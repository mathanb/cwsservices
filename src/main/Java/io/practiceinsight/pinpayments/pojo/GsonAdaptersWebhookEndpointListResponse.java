package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code WebhookEndpointListResponse}.
 * @see ImmutableWebhookEndpointListResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.WebhookEndpointListResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersWebhookEndpointListResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (WebhookEndpointListResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new WebhookEndpointListResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersWebhookEndpointListResponse(WebhookEndpointListResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class WebhookEndpointListResponseTypeAdapter extends TypeAdapter<WebhookEndpointListResponse> {
    public final WebhookEndpointResult responseTypeSample = null;
    public final Pagination paginationTypeSample = null;
    private final TypeAdapter<WebhookEndpointResult> responseTypeAdapter;
    private final TypeAdapter<Pagination> paginationTypeAdapter;
    final String responseName;
    final String paginationName;

    static class WebhookEndpointListResponseNamingFields {
      public List<WebhookEndpointResult> response;
      public Pagination pagination;
    }

    WebhookEndpointListResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( WebhookEndpointResult.class);
      this.paginationTypeAdapter = gson.getAdapter( Pagination.class);
      this.responseName = translateName(gson, WebhookEndpointListResponseNamingFields.class, "response");
      this.paginationName = translateName(gson, WebhookEndpointListResponseNamingFields.class, "pagination");
    } 

    static boolean adapts(TypeToken<?> type) {
      return WebhookEndpointListResponse.class == type.getRawType()
          || ImmutableWebhookEndpointListResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, WebhookEndpointListResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeWebhookEndpointListResponse(out, value);
      }
    }

    @Override
    public WebhookEndpointListResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readWebhookEndpointListResponse(in);
    }

    private void writeWebhookEndpointListResponse(JsonWriter out, WebhookEndpointListResponse instance)
        throws IOException {
      out.beginObject();
      List<WebhookEndpointResult> responseElements = instance.response();
      out.name(responseName);
      out.beginArray();
      for (WebhookEndpointResult e : responseElements) {
        responseTypeAdapter.write(out, e);
      }
      out.endArray();
      out.name(paginationName);
      paginationTypeAdapter.write(out, instance.pagination());
      out.endObject();
    }

    private WebhookEndpointListResponse readWebhookEndpointListResponse(JsonReader in)
        throws IOException {
      ImmutableWebhookEndpointListResponse.Builder builder = ImmutableWebhookEndpointListResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableWebhookEndpointListResponse.Builder builder)
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

    private void readInResponse(JsonReader in, ImmutableWebhookEndpointListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          WebhookEndpointResult value = responseTypeAdapter.read(in);
          builder.addResponse(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        WebhookEndpointResult value = responseTypeAdapter.read(in);
        builder.addResponse(value);
      }
    }

    private void readInPagination(JsonReader in, ImmutableWebhookEndpointListResponse.Builder builder)
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
