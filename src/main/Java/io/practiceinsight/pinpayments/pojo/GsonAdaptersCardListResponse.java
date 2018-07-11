package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code CardListResponse}.
 * @see ImmutableCardListResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.CardListResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersCardListResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (CardListResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new CardListResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersCardListResponse(CardListResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class CardListResponseTypeAdapter extends TypeAdapter<CardListResponse> {
    public final CardResult responseTypeSample = null;
    public final Pagination paginationTypeSample = null;
    public final ErrorResponse errorResponseTypeSample = null;
    private final TypeAdapter<CardResult> responseTypeAdapter;
    private final TypeAdapter<Pagination> paginationTypeAdapter;
    private final TypeAdapter<ErrorResponse> errorResponseTypeAdapter;
    final String responseName;
    final String paginationName;
    final String errorResponseName;

    static class CardListResponseNamingFields {
      public List<CardResult> response;
      public Pagination pagination;
      public ErrorResponse errorResponse;
    }

    CardListResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( CardResult.class);
      this.paginationTypeAdapter = gson.getAdapter( Pagination.class);
      this.errorResponseTypeAdapter = gson.getAdapter( ErrorResponse.class);
      this.responseName = translateName(gson, CardListResponseNamingFields.class, "response");
      this.paginationName = translateName(gson, CardListResponseNamingFields.class, "pagination");
      this.errorResponseName = translateName(gson, CardListResponseNamingFields.class, "errorResponse");
    } 

    static boolean adapts(TypeToken<?> type) {
      return CardListResponse.class == type.getRawType()
          || ImmutableCardListResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, CardListResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeCardListResponse(out, value);
      }
    }

    @Override
    public CardListResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readCardListResponse(in);
    }

    private void writeCardListResponse(JsonWriter out, CardListResponse instance)
        throws IOException {
      out.beginObject();
      @Nullable List<CardResult> responseElements = instance.response();
      if (responseElements != null) {
        out.name(responseName);
        out.beginArray();
        for (CardResult e : responseElements) {
          responseTypeAdapter.write(out, e);
        }
        out.endArray();
      } else if (out.getSerializeNulls()) {
        out.name(responseName);
        out.nullValue();
      }
      @Nullable Pagination paginationValue = instance.pagination();
      if (paginationValue != null) {
        out.name(paginationName);
        paginationTypeAdapter.write(out, paginationValue);
      } else if (out.getSerializeNulls()) {
        out.name(paginationName);
        out.nullValue();
      }
      @Nullable ErrorResponse errorResponseValue = instance.errorResponse();
      if (errorResponseValue != null) {
        out.name(errorResponseName);
        errorResponseTypeAdapter.write(out, errorResponseValue);
      } else if (out.getSerializeNulls()) {
        out.name(errorResponseName);
        out.nullValue();
      }
      out.endObject();
    }

    private CardListResponse readCardListResponse(JsonReader in)
        throws IOException {
      ImmutableCardListResponse.Builder builder = ImmutableCardListResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableCardListResponse.Builder builder)
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
      if (errorResponseName.equals(attributeName)) {
        readInErrorResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableCardListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        boolean empty = true;
        if (in.peek() == JsonToken.BEGIN_ARRAY) {
          in.beginArray();
          while(in.hasNext()) {
            CardResult value = responseTypeAdapter.read(in);
            builder.addResponse(value);
            empty = false;
          }
          in.endArray();
        } else if (in.peek() == JsonToken.NULL) {
          in.nextNull();
        } else {
          CardResult value = responseTypeAdapter.read(in);
          builder.addResponse(value);
          empty = false;
        }
        if (empty) {
          builder.addAllResponse(Collections.<CardResult>emptyList());
        }
      }
    }

    private void readInPagination(JsonReader in, ImmutableCardListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        Pagination value = paginationTypeAdapter.read(in);
        builder.pagination(value);
      }
    }

    private void readInErrorResponse(JsonReader in, ImmutableCardListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        ErrorResponse value = errorResponseTypeAdapter.read(in);
        builder.errorResponse(value);
      }
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
