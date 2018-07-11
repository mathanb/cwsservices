package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code TransferListResponse}.
 * @see ImmutableTransferListResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.TransferListResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersTransferListResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (TransferListResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new TransferListResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersTransferListResponse(TransferListResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class TransferListResponseTypeAdapter extends TypeAdapter<TransferListResponse> {
    public final TransferResult responseTypeSample = null;
    public final Pagination paginationTypeSample = null;
    private final TypeAdapter<TransferResult> responseTypeAdapter;
    private final TypeAdapter<Pagination> paginationTypeAdapter;
    final String responseName;
    final String paginationName;

    static class TransferListResponseNamingFields {
      public List<TransferResult> response;
      public Pagination pagination;
    }

    TransferListResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( TransferResult.class);
      this.paginationTypeAdapter = gson.getAdapter( Pagination.class);
      this.responseName = translateName(gson, TransferListResponseNamingFields.class, "response");
      this.paginationName = translateName(gson, TransferListResponseNamingFields.class, "pagination");
    } 

    static boolean adapts(TypeToken<?> type) {
      return TransferListResponse.class == type.getRawType()
          || ImmutableTransferListResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, TransferListResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeTransferListResponse(out, value);
      }
    }

    @Override
    public TransferListResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readTransferListResponse(in);
    }

    private void writeTransferListResponse(JsonWriter out, TransferListResponse instance)
        throws IOException {
      out.beginObject();
      List<TransferResult> responseElements = instance.response();
      out.name(responseName);
      out.beginArray();
      for (TransferResult e : responseElements) {
        responseTypeAdapter.write(out, e);
      }
      out.endArray();
      out.name(paginationName);
      paginationTypeAdapter.write(out, instance.pagination());
      out.endObject();
    }

    private TransferListResponse readTransferListResponse(JsonReader in)
        throws IOException {
      ImmutableTransferListResponse.Builder builder = ImmutableTransferListResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableTransferListResponse.Builder builder)
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

    private void readInResponse(JsonReader in, ImmutableTransferListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          TransferResult value = responseTypeAdapter.read(in);
          builder.addResponse(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        TransferResult value = responseTypeAdapter.read(in);
        builder.addResponse(value);
      }
    }

    private void readInPagination(JsonReader in, ImmutableTransferListResponse.Builder builder)
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
