package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code EventListResponse}.
 * @see ImmutableEventListResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.EventListResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersEventListResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (EventListResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new EventListResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersEventListResponse(EventListResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class EventListResponseTypeAdapter extends TypeAdapter<EventListResponse> {
    public final EventResult responseTypeSample = null;
    public final Pagination paginationTypeSample = null;
    private final TypeAdapter<EventResult> responseTypeAdapter;
    private final TypeAdapter<Pagination> paginationTypeAdapter;
    final String responseName;
    final String paginationName;

    static class EventListResponseNamingFields {
      public List<EventResult> response;
      public Pagination pagination;
    }

    EventListResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( EventResult.class);
      this.paginationTypeAdapter = gson.getAdapter( Pagination.class);
      this.responseName = translateName(gson, EventListResponseNamingFields.class, "response");
      this.paginationName = translateName(gson, EventListResponseNamingFields.class, "pagination");
    } 

    static boolean adapts(TypeToken<?> type) {
      return EventListResponse.class == type.getRawType()
          || ImmutableEventListResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, EventListResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeEventListResponse(out, value);
      }
    }

    @Override
    public EventListResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readEventListResponse(in);
    }

    private void writeEventListResponse(JsonWriter out, EventListResponse instance)
        throws IOException {
      out.beginObject();
      List<EventResult> responseElements = instance.response();
      out.name(responseName);
      out.beginArray();
      for (EventResult e : responseElements) {
        responseTypeAdapter.write(out, e);
      }
      out.endArray();
      out.name(paginationName);
      paginationTypeAdapter.write(out, instance.pagination());
      out.endObject();
    }

    private EventListResponse readEventListResponse(JsonReader in)
        throws IOException {
      ImmutableEventListResponse.Builder builder = ImmutableEventListResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableEventListResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      if (paginationName.equals(attributeName)) {
        readInPagination(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableEventListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          EventResult value = responseTypeAdapter.read(in);
          builder.addResponse(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        EventResult value = responseTypeAdapter.read(in);
        builder.addResponse(value);
      }
    }

    private void readInPagination(JsonReader in, ImmutableEventListResponse.Builder builder)
        throws IOException {
      Pagination value = paginationTypeAdapter.read(in);
      builder.pagination(value);
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
