package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code RecipientResult}.
 * @see ImmutableRecipientResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.RecipientResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersRecipientResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (RecipientResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new RecipientResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersRecipientResult(RecipientResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class RecipientResultTypeAdapter extends TypeAdapter<RecipientResult> {
    public final BankAccountResult bankAccountTypeSample = null;
    private final TypeAdapter<BankAccountResult> bankAccountTypeAdapter;
    final String tokenName;
    final String createdAtName;
    final String bankAccountName;
    final String emailName;
    final String nameName;

    static class RecipientResultNamingFields {
      public String token;
      public String createdAt;
      public BankAccountResult bankAccount;
      public String email;
      public String name;
    }

    RecipientResultTypeAdapter(Gson gson) {
      this.bankAccountTypeAdapter = gson.getAdapter( BankAccountResult.class);
      this.tokenName = translateName(gson, RecipientResultNamingFields.class, "token");
      this.createdAtName = translateName(gson, RecipientResultNamingFields.class, "createdAt");
      this.bankAccountName = translateName(gson, RecipientResultNamingFields.class, "bankAccount");
      this.emailName = translateName(gson, RecipientResultNamingFields.class, "email");
      this.nameName = translateName(gson, RecipientResultNamingFields.class, "name");
    } 

    static boolean adapts(TypeToken<?> type) {
      return RecipientResult.class == type.getRawType()
          || ImmutableRecipientResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, RecipientResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeRecipientResult(out, value);
      }
    }

    @Override
    public RecipientResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readRecipientResult(in);
    }

    private void writeRecipientResult(JsonWriter out, RecipientResult instance)
        throws IOException {
      out.beginObject();
      out.name(tokenName);
      out.value(instance.token());
      out.name(createdAtName);
      out.value(instance.createdAt());
      @Nullable BankAccountResult bankAccountValue = instance.bankAccount();
      if (bankAccountValue != null) {
        out.name(bankAccountName);
        bankAccountTypeAdapter.write(out, bankAccountValue);
      } else if (out.getSerializeNulls()) {
        out.name(bankAccountName);
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

    private RecipientResult readRecipientResult(JsonReader in)
        throws IOException {
      ImmutableRecipientResult.Builder builder = ImmutableRecipientResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableRecipientResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (tokenName.equals(attributeName)) {
        readInToken(in, builder);
        return;
      }
      if (createdAtName.equals(attributeName)) {
        readInCreatedAt(in, builder);
        return;
      }
      if (bankAccountName.equals(attributeName)) {
        readInBankAccount(in, builder);
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

    private void readInToken(JsonReader in, ImmutableRecipientResult.Builder builder)
        throws IOException {
      builder.token(in.nextString());
    }

    private void readInCreatedAt(JsonReader in, ImmutableRecipientResult.Builder builder)
        throws IOException {
      builder.createdAt(in.nextString());
    }

    private void readInBankAccount(JsonReader in, ImmutableRecipientResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        BankAccountResult value = bankAccountTypeAdapter.read(in);
        builder.bankAccount(value);
      }
    }

    private void readInEmail(JsonReader in, ImmutableRecipientResult.Builder builder)
        throws IOException {
      builder.email(in.nextString());
    }

    private void readInName(JsonReader in, ImmutableRecipientResult.Builder builder)
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
