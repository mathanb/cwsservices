package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code Charge}.
 * @see ImmutableCharge
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.Charge"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersCharge implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (ChargeTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new ChargeTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersCharge(Charge)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class ChargeTypeAdapter extends TypeAdapter<Charge> {
    public final Card cardTypeSample = null;
    public final Integer amountTypeSample = null;
    private final TypeAdapter<Card> cardTypeAdapter;
    private final TypeAdapter<Integer> amountTypeAdapter;
    final String captureName;
    final String cardName;
    final String cardTokenName;
    final String customerTokenName;
    final String emailName;
    final String descriptionName;
    final String amountName;
    final String ipAddressName;
    final String currencyName;
    final String metadataName;

    static class ChargeNamingFields {
      public String capture;
      public Card card;
      public String cardToken;
      public String customerToken;
      public String email;
      public String description;
      public Integer amount;
      public String ipAddress;
      public String currency;
      public Map<String, String> metadata;
    }

    ChargeTypeAdapter(Gson gson) {
      this.cardTypeAdapter = gson.getAdapter( Card.class);
      this.amountTypeAdapter = gson.getAdapter( Integer.class);
      this.captureName = translateName(gson, ChargeNamingFields.class, "capture");
      this.cardName = translateName(gson, ChargeNamingFields.class, "card");
      this.cardTokenName = translateName(gson, ChargeNamingFields.class, "cardToken");
      this.customerTokenName = translateName(gson, ChargeNamingFields.class, "customerToken");
      this.emailName = translateName(gson, ChargeNamingFields.class, "email");
      this.descriptionName = translateName(gson, ChargeNamingFields.class, "description");
      this.amountName = translateName(gson, ChargeNamingFields.class, "amount");
      this.ipAddressName = translateName(gson, ChargeNamingFields.class, "ipAddress");
      this.currencyName = translateName(gson, ChargeNamingFields.class, "currency");
      this.metadataName = translateName(gson, ChargeNamingFields.class, "metadata");
    } 

    static boolean adapts(TypeToken<?> type) {
      return Charge.class == type.getRawType()
          || ImmutableCharge.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, Charge value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeCharge(out, value);
      }
    }

    @Override
    public Charge read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readCharge(in);
    }

    private void writeCharge(JsonWriter out, Charge instance)
        throws IOException {
      out.beginObject();
      @Nullable String captureValue = instance.capture();
      if (captureValue != null) {
        out.name(captureName);
        out.value(captureValue);
      } else if (out.getSerializeNulls()) {
        out.name(captureName);
        out.nullValue();
      }
      @Nullable Card cardValue = instance.card();
      if (cardValue != null) {
        out.name(cardName);
        cardTypeAdapter.write(out, cardValue);
      } else if (out.getSerializeNulls()) {
        out.name(cardName);
        out.nullValue();
      }
      @Nullable String cardTokenValue = instance.cardToken();
      if (cardTokenValue != null) {
        out.name(cardTokenName);
        out.value(cardTokenValue);
      } else if (out.getSerializeNulls()) {
        out.name(cardTokenName);
        out.nullValue();
      }
      @Nullable String customerTokenValue = instance.customerToken();
      if (customerTokenValue != null) {
        out.name(customerTokenName);
        out.value(customerTokenValue);
      } else if (out.getSerializeNulls()) {
        out.name(customerTokenName);
        out.nullValue();
      }
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

    private Charge readCharge(JsonReader in)
        throws IOException {
      ImmutableCharge.Builder builder = ImmutableCharge.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableCharge.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (captureName.equals(attributeName)) {
        readInCapture(in, builder);
        return;
      }
      if (cardName.equals(attributeName)) {
        readInCard(in, builder);
        return;
      }
      if (cardTokenName.equals(attributeName)) {
        readInCardToken(in, builder);
        return;
      }
      if (customerTokenName.equals(attributeName)) {
        readInCustomerToken(in, builder);
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

    private void readInCapture(JsonReader in, ImmutableCharge.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.capture(in.nextString());
      }
    }

    private void readInCard(JsonReader in, ImmutableCharge.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        Card value = cardTypeAdapter.read(in);
        builder.card(value);
      }
    }

    private void readInCardToken(JsonReader in, ImmutableCharge.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.cardToken(in.nextString());
      }
    }

    private void readInCustomerToken(JsonReader in, ImmutableCharge.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.customerToken(in.nextString());
      }
    }

    private void readInEmail(JsonReader in, ImmutableCharge.Builder builder)
        throws IOException {
      builder.email(in.nextString());
    }

    private void readInDescription(JsonReader in, ImmutableCharge.Builder builder)
        throws IOException {
      builder.description(in.nextString());
    }

    private void readInAmount(JsonReader in, ImmutableCharge.Builder builder)
        throws IOException {
      Integer value = amountTypeAdapter.read(in);
      builder.amount(value);
    }

    private void readInIpAddress(JsonReader in, ImmutableCharge.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.ipAddress(in.nextString());
      }
    }

    private void readInCurrency(JsonReader in, ImmutableCharge.Builder builder)
        throws IOException {
      builder.currency(in.nextString());
    }

    private void readInMetadata(JsonReader in, ImmutableCharge.Builder builder)
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
