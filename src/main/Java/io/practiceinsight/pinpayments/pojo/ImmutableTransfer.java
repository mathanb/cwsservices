package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
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
 * Immutable implementation of {@link Transfer}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransfer.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Transfer"})
@Immutable
public final class ImmutableTransfer implements Transfer {
  private final String description;
  private final Integer amount;
  private final String currency;
  private final String recipient;

  private ImmutableTransfer(
      String description,
      Integer amount,
      String currency,
      String recipient) {
    this.description = description;
    this.amount = amount;
    this.currency = currency;
    this.recipient = recipient;
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
   * @return The value of the {@code currency} attribute
   */
  @Override
  public String currency() {
    return currency;
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @Override
  public String recipient() {
    return recipient;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transfer#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransfer withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "description");
    return new ImmutableTransfer(newValue, this.amount, this.currency, this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transfer#amount() amount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransfer withAmount(Integer value) {
    if (this.amount.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "amount");
    return new ImmutableTransfer(this.description, newValue, this.currency, this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transfer#currency() currency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for currency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransfer withCurrency(String value) {
    if (this.currency.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "currency");
    return new ImmutableTransfer(this.description, this.amount, newValue, this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Transfer#recipient() recipient} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for recipient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransfer withRecipient(String value) {
    if (this.recipient.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "recipient");
    return new ImmutableTransfer(this.description, this.amount, this.currency, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransfer} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransfer
        && equalTo((ImmutableTransfer) another);
  }

  private boolean equalTo(ImmutableTransfer another) {
    return description.equals(another.description)
        && amount.equals(another.amount)
        && currency.equals(another.currency)
        && recipient.equals(another.recipient);
  }

  /**
   * Computes a hash code from attributes: {@code description}, {@code amount}, {@code currency}, {@code recipient}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + description.hashCode();
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + currency.hashCode();
    h += (h << 5) + recipient.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Transfer} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Transfer")
        .omitNullValues()
        .add("description", description)
        .add("amount", amount)
        .add("currency", currency)
        .add("recipient", recipient)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Transfer} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Transfer instance
   */
  public static ImmutableTransfer copyOf(Transfer instance) {
    if (instance instanceof ImmutableTransfer) {
      return (ImmutableTransfer) instance;
    }
    return ImmutableTransfer.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransfer ImmutableTransfer}.
   * @return A new ImmutableTransfer builder
   */
  public static ImmutableTransfer.Builder builder() {
    return new ImmutableTransfer.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransfer ImmutableTransfer}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DESCRIPTION = 0x1L;
    private static final long INIT_BIT_AMOUNT = 0x2L;
    private static final long INIT_BIT_CURRENCY = 0x4L;
    private static final long INIT_BIT_RECIPIENT = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String description;
    private @Nullable Integer amount;
    private @Nullable String currency;
    private @Nullable String recipient;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.TransferBase} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TransferBase instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.Transfer} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Transfer instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof TransferBase) {
        TransferBase instance = (TransferBase) object;
        recipient(instance.recipient());
        description(instance.description());
        amount(instance.amount());
        currency(instance.currency());
      }
    }

    /**
     * Initializes the value for the {@link Transfer#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(String description) {
      this.description = Preconditions.checkNotNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link Transfer#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder amount(Integer amount) {
      this.amount = Preconditions.checkNotNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link Transfer#currency() currency} attribute.
     * @param currency The value for currency 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder currency(String currency) {
      this.currency = Preconditions.checkNotNull(currency, "currency");
      initBits &= ~INIT_BIT_CURRENCY;
      return this;
    }

    /**
     * Initializes the value for the {@link Transfer#recipient() recipient} attribute.
     * @param recipient The value for recipient 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder recipient(String recipient) {
      this.recipient = Preconditions.checkNotNull(recipient, "recipient");
      initBits &= ~INIT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransfer ImmutableTransfer}.
     * @return An immutable instance of Transfer
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransfer build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransfer(description, amount, currency, recipient);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      if ((initBits & INIT_BIT_CURRENCY) != 0) attributes.add("currency");
      if ((initBits & INIT_BIT_RECIPIENT) != 0) attributes.add("recipient");
      return "Cannot build Transfer, some of required attributes are not set " + attributes;
    }
  }
}
