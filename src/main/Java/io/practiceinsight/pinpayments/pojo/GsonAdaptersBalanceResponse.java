package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code BalanceResponse}.
 * @see ImmutableBalanceResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.BalanceResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersBalanceResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (BalanceResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new BalanceResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersBalanceResponse(BalanceResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class BalanceResponseTypeAdapter extends TypeAdapter<BalanceResponse> {
    public final BalanceResult responseTypeSample = null;
    private final TypeAdapter<BalanceResult> responseTypeAdapter;
    final String responseName;

    static class BalanceResponseNamingFields {
      public BalanceResult response;
    }

    BalanceResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( BalanceResult.class);
      this.responseName = translateName(gson, BalanceResponseNamingFields.class, "response");
    } 

    static boolean adapts(TypeToken<?> type) {
      return BalanceResponse.class == type.getRawType()
          || ImmutableBalanceResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, BalanceResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeBalanceResponse(out, value);
      }
    }

    @Override
    public BalanceResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readBalanceResponse(in);
    }

    private void writeBalanceResponse(JsonWriter out, BalanceResponse instance)
        throws IOException {
      out.beginObject();
      out.name(responseName);
      responseTypeAdapter.write(out, instance.response());
      out.endObject();
    }

    private BalanceResponse readBalanceResponse(JsonReader in)
        throws IOException {
      ImmutableBalanceResponse.Builder builder = ImmutableBalanceResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableBalanceResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableBalanceResponse.Builder builder)
        throws IOException {
      BalanceResult value = responseTypeAdapter.read(in);
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
