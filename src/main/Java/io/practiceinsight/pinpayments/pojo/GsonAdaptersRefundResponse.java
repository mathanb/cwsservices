package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code RefundResponse}.
 * @see ImmutableRefundResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.RefundResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersRefundResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (RefundResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new RefundResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersRefundResponse(RefundResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class RefundResponseTypeAdapter extends TypeAdapter<RefundResponse> {
    public final RefundResult responseTypeSample = null;
    public final ErrorResponse errorResponseTypeSample = null;
    private final TypeAdapter<RefundResult> responseTypeAdapter;
    private final TypeAdapter<ErrorResponse> errorResponseTypeAdapter;
    final String responseName;
    final String errorResponseName;

    static class RefundResponseNamingFields {
      public RefundResult response;
      public ErrorResponse errorResponse;
    }

    RefundResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( RefundResult.class);
      this.errorResponseTypeAdapter = gson.getAdapter( ErrorResponse.class);
      this.responseName = translateName(gson, RefundResponseNamingFields.class, "response");
      this.errorResponseName = translateName(gson, RefundResponseNamingFields.class, "errorResponse");
    } 

    static boolean adapts(TypeToken<?> type) {
      return RefundResponse.class == type.getRawType()
          || ImmutableRefundResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, RefundResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeRefundResponse(out, value);
      }
    }

    @Override
    public RefundResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readRefundResponse(in);
    }

    private void writeRefundResponse(JsonWriter out, RefundResponse instance)
        throws IOException {
      out.beginObject();
      @Nullable RefundResult responseValue = instance.response();
      if (responseValue != null) {
        out.name(responseName);
        responseTypeAdapter.write(out, responseValue);
      } else if (out.getSerializeNulls()) {
        out.name(responseName);
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

    private RefundResponse readRefundResponse(JsonReader in)
        throws IOException {
      ImmutableRefundResponse.Builder builder = ImmutableRefundResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableRefundResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      if (errorResponseName.equals(attributeName)) {
        readInErrorResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableRefundResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        RefundResult value = responseTypeAdapter.read(in);
        builder.response(value);
      }
    }

    private void readInErrorResponse(JsonReader in, ImmutableRefundResponse.Builder builder)
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
