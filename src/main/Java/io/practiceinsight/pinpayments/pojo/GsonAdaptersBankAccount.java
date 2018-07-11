package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code BankAccount}.
 * @see ImmutableBankAccount
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.BankAccount"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersBankAccount implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (BankAccountTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new BankAccountTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersBankAccount(BankAccount)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class BankAccountTypeAdapter extends TypeAdapter<BankAccount> {
    final String bankNameName;
    final String nameName;
    final String bsbName;
    final String numberName;

    static class BankAccountNamingFields {
      public String bankName;
      public String name;
      public String bsb;
      public String number;
    }

    BankAccountTypeAdapter(Gson gson) {
      this.bankNameName = "bank_name";
      this.nameName = translateName(gson, BankAccountNamingFields.class, "name");
      this.bsbName = translateName(gson, BankAccountNamingFields.class, "bsb");
      this.numberName = translateName(gson, BankAccountNamingFields.class, "number");
    } 

    static boolean adapts(TypeToken<?> type) {
      return BankAccount.class == type.getRawType()
          || ImmutableBankAccount.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, BankAccount value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeBankAccount(out, value);
      }
    }

    @Override
    public BankAccount read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readBankAccount(in);
    }

    private void writeBankAccount(JsonWriter out, BankAccount instance)
        throws IOException {
      out.beginObject();
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

    private BankAccount readBankAccount(JsonReader in)
        throws IOException {
      ImmutableBankAccount.Builder builder = ImmutableBankAccount.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableBankAccount.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
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

    private void readInBankName(JsonReader in, ImmutableBankAccount.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.bankName(in.nextString());
      }
    }

    private void readInName(JsonReader in, ImmutableBankAccount.Builder builder)
        throws IOException {
      builder.name(in.nextString());
    }

    private void readInBsb(JsonReader in, ImmutableBankAccount.Builder builder)
        throws IOException {
      builder.bsb(in.nextString());
    }

    private void readInNumber(JsonReader in, ImmutableBankAccount.Builder builder)
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
