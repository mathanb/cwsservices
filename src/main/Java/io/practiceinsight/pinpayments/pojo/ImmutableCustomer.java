package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link Customer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCustomer.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Customer"})
@Immutable
public final class ImmutableCustomer implements Customer {
  private final @Nullable Card card;
  private final @Nullable String cardToken;
  private final String email;

  private ImmutableCustomer(
      @Nullable Card card,
      @Nullable String cardToken,
      String email) {
    this.card = card;
    this.cardToken = cardToken;
    this.email = email;
  }

  /**
   * @return The value of the {@code card} attribute
   */
  @Override
  public @Nullable Card card() {
    return card;
  }

  /**
   * @return The value of the {@code cardToken} attribute
   */
  @Override
  public @Nullable String cardToken() {
    return cardToken;
  }

  /**
   * @return The value of the {@code email} attribute
   */
  @Override
  public String email() {
    return email;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Customer#card() card} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for card (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomer withCard(@Nullable Card value) {
    if (this.card == value) return this;
    return new ImmutableCustomer(value, this.cardToken, this.email);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Customer#cardToken() cardToken} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cardToken (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomer withCardToken(@Nullable String value) {
    if (Objects.equal(this.cardToken, value)) return this;
    return new ImmutableCustomer(this.card, value, this.email);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Customer#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomer withEmail(String value) {
    if (this.email.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "email");
    return new ImmutableCustomer(this.card, this.cardToken, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCustomer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCustomer
        && equalTo((ImmutableCustomer) another);
  }

  private boolean equalTo(ImmutableCustomer another) {
    return Objects.equal(card, another.card)
        && Objects.equal(cardToken, another.cardToken)
        && email.equals(another.email);
  }

  /**
   * Computes a hash code from attributes: {@code card}, {@code cardToken}, {@code email}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(card);
    h += (h << 5) + Objects.hashCode(cardToken);
    h += (h << 5) + email.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Customer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Customer")
        .omitNullValues()
        .add("card", card)
        .add("cardToken", cardToken)
        .add("email", email)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Customer} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Customer instance
   */
  public static ImmutableCustomer copyOf(Customer instance) {
    if (instance instanceof ImmutableCustomer) {
      return (ImmutableCustomer) instance;
    }
    return ImmutableCustomer.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCustomer ImmutableCustomer}.
   * @return A new ImmutableCustomer builder
   */
  public static ImmutableCustomer.Builder builder() {
    return new ImmutableCustomer.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCustomer ImmutableCustomer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_EMAIL = 0x1L;
    private long initBits = 0x1L;

    private @Nullable Card card;
    private @Nullable String cardToken;
    private @Nullable String email;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.Customer} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Customer instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.CustomerBase} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CustomerBase instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof Customer) {
        Customer instance = (Customer) object;
        @Nullable Card cardValue = instance.card();
        if (cardValue != null) {
          card(cardValue);
        }
        @Nullable String cardTokenValue = instance.cardToken();
        if (cardTokenValue != null) {
          cardToken(cardTokenValue);
        }
      }
      if (object instanceof CustomerBase) {
        CustomerBase instance = (CustomerBase) object;
        email(instance.email());
      }
    }

    /**
     * Initializes the value for the {@link Customer#card() card} attribute.
     * @param card The value for card (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder card(@Nullable Card card) {
      this.card = card;
      return this;
    }

    /**
     * Initializes the value for the {@link Customer#cardToken() cardToken} attribute.
     * @param cardToken The value for cardToken (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder cardToken(@Nullable String cardToken) {
      this.cardToken = cardToken;
      return this;
    }

    /**
     * Initializes the value for the {@link Customer#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder email(String email) {
      this.email = Preconditions.checkNotNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCustomer ImmutableCustomer}.
     * @return An immutable instance of Customer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCustomer build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCustomer(card, cardToken, email);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      return "Cannot build Customer, some of required attributes are not set " + attributes;
    }
  }
}
