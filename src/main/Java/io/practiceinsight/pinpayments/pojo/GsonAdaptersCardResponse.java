package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code CardResponse}.
 * @see ImmutableCardResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.CardResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersCardResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (CardResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new CardResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersCardResponse(CardResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class CardResponseTypeAdapter extends TypeAdapter<CardResponse> {
    public final CardResult responseTypeSample = null;
    public final ErrorResponse errorResponseTypeSample = null;
    private final TypeAdapter<CardResult> responseTypeAdapter;
    private final TypeAdapter<ErrorResponse> errorResponseTypeAdapter;
    final String responseName;
    final String errorResponseName;

    static class CardResponseNamingFields {
      public CardResult response;
      public ErrorResponse errorResponse;
    }

    CardResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( CardResult.class);
      this.errorResponseTypeAdapter = gson.getAdapter( ErrorResponse.class);
      this.responseName = translateName(gson, CardResponseNamingFields.class, "response");
      this.errorResponseName = translateName(gson, CardResponseNamingFields.class, "errorResponse");
    } 

    static boolean adapts(TypeToken<?> type) {
      return CardResponse.class == type.getRawType()
          || ImmutableCardResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, CardResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeCardResponse(out, value);
      }
    }

    @Override
    public CardResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readCardResponse(in);
    }

    private void writeCardResponse(JsonWriter out, CardResponse instance)
        throws IOException {
      out.beginObject();
      @Nullable CardResult responseValue = instance.response();
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

    private CardResponse readCardResponse(JsonReader in)
        throws IOException {
      ImmutableCardResponse.Builder builder = ImmutableCardResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableCardResponse.Builder builder)
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

    private void readInResponse(JsonReader in, ImmutableCardResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        CardResult value = responseTypeAdapter.read(in);
        builder.response(value);
      }
    }

    private void readInErrorResponse(JsonReader in, ImmutableCardResponse.Builder builder)
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
