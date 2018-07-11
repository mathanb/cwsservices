package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code Balance}.
 * @see ImmutableBalance
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.Balance"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersBalance implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (BalanceTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new BalanceTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersBalance(Balance)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class BalanceTypeAdapter extends TypeAdapter<Balance> {
    public final Integer amountTypeSample = null;
    private final TypeAdapter<Integer> amountTypeAdapter;
    final String amountName;
    final String currencyName;

    static class BalanceNamingFields {
      public Integer amount;
      public String currency;
    }

    BalanceTypeAdapter(Gson gson) {
      this.amountTypeAdapter = gson.getAdapter( Integer.class);
      this.amountName = translateName(gson, BalanceNamingFields.class, "amount");
      this.currencyName = translateName(gson, BalanceNamingFields.class, "currency");
    } 

    static boolean adapts(TypeToken<?> type) {
      return Balance.class == type.getRawType()
          || ImmutableBalance.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, Balance value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeBalance(out, value);
      }
    }

    @Override
    public Balance read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readBalance(in);
    }

    private void writeBalance(JsonWriter out, Balance instance)
        throws IOException {
      out.beginObject();
      out.name(amountName);
      amountTypeAdapter.write(out, instance.amount());
      out.name(currencyName);
      out.value(instance.currency());
      out.endObject();
    }

    private Balance readBalance(JsonReader in)
        throws IOException {
      ImmutableBalance.Builder builder = ImmutableBalance.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableBalance.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (amountName.equals(attributeName)) {
        readInAmount(in, builder);
        return;
      }
      if (currencyName.equals(attributeName)) {
        readInCurrency(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInAmount(JsonReader in, ImmutableBalance.Builder builder)
        throws IOException {
      Integer value = amountTypeAdapter.read(in);
      builder.amount(value);
    }

    private void readInCurrency(JsonReader in, ImmutableBalance.Builder builder)
        throws IOException {
      builder.currency(in.nextString());
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
