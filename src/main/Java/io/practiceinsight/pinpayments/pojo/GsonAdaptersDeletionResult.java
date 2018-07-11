package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code DeletionResult}.
 * @see ImmutableDeletionResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.DeletionResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersDeletionResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (DeletionResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new DeletionResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersDeletionResult(DeletionResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class DeletionResultTypeAdapter extends TypeAdapter<DeletionResult> {
    public final ErrorResponse errorResponseTypeSample = null;
    private final TypeAdapter<ErrorResponse> errorResponseTypeAdapter;
    final String successName;
    final String errorResponseName;

    static class DeletionResultNamingFields {
      public boolean success;
      public ErrorResponse errorResponse;
    }

    DeletionResultTypeAdapter(Gson gson) {
      this.errorResponseTypeAdapter = gson.getAdapter( ErrorResponse.class);
      this.successName = translateName(gson, DeletionResultNamingFields.class, "success");
      this.errorResponseName = translateName(gson, DeletionResultNamingFields.class, "errorResponse");
    } 

    static boolean adapts(TypeToken<?> type) {
      return DeletionResult.class == type.getRawType()
          || ImmutableDeletionResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, DeletionResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeDeletionResult(out, value);
      }
    }

    @Override
    public DeletionResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readDeletionResult(in);
    }

    private void writeDeletionResult(JsonWriter out, DeletionResult instance)
        throws IOException {
      out.beginObject();
      out.name(successName);
      out.value(instance.success());
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

    private DeletionResult readDeletionResult(JsonReader in)
        throws IOException {
      ImmutableDeletionResult.Builder builder = ImmutableDeletionResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableDeletionResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (successName.equals(attributeName)) {
        readInSuccess(in, builder);
        return;
      }
      if (errorResponseName.equals(attributeName)) {
        readInErrorResponse(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInSuccess(JsonReader in, ImmutableDeletionResult.Builder builder)
        throws IOException {
      builder.success(in.nextBoolean());
    }

    private void readInErrorResponse(JsonReader in, ImmutableDeletionResult.Builder builder)
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
