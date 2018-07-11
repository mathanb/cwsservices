package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code WebhookEndpointResponse}.
 * @see ImmutableWebhookEndpointResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.WebhookEndpointResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersWebhookEndpointResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (WebhookEndpointResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new WebhookEndpointResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersWebhookEndpointResponse(WebhookEndpointResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class WebhookEndpointResponseTypeAdapter extends TypeAdapter<WebhookEndpointResponse> {
    public final WebhookEndpointResult responseTypeSample = null;
    private final TypeAdapter<WebhookEndpointResult> responseTypeAdapter;
    final String responseName;

    static class WebhookEndpointResponseNamingFields {
      public WebhookEndpointResult response;
    }

    WebhookEndpointResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( WebhookEndpointResult.class);
      this.responseName = translateName(gson, WebhookEndpointResponseNamingFields.class, "response");
    } 

    static boolean adapts(TypeToken<?> type) {
      return WebhookEndpointResponse.class == type.getRawType()
          || ImmutableWebhookEndpointResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, WebhookEndpointResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeWebhookEndpointResponse(out, value);
      }
    }

    @Override
    public WebhookEndpointResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readWebhookEndpointResponse(in);
    }

    private void writeWebhookEndpointResponse(JsonWriter out, WebhookEndpointResponse instance)
        throws IOException {
      out.beginObject();
      out.name(responseName);
      responseTypeAdapter.write(out, instance.response());
      out.endObject();
    }

    private WebhookEndpointResponse readWebhookEndpointResponse(JsonReader in)
        throws IOException {
      ImmutableWebhookEndpointResponse.Builder builder = ImmutableWebhookEndpointResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableWebhookEndpointResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableWebhookEndpointResponse.Builder builder)
        throws IOException {
      WebhookEndpointResult value = responseTypeAdapter.read(in);
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
