package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code CardResult}.
 * @see ImmutableCardResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.CardResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersCardResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (CardResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new CardResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersCardResult(CardResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class CardResultTypeAdapter extends TypeAdapter<CardResult> {
    public final Boolean primaryTypeSample = null;
    private final TypeAdapter<Boolean> primaryTypeAdapter;
    final String tokenName;
    final String schemeName;
    final String displayNumberName;
    final String primaryName;
    final String expiryMonthName;
    final String expiryYearName;
    final String nameName;
    final String addressLine1Name;
    final String addressLine2Name;
    final String addressCityName;
    final String addressPostcodeName;
    final String addressStateName;
    final String addressCountryName;

    static class CardResultNamingFields {
      public String token;
      public String scheme;
      public String displayNumber;
      public Boolean primary;
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

    CardResultTypeAdapter(Gson gson) {
      this.primaryTypeAdapter = gson.getAdapter( Boolean.class);
      this.tokenName = translateName(gson, CardResultNamingFields.class, "token");
      this.schemeName = translateName(gson, CardResultNamingFields.class, "scheme");
      this.displayNumberName = translateName(gson, CardResultNamingFields.class, "displayNumber");
      this.primaryName = translateName(gson, CardResultNamingFields.class, "primary");
      this.expiryMonthName = translateName(gson, CardResultNamingFields.class, "expiryMonth");
      this.expiryYearName = translateName(gson, CardResultNamingFields.class, "expiryYear");
      this.nameName = translateName(gson, CardResultNamingFields.class, "name");
      this.addressLine1Name = translateName(gson, CardResultNamingFields.class, "addressLine1");
      this.addressLine2Name = translateName(gson, CardResultNamingFields.class, "addressLine2");
      this.addressCityName = translateName(gson, CardResultNamingFields.class, "addressCity");
      this.addressPostcodeName = translateName(gson, CardResultNamingFields.class, "addressPostcode");
      this.addressStateName = translateName(gson, CardResultNamingFields.class, "addressState");
      this.addressCountryName = translateName(gson, CardResultNamingFields.class, "addressCountry");
    } 

    static boolean adapts(TypeToken<?> type) {
      return CardResult.class == type.getRawType()
          || ImmutableCardResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, CardResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeCardResult(out, value);
      }
    }

    @Override
    public CardResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readCardResult(in);
    }

    private void writeCardResult(JsonWriter out, CardResult instance)
        throws IOException {
      out.beginObject();
      out.name(tokenName);
      out.value(instance.token());
      out.name(schemeName);
      out.value(instance.scheme());
      out.name(displayNumberName);
      out.value(instance.displayNumber());
      @Nullable Boolean primaryValue = instance.primary();
      if (primaryValue != null) {
        out.name(primaryName);
        primaryTypeAdapter.write(out, primaryValue);
      } else if (out.getSerializeNulls()) {
        out.name(primaryName);
        out.nullValue();
      }
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

    private CardResult readCardResult(JsonReader in)
        throws IOException {
      ImmutableCardResult.Builder builder = ImmutableCardResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (tokenName.equals(attributeName)) {
        readInToken(in, builder);
        return;
      }
      if (schemeName.equals(attributeName)) {
        readInScheme(in, builder);
        return;
      }
      if (displayNumberName.equals(attributeName)) {
        readInDisplayNumber(in, builder);
        return;
      }
      if (primaryName.equals(attributeName)) {
        readInPrimary(in, builder);
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

    private void readInToken(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      builder.token(in.nextString());
    }

    private void readInScheme(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      builder.scheme(in.nextString());
    }

    private void readInDisplayNumber(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      builder.displayNumber(in.nextString());
    }

    private void readInPrimary(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        Boolean value = primaryTypeAdapter.read(in);
        builder.primary(value);
      }
    }

    private void readInExpiryMonth(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      builder.expiryMonth(in.nextString());
    }

    private void readInExpiryYear(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      builder.expiryYear(in.nextString());
    }

    private void readInName(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      builder.name(in.nextString());
    }

    private void readInAddressLine1(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      builder.addressLine1(in.nextString());
    }

    private void readInAddressLine2(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.addressLine2(in.nextString());
      }
    }

    private void readInAddressCity(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      builder.addressCity(in.nextString());
    }

    private void readInAddressPostcode(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.addressPostcode(in.nextString());
      }
    }

    private void readInAddressState(JsonReader in, ImmutableCardResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.addressState(in.nextString());
      }
    }

    private void readInAddressCountry(JsonReader in, ImmutableCardResult.Builder builder)
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
