package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code Recipient}.
 * @see ImmutableRecipient
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.Recipient"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersRecipient implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (RecipientTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new RecipientTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersRecipient(Recipient)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class RecipientTypeAdapter extends TypeAdapter<Recipient> {
    public final BankAccount bankAccountTypeSample = null;
    private final TypeAdapter<BankAccount> bankAccountTypeAdapter;
    final String bankAccountName;
    final String bankAccountTokenName;
    final String emailName;
    final String nameName;

    static class RecipientNamingFields {
      public BankAccount bankAccount;
      public String bankAccountToken;
      public String email;
      public String name;
    }

    RecipientTypeAdapter(Gson gson) {
      this.bankAccountTypeAdapter = gson.getAdapter( BankAccount.class);
      this.bankAccountName = translateName(gson, RecipientNamingFields.class, "bankAccount");
      this.bankAccountTokenName = translateName(gson, RecipientNamingFields.class, "bankAccountToken");
      this.emailName = translateName(gson, RecipientNamingFields.class, "email");
      this.nameName = translateName(gson, RecipientNamingFields.class, "name");
    } 

    static boolean adapts(TypeToken<?> type) {
      return Recipient.class == type.getRawType()
          || ImmutableRecipient.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, Recipient value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeRecipient(out, value);
      }
    }

    @Override
    public Recipient read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readRecipient(in);
    }

    private void writeRecipient(JsonWriter out, Recipient instance)
        throws IOException {
      out.beginObject();
      @Nullable BankAccount bankAccountValue = instance.bankAccount();
      if (bankAccountValue != null) {
        out.name(bankAccountName);
        bankAccountTypeAdapter.write(out, bankAccountValue);
      } else if (out.getSerializeNulls()) {
        out.name(bankAccountName);
        out.nullValue();
      }
      @Nullable String bankAccountTokenValue = instance.bankAccountToken();
      if (bankAccountTokenValue != null) {
        out.name(bankAccountTokenName);
        out.value(bankAccountTokenValue);
      } else if (out.getSerializeNulls()) {
        out.name(bankAccountTokenName);
        out.nullValue();
      }
      out.name(emailName);
      out.value(instance.email());
      @Nullable String nameValue = instance.name();
      if (nameValue != null) {
        out.name(nameName);
        out.value(nameValue);
      } else if (out.getSerializeNulls()) {
        out.name(nameName);
        out.nullValue();
      }
      out.endObject();
    }

    private Recipient readRecipient(JsonReader in)
        throws IOException {
      ImmutableRecipient.Builder builder = ImmutableRecipient.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableRecipient.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (bankAccountName.equals(attributeName)) {
        readInBankAccount(in, builder);
        return;
      }
      if (bankAccountTokenName.equals(attributeName)) {
        readInBankAccountToken(in, builder);
        return;
      }
      if (emailName.equals(attributeName)) {
        readInEmail(in, builder);
        return;
      }
      if (nameName.equals(attributeName)) {
        readInName(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInBankAccount(JsonReader in, ImmutableRecipient.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        BankAccount value = bankAccountTypeAdapter.read(in);
        builder.bankAccount(value);
      }
    }

    private void readInBankAccountToken(JsonReader in, ImmutableRecipient.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.bankAccountToken(in.nextString());
      }
    }

    private void readInEmail(JsonReader in, ImmutableRecipient.Builder builder)
        throws IOException {
      builder.email(in.nextString());
    }

    private void readInName(JsonReader in, ImmutableRecipient.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.name(in.nextString());
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
