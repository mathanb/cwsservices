package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code Refund}.
 * @see ImmutableRefund
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.Refund"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersRefund implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (RefundTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new RefundTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersRefund(Refund)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class RefundTypeAdapter extends TypeAdapter<Refund> {
    public final Integer amountTypeSample = null;
    private final TypeAdapter<Integer> amountTypeAdapter;
    final String amountName;

    static class RefundNamingFields {
      public Integer amount;
    }

    RefundTypeAdapter(Gson gson) {
      this.amountTypeAdapter = gson.getAdapter( Integer.class);
      this.amountName = translateName(gson, RefundNamingFields.class, "amount");
    } 

    static boolean adapts(TypeToken<?> type) {
      return Refund.class == type.getRawType()
          || ImmutableRefund.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, Refund value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeRefund(out, value);
      }
    }

    @Override
    public Refund read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readRefund(in);
    }

    private void writeRefund(JsonWriter out, Refund instance)
        throws IOException {
      out.beginObject();
      @Nullable Integer amountValue = instance.amount();
      if (amountValue != null) {
        out.name(amountName);
        amountTypeAdapter.write(out, amountValue);
      } else if (out.getSerializeNulls()) {
        out.name(amountName);
        out.nullValue();
      }
      out.endObject();
    }

    private Refund readRefund(JsonReader in)
        throws IOException {
      ImmutableRefund.Builder builder = ImmutableRefund.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableRefund.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (amountName.equals(attributeName)) {
        readInAmount(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInAmount(JsonReader in, ImmutableRefund.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        Integer value = amountTypeAdapter.read(in);
        builder.amount(value);
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
