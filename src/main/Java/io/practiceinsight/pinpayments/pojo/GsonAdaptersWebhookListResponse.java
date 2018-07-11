package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code WebhookListResponse}.
 * @see ImmutableWebhookListResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.WebhookListResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersWebhookListResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (WebhookListResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new WebhookListResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersWebhookListResponse(WebhookListResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class WebhookListResponseTypeAdapter extends TypeAdapter<WebhookListResponse> {
    public final WebhookResult responseTypeSample = null;
    public final Pagination paginationTypeSample = null;
    private final TypeAdapter<WebhookResult> responseTypeAdapter;
    private final TypeAdapter<Pagination> paginationTypeAdapter;
    final String responseName;
    final String paginationName;

    static class WebhookListResponseNamingFields {
      public List<WebhookResult> response;
      public Pagination pagination;
    }

    WebhookListResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( WebhookResult.class);
      this.paginationTypeAdapter = gson.getAdapter( Pagination.class);
      this.responseName = translateName(gson, WebhookListResponseNamingFields.class, "response");
      this.paginationName = translateName(gson, WebhookListResponseNamingFields.class, "pagination");
    } 

    static boolean adapts(TypeToken<?> type) {
      return WebhookListResponse.class == type.getRawType()
          || ImmutableWebhookListResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, WebhookListResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeWebhookListResponse(out, value);
      }
    }

    @Override
    public WebhookListResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readWebhookListResponse(in);
    }

    private void writeWebhookListResponse(JsonWriter out, WebhookListResponse instance)
        throws IOException {
      out.beginObject();
      List<WebhookResult> responseElements = instance.response();
      out.name(responseName);
      out.beginArray();
      for (WebhookResult e : responseElements) {
        responseTypeAdapter.write(out, e);
      }
      out.endArray();
      out.name(paginationName);
      paginationTypeAdapter.write(out, instance.pagination());
      out.endObject();
    }

    private WebhookListResponse readWebhookListResponse(JsonReader in)
        throws IOException {
      ImmutableWebhookListResponse.Builder builder = ImmutableWebhookListResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableWebhookListResponse.Builder builder)
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

    private void readInResponse(JsonReader in, ImmutableWebhookListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          WebhookResult value = responseTypeAdapter.read(in);
          builder.addResponse(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        WebhookResult value = responseTypeAdapter.read(in);
        builder.addResponse(value);
      }
    }

    private void readInPagination(JsonReader in, ImmutableWebhookListResponse.Builder builder)
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
