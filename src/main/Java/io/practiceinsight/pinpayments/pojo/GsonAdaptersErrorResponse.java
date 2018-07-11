package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code ErrorResponse}.
 * @see ImmutableErrorResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.ErrorResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersErrorResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (ErrorResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new ErrorResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersErrorResponse(ErrorResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class ErrorResponseTypeAdapter extends TypeAdapter<ErrorResponse> {
    public final ErrorMessage messagesTypeSample = null;
    private final TypeAdapter<ErrorMessage> messagesTypeAdapter;
    final String errorName;
    final String errorDescriptionName;
    final String messagesName;

    static class ErrorResponseNamingFields {
      public String error;
      public String errorDescription;
      public List<ErrorMessage> messages;
    }

    ErrorResponseTypeAdapter(Gson gson) {
      this.messagesTypeAdapter = gson.getAdapter( ErrorMessage.class);
      this.errorName = translateName(gson, ErrorResponseNamingFields.class, "error");
      this.errorDescriptionName = translateName(gson, ErrorResponseNamingFields.class, "errorDescription");
      this.messagesName = translateName(gson, ErrorResponseNamingFields.class, "messages");
    } 

    static boolean adapts(TypeToken<?> type) {
      return ErrorResponse.class == type.getRawType()
          || ImmutableErrorResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, ErrorResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeErrorResponse(out, value);
      }
    }

    @Override
    public ErrorResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readErrorResponse(in);
    }

    private void writeErrorResponse(JsonWriter out, ErrorResponse instance)
        throws IOException {
      out.beginObject();
      out.name(errorName);
      out.value(instance.error());
      out.name(errorDescriptionName);
      out.value(instance.errorDescription());
      List<ErrorMessage> messagesElements = instance.messages();
      out.name(messagesName);
      out.beginArray();
      for (ErrorMessage e : messagesElements) {
        messagesTypeAdapter.write(out, e);
      }
      out.endArray();
      out.endObject();
    }

    private ErrorResponse readErrorResponse(JsonReader in)
        throws IOException {
      ImmutableErrorResponse.Builder builder = ImmutableErrorResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableErrorResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (errorName.equals(attributeName)) {
        readInError(in, builder);
        return;
      }
      if (errorDescriptionName.equals(attributeName)) {
        readInErrorDescription(in, builder);
        return;
      }
      if (messagesName.equals(attributeName)) {
        readInMessages(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInError(JsonReader in, ImmutableErrorResponse.Builder builder)
        throws IOException {
      builder.error(in.nextString());
    }

    private void readInErrorDescription(JsonReader in, ImmutableErrorResponse.Builder builder)
        throws IOException {
      builder.errorDescription(in.nextString());
    }

    private void readInMessages(JsonReader in, ImmutableErrorResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          ErrorMessage value = messagesTypeAdapter.read(in);
          builder.addMessages(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        ErrorMessage value = messagesTypeAdapter.read(in);
        builder.addMessages(value);
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
