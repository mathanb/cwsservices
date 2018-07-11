package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code TransferResult}.
 * @see ImmutableTransferResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.TransferResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersTransferResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (TransferResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new TransferResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersTransferResult(TransferResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class TransferResultTypeAdapter extends TypeAdapter<TransferResult> {
    public final Integer totalDebitsTypeSample = null;
    public final Integer totalCreditsTypeSample = null;
    public final BankAccountResult bankAccountTypeSample = null;
    public final Integer amountTypeSample = null;
    private final TypeAdapter<Integer> totalDebitsTypeAdapter;
    private final TypeAdapter<Integer> totalCreditsTypeAdapter;
    private final TypeAdapter<BankAccountResult> bankAccountTypeAdapter;
    private final TypeAdapter<Integer> amountTypeAdapter;
    final String tokenName;
    final String statusName;
    final String totalDebitsName;
    final String totalCreditsName;
    final String createdAtName;
    final String paidAtName;
    final String bankAccountName;
    final String descriptionName;
    final String amountName;
    final String currencyName;
    final String recipientName;

    static class TransferResultNamingFields {
      public String token;
      public String status;
      public Integer totalDebits;
      public Integer totalCredits;
      public String createdAt;
      public String paidAt;
      public BankAccountResult bankAccount;
      public String description;
      public Integer amount;
      public String currency;
      public String recipient;
    }

    TransferResultTypeAdapter(Gson gson) {
      this.totalDebitsTypeAdapter = gson.getAdapter( Integer.class);
      this.totalCreditsTypeAdapter = gson.getAdapter( Integer.class);
      this.bankAccountTypeAdapter = gson.getAdapter( BankAccountResult.class);
      this.amountTypeAdapter = gson.getAdapter( Integer.class);
      this.tokenName = translateName(gson, TransferResultNamingFields.class, "token");
      this.statusName = translateName(gson, TransferResultNamingFields.class, "status");
      this.totalDebitsName = translateName(gson, TransferResultNamingFields.class, "totalDebits");
      this.totalCreditsName = translateName(gson, TransferResultNamingFields.class, "totalCredits");
      this.createdAtName = translateName(gson, TransferResultNamingFields.class, "createdAt");
      this.paidAtName = translateName(gson, TransferResultNamingFields.class, "paidAt");
      this.bankAccountName = translateName(gson, TransferResultNamingFields.class, "bankAccount");
      this.descriptionName = translateName(gson, TransferResultNamingFields.class, "description");
      this.amountName = translateName(gson, TransferResultNamingFields.class, "amount");
      this.currencyName = translateName(gson, TransferResultNamingFields.class, "currency");
      this.recipientName = translateName(gson, TransferResultNamingFields.class, "recipient");
    } 

    static boolean adapts(TypeToken<?> type) {
      return TransferResult.class == type.getRawType()
          || ImmutableTransferResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, TransferResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeTransferResult(out, value);
      }
    }

    @Override
    public TransferResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readTransferResult(in);
    }

    private void writeTransferResult(JsonWriter out, TransferResult instance)
        throws IOException {
      out.beginObject();
      out.name(tokenName);
      out.value(instance.token());
      out.name(statusName);
      out.value(instance.status());
      out.name(totalDebitsName);
      totalDebitsTypeAdapter.write(out, instance.totalDebits());
      out.name(totalCreditsName);
      totalCreditsTypeAdapter.write(out, instance.totalCredits());
      out.name(createdAtName);
      out.value(instance.createdAt());
      out.name(paidAtName);
      out.value(instance.paidAt());
      out.name(bankAccountName);
      bankAccountTypeAdapter.write(out, instance.bankAccount());
      out.name(descriptionName);
      out.value(instance.description());
      out.name(amountName);
      amountTypeAdapter.write(out, instance.amount());
      out.name(currencyName);
      out.value(instance.currency());
      out.name(recipientName);
      out.value(instance.recipient());
      out.endObject();
    }

    private TransferResult readTransferResult(JsonReader in)
        throws IOException {
      ImmutableTransferResult.Builder builder = ImmutableTransferResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (tokenName.equals(attributeName)) {
        readInToken(in, builder);
        return;
      }
      if (statusName.equals(attributeName)) {
        readInStatus(in, builder);
        return;
      }
      if (totalDebitsName.equals(attributeName)) {
        readInTotalDebits(in, builder);
        return;
      }
      if (totalCreditsName.equals(attributeName)) {
        readInTotalCredits(in, builder);
        return;
      }
      if (createdAtName.equals(attributeName)) {
        readInCreatedAt(in, builder);
        return;
      }
      if (paidAtName.equals(attributeName)) {
        readInPaidAt(in, builder);
        return;
      }
      if (bankAccountName.equals(attributeName)) {
        readInBankAccount(in, builder);
        return;
      }
      if (descriptionName.equals(attributeName)) {
        readInDescription(in, builder);
        return;
      }
      if (amountName.equals(attributeName)) {
        readInAmount(in, builder);
        return;
      }
      if (currencyName.equals(attributeName)) {
        readInCurrency(in, builder);
        return;
      }
      if (recipientName.equals(attributeName)) {
        readInRecipient(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInToken(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      builder.token(in.nextString());
    }

    private void readInStatus(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      builder.status(in.nextString());
    }

    private void readInTotalDebits(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      Integer value = totalDebitsTypeAdapter.read(in);
      builder.totalDebits(value);
    }

    private void readInTotalCredits(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      Integer value = totalCreditsTypeAdapter.read(in);
      builder.totalCredits(value);
    }

    private void readInCreatedAt(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      builder.createdAt(in.nextString());
    }

    private void readInPaidAt(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      builder.paidAt(in.nextString());
    }

    private void readInBankAccount(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      BankAccountResult value = bankAccountTypeAdapter.read(in);
      builder.bankAccount(value);
    }

    private void readInDescription(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      builder.description(in.nextString());
    }

    private void readInAmount(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      Integer value = amountTypeAdapter.read(in);
      builder.amount(value);
    }

    private void readInCurrency(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      builder.currency(in.nextString());
    }

    private void readInRecipient(JsonReader in, ImmutableTransferResult.Builder builder)
        throws IOException {
      builder.recipient(in.nextString());
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
