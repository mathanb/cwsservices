package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code Transfer}.
 * @see ImmutableTransfer
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.Transfer"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersTransfer implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (TransferTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new TransferTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersTransfer(Transfer)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class TransferTypeAdapter extends TypeAdapter<Transfer> {
    public final Integer amountTypeSample = null;
    private final TypeAdapter<Integer> amountTypeAdapter;
    final String descriptionName;
    final String amountName;
    final String currencyName;
    final String recipientName;

    static class TransferNamingFields {
      public String description;
      public Integer amount;
      public String currency;
      public String recipient;
    }

    TransferTypeAdapter(Gson gson) {
      this.amountTypeAdapter = gson.getAdapter( Integer.class);
      this.descriptionName = translateName(gson, TransferNamingFields.class, "description");
      this.amountName = translateName(gson, TransferNamingFields.class, "amount");
      this.currencyName = translateName(gson, TransferNamingFields.class, "currency");
      this.recipientName = translateName(gson, TransferNamingFields.class, "recipient");
    } 

    static boolean adapts(TypeToken<?> type) {
      return Transfer.class == type.getRawType()
          || ImmutableTransfer.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, Transfer value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeTransfer(out, value);
      }
    }

    @Override
    public Transfer read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readTransfer(in);
    }

    private void writeTransfer(JsonWriter out, Transfer instance)
        throws IOException {
      out.beginObject();
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

    private Transfer readTransfer(JsonReader in)
        throws IOException {
      ImmutableTransfer.Builder builder = ImmutableTransfer.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableTransfer.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
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

    private void readInDescription(JsonReader in, ImmutableTransfer.Builder builder)
        throws IOException {
      builder.description(in.nextString());
    }

    private void readInAmount(JsonReader in, ImmutableTransfer.Builder builder)
        throws IOException {
      Integer value = amountTypeAdapter.read(in);
      builder.amount(value);
    }

    private void readInCurrency(JsonReader in, ImmutableTransfer.Builder builder)
        throws IOException {
      builder.currency(in.nextString());
    }

    private void readInRecipient(JsonReader in, ImmutableTransfer.Builder builder)
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
