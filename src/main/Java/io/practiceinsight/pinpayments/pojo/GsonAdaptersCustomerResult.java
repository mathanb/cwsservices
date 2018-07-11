package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code CustomerResult}.
 * @see ImmutableCustomerResult
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.CustomerResult"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersCustomerResult implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (CustomerResultTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new CustomerResultTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersCustomerResult(CustomerResult)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class CustomerResultTypeAdapter extends TypeAdapter<CustomerResult> {
    public final CardResult cardTypeSample = null;
    private final TypeAdapter<CardResult> cardTypeAdapter;
    final String tokenName;
    final String createdAtName;
    final String cardName;
    final String emailName;

    static class CustomerResultNamingFields {
      public String token;
      public String createdAt;
      public CardResult card;
      public String email;
    }

    CustomerResultTypeAdapter(Gson gson) {
      this.cardTypeAdapter = gson.getAdapter( CardResult.class);
      this.tokenName = translateName(gson, CustomerResultNamingFields.class, "token");
      this.createdAtName = translateName(gson, CustomerResultNamingFields.class, "createdAt");
      this.cardName = translateName(gson, CustomerResultNamingFields.class, "card");
      this.emailName = translateName(gson, CustomerResultNamingFields.class, "email");
    } 

    static boolean adapts(TypeToken<?> type) {
      return CustomerResult.class == type.getRawType()
          || ImmutableCustomerResult.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, CustomerResult value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeCustomerResult(out, value);
      }
    }

    @Override
    public CustomerResult read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readCustomerResult(in);
    }

    private void writeCustomerResult(JsonWriter out, CustomerResult instance)
        throws IOException {
      out.beginObject();
      out.name(tokenName);
      out.value(instance.token());
      out.name(createdAtName);
      out.value(instance.createdAt());
      out.name(cardName);
      cardTypeAdapter.write(out, instance.card());
      out.name(emailName);
      out.value(instance.email());
      out.endObject();
    }

    private CustomerResult readCustomerResult(JsonReader in)
        throws IOException {
      ImmutableCustomerResult.Builder builder = ImmutableCustomerResult.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableCustomerResult.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (tokenName.equals(attributeName)) {
        readInToken(in, builder);
        return;
      }
      if (createdAtName.equals(attributeName)) {
        readInCreatedAt(in, builder);
        return;
      }
      if (cardName.equals(attributeName)) {
        readInCard(in, builder);
        return;
      }
      if (emailName.equals(attributeName)) {
        readInEmail(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInToken(JsonReader in, ImmutableCustomerResult.Builder builder)
        throws IOException {
      builder.token(in.nextString());
    }

    private void readInCreatedAt(JsonReader in, ImmutableCustomerResult.Builder builder)
        throws IOException {
      builder.createdAt(in.nextString());
    }

    private void readInCard(JsonReader in, ImmutableCustomerResult.Builder builder)
        throws IOException {
      CardResult value = cardTypeAdapter.read(in);
      builder.card(value);
    }

    private void readInEmail(JsonReader in, ImmutableCustomerResult.Builder builder)
        throws IOException {
      builder.email(in.nextString());
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
