package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code BankAccountResponse}.
 * @see ImmutableBankAccountResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.BankAccountResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersBankAccountResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (BankAccountResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new BankAccountResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersBankAccountResponse(BankAccountResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class BankAccountResponseTypeAdapter extends TypeAdapter<BankAccountResponse> {
    public final BankAccountResult responseTypeSample = null;
    private final TypeAdapter<BankAccountResult> responseTypeAdapter;
    final String responseName;

    static class BankAccountResponseNamingFields {
      public BankAccountResult response;
    }

    BankAccountResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( BankAccountResult.class);
      this.responseName = translateName(gson, BankAccountResponseNamingFields.class, "response");
    } 

    static boolean adapts(TypeToken<?> type) {
      return BankAccountResponse.class == type.getRawType()
          || ImmutableBankAccountResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, BankAccountResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeBankAccountResponse(out, value);
      }
    }

    @Override
    public BankAccountResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readBankAccountResponse(in);
    }

    private void writeBankAccountResponse(JsonWriter out, BankAccountResponse instance)
        throws IOException {
      out.beginObject();
      out.name(responseName);
      responseTypeAdapter.write(out, instance.response());
      out.endObject();
    }

    private BankAccountResponse readBankAccountResponse(JsonReader in)
        throws IOException {
      ImmutableBankAccountResponse.Builder builder = ImmutableBankAccountResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableBankAccountResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableBankAccountResponse.Builder builder)
        throws IOException {
      BankAccountResult value = responseTypeAdapter.read(in);
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
