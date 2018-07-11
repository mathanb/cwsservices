package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code TransferLineItemListResponse}.
 * @see ImmutableTransferLineItemListResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.TransferLineItemListResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersTransferLineItemListResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (TransferLineItemListResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new TransferLineItemListResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersTransferLineItemListResponse(TransferLineItemListResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class TransferLineItemListResponseTypeAdapter extends TypeAdapter<TransferLineItemListResponse> {
    public final TransferLineItemResult responseTypeSample = null;
    public final Pagination paginationTypeSample = null;
    private final TypeAdapter<TransferLineItemResult> responseTypeAdapter;
    private final TypeAdapter<Pagination> paginationTypeAdapter;
    final String responseName;
    final String paginationName;

    static class TransferLineItemListResponseNamingFields {
      public List<TransferLineItemResult> response;
      public Pagination pagination;
    }

    TransferLineItemListResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( TransferLineItemResult.class);
      this.paginationTypeAdapter = gson.getAdapter( Pagination.class);
      this.responseName = translateName(gson, TransferLineItemListResponseNamingFields.class, "response");
      this.paginationName = translateName(gson, TransferLineItemListResponseNamingFields.class, "pagination");
    } 

    static boolean adapts(TypeToken<?> type) {
      return TransferLineItemListResponse.class == type.getRawType()
          || ImmutableTransferLineItemListResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, TransferLineItemListResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeTransferLineItemListResponse(out, value);
      }
    }

    @Override
    public TransferLineItemListResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readTransferLineItemListResponse(in);
    }

    private void writeTransferLineItemListResponse(JsonWriter out, TransferLineItemListResponse instance)
        throws IOException {
      out.beginObject();
      List<TransferLineItemResult> responseElements = instance.response();
      out.name(responseName);
      out.beginArray();
      for (TransferLineItemResult e : responseElements) {
        responseTypeAdapter.write(out, e);
      }
      out.endArray();
      out.name(paginationName);
      paginationTypeAdapter.write(out, instance.pagination());
      out.endObject();
    }

    private TransferLineItemListResponse readTransferLineItemListResponse(JsonReader in)
        throws IOException {
      ImmutableTransferLineItemListResponse.Builder builder = ImmutableTransferLineItemListResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableTransferLineItemListResponse.Builder builder)
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

    private void readInResponse(JsonReader in, ImmutableTransferLineItemListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          TransferLineItemResult value = responseTypeAdapter.read(in);
          builder.addResponse(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        TransferLineItemResult value = responseTypeAdapter.read(in);
        builder.addResponse(value);
      }
    }

    private void readInPagination(JsonReader in, ImmutableTransferLineItemListResponse.Builder builder)
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
