package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code BankAccountResult}.
 * @see ImmutableBankAccountResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.BankAccountResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersBankAccountResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (BankAccountResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new BankAccountResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersBankAccountResult(BankAccountResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class BankAccountResultTypeAdapter extends TypeAdapter<BankAccountResult> {
    final String tokenName;
    final String bankNameName;
    final String nameName;
    final String bsbName;
    final String numberName;

    static class BankAccountResultNamingFields {
      public String token;
      public String bankName;
      public String name;
      public String bsb;
      public String number;
    }

    BankAccountResultTypeAdapter(Gson gson) {
      this.tokenName = translateName(gson, BankAccountResultNamingFields.class, "token");
      this.bankNameName = "bank_name";
      this.nameName = translateName(gson, BankAccountResultNamingFields.class, "name");
      this.bsbName = translateName(gson, BankAccountResultNamingFields.class, "bsb");
      this.numberName = translateName(gson, BankAccountResultNamingFields.class, "number");
    } 

    static boolean adapts(TypeToken<?> type) {
      return BankAccountResult.class == type.getRawType()
          || ImmutableBankAccountResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, BankAccountResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeBankAccountResult(out, value);
      }
    }

    @Override
    public BankAccountResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readBankAccountResult(in);
    }

    private void writeBankAccountResult(JsonWriter out, BankAccountResult instance)
        throws IOException {
      out.beginObject();
      out.name(tokenName);
      out.value(instance.token());
      @Nullable String bankNameValue = instance.bankName();
      if (bankNameValue != null) {
        out.name(bankNameName);
        out.value(bankNameValue);
      } else if (out.getSerializeNulls()) {
        out.name(bankNameName);
        out.nullValue();
      }
      out.name(nameName);
      out.value(instance.name());
      out.name(bsbName);
      out.value(instance.bsb());
      out.name(numberName);
      out.value(instance.number());
      out.endObject();
    }

    private BankAccountResult readBankAccountResult(JsonReader in)
        throws IOException {
      ImmutableBankAccountResult.Builder builder = ImmutableBankAccountResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableBankAccountResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (tokenName.equals(attributeName)) {
        readInToken(in, builder);
        return;
      }
      if (bankNameName.equals(attributeName)) {
        readInBankName(in, builder);
        return;
      }
      if (nameName.equals(attributeName)) {
        readInName(in, builder);
        return;
      }
      if (bsbName.equals(attributeName)) {
        readInBsb(in, builder);
        return;
      }
      if (numberName.equals(attributeName)) {
        readInNumber(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInToken(JsonReader in, ImmutableBankAccountResult.Builder builder)
        throws IOException {
      builder.token(in.nextString());
    }

    private void readInBankName(JsonReader in, ImmutableBankAccountResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.bankName(in.nextString());
      }
    }

    private void readInName(JsonReader in, ImmutableBankAccountResult.Builder builder)
        throws IOException {
      builder.name(in.nextString());
    }

    private void readInBsb(JsonReader in, ImmutableBankAccountResult.Builder builder)
        throws IOException {
      builder.bsb(in.nextString());
    }

    private void readInNumber(JsonReader in, ImmutableBankAccountResult.Builder builder)
        throws IOException {
      builder.number(in.nextString());
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
