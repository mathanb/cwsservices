package io.practiceinsight.pinpayments.pojo;

import com.google.gson.*;
import com.google.gson.reflect.*;
import com.google.gson.stream.*;
import java.io.IOException;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * A {@code TypeAdapterFactory} that handles all of the immutable types generated under {@code Customer}.
 * @see ImmutableCustomer
 */
@SuppressWarnings("all")
@Generated({"Gsons.generator", "io.practiceinsight.pinpayments.pojo.Customer"})
@ParametersAreNonnullByDefault
public final class GsonAdaptersCustomer implements TypeAdapterFactory {
  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  @Override
  public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
    if (CustomerTypeAdapter.adapts(type)) {
      return (TypeAdapter<T>) new CustomerTypeAdapter(gson);
    }
    return null;
  }

  @Override
  public String toString() {
    return "GsonAdaptersCustomer(Customer)";
  }

  @SuppressWarnings({"unchecked", "raw"}) // safe unchecked, types are verified in runtime
  private static class CustomerTypeAdapter extends TypeAdapter<Customer> {
    public final Card cardTypeSample = null;
    private final TypeAdapter<Card> cardTypeAdapter;
    final String cardName;
    final String cardTokenName;
    final String emailName;

    static class CustomerNamingFields {
      public Card card;
      public String cardToken;
      public String email;
    }

    CustomerTypeAdapter(Gson gson) {
      this.cardTypeAdapter = gson.getAdapter( Card.class);
      this.cardName = translateName(gson, CustomerNamingFields.class, "card");
      this.cardTokenName = translateName(gson, CustomerNamingFields.class, "cardToken");
      this.emailName = translateName(gson, CustomerNamingFields.class, "email");
    } 

    static boolean adapts(TypeToken<?> type) {
      return Customer.class == type.getRawType()
          || ImmutableCustomer.class == type.getRawType();
    }

    @Override
    public void write(JsonWriter out, Customer value) throws IOException {
      if (value == null) {
        out.nullValue();
      } else {
        writeCustomer(out, value);
      }
    }

    @Override
    public Customer read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      return readCustomer(in);
    }

    private void writeCustomer(JsonWriter out, Customer instance)
        throws IOException {
      out.beginObject();
      @Nullable Card cardValue = instance.card();
      if (cardValue != null) {
        out.name(cardName);
        cardTypeAdapter.write(out, cardValue);
      } else if (out.getSerializeNulls()) {
        out.name(cardName);
        out.nullValue();
      }
      @Nullable String cardTokenValue = instance.cardToken();
      if (cardTokenValue != null) {
        out.name(cardTokenName);
        out.value(cardTokenValue);
      } else if (out.getSerializeNulls()) {
        out.name(cardTokenName);
        out.nullValue();
      }
      out.name(emailName);
      out.value(instance.email());
      out.endObject();
    }

    private Customer readCustomer(JsonReader in)
        throws IOException {
      ImmutableCustomer.Builder builder = ImmutableCustomer.builder();
      in.beginObject();
      while (in.hasNext()) {
        eachAttribute(in, builder);
      }
      in.endObject();
      return builder.build();
    }

    private void eachAttribute(JsonReader in, ImmutableCustomer.Builder builder)
        throws IOException {
      String attributeName = in.nextName();
      if (cardName.equals(attributeName)) {
        readInCard(in, builder);
        return;
      }
      if (cardTokenName.equals(attributeName)) {
        readInCardToken(in, builder);
        return;
      }
      if (emailName.equals(attributeName)) {
        readInEmail(in, builder);
        return;
      }
      in.skipValue();
    }

    private void readInCard(JsonReader in, ImmutableCustomer.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        Card value = cardTypeAdapter.read(in);
        builder.card(value);
      }
    }

    private void readInCardToken(JsonReader in, ImmutableCustomer.Builder builder)
        throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
      } else {
        builder.cardToken(in.nextString());
      }
    }

    private void readInEmail(JsonReader in, ImmutableCustomer.Builder builder)
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
