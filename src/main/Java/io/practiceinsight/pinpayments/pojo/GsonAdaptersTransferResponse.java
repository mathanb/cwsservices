package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code TransferResponse}.
 * @see ImmutableTransferResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.TransferResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersTransferResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (TransferResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new TransferResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersTransferResponse(TransferResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class TransferResponseTypeAdapter extends TypeAdapter<TransferResponse> {
    public final TransferResult responseTypeSample = null;
    private final TypeAdapter<TransferResult> responseTypeAdapter;
    final String responseName;

    static class TransferResponseNamingFields {
      public TransferResult response;
    }

    TransferResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( TransferResult.class);
      this.responseName = translateName(gson, TransferResponseNamingFields.class, "response");
    } 

    static boolean adapts(TypeToken<?> type) {
      return TransferResponse.class == type.getRawType()
          || ImmutableTransferResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, TransferResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeTransferResponse(out, value);
      }
    }

    @Override
    public TransferResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readTransferResponse(in);
    }

    private void writeTransferResponse(JsonWriter out, TransferResponse instance)
        throws IOException {
      out.beginObject();
      out.name(responseName);
      responseTypeAdapter.write(out, instance.response());
      out.endObject();
    }

    private TransferResponse readTransferResponse(JsonReader in)
        throws IOException {
      ImmutableTransferResponse.Builder builder = ImmutableTransferResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableTransferResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableTransferResponse.Builder builder)
        throws IOException {
      TransferResult value = responseTypeAdapter.read(in);
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
