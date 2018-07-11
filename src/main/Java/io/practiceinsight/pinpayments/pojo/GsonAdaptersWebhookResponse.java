package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code WebhookResponse}.
 * @see ImmutableWebhookResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.WebhookResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersWebhookResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (WebhookResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new WebhookResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersWebhookResponse(WebhookResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class WebhookResponseTypeAdapter extends TypeAdapter<WebhookResponse> {
    public final WebhookResult responseTypeSample = null;
    private final TypeAdapter<WebhookResult> responseTypeAdapter;
    final String responseName;

    static class WebhookResponseNamingFields {
      public WebhookResult response;
    }

    WebhookResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( WebhookResult.class);
      this.responseName = translateName(gson, WebhookResponseNamingFields.class, "response");
    } 

    static boolean adapts(TypeToken<?> type) {
      return WebhookResponse.class == type.getRawType()
          || ImmutableWebhookResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, WebhookResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeWebhookResponse(out, value);
      }
    }

    @Override
    public WebhookResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readWebhookResponse(in);
    }

    private void writeWebhookResponse(JsonWriter out, WebhookResponse instance)
        throws IOException {
      out.beginObject();
      out.name(responseName);
      responseTypeAdapter.write(out, instance.response());
      out.endObject();
    }

    private WebhookResponse readWebhookResponse(JsonReader in)
        throws IOException {
      ImmutableWebhookResponse.Builder builder = ImmutableWebhookResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableWebhookResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableWebhookResponse.Builder builder)
        throws IOException {
      WebhookResult value = responseTypeAdapter.read(in);
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
