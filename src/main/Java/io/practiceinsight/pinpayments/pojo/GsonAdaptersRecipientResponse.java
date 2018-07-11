package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code RecipientResponse}.
 * @see ImmutableRecipientResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.RecipientResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersRecipientResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (RecipientResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new RecipientResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersRecipientResponse(RecipientResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class RecipientResponseTypeAdapter extends TypeAdapter<RecipientResponse> {
    public final RecipientResult responseTypeSample = null;
    private final TypeAdapter<RecipientResult> responseTypeAdapter;
    final String responseName;

    static class RecipientResponseNamingFields {
      public RecipientResult response;
    }

    RecipientResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( RecipientResult.class);
      this.responseName = translateName(gson, RecipientResponseNamingFields.class, "response");
    } 

    static boolean adapts(TypeToken<?> type) {
      return RecipientResponse.class == type.getRawType()
          || ImmutableRecipientResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, RecipientResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeRecipientResponse(out, value);
      }
    }

    @Override
    public RecipientResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readRecipientResponse(in);
    }

    private void writeRecipientResponse(JsonWriter out, RecipientResponse instance)
        throws IOException {
      out.beginObject();
      out.name(responseName);
      responseTypeAdapter.write(out, instance.response());
      out.endObject();
    }

    private RecipientResponse readRecipientResponse(JsonReader in)
        throws IOException {
      ImmutableRecipientResponse.Builder builder = ImmutableRecipientResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableRecipientResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableRecipientResponse.Builder builder)
        throws IOException {
      RecipientResult value = responseTypeAdapter.read(in);
      builder.response(value);
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
