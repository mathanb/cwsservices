package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code CustomerResponse}.
 * @see ImmutableCustomerResponse
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.CustomerResponse"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersCustomerResponse implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (CustomerResponseTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new CustomerResponseTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersCustomerResponse(CustomerResponse)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class CustomerResponseTypeAdapter extends TypeAdapter<CustomerResponse> {
    public final CustomerResult responseTypeSample = null;
    public final ErrorResponse errorResponseTypeSample = null;
    private final TypeAdapter<CustomerResult> responseTypeAdapter;
    private final TypeAdapter<ErrorResponse> errorResponseTypeAdapter;
    final String responseName;
    final String errorResponseName;

    static class CustomerResponseNamingFields {
      public CustomerResult response;
      public ErrorResponse errorResponse;
    }

    CustomerResponseTypeAdapter(Gson gson) {
      this.responseTypeAdapter = gson.getAdapter( CustomerResult.class);
      this.errorResponseTypeAdapter = gson.getAdapter( ErrorResponse.class);
      this.responseName = translateName(gson, CustomerResponseNamingFields.class, "response");
      this.errorResponseName = translateName(gson, CustomerResponseNamingFields.class, "errorResponse");
    } 

    static boolean adapts(TypeToken<?> type) {
      return CustomerResponse.class == type.getRawType()
          || ImmutableCustomerResponse.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, CustomerResponse value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeCustomerResponse(out, value);
      }
    }

    @Override
    public CustomerResponse read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readCustomerResponse(in);
    }

    private void writeCustomerResponse(JsonWriter out, CustomerResponse instance)
        throws IOException {
      out.beginObject();
      @Nullable CustomerResult responseValue = instance.response();
      if (responseValue != null) {
        out.name(responseName);
        responseTypeAdapter.write(out, responseValue);
      } else if (out.getSerializeNulls()) {
        out.name(responseName);
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

    private CustomerResponse readCustomerResponse(JsonReader in)
        throws IOException {
      ImmutableCustomerResponse.Builder builder = ImmutableCustomerResponse.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableCustomerResponse.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (responseName.equals(attributeName)) {
        readInResponse(in, builder);
        return;
      }
      if (errorResponseName.equals(attributeName)) {
        readInErrorResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInResponse(JsonReader in, ImmutableCustomerResponse.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        CustomerResult value = responseTypeAdapter.read(in);
        builder.response(value);
      }
    }

    private void readInErrorResponse(JsonReader in, ImmutableCustomerResponse.Builder builder)
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
