package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code ChargeResponse}.
 * @see ImmutableChargeResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.ChargeResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersChargeResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (ChargeResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new ChargeResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersChargeResponse(ChargeResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class ChargeResponseTypeAdapter extends TypeAdapter<ChargeResponse> {
    public final ChargeResult responseTypeSample = null;
    public final ErrorResponse errorResponseTypeSample = null;
    private final TypeAdapter<ChargeResult> responseTypeAdapter;
    private final TypeAdapter<ErrorResponse> errorResponseTypeAdapter;
    final String responseName;
    final String errorResponseName;

    static class ChargeResponseNamingFields {
      public ChargeResult response;
      public ErrorResponse errorResponse;
    }

    ChargeResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( ChargeResult.class);
      this.errorResponseTypeAdapter = gson.getAdapter( ErrorResponse.class);
      this.responseName = translateName(gson, ChargeResponseNamingFields.class, "response");
      this.errorResponseName = translateName(gson, ChargeResponseNamingFields.class, "errorResponse");
    } 

    static boolean adapts(TypeToken<?> type) {
      return ChargeResponse.class == type.getRawType()
          || ImmutableChargeResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, ChargeResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeChargeResponse(out, value);
      }
    }

    @Override
    public ChargeResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readChargeResponse(in);
    }

    private void writeChargeResponse(JsonWriter out, ChargeResponse instance)
        throws IOException {
      out.beginObject();
      @Nullable ChargeResult responseValue = instance.response();
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

    private ChargeResponse readChargeResponse(JsonReader in)
        throws IOException {
      ImmutableChargeResponse.Builder builder = ImmutableChargeResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableChargeResponse.Builder builder)
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

    private void readInResponse(JsonReader in, ImmutableChargeResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        ChargeResult value = responseTypeAdapter.read(in);
        builder.response(value);
      }
    }

    private void readInErrorResponse(JsonReader in, ImmutableChargeResponse.Builder builder)
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
