package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code WebhookEndpoint}.
 * @see ImmutableWebhookEndpoint
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.WebhookEndpoint"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersWebhookEndpoint implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (WebhookEndpointTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new WebhookEndpointTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersWebhookEndpoint(WebhookEndpoint)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class WebhookEndpointTypeAdapter extends TypeAdapter<WebhookEndpoint> {
    final String urlName;

    static class WebhookEndpointNamingFields {
      public String url;
    }

    WebhookEndpointTypeAdapter(Gson gson) {
      this.urlName = translateName(gson, WebhookEndpointNamingFields.class, "url");
    } 

    static boolean adapts(TypeToken<?> type) {
      return WebhookEndpoint.class == type.getRawType()
          || ImmutableWebhookEndpoint.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, WebhookEndpoint value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeWebhookEndpoint(out, value);
      }
    }

    @Override
    public WebhookEndpoint read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readWebhookEndpoint(in);
    }

    private void writeWebhookEndpoint(JsonWriter out, WebhookEndpoint instance)
        throws IOException {
      out.beginObject();
      out.name(urlName);
      out.value(instance.url());
      out.endObject();
    }

    private WebhookEndpoint readWebhookEndpoint(JsonReader in)
        throws IOException {
      ImmutableWebhookEndpoint.Builder builder = ImmutableWebhookEndpoint.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableWebhookEndpoint.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (urlName.equals(attributeName)) {
        readInUrl(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInUrl(JsonReader in, ImmutableWebhookEndpoint.Builder builder)
        throws IOException {
      builder.url(in.nextString());
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
