package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.joda.time.DateTime;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code SearchCriteria}.
 * @see ImmutableSearchCriteria
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.SearchCriteria"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersSearchCriteria implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (SearchCriteriaTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new SearchCriteriaTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersSearchCriteria(SearchCriteria)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class SearchCriteriaTypeAdapter extends TypeAdapter<SearchCriteria> {
    public final DateTime startDateTypeSample = null;
    public final DateTime endDateTypeSample = null;
    private final TypeAdapter<DateTime> startDateTypeAdapter;
    private final TypeAdapter<DateTime> endDateTypeAdapter;
    final String queryName;
    final String startDateName;
    final String endDateName;
    final String sortName;
    final String directionName;

    static class SearchCriteriaNamingFields {
      public String query;
      public DateTime startDate;
      public DateTime endDate;
      public String sort;
      public int direction;
    }

    SearchCriteriaTypeAdapter(Gson gson) {
      this.startDateTypeAdapter = gson.getAdapter( DateTime.class);
      this.endDateTypeAdapter = gson.getAdapter( DateTime.class);
      this.queryName = translateName(gson, SearchCriteriaNamingFields.class, "query");
      this.startDateName = translateName(gson, SearchCriteriaNamingFields.class, "startDate");
      this.endDateName = translateName(gson, SearchCriteriaNamingFields.class, "endDate");
      this.sortName = translateName(gson, SearchCriteriaNamingFields.class, "sort");
      this.directionName = translateName(gson, SearchCriteriaNamingFields.class, "direction");
    } 

    static boolean adapts(TypeToken<?> type) {
      return SearchCriteria.class == type.getRawType()
          || ImmutableSearchCriteria.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, SearchCriteria value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeSearchCriteria(out, value);
      }
    }

    @Override
    public SearchCriteria read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readSearchCriteria(in);
    }

    private void writeSearchCriteria(JsonWriter out, SearchCriteria instance)
        throws IOException {
      out.beginObject();
      @Nullable String queryValue = instance.query();
      if (queryValue != null) {
        out.name(queryName);
        out.value(queryValue);
      } else if (out.getSerializeNulls()) {
        out.name(queryName);
        out.nullValue();
      }
      @Nullable DateTime startDateValue = instance.startDate();
      if (startDateValue != null) {
        out.name(startDateName);
        startDateTypeAdapter.write(out, startDateValue);
      } else if (out.getSerializeNulls()) {
        out.name(startDateName);
        out.nullValue();
      }
      @Nullable DateTime endDateValue = instance.endDate();
      if (endDateValue != null) {
        out.name(endDateName);
        endDateTypeAdapter.write(out, endDateValue);
      } else if (out.getSerializeNulls()) {
        out.name(endDateName);
        out.nullValue();
      }
      @Nullable String sortValue = instance.sort();
      if (sortValue != null) {
        out.name(sortName);
        out.value(sortValue);
      } else if (out.getSerializeNulls()) {
        out.name(sortName);
        out.nullValue();
      }
      out.name(directionName);
      out.value(instance.direction());
      out.endObject();
    }

    private SearchCriteria readSearchCriteria(JsonReader in)
        throws IOException {
      ImmutableSearchCriteria.Builder builder = ImmutableSearchCriteria.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableSearchCriteria.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (queryName.equals(attributeName)) {
        readInQuery(in, builder);
        return;
      }
      if (startDateName.equals(attributeName)) {
        readInStartDate(in, builder);
        return;
      }
      if (endDateName.equals(attributeName)) {
        readInEndDate(in, builder);
        return;
      }
      if (sortName.equals(attributeName)) {
        readInSort(in, builder);
        return;
      }
      if (directionName.equals(attributeName)) {
        readInDirection(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInQuery(JsonReader in, ImmutableSearchCriteria.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.query(in.nextString());
      }
    }

    private void readInStartDate(JsonReader in, ImmutableSearchCriteria.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        DateTime value = startDateTypeAdapter.read(in);
        builder.startDate(value);
      }
    }

    private void readInEndDate(JsonReader in, ImmutableSearchCriteria.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        DateTime value = endDateTypeAdapter.read(in);
        builder.endDate(value);
      }
    }

    private void readInSort(JsonReader in, ImmutableSearchCriteria.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.sort(in.nextString());
      }
    }

    private void readInDirection(JsonReader in, ImmutableSearchCriteria.Builder builder)
        throws IOException {
      builder.direction(in.nextInt());
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
