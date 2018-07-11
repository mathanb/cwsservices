package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code Card}.
 * @see ImmutableCard
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.Card"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersCard implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (CardTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new CardTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersCard(Card)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class CardTypeAdapter extends TypeAdapter<Card> {
    final String numberName;
    final String cvcName;
    final String expiryMonthName;
    final String expiryYearName;
    final String nameName;
    final String addressLine1Name;
    final String addressLine2Name;
    final String addressCityName;
    final String addressPostcodeName;
    final String addressStateName;
    final String addressCountryName;

    static class CardNamingFields {
      public String number;
      public String cvc;
      public String expiryMonth;
      public String expiryYear;
      public String name;
      public String addressLine1;
      public String addressLine2;
      public String addressCity;
      public String addressPostcode;
      public String addressState;
      public String addressCountry;
    }

    CardTypeAdapter(Gson gson) {
      this.numberName = translateName(gson, CardNamingFields.class, "number");
      this.cvcName = translateName(gson, CardNamingFields.class, "cvc");
      this.expiryMonthName = translateName(gson, CardNamingFields.class, "expiryMonth");
      this.expiryYearName = translateName(gson, CardNamingFields.class, "expiryYear");
      this.nameName = translateName(gson, CardNamingFields.class, "name");
      this.addressLine1Name = translateName(gson, CardNamingFields.class, "addressLine1");
      this.addressLine2Name = translateName(gson, CardNamingFields.class, "addressLine2");
      this.addressCityName = translateName(gson, CardNamingFields.class, "addressCity");
      this.addressPostcodeName = translateName(gson, CardNamingFields.class, "addressPostcode");
      this.addressStateName = translateName(gson, CardNamingFields.class, "addressState");
      this.addressCountryName = translateName(gson, CardNamingFields.class, "addressCountry");
    } 

    static boolean adapts(TypeToken<?> type) {
      return Card.class == type.getRawType()
          || ImmutableCard.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, Card value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeCard(out, value);
      }
    }

    @Override
    public Card read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readCard(in);
    }

    private void writeCard(JsonWriter out, Card instance)
        throws IOException {
      out.beginObject();
      out.name(numberName);
      out.value(instance.number());
      out.name(cvcName);
      out.value(instance.cvc());
      out.name(expiryMonthName);
      out.value(instance.expiryMonth());
      out.name(expiryYearName);
      out.value(instance.expiryYear());
      out.name(nameName);
      out.value(instance.name());
      out.name(addressLine1Name);
      out.value(instance.addressLine1());
      @Nullable String addressLine2Value = instance.addressLine2();
      if (addressLine2Value != null) {
        out.name(addressLine2Name);
        out.value(addressLine2Value);
      } else if (out.getSerializeNulls()) {
        out.name(addressLine2Name);
        out.nullValue();
      }
      out.name(addressCityName);
      out.value(instance.addressCity());
      @Nullable String addressPostcodeValue = instance.addressPostcode();
      if (addressPostcodeValue != null) {
        out.name(addressPostcodeName);
        out.value(addressPostcodeValue);
      } else if (out.getSerializeNulls()) {
        out.name(addressPostcodeName);
        out.nullValue();
      }
      @Nullable String addressStateValue = instance.addressState();
      if (addressStateValue != null) {
        out.name(addressStateName);
        out.value(addressStateValue);
      } else if (out.getSerializeNulls()) {
        out.name(addressStateName);
        out.nullValue();
      }
      out.name(addressCountryName);
      out.value(instance.addressCountry());
      out.endObject();
    }

    private Card readCard(JsonReader in)
        throws IOException {
      ImmutableCard.Builder builder = ImmutableCard.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (numberName.equals(attributeName)) {
        readInNumber(in, builder);
        return;
      }
      if (cvcName.equals(attributeName)) {
        readInCvc(in, builder);
        return;
      }
      if (expiryMonthName.equals(attributeName)) {
        readInExpiryMonth(in, builder);
        return;
      }
      if (expiryYearName.equals(attributeName)) {
        readInExpiryYear(in, builder);
        return;
      }
      if (nameName.equals(attributeName)) {
        readInName(in, builder);
        return;
      }
      if (addressLine1Name.equals(attributeName)) {
        readInAddressLine1(in, builder);
        return;
      }
      if (addressLine2Name.equals(attributeName)) {
        readInAddressLine2(in, builder);
        return;
      }
      if (addressCityName.equals(attributeName)) {
        readInAddressCity(in, builder);
        return;
      }
      if (addressPostcodeName.equals(attributeName)) {
        readInAddressPostcode(in, builder);
        return;
      }
      if (addressStateName.equals(attributeName)) {
        readInAddressState(in, builder);
        return;
      }
      if (addressCountryName.equals(attributeName)) {
        readInAddressCountry(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInNumber(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      builder.number(in.nextString());
    }

    private void readInCvc(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      builder.cvc(in.nextString());
    }

    private void readInExpiryMonth(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      builder.expiryMonth(in.nextString());
    }

    private void readInExpiryYear(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      builder.expiryYear(in.nextString());
    }

    private void readInName(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      builder.name(in.nextString());
    }

    private void readInAddressLine1(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      builder.addressLine1(in.nextString());
    }

    private void readInAddressLine2(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.addressLine2(in.nextString());
      }
    }

    private void readInAddressCity(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      builder.addressCity(in.nextString());
    }

    private void readInAddressPostcode(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.addressPostcode(in.nextString());
      }
    }

    private void readInAddressState(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.addressState(in.nextString());
      }
    }

    private void readInAddressCountry(JsonReader in, ImmutableCard.Builder builder)
        throws IOException {
      builder.addressCountry(in.nextString());
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
