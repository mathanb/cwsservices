package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code CustomerListResponse}.
 * @see ImmutableCustomerListResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.CustomerListResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersCustomerListResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (CustomerListResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new CustomerListResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersCustomerListResponse(CustomerListResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class CustomerListResponseTypeAdapter extends TypeAdapter<CustomerListResponse> {
    public final CustomerResult responseTypeSample = null;
    public final Pagination paginationTypeSample = null;
    private final TypeAdapter<CustomerResult> responseTypeAdapter;
    private final TypeAdapter<Pagination> paginationTypeAdapter;
    final String responseName;
    final String paginationName;

    static class CustomerListResponseNamingFields {
      public List<CustomerResult> response;
      public Pagination pagination;
    }

    CustomerListResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( CustomerResult.class);
      this.paginationTypeAdapter = gson.getAdapter( Pagination.class);
      this.responseName = translateName(gson, CustomerListResponseNamingFields.class, "response");
      this.paginationName = translateName(gson, CustomerListResponseNamingFields.class, "pagination");
    } 

    static boolean adapts(TypeToken<?> type) {
      return CustomerListResponse.class == type.getRawType()
          || ImmutableCustomerListResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, CustomerListResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeCustomerListResponse(out, value);
      }
    }

    @Override
    public CustomerListResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readCustomerListResponse(in);
    }

    private void writeCustomerListResponse(JsonWriter out, CustomerListResponse instance)
        throws IOException {
      out.beginObject();
      List<CustomerResult> responseElements = instance.response();
      out.name(responseName);
      out.beginArray();
      for (CustomerResult e : responseElements) {
        responseTypeAdapter.write(out, e);
      }
      out.endArray();
      out.name(paginationName);
      paginationTypeAdapter.write(out, instance.pagination());
      out.endObject();
    }

    private CustomerListResponse readCustomerListResponse(JsonReader in)
        throws IOException {
      ImmutableCustomerListResponse.Builder builder = ImmutableCustomerListResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableCustomerListResponse.Builder builder)
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

    private void readInResponse(JsonReader in, ImmutableCustomerListResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.BEGIN_ARRAY) {
        in.beginArray();
        while(in.hasNext()) {
          CustomerResult value = responseTypeAdapter.read(in);
          builder.addResponse(value);
        }
        in.endArray();
      } else if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        CustomerResult value = responseTypeAdapter.read(in);
        builder.addResponse(value);
      }
    }

    private void readInPagination(JsonReader in, ImmutableCustomerListResponse.Builder builder)
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
