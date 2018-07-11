package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code WebhookEndpointResult}.
 * @see ImmutableWebhookEndpointResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.WebhookEndpointResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersWebhookEndpointResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (WebhookEndpointResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new WebhookEndpointResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersWebhookEndpointResult(WebhookEndpointResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class WebhookEndpointResultTypeAdapter extends TypeAdapter<WebhookEndpointResult> {
    final String tokenName;
    final String urlName;
    final String keyName;
    final String createdAtName;
    final String updatedAtName;

    static class WebhookEndpointResultNamingFields {
      public String token;
      public String url;
      public String key;
      public String createdAt;
      public String updatedAt;
    }

    WebhookEndpointResultTypeAdapter(Gson gson) {
      this.tokenName = translateName(gson, WebhookEndpointResultNamingFields.class, "token");
      this.urlName = translateName(gson, WebhookEndpointResultNamingFields.class, "url");
      this.keyName = translateName(gson, WebhookEndpointResultNamingFields.class, "key");
      this.createdAtName = translateName(gson, WebhookEndpointResultNamingFields.class, "createdAt");
      this.updatedAtName = translateName(gson, WebhookEndpointResultNamingFields.class, "updatedAt");
    } 

    static boolean adapts(TypeToken<?> type) {
      return WebhookEndpointResult.class == type.getRawType()
          || ImmutableWebhookEndpointResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, WebhookEndpointResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeWebhookEndpointResult(out, value);
      }
    }

    @Override
    public WebhookEndpointResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readWebhookEndpointResult(in);
    }

    private void writeWebhookEndpointResult(JsonWriter out, WebhookEndpointResult instance)
        throws IOException {
      out.beginObject();
      out.name(tokenName);
      out.value(instance.token());
      out.name(urlName);
      out.value(instance.url());
      out.name(keyName);
      out.value(instance.key());
      out.name(createdAtName);
      out.value(instance.createdAt());
      out.name(updatedAtName);
      out.value(instance.updatedAt());
      out.endObject();
    }

    private WebhookEndpointResult readWebhookEndpointResult(JsonReader in)
        throws IOException {
      ImmutableWebhookEndpointResult.Builder builder = ImmutableWebhookEndpointResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableWebhookEndpointResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (tokenName.equals(attributeName)) {
        readInToken(in, builder);
        return;
      }
      if (urlName.equals(attributeName)) {
        readInUrl(in, builder);
        return;
      }
      if (keyName.equals(attributeName)) {
        readInKey(in, builder);
        return;
      }
      if (createdAtName.equals(attributeName)) {
        readInCreatedAt(in, builder);
        return;
      }
      if (updatedAtName.equals(attributeName)) {
        readInUpdatedAt(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInToken(JsonReader in, ImmutableWebhookEndpointResult.Builder builder)
        throws IOException {
      builder.token(in.nextString());
    }

    private void readInUrl(JsonReader in, ImmutableWebhookEndpointResult.Builder builder)
        throws IOException {
      builder.url(in.nextString());
    }

    private void readInKey(JsonReader in, ImmutableWebhookEndpointResult.Builder builder)
        throws IOException {
      builder.key(in.nextString());
    }

    private void readInCreatedAt(JsonReader in, ImmutableWebhookEndpointResult.Builder builder)
        throws IOException {
      builder.createdAt(in.nextString());
    }

    private void readInUpdatedAt(JsonReader in, ImmutableWebhookEndpointResult.Builder builder)
        throws IOException {
      builder.updatedAt(in.nextString());
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
