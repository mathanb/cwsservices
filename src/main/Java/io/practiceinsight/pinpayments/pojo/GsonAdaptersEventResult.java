package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.HashMap;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code EventResult}.
 * @see ImmutableEventResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.EventResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersEventResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (EventResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new EventResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersEventResult(EventResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class EventResultTypeAdapter extends TypeAdapter<EventResult> {
    public final HashMap<String, Object> dataTypeSample = null;
    private final TypeAdapter<HashMap<String, Object>> dataTypeAdapter;
    final String tokenName;
    final String typeName;
    final String dataName;
    final String createdAtName;

    static class EventResultNamingFields {
      public String token;
      public String type;
      public HashMap<String, Object> data;
      public String createdAt;
    }

    EventResultTypeAdapter(Gson gson) {
      this.dataTypeAdapter = gson.getAdapter(
          (TypeToken<HashMap<String, Object>>) TypeToken.getParameterized(HashMap.class, String.class, Object.class));
      this.tokenName = translateName(gson, EventResultNamingFields.class, "token");
      this.typeName = translateName(gson, EventResultNamingFields.class, "type");
      this.dataName = translateName(gson, EventResultNamingFields.class, "data");
      this.createdAtName = translateName(gson, EventResultNamingFields.class, "createdAt");
    } 

    static boolean adapts(TypeToken<?> type) {
      return EventResult.class == type.getRawType()
          || ImmutableEventResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, EventResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeEventResult(out, value);
      }
    }

    @Override
    public EventResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readEventResult(in);
    }

    private void writeEventResult(JsonWriter out, EventResult instance)
        throws IOException {
      out.beginObject();
      out.name(tokenName);
      out.value(instance.token());
      out.name(typeName);
      out.value(instance.type());
      out.name(dataName);
      dataTypeAdapter.write(out, instance.data());
      out.name(createdAtName);
      out.value(instance.createdAt());
      out.endObject();
    }

    private EventResult readEventResult(JsonReader in)
        throws IOException {
      ImmutableEventResult.Builder builder = ImmutableEventResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableEventResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (tokenName.equals(attributeName)) {
        readInToken(in, builder);
        return;
      }
      if (typeName.equals(attributeName)) {
        readInType(in, builder);
        return;
      }
      if (dataName.equals(attributeName)) {
        readInData(in, builder);
        return;
      }
      if (createdAtName.equals(attributeName)) {
        readInCreatedAt(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInToken(JsonReader in, ImmutableEventResult.Builder builder)
        throws IOException {
      builder.token(in.nextString());
    }

    private void readInType(JsonReader in, ImmutableEventResult.Builder builder)
        throws IOException {
      builder.type(in.nextString());
    }

    private void readInData(JsonReader in, ImmutableEventResult.Builder builder)
        throws IOException {
      HashMap<String, Object> value = dataTypeAdapter.read(in);
      builder.data(value);
    }

    private void readInCreatedAt(JsonReader in, ImmutableEventResult.Builder builder)
        throws IOException {
      builder.createdAt(in.nextString());
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
