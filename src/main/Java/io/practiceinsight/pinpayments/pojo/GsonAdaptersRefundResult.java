package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code RefundResult}.
 * @see ImmutableRefundResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.RefundResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersRefundResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (RefundResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new RefundResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersRefundResult(RefundResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class RefundResultTypeAdapter extends TypeAdapter<RefundResult> {
    public final Boolean successTypeSample = null;
    public final Integer amountTypeSample = null;
    private final TypeAdapter<Boolean> successTypeAdapter;
    private final TypeAdapter<Integer> amountTypeAdapter;
    final String tokenName;
    final String successName;
    final String amountName;
    final String currencyName;
    final String chargeName;
    final String createdAtName;
    final String errorMessageName;
    final String statusMessageName;

    static class RefundResultNamingFields {
      public String token;
      public Boolean success;
      public Integer amount;
      public String currency;
      public String charge;
      public String createdAt;
      public String errorMessage;
      public String statusMessage;
    }

    RefundResultTypeAdapter(Gson gson) {
      this.successTypeAdapter = gson.getAdapter( Boolean.class);
      this.amountTypeAdapter = gson.getAdapter( Integer.class);
      this.tokenName = translateName(gson, RefundResultNamingFields.class, "token");
      this.successName = translateName(gson, RefundResultNamingFields.class, "success");
      this.amountName = translateName(gson, RefundResultNamingFields.class, "amount");
      this.currencyName = translateName(gson, RefundResultNamingFields.class, "currency");
      this.chargeName = translateName(gson, RefundResultNamingFields.class, "charge");
      this.createdAtName = translateName(gson, RefundResultNamingFields.class, "createdAt");
      this.errorMessageName = translateName(gson, RefundResultNamingFields.class, "errorMessage");
      this.statusMessageName = translateName(gson, RefundResultNamingFields.class, "statusMessage");
    } 

    static boolean adapts(TypeToken<?> type) {
      return RefundResult.class == type.getRawType()
          || ImmutableRefundResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, RefundResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeRefundResult(out, value);
      }
    }

    @Override
    public RefundResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readRefundResult(in);
    }

    private void writeRefundResult(JsonWriter out, RefundResult instance)
        throws IOException {
      out.beginObject();
      out.name(tokenName);
      out.value(instance.token());
      @Nullable Boolean successValue = instance.success();
      if (successValue != null) {
        out.name(successName);
        successTypeAdapter.write(out, successValue);
      } else if (out.getSerializeNulls()) {
        out.name(successName);
        out.nullValue();
      }
      out.name(amountName);
      amountTypeAdapter.write(out, instance.amount());
      out.name(currencyName);
      out.value(instance.currency());
      out.name(chargeName);
      out.value(instance.charge());
      out.name(createdAtName);
      out.value(instance.createdAt());
      @Nullable String errorMessageValue = instance.errorMessage();
      if (errorMessageValue != null) {
        out.name(errorMessageName);
        out.value(errorMessageValue);
      } else if (out.getSerializeNulls()) {
        out.name(errorMessageName);
        out.nullValue();
      }
      @Nullable String statusMessageValue = instance.statusMessage();
      if (statusMessageValue != null) {
        out.name(statusMessageName);
        out.value(statusMessageValue);
      } else if (out.getSerializeNulls()) {
        out.name(statusMessageName);
        out.nullValue();
      }
      out.endObject();
    }

    private RefundResult readRefundResult(JsonReader in)
        throws IOException {
      ImmutableRefundResult.Builder builder = ImmutableRefundResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableRefundResult.Builder builder)
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
      if (amountName.equals(attributeName)) {
        readInAmount(in, builder);
        return;
      }
      if (currencyName.equals(attributeName)) {
        readInCurrency(in, builder);
        return;
      }
      if (chargeName.equals(attributeName)) {
        readInCharge(in, builder);
        return;
      }
      if (createdAtName.equals(attributeName)) {
        readInCreatedAt(in, builder);
        return;
      }
      if (errorMessageName.equals(attributeName)) {
        readInErrorMessage(in, builder);
        return;
      }
      if (statusMessageName.equals(attributeName)) {
        readInStatusMessage(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInToken(JsonReader in, ImmutableRefundResult.Builder builder)
        throws IOException {
      builder.token(in.nextString());
    }

    private void readInSuccess(JsonReader in, ImmutableRefundResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        Boolean value = successTypeAdapter.read(in);
        builder.success(value);
      }
    }

    private void readInAmount(JsonReader in, ImmutableRefundResult.Builder builder)
        throws IOException {
      Integer value = amountTypeAdapter.read(in);
      builder.amount(value);
    }

    private void readInCurrency(JsonReader in, ImmutableRefundResult.Builder builder)
        throws IOException {
      builder.currency(in.nextString());
    }

    private void readInCharge(JsonReader in, ImmutableRefundResult.Builder builder)
        throws IOException {
      builder.charge(in.nextString());
    }

    private void readInCreatedAt(JsonReader in, ImmutableRefundResult.Builder builder)
        throws IOException {
      builder.createdAt(in.nextString());
    }

    private void readInErrorMessage(JsonReader in, ImmutableRefundResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.errorMessage(in.nextString());
      }
    }

    private void readInStatusMessage(JsonReader in, ImmutableRefundResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.statusMessage(in.nextString());
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
