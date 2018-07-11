package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.HashMap;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code WebhookResult}.
 * @see ImmutableWebhookResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.WebhookResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersWebhookResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (WebhookResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new WebhookResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersWebhookResult(WebhookResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class WebhookResultTypeAdapter extends TypeAdapter<WebhookResult> {
    public final Integer retriesTypeSample = null;
    public final HashMap<String, Object> errorsTypeSample = null;
    private final TypeAdapter<Integer> retriesTypeAdapter;
    private final TypeAdapter<HashMap<String, Object>> errorsTypeAdapter;
    final String tokenName;
    final String statusName;
    final String urlName;
    final String eventTokenName;
    final String createdAtName;
    final String acceptedAtName;
    final String nextRunName;
    final String retriesName;
    final String errorsName;

    static class WebhookResultNamingFields {
      public String token;
      public String status;
      public String url;
      public String eventToken;
      public String createdAt;
      public String acceptedAt;
      public String nextRun;
      public Integer retries;
      public HashMap<String, Object> errors;
    }

    WebhookResultTypeAdapter(Gson gson) {
      this.retriesTypeAdapter = gson.getAdapter( Integer.class);
      this.errorsTypeAdapter = gson.getAdapter(
          (TypeToken<HashMap<String, Object>>) TypeToken.getParameterized(HashMap.class, String.class, Object.class));
      this.tokenName = translateName(gson, WebhookResultNamingFields.class, "token");
      this.statusName = translateName(gson, WebhookResultNamingFields.class, "status");
      this.urlName = translateName(gson, WebhookResultNamingFields.class, "url");
      this.eventTokenName = translateName(gson, WebhookResultNamingFields.class, "eventToken");
      this.createdAtName = translateName(gson, WebhookResultNamingFields.class, "createdAt");
      this.acceptedAtName = translateName(gson, WebhookResultNamingFields.class, "acceptedAt");
      this.nextRunName = translateName(gson, WebhookResultNamingFields.class, "nextRun");
      this.retriesName = translateName(gson, WebhookResultNamingFields.class, "retries");
      this.errorsName = translateName(gson, WebhookResultNamingFields.class, "errors");
    } 

    static boolean adapts(TypeToken<?> type) {
      return WebhookResult.class == type.getRawType()
          || ImmutableWebhookResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, WebhookResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeWebhookResult(out, value);
      }
    }

    @Override
    public WebhookResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readWebhookResult(in);
    }

    private void writeWebhookResult(JsonWriter out, WebhookResult instance)
        throws IOException {
      out.beginObject();
      out.name(tokenName);
      out.value(instance.token());
      out.name(statusName);
      out.value(instance.status());
      out.name(urlName);
      out.value(instance.url());
      out.name(eventTokenName);
      out.value(instance.eventToken());
      out.name(createdAtName);
      out.value(instance.createdAt());
      out.name(acceptedAtName);
      out.value(instance.acceptedAt());
      @Nullable String nextRunValue = instance.nextRun();
      if (nextRunValue != null) {
        out.name(nextRunName);
        out.value(nextRunValue);
      } else if (out.getSerializeNulls()) {
        out.name(nextRunName);
        out.nullValue();
      }
      out.name(retriesName);
      retriesTypeAdapter.write(out, instance.retries());
      out.name(errorsName);
      errorsTypeAdapter.write(out, instance.errors());
      out.endObject();
    }

    private WebhookResult readWebhookResult(JsonReader in)
        throws IOException {
      ImmutableWebhookResult.Builder builder = ImmutableWebhookResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableWebhookResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (tokenName.equals(attributeName)) {
        readInToken(in, builder);
        return;
      }
      if (statusName.equals(attributeName)) {
        readInStatus(in, builder);
        return;
      }
      if (urlName.equals(attributeName)) {
        readInUrl(in, builder);
        return;
      }
      if (eventTokenName.equals(attributeName)) {
        readInEventToken(in, builder);
        return;
      }
      if (createdAtName.equals(attributeName)) {
        readInCreatedAt(in, builder);
        return;
      }
      if (acceptedAtName.equals(attributeName)) {
        readInAcceptedAt(in, builder);
        return;
      }
      if (nextRunName.equals(attributeName)) {
        readInNextRun(in, builder);
        return;
      }
      if (retriesName.equals(attributeName)) {
        readInRetries(in, builder);
        return;
      }
      if (errorsName.equals(attributeName)) {
        readInErrors(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInToken(JsonReader in, ImmutableWebhookResult.Builder builder)
        throws IOException {
      builder.token(in.nextString());
    }

    private void readInStatus(JsonReader in, ImmutableWebhookResult.Builder builder)
        throws IOException {
      builder.status(in.nextString());
    }

    private void readInUrl(JsonReader in, ImmutableWebhookResult.Builder builder)
        throws IOException {
      builder.url(in.nextString());
    }

    private void readInEventToken(JsonReader in, ImmutableWebhookResult.Builder builder)
        throws IOException {
      builder.eventToken(in.nextString());
    }

    private void readInCreatedAt(JsonReader in, ImmutableWebhookResult.Builder builder)
        throws IOException {
      builder.createdAt(in.nextString());
    }

    private void readInAcceptedAt(JsonReader in, ImmutableWebhookResult.Builder builder)
        throws IOException {
      builder.acceptedAt(in.nextString());
    }

    private void readInNextRun(JsonReader in, ImmutableWebhookResult.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.nextRun(in.nextString());
      }
    }

    private void readInRetries(JsonReader in, ImmutableWebhookResult.Builder builder)
        throws IOException {
      Integer value = retriesTypeAdapter.read(in);
      builder.retries(value);
    }

    private void readInErrors(JsonReader in, ImmutableWebhookResult.Builder builder)
        throws IOException {
      HashMap<String, Object> value = errorsTypeAdapter.read(in);
      builder.errors(value);
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
