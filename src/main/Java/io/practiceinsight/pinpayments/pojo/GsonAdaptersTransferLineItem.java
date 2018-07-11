package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code TransferLineItem}.
 * @see ImmutableTransferLineItem
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.TransferLineItem"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersTransferLineItem implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (TransferLineItemTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new TransferLineItemTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersTransferLineItem(TransferLineItem)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class TransferLineItemTypeAdapter extends TypeAdapter<TransferLineItem> {
    public final Integer amountTypeSample = null;
    private final TypeAdapter<Integer> amountTypeAdapter;
    final String typeName;
    final String objectName;
    final String amountName;

    static class TransferLineItemNamingFields {
      public String type;
      public String object;
      public Integer amount;
    }

    TransferLineItemTypeAdapter(Gson gson) {
      this.amountTypeAdapter = gson.getAdapter( Integer.class);
      this.typeName = translateName(gson, TransferLineItemNamingFields.class, "type");
      this.objectName = translateName(gson, TransferLineItemNamingFields.class, "object");
      this.amountName = translateName(gson, TransferLineItemNamingFields.class, "amount");
    } 

    static boolean adapts(TypeToken<?> type) {
      return TransferLineItem.class == type.getRawType()
          || ImmutableTransferLineItem.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, TransferLineItem value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeTransferLineItem(out, value);
      }
    }

    @Override
    public TransferLineItem read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readTransferLineItem(in);
    }

    private void writeTransferLineItem(JsonWriter out, TransferLineItem instance)
        throws IOException {
      out.beginObject();
      out.name(typeName);
      out.value(instance.type());
      @Nullable String objectValue = instance.object();
      if (objectValue != null) {
        out.name(objectName);
        out.value(objectValue);
      } else if (out.getSerializeNulls()) {
        out.name(objectName);
        out.nullValue();
      }
      out.name(amountName);
      amountTypeAdapter.write(out, instance.amount());
      out.endObject();
    }

    private TransferLineItem readTransferLineItem(JsonReader in)
        throws IOException {
      ImmutableTransferLineItem.Builder builder = ImmutableTransferLineItem.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableTransferLineItem.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (typeName.equals(attributeName)) {
        readInType(in, builder);
        return;
      }
      if (objectName.equals(attributeName)) {
        readInObject(in, builder);
        return;
      }
      if (amountName.equals(attributeName)) {
        readInAmount(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInType(JsonReader in, ImmutableTransferLineItem.Builder builder)
        throws IOException {
      builder.type(in.nextString());
    }

    private void readInObject(JsonReader in, ImmutableTransferLineItem.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.object(in.nextString());
      }
    }

    private void readInAmount(JsonReader in, ImmutableTransferLineItem.Builder builder)
        throws IOException {
      Integer value = amountTypeAdapter.read(in);
      builder.amount(value);
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
