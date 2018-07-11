package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code ErrorMessage}.
 * @see ImmutableErrorMessage
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.ErrorMessage"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersErrorMessage implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (ErrorMessageTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new ErrorMessageTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersErrorMessage(ErrorMessage)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class ErrorMessageTypeAdapter extends TypeAdapter<ErrorMessage> {
    final String paramName;
    final String codeName;
    final String messageName;

    static class ErrorMessageNamingFields {
      public String param;
      public String code;
      public String message;
    }

    ErrorMessageTypeAdapter(Gson gson) {
      this.paramName = translateName(gson, ErrorMessageNamingFields.class, "param");
      this.codeName = translateName(gson, ErrorMessageNamingFields.class, "code");
      this.messageName = translateName(gson, ErrorMessageNamingFields.class, "message");
    } 

    static boolean adapts(TypeToken<?> type) {
      return ErrorMessage.class == type.getRawType()
          || ImmutableErrorMessage.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, ErrorMessage value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeErrorMessage(out, value);
      }
    }

    @Override
    public ErrorMessage read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readErrorMessage(in);
    }

    private void writeErrorMessage(JsonWriter out, ErrorMessage instance)
        throws IOException {
      out.beginObject();
      out.name(paramName);
      out.value(instance.param());
      out.name(codeName);
      out.value(instance.code());
      out.name(messageName);
      out.value(instance.message());
      out.endObject();
    }

    private ErrorMessage readErrorMessage(JsonReader in)
        throws IOException {
      ImmutableErrorMessage.Builder builder = ImmutableErrorMessage.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableErrorMessage.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (paramName.equals(attributeName)) {
        readInParam(in, builder);
        return;
      }
      if (codeName.equals(attributeName)) {
        readInCode(in, builder);
        return;
      }
      if (messageName.equals(attributeName)) {
        readInMessage(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInParam(JsonReader in, ImmutableErrorMessage.Builder builder)
        throws IOException {
      builder.param(in.nextString());
    }

    private void readInCode(JsonReader in, ImmutableErrorMessage.Builder builder)
        throws IOException {
      builder.code(in.nextString());
    }

    private void readInMessage(JsonReader in, ImmutableErrorMessage.Builder builder)
        throws IOException {
      builder.message(in.nextString());
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
