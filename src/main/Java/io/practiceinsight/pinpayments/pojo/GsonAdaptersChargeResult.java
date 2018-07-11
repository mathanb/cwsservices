package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code ChargeResult}.
 * @see ImmutableChargeResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.ChargeResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersChargeResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (ChargeResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new ChargeResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersChargeResult(ChargeResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class ChargeResultTypeAdapter extends TypeAdapter<ChargeResult> {
    public final CardResult cardTypeSample = null;
    public final Transfer transferTypeSample = null;
    public final BigDecimal amountRefundedTypeSample = null;
    public final BigDecimal totalFeesTypeSample = null;
    public final BigDecimal merchantEntitlementTypeSample = null;
    public final Integer amountTypeSample = null;
    private final TypeAdapter<CardResult> cardTypeAdapter;
    private final TypeAdapter<Transfer> transferTypeAdapter;
    private final TypeAdapter<BigDecimal> amountRefundedTypeAdapter;
    private final TypeAdapter<BigDecimal> totalFeesTypeAdapter;
    private final TypeAdapter<BigDecimal> merchantEntitlementTypeAdapter;
    private final TypeAdapter<Integer> amountTypeAdapter;
    final String tokenName;
    final String successName;
    final String createdAtName;
    final String statusMessageName;
    final String errorMessageName;
    final String cardName;
    final String capturedName;
    final String authorisationExpiredName;
    final String transferName;
    final String amountRefundedName;
    final String totalFeesName;
    final String merchantEntitlementName;
    final String refundPendingName;
    final String settlementCurrencyName;
    final String emailName;
    final String descriptionName;
    final String amountName;
    final String ipAddressName;
    final String currencyName;
    final String metadataName;

    static class ChargeResultNamingFields {
      public String token;
      public boolean success;
      public String createdAt;
      public String statusMessage;
      public String errorMessage;
      public CardResult card;
      public boolean captured;
      public boolean authorisationExpired;
      public List<Transfer> transfer;
      public BigDecimal amountRefunded;
      public BigDecimal totalFees;
      public BigDecimal merchantEntitlement;
      public boolean refundPending;
      public String settlementCurrency;
      public String email;
      public String description;
      public Integer amount;
      public String ipAddress;
      public String currency;
      public Map<String, String> metadata;
    }

    ChargeResultTypeAdapter(Gson gson) {
      this.cardTypeAdapter = gson.getAdapter( CardResult.class);
      this.transferTypeAdapter = gson.getAdapter( Transfer.class);
      this.amountRefundedTypeAdapter = gson.getAdapter( BigDecimal.class);
      this.totalFeesTypeAdapter = gson.getAdapter( BigDecimal.class);
      this.merchantEntitlementTypeAdapter = gson.getAdapter( BigDecimal.class);
      this.amountTypeAdapter = gson.getAdapter( Integer.class);
      this.tokenName = translateName(gson, ChargeResultNamingFields.class, "token");
      this.successName = translateName(gson, ChargeResultNamingFields.class, "success");
      this.createdAtName = translateName(gson, ChargeResultNamingFields.class, "createdAt");
      this.statusMessageName = translateName(gson, ChargeResultNamingFields.class, "statusMessage");
      this.errorMessageName = translateName(gson, ChargeResultNamingFields.class, "errorMessage");
      this.cardName = translateName(gson, ChargeResultNamingFields.class, "card");
      this.capturedName = translateName(gson, ChargeResultNamingFields.class, "captured");
      this.authorisationExpiredName = translateName(gson, ChargeResultNamingFields.class, "authorisationExpired");
      this.transferName = translateName(gson, ChargeResultNamingFields.class, "transfer");
      this.amountRefundedName = translateName(gson, ChargeResultNamingFields.class, "amountRefunded");
      this.totalFeesName = translateName(gson, ChargeResultNamingFields.class, "totalFees");
      this.merchantEntitlementName = translateName(gson, ChargeResultNamingFields.class, "merchantEntitlement");
      this.refundPendingName = translateName(gson, ChargeResultNamingFields.class, "refundPending");
      this.settlementCurrencyName = translateName(gson, ChargeResultNamingFields.class, "settlementCurrency");
      this.emailName = translateName(gson, ChargeResultNamingFields.class, "email");
      this.descriptionName = translateName(gson, ChargeResultNamingFields.class, "description");
      this.amountName = translateName(gson, ChargeResultNamingFields.class, "amount");
      this.ipAddressName = translateName(gson, ChargeResultNamingFields.class, "ipAddress");
      this.currencyName = translateName(gson, ChargeResultNamingFields.class, "currency");
      this.metadataName = translateName(gson, ChargeResultNamingFields.class, "metadata");
    } 

    static boolean adapts(TypeToken<?> type) {
      return ChargeResult.class == type.getRawType()
          || ImmutableChargeResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, ChargeResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeChargeResult(out, value);
      }
    }

    @Override
    public ChargeResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readChargeResult(in);
    }

    private void writeChargeResult(JsonWriter out, ChargeResult instance)
        throws IOException {
      out.beginObject();
      out.name(tokenName);
      out.value(instance.token());
      out.name(successName);
      out.value(instance.success());
      out.name(createdAtName);
      out.value(instance.createdAt());
      out.name(statusMessageName);
      out.value(instance.statusMessage());
      @Nullable String errorMessageValue = instance.errorMessage();
      if (errorMessageValue != null) {
        out.name(errorMessageName);
        out.value(errorMessageValue);
      } else if (out.getSerializeNulls()) {
        out.name(errorMessageName);
        out.nullValue();
      }
      out.name(cardName);
      cardTypeAdapter.write(out, instance.card());
      out.name(capturedName);
      out.value(instance.captured());
      out.name(authorisationExpiredName);
      out.value(instance.authorisationExpired());
      List<Transfer> transferElements = instance.transfer();
      out.name(transferName);
      out.beginArray();
      for (Transfer e : transferElements) {
        transferTypeAdapter.write(out, e);
      }
      out.endArray();
      out.name(amountRefundedName);
      amountRefundedTypeAdapter.write(out, instance.amountRefunded());
      @Nullable BigDecimal totalFeesValue = instance.totalFees();
      if (totalFeesValue != null) {
        out.name(totalFeesName);
        totalFeesTypeAdapter.write(out, totalFeesValue);
      } else if (out.getSerializeNulls()) {
        out.name(totalFeesName);
        out.nullValue();
      }
      @Nullable BigDecimal merchantEntitlementValue = instance.merchantEntitlement();
      if (merchantEntitlementValue != null) {
        out.name(merchantEntitlementName);
        merchantEntitlementTypeAdapter.write(out, merchantEntitlementValue);
      } else if (out.getSerializeNulls()) {
        out.name(merchantEntitlementName);
        out.nullValue();
      }
      out.name(refundPendingName);
      out.value(instance.refundPending());
      out.name(settlementCurrencyName);
      out.value(instance.settlementCurrency());
      out.name(emailName);
      out.value(instance.email());
      out.name(descriptionName);
      out.value(instance.description());
      out.name(amountName);
      amountTypeAdapter.write(out, instance.amount());
      @Nullable String ipAddressValue = instance.ipAddress();
      if (ipAddressValue != null) {
        out.name(ipAddressName);
        out.value(ipAddressValue);
      } else if (out.getSerializeNulls()) {
        out.name(ipAddressName);
        out.nullValue();
      }
      out.name(currencyName);
      out.value(instance.currency());
      Map<String, String> metadataMapping = instance.metadata();
      out.name(metadataName);
      out.beginObject();
      for (Map.Entry<String, String> e : metadataMapping.entrySet()) {
        String key = e.getKey();
        out.name(key);
        String value = e.getValue();
        out.value(value);
      }
      out.endObject();
      out.endObject();
    }

    private ChargeResult readChargeResult(JsonReader in)
        throws IOException {
      ImmutableChargeResult.Builder builder = ImmutableChargeResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (tokenName.equals(attributeName)) {
        readInToken(in, builder);
        return;
      }
      if (successName.equals(attributeName)) {
        readInSuccess(in, builder);
        return;
      }
      if (createdAtName.equals(attributeName)) {
        readInCreatedAt(in, builder);
        return;
      }
      if (statusMessageName.equals(attributeName)) {
        readInStatusMessage(in, builder);
        return;
      }
      if (errorMessageName.equals(attributeName)) {
        readInErrorMessage(in, builder);
        return;
      }
      if (cardName.equals(attributeName)) {
        readInCard(in, builder);
        return;
      }
      if (capturedName.equals(attributeName)) {
        readInCaptured(in, builder);
        return;
      }
      if (authorisationExpiredName.equals(attributeName)) {
        readInAuthorisationExpired(in, builder);
        return;
      }
      if (transferName.equals(attributeName)) {
        readInTransfer(in, builder);
        return;
      }
      if (amountRefundedName.equals(attributeName)) {
        readInAmountRefunded(in, builder);
        return;
      }
      if (totalFeesName.equals(attributeName)) {
        readInTotalFees(in, builder);
        return;
      }
      if (merchantEntitlementName.equals(attributeName)) {
        readInMerchantEntitlement(in, builder);
        return;
      }
      if (refundPendingName.equals(attributeName)) {
        readInRefundPending(in, builder);
        return;
      }
      if (settlementCurrencyName.equals(attributeName)) {
        readInSettlementCurrency(in, builder);
        return;
      }
      if (emailName.equals(attributeName)) {
        readInEmail(in, builder);
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
      if (ipAddressName.equals(attributeName)) {
        readInIpAddress(in, builder);
        return;
      }
      if (currencyName.equals(attributeName)) {
        readInCurrency(in, builder);
        return;
      }
      if (metadataName.equals(attributeName)) {
        readInMetadata(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInToken(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.token(in.nextString());
    }

    private void readInSuccess(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.success(in.nextBoolean());
    }

    private void readInCreatedAt(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.createdAt(in.nextString());
    }

    private void readInStatusMessage(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.statusMessage(in.nextString());
    }

    private void readInErrorMessage(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.errorMessage(in.nextString());
      }
    }

    private void readInCard(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      CardResult value = cardTypeAdapter.read(in);
      builder.card(value);
    }

    private void readInCaptured(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.captured(in.nextBoolean());
    }

    private void readInAuthorisationExpired(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.authorisationExpired(in.nextBoolean());
    }

    private void readInTransfer(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          Transfer value = transferTypeAdapter.read(in);
          builder.addTransfer(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        Transfer value = transferTypeAdapter.read(in);
        builder.addTransfer(value);
      }
    }

    private void readInAmountRefunded(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      BigDecimal value = amountRefundedTypeAdapter.read(in);
      builder.amountRefunded(value);
    }

    private void readInTotalFees(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        BigDecimal value = totalFeesTypeAdapter.read(in);
        builder.totalFees(value);
      }
    }

    private void readInMerchantEntitlement(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        BigDecimal value = merchantEntitlementTypeAdapter.read(in);
        builder.merchantEntitlement(value);
      }
    }

    private void readInRefundPending(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.refundPending(in.nextBoolean());
    }

    private void readInSettlementCurrency(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.settlementCurrency(in.nextString());
    }

    private void readInEmail(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.email(in.nextString());
    }

    private void readInDescription(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.description(in.nextString());
    }

    private void readInAmount(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      Integer value = amountTypeAdapter.read(in);
      builder.amount(value);
    }

    private void readInIpAddress(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.ipAddress(in.nextString());
      }
    }

    private void readInCurrency(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      builder.currency(in.nextString());
    }

    private void readInMetadata(JsonReader in, ImmutableChargeResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        in.beginObject();
        while(in.hasNext()) {
          String rawKey = in.nextName();
          String key = rawKey;
          String value = in.nextString();
          builder.putMetadata(key, value);
        }
        in.endObject();
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
