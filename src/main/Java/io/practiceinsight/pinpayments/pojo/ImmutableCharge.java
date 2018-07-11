package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link Charge}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCharge.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Charge"})
@Immutable
public final class ImmutableCharge implements Charge {
  private final @Nullable String capture;
  private final @Nullable Card card;
  private final @Nullable String cardToken;
  private final @Nullable String customerToken;
  private final String email;
  private final String description;
  private final Integer amount;
  private final @Nullable String ipAddress;
  private final String currency;
  private final ImmutableMap<String, String> metadata;

  private ImmutableCharge(
      @Nullable String capture,
      @Nullable Card card,
      @Nullable String cardToken,
      @Nullable String customerToken,
      String email,
      String description,
      Integer amount,
      @Nullable String ipAddress,
      String currency,
      ImmutableMap<String, String> metadata) {
    this.capture = capture;
    this.card = card;
    this.cardToken = cardToken;
    this.customerToken = customerToken;
    this.email = email;
    this.description = description;
    this.amount = amount;
    this.ipAddress = ipAddress;
    this.currency = currency;
    this.metadata = metadata;
  }

  /**
   * @return The value of the {@code capture} attribute
   */
  @Override
  public @Nullable String capture() {
    return capture;
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
   * @return The value of the {@code customerToken} attribute
   */
  @Override
  public @Nullable String customerToken() {
    return customerToken;
  }

  /**
   * @return The value of the {@code email} attribute
   */
  @Override
  public String email() {
    return email;
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @Override
  public String description() {
    return description;
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @Override
  public Integer amount() {
    return amount;
  }

  /**
   * @return The value of the {@code ipAddress} attribute
   */
  @Override
  public @Nullable String ipAddress() {
    return ipAddress;
  }

  /**
   * @return The value of the {@code currency} attribute
   */
  @Override
  public String currency() {
    return currency;
  }

  /**
   * @return The value of the {@code metadata} attribute
   */
  @Override
  public ImmutableMap<String, String> metadata() {
    return metadata;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Charge#capture() capture} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for capture (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCharge withCapture(@Nullable String value) {
    if (Objects.equal(this.capture, value)) return this;
    return new ImmutableCharge(
        value,
        this.card,
        this.cardToken,
        this.customerToken,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Charge#card() card} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for card (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCharge withCard(@Nullable Card value) {
    if (this.card == value) return this;
    return new ImmutableCharge(
        this.capture,
        value,
        this.cardToken,
        this.customerToken,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Charge#cardToken() cardToken} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cardToken (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCharge withCardToken(@Nullable String value) {
    if (Objects.equal(this.cardToken, value)) return this;
    return new ImmutableCharge(
        this.capture,
        this.card,
        value,
        this.customerToken,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Charge#customerToken() customerToken} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for customerToken (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCharge withCustomerToken(@Nullable String value) {
    if (Objects.equal(this.customerToken, value)) return this;
    return new ImmutableCharge(
        this.capture,
        this.card,
        this.cardToken,
        value,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Charge#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCharge withEmail(String value) {
    if (this.email.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "email");
    return new ImmutableCharge(
        this.capture,
        this.card,
        this.cardToken,
        this.customerToken,
        newValue,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Charge#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCharge withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "description");
    return new ImmutableCharge(
        this.capture,
        this.card,
        this.cardToken,
        this.customerToken,
        this.email,
        newValue,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Charge#amount() amount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCharge withAmount(Integer value) {
    if (this.amount.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "amount");
    return new ImmutableCharge(
        this.capture,
        this.card,
        this.cardToken,
        this.customerToken,
        this.email,
        this.description,
        newValue,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Charge#ipAddress() ipAddress} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ipAddress (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCharge withIpAddress(@Nullable String value) {
    if (Objects.equal(this.ipAddress, value)) return this;
    return new ImmutableCharge(
        this.capture,
        this.card,
        this.cardToken,
        this.customerToken,
        this.email,
        this.description,
        this.amount,
        value,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Charge#currency() currency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for currency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCharge withCurrency(String value) {
    if (this.currency.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "currency");
    return new ImmutableCharge(
        this.capture,
        this.card,
        this.cardToken,
        this.customerToken,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        newValue,
        this.metadata);
  }

  /**
   * Copy the current immutable object by replacing the {@link Charge#metadata() metadata} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the metadata map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCharge withMetadata(Map<String, ? extends String> entries) {
    if (this.metadata == entries) return this;
    ImmutableMap<String, String> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableCharge(
        this.capture,
        this.card,
        this.cardToken,
        this.customerToken,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCharge} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCharge
        && equalTo((ImmutableCharge) another);
  }

  private boolean equalTo(ImmutableCharge another) {
    return Objects.equal(capture, another.capture)
        && Objects.equal(card, another.card)
        && Objects.equal(cardToken, another.cardToken)
        && Objects.equal(customerToken, another.customerToken)
        && email.equals(another.email)
        && description.equals(another.description)
        && amount.equals(another.amount)
        && Objects.equal(ipAddress, another.ipAddress)
        && currency.equals(another.currency)
        && metadata.equals(another.metadata);
  }

  /**
   * Computes a hash code from attributes: {@code capture}, {@code card}, {@code cardToken}, {@code customerToken}, {@code email}, {@code description}, {@code amount}, {@code ipAddress}, {@code currency}, {@code metadata}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(capture);
    h += (h << 5) + Objects.hashCode(card);
    h += (h << 5) + Objects.hashCode(cardToken);
    h += (h << 5) + Objects.hashCode(customerToken);
    h += (h << 5) + email.hashCode();
    h += (h << 5) + description.hashCode();
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + Objects.hashCode(ipAddress);
    h += (h << 5) + currency.hashCode();
    h += (h << 5) + metadata.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Charge} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Charge")
        .omitNullValues()
        .add("capture", capture)
        .add("card", card)
        .add("cardToken", cardToken)
        .add("customerToken", customerToken)
        .add("email", email)
        .add("description", description)
        .add("amount", amount)
        .add("ipAddress", ipAddress)
        .add("currency", currency)
        .add("metadata", metadata)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Charge} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Charge instance
   */
  public static ImmutableCharge copyOf(Charge instance) {
    if (instance instanceof ImmutableCharge) {
      return (ImmutableCharge) instance;
    }
    return ImmutableCharge.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCharge ImmutableCharge}.
   * @return A new ImmutableCharge builder
   */
  public static ImmutableCharge.Builder builder() {
    return new ImmutableCharge.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCharge ImmutableCharge}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_EMAIL = 0x1L;
    private static final long INIT_BIT_DESCRIPTION = 0x2L;
    private static final long INIT_BIT_AMOUNT = 0x4L;
    private static final long INIT_BIT_CURRENCY = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String capture;
    private @Nullable Card card;
    private @Nullable String cardToken;
    private @Nullable String customerToken;
    private @Nullable String email;
    private @Nullable String description;
    private @Nullable Integer amount;
    private @Nullable String ipAddress;
    private @Nullable String currency;
    private ImmutableMap.Builder<String, String> metadata = ImmutableMap.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.Charge} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Charge instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.ChargeBase} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ChargeBase instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof Charge) {
        Charge instance = (Charge) object;
        @Nullable String captureValue = instance.capture();
        if (captureValue != null) {
          capture(captureValue);
        }
        @Nullable String customerTokenValue = instance.customerToken();
        if (customerTokenValue != null) {
          customerToken(customerTokenValue);
        }
        @Nullable Card cardValue = instance.card();
        if (cardValue != null) {
          card(cardValue);
        }
        @Nullable String cardTokenValue = instance.cardToken();
        if (cardTokenValue != null) {
          cardToken(cardTokenValue);
        }
      }
      if (object instanceof ChargeBase) {
        ChargeBase instance = (ChargeBase) object;
        @Nullable String ipAddressValue = instance.ipAddress();
        if (ipAddressValue != null) {
          ipAddress(ipAddressValue);
        }
        description(instance.description());
        amount(instance.amount());
        putAllMetadata(instance.metadata());
        currency(instance.currency());
        email(instance.email());
      }
    }

    /**
     * Initializes the value for the {@link Charge#capture() capture} attribute.
     * @param capture The value for capture (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder capture(@Nullable String capture) {
      this.capture = capture;
      return this;
    }

    /**
     * Initializes the value for the {@link Charge#card() card} attribute.
     * @param card The value for card (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder card(@Nullable Card card) {
      this.card = card;
      return this;
    }

    /**
     * Initializes the value for the {@link Charge#cardToken() cardToken} attribute.
     * @param cardToken The value for cardToken (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder cardToken(@Nullable String cardToken) {
      this.cardToken = cardToken;
      return this;
    }

    /**
     * Initializes the value for the {@link Charge#customerToken() customerToken} attribute.
     * @param customerToken The value for customerToken (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder customerToken(@Nullable String customerToken) {
      this.customerToken = customerToken;
      return this;
    }

    /**
     * Initializes the value for the {@link Charge#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder email(String email) {
      this.email = Preconditions.checkNotNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link Charge#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(String description) {
      this.description = Preconditions.checkNotNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link Charge#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder amount(Integer amount) {
      this.amount = Preconditions.checkNotNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link Charge#ipAddress() ipAddress} attribute.
     * @param ipAddress The value for ipAddress (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ipAddress(@Nullable String ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }

    /**
     * Initializes the value for the {@link Charge#currency() currency} attribute.
     * @param currency The value for currency 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder currency(String currency) {
      this.currency = Preconditions.checkNotNull(currency, "currency");
      initBits &= ~INIT_BIT_CURRENCY;
      return this;
    }

    /**
     * Put one entry to the {@link Charge#metadata() metadata} map.
     * @param key The key in the metadata map
     * @param value The associated value in the metadata map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putMetadata(String key, String value) {
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link Charge#metadata() metadata} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putMetadata(Map.Entry<String, ? extends String> entry) {
      this.metadata.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link Charge#metadata() metadata} map. Nulls are not permitted
     * @param metadata The entries that will be added to the metadata map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder metadata(Map<String, ? extends String> metadata) {
      this.metadata = ImmutableMap.builder();
      return putAllMetadata(metadata);
    }

    /**
     * Put all mappings from the specified map as entries to {@link Charge#metadata() metadata} map. Nulls are not permitted
     * @param metadata The entries that will be added to the metadata map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllMetadata(Map<String, ? extends String> metadata) {
      this.metadata.putAll(metadata);
      return this;
    }

    /**
     * Builds a new {@link ImmutableCharge ImmutableCharge}.
     * @return An immutable instance of Charge
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCharge build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCharge(
          capture,
          card,
          cardToken,
          customerToken,
          email,
          description,
          amount,
          ipAddress,
          currency,
          metadata.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      if ((initBits & INIT_BIT_CURRENCY) != 0) attributes.add("currency");
      return "Cannot build Charge, some of required attributes are not set " + attributes;
    }
  }
}
