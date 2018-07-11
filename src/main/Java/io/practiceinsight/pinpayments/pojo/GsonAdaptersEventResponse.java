package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code EventResponse}.
 * @see ImmutableEventResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.EventResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersEventResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (EventResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new EventResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersEventResponse(EventResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class EventResponseTypeAdapter extends TypeAdapter<EventResponse> {
    public final EventResult responseTypeSample = null;
    private final TypeAdapter<EventResult> responseTypeAdapter;
    final String responseName;

    static class EventResponseNamingFields {
      public EventResult response;
    }

    EventResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( EventResult.class);
      this.responseName = translateName(gson, EventResponseNamingFields.class, "response");
    } 

    static boolean adapts(TypeToken<?> type) {
      return EventResponse.class == type.getRawType()
          || ImmutableEventResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, EventResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeEventResponse(out, value);
      }
    }

    @Override
    public EventResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readEventResponse(in);
    }

    private void writeEventResponse(JsonWriter out, EventResponse instance)
        throws IOException {
      out.beginObject();
      out.name(responseName);
      responseTypeAdapter.write(out, instance.response());
      out.endObject();
    }

    private EventResponse readEventResponse(JsonReader in)
        throws IOException {
      ImmutableEventResponse.Builder builder = ImmutableEventResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableEventResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableEventResponse.Builder builder)
        throws IOException {
      EventResult value = responseTypeAdapter.read(in);
      builder.response(value);
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
