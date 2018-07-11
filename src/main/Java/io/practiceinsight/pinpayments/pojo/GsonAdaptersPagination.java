package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code Pagination}.
 * @see ImmutablePagination
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.Pagination"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersPagination implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (PaginationTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new PaginationTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersPagination(Pagination)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class PaginationTypeAdapter extends TypeAdapter<Pagination> {
    final String currentName;
    final String perPageName;
    final String countName;

    static class PaginationNamingFields {
      public int current;
      public int perPage;
      public int count;
    }

    PaginationTypeAdapter(Gson gson) {
      this.currentName = translateName(gson, PaginationNamingFields.class, "current");
      this.perPageName = translateName(gson, PaginationNamingFields.class, "perPage");
      this.countName = translateName(gson, PaginationNamingFields.class, "count");
    } 

    static boolean adapts(TypeToken<?> type) {
      return Pagination.class == type.getRawType()
          || ImmutablePagination.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, Pagination value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writePagination(out, value);
      }
    }

    @Override
    public Pagination read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readPagination(in);
    }

    private void writePagination(JsonWriter out, Pagination instance)
        throws IOException {
      out.beginObject();
      out.name(currentName);
      out.value(instance.current());
      out.name(perPageName);
      out.value(instance.perPage());
      out.name(countName);
      out.value(instance.count());
      out.endObject();
    }

    private Pagination readPagination(JsonReader in)
        throws IOException {
      ImmutablePagination.Builder builder = ImmutablePagination.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutablePagination.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (currentName.equals(attributeName)) {
        readInCurrent(in, builder);
        return;
      }
      if (perPageName.equals(attributeName)) {
        readInPerPage(in, builder);
        return;
      }
      if (countName.equals(attributeName)) {
        readInCount(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInCurrent(JsonReader in, ImmutablePagination.Builder builder)
        throws IOException {
      builder.current(in.nextInt());
    }

    private void readInPerPage(JsonReader in, ImmutablePagination.Builder builder)
        throws IOException {
      builder.perPage(in.nextInt());
    }

    private void readInCount(JsonReader in, ImmutablePagination.Builder builder)
        throws IOException {
      builder.count(in.nextInt());
    }
  }

  private static String translateName(Gson gson, Class<?> sampleClass, String fieldName) {
    try {
      return gson.fieldNamingStrategy().translateName(sampleClass.getField(fieldName));
    } catch (NoSuchFieldException noSuchField) {
      throw new AssertionError(noSuchField);
    }
  }
}
