package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code BalanceResult}.
 * @see ImmutableBalanceResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.BalanceResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersBalanceResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (BalanceResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new BalanceResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersBalanceResult(BalanceResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class BalanceResultTypeAdapter extends TypeAdapter<BalanceResult> {
    public final Balance availableTypeSample = null;
    public final Balance pendingTypeSample = null;
    private final TypeAdapter<Balance> availableTypeAdapter;
    private final TypeAdapter<Balance> pendingTypeAdapter;
    final String availableName;
    final String pendingName;

    static class BalanceResultNamingFields {
      public List<Balance> available;
      public List<Balance> pending;
    }

    BalanceResultTypeAdapter(Gson gson) {
      this.availableTypeAdapter = gson.getAdapter( Balance.class);
      this.pendingTypeAdapter = gson.getAdapter( Balance.class);
      this.availableName = translateName(gson, BalanceResultNamingFields.class, "available");
      this.pendingName = translateName(gson, BalanceResultNamingFields.class, "pending");
    } 

    static boolean adapts(TypeToken<?> type) {
      return BalanceResult.class == type.getRawType()
          || ImmutableBalanceResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, BalanceResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeBalanceResult(out, value);
      }
    }

    @Override
    public BalanceResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readBalanceResult(in);
    }

    private void writeBalanceResult(JsonWriter out, BalanceResult instance)
        throws IOException {
      out.beginObject();
      List<Balance> availableElements = instance.available();
      out.name(availableName);
      out.beginArray();
      for (Balance e : availableElements) {
        availableTypeAdapter.write(out, e);
      }
      out.endArray();
      List<Balance> pendingElements = instance.pending();
      out.name(pendingName);
      out.beginArray();
      for (Balance e : pendingElements) {
        pendingTypeAdapter.write(out, e);
      }
      out.endArray();
      out.endObject();
    }

    private BalanceResult readBalanceResult(JsonReader in)
        throws IOException {
      ImmutableBalanceResult.Builder builder = ImmutableBalanceResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableBalanceResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (availableName.equals(attributeName)) {
        readInAvailable(in, builder);
        return;
      }
      if (pendingName.equals(attributeName)) {
        readInPending(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInAvailable(JsonReader in, ImmutableBalanceResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          Balance value = availableTypeAdapter.read(in);
          builder.addAvailable(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        Balance value = availableTypeAdapter.read(in);
        builder.addAvailable(value);
      }
    }

    private void readInPending(JsonReader in, ImmutableBalanceResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          Balance value = pendingTypeAdapter.read(in);
          builder.addPending(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        Balance value = pendingTypeAdapter.read(in);
        builder.addPending(value);
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
