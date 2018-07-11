package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code ChargeListResponse}.
 * @see ImmutableChargeListResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.ChargeListResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersChargeListResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (ChargeListResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new ChargeListResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersChargeListResponse(ChargeListResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class ChargeListResponseTypeAdapter extends TypeAdapter<ChargeListResponse> {
    public final ChargeResult responseTypeSample = null;
    public final Pagination paginationTypeSample = null;
    public final ErrorResponse errorResponseTypeSample = null;
    private final TypeAdapter<ChargeResult> responseTypeAdapter;
    private final TypeAdapter<Pagination> paginationTypeAdapter;
    private final TypeAdapter<ErrorResponse> errorResponseTypeAdapter;
    final String responseName;
    final String paginationName;
    final String errorResponseName;

    static class ChargeListResponseNamingFields {
      public List<ChargeResult> response;
      public Pagination pagination;
      public ErrorResponse errorResponse;
    }

    ChargeListResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( ChargeResult.class);
      this.paginationTypeAdapter = gson.getAdapter( Pagination.class);
      this.errorResponseTypeAdapter = gson.getAdapter( ErrorResponse.class);
      this.responseName = translateName(gson, ChargeListResponseNamingFields.class, "response");
      this.paginationName = translateName(gson, ChargeListResponseNamingFields.class, "pagination");
      this.errorResponseName = translateName(gson, ChargeListResponseNamingFields.class, "errorResponse");
    } 

    static boolean adapts(TypeToken<?> type) {
      return ChargeListResponse.class == type.getRawType()
          || ImmutableChargeListResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, ChargeListResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeChargeListResponse(out, value);
      }
    }

    @Override
    public ChargeListResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readChargeListResponse(in);
    }

    private void writeChargeListResponse(JsonWriter out, ChargeListResponse instance)
        throws IOException {
      out.beginObject();
      @Nullable List<ChargeResult> responseElements = instance.response();
      if (responseElements != null) {
        out.name(responseName);
        out.beginArray();
        for (ChargeResult e : responseElements) {
          responseTypeAdapter.write(out, e);
        }
        out.endArray();
      } else if (out.getSerializeNulls()) {
        out.name(responseName);
        out.nullValue();
      }
      @Nullable Pagination paginationValue = instance.pagination();
      if (paginationValue != null) {
        out.name(paginationName);
        paginationTypeAdapter.write(out, paginationValue);
      } else if (out.getSerializeNulls()) {
        out.name(paginationName);
        out.nullValue();
      }
      @Nullable ErrorResponse errorResponseValue = instance.errorResponse();
      if (errorResponseValue != null) {
        out.name(errorResponseName);
        errorResponseTypeAdapter.write(out, errorResponseValue);
      } else if (out.getSerializeNulls()) {
        out.name(errorResponseName);
        out.nullValue();
      }
      out.endObject();
    }

    private ChargeListResponse readChargeListResponse(JsonReader in)
        throws IOException {
      ImmutableChargeListResponse.Builder builder = ImmutableChargeListResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableChargeListResponse.Builder builder)
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
      if (errorResponseName.equals(attributeName)) {
        readInErrorResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableChargeListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        boolean empty = true;
        if (in.peek() == JsonToken.BEGIN_ARRAY) {
          in.beginArray();
          while(in.hasNext()) {
            ChargeResult value = responseTypeAdapter.read(in);
            builder.addResponse(value);
            empty = false;
          }
          in.endArray();
        } else if (in.peek() == JsonToken.NULL) {
          in.nextNull();
        } else {
          ChargeResult value = responseTypeAdapter.read(in);
          builder.addResponse(value);
          empty = false;
        }
        if (empty) {
          builder.addAllResponse(Collections.<ChargeResult>emptyList());
        }
      }
    }

    private void readInPagination(JsonReader in, ImmutableChargeListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        Pagination value = paginationTypeAdapter.read(in);
        builder.pagination(value);
      }
    }

    private void readInErrorResponse(JsonReader in, ImmutableChargeListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        ErrorResponse value = errorResponseTypeAdapter.read(in);
        builder.errorResponse(value);
      }
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
