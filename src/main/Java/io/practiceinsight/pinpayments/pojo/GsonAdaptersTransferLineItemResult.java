package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code TransferLineItemResult}.
 * @see ImmutableTransferLineItemResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.TransferLineItemResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersTransferLineItemResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (TransferLineItemResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new TransferLineItemResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersTransferLineItemResult(TransferLineItemResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class TransferLineItemResultTypeAdapter extends TypeAdapter<TransferLineItemResult> {
    public final Integer amountTypeSample = null;
    private final TypeAdapter<Integer> amountTypeAdapter;
    final String tokenName;
    final String createdAtName;
    final String typeName;
    final String objectName;
    final String amountName;

    static class TransferLineItemResultNamingFields {
      public String token;
      public String createdAt;
      public String type;
      public String object;
      public Integer amount;
    }

    TransferLineItemResultTypeAdapter(Gson gson) {
      this.amountTypeAdapter = gson.getAdapter( Integer.class);
      this.tokenName = translateName(gson, TransferLineItemResultNamingFields.class, "token");
      this.createdAtName = translateName(gson, TransferLineItemResultNamingFields.class, "createdAt");
      this.typeName = translateName(gson, TransferLineItemResultNamingFields.class, "type");
      this.objectName = translateName(gson, TransferLineItemResultNamingFields.class, "object");
      this.amountName = translateName(gson, TransferLineItemResultNamingFields.class, "amount");
    } 

    static boolean adapts(TypeToken<?> type) {
      return TransferLineItemResult.class == type.getRawType()
          || ImmutableTransferLineItemResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, TransferLineItemResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeTransferLineItemResult(out, value);
      }
    }

    @Override
    public TransferLineItemResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readTransferLineItemResult(in);
    }

    private void writeTransferLineItemResult(JsonWriter out, TransferLineItemResult instance)
        throws IOException {
      out.beginObject();
      @Nullable String tokenValue = instance.token();
      if (tokenValue != null) {
        out.name(tokenName);
        out.value(tokenValue);
      } else if (out.getSerializeNulls()) {
        out.name(tokenName);
        out.nullValue();
      }
      out.name(createdAtName);
      out.value(instance.createdAt());
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

    private TransferLineItemResult readTransferLineItemResult(JsonReader in)
        throws IOException {
      ImmutableTransferLineItemResult.Builder builder = ImmutableTransferLineItemResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableTransferLineItemResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (tokenName.equals(attributeName)) {
        readInToken(in, builder);
        return;
      }
      if (createdAtName.equals(attributeName)) {
        readInCreatedAt(in, builder);
        return;
      }
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

    private void readInToken(JsonReader in, ImmutableTransferLineItemResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.token(in.nextString());
      }
    }

    private void readInCreatedAt(JsonReader in, ImmutableTransferLineItemResult.Builder builder)
        throws IOException {
      builder.createdAt(in.nextString());
    }

    private void readInType(JsonReader in, ImmutableTransferLineItemResult.Builder builder)
        throws IOException {
      builder.type(in.nextString());
    }

    private void readInObject(JsonReader in, ImmutableTransferLineItemResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.object(in.nextString());
      }
    }

    private void readInAmount(JsonReader in, ImmutableTransferLineItemResult.Builder builder)
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
