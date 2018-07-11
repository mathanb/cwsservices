package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code RecipientListResponse}.
 * @see ImmutableRecipientListResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.RecipientListResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersRecipientListResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (RecipientListResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new RecipientListResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersRecipientListResponse(RecipientListResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class RecipientListResponseTypeAdapter extends TypeAdapter<RecipientListResponse> {
    public final RecipientResult responseTypeSample = null;
    public final Pagination paginationTypeSample = null;
    private final TypeAdapter<RecipientResult> responseTypeAdapter;
    private final TypeAdapter<Pagination> paginationTypeAdapter;
    final String responseName;
    final String paginationName;

    static class RecipientListResponseNamingFields {
      public List<RecipientResult> response;
      public Pagination pagination;
    }

    RecipientListResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( RecipientResult.class);
      this.paginationTypeAdapter = gson.getAdapter( Pagination.class);
      this.responseName = translateName(gson, RecipientListResponseNamingFields.class, "response");
      this.paginationName = translateName(gson, RecipientListResponseNamingFields.class, "pagination");
    } 

    static boolean adapts(TypeToken<?> type) {
      return RecipientListResponse.class == type.getRawType()
          || ImmutableRecipientListResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, RecipientListResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeRecipientListResponse(out, value);
      }
    }

    @Override
    public RecipientListResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readRecipientListResponse(in);
    }

    private void writeRecipientListResponse(JsonWriter out, RecipientListResponse instance)
        throws IOException {
      out.beginObject();
      List<RecipientResult> responseElements = instance.response();
      out.name(responseName);
      out.beginArray();
      for (RecipientResult e : responseElements) {
        responseTypeAdapter.write(out, e);
      }
      out.endArray();
      out.name(paginationName);
      paginationTypeAdapter.write(out, instance.pagination());
      out.endObject();
    }

    private RecipientListResponse readRecipientListResponse(JsonReader in)
        throws IOException {
      ImmutableRecipientListResponse.Builder builder = ImmutableRecipientListResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableRecipientListResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      if (paginationName.equals(attributeName)) {
        readInPagination(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableRecipientListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          RecipientResult value = responseTypeAdapter.read(in);
          builder.addResponse(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        RecipientResult value = responseTypeAdapter.read(in);
        builder.addResponse(value);
      }
    }

    private void readInPagination(JsonReader in, ImmutableRecipientListResponse.Builder builder)
        throws IOException {
      Pagination value = paginationTypeAdapter.read(in);
      builder.pagination(value);
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
