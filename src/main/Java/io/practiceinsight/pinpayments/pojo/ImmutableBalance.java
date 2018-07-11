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
 * Immutable implementation of {@link Balance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBalance.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Balance"})
@Immutable
public final class ImmutableBalance implements Balance {
  private final Integer amount;
  private final String currency;

  private ImmutableBalance(Integer amount, String currency) {
    this.amount = amount;
    this.currency = currency;
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
   * Copy the current immutable object by setting a value for the {@link Balance#amount() amount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBalance withAmount(Integer value) {
    if (this.amount.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "amount");
    return new ImmutableBalance(newValue, this.currency);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Balance#currency() currency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for currency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBalance withCurrency(String value) {
    if (this.currency.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "currency");
    return new ImmutableBalance(this.amount, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBalance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBalance
        && equalTo((ImmutableBalance) another);
  }

  private boolean equalTo(ImmutableBalance another) {
    return amount.equals(another.amount)
        && currency.equals(another.currency);
  }

  /**
   * Computes a hash code from attributes: {@code amount}, {@code currency}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + currency.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Balance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Balance")
        .omitNullValues()
        .add("amount", amount)
        .add("currency", currency)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Balance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Balance instance
   */
  public static ImmutableBalance copyOf(Balance instance) {
    if (instance instanceof ImmutableBalance) {
      return (ImmutableBalance) instance;
    }
    return ImmutableBalance.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBalance ImmutableBalance}.
   * @return A new ImmutableBalance builder
   */
  public static ImmutableBalance.Builder builder() {
    return new ImmutableBalance.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBalance ImmutableBalance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_AMOUNT = 0x1L;
    private static final long INIT_BIT_CURRENCY = 0x2L;
    private long initBits = 0x3L;

    private @Nullable Integer amount;
    private @Nullable String currency;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Balance} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Balance instance) {
      Preconditions.checkNotNull(instance, "instance");
      amount(instance.amount());
      currency(instance.currency());
      return this;
    }

    /**
     * Initializes the value for the {@link Balance#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder amount(Integer amount) {
      this.amount = Preconditions.checkNotNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link Balance#currency() currency} attribute.
     * @param currency The value for currency 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder currency(String currency) {
      this.currency = Preconditions.checkNotNull(currency, "currency");
      initBits &= ~INIT_BIT_CURRENCY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableBalance ImmutableBalance}.
     * @return An immutable instance of Balance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBalance build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBalance(amount, currency);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      if ((initBits & INIT_BIT_CURRENCY) != 0) attributes.add("currency");
      return "Cannot build Balance, some of required attributes are not set " + attributes;
    }
  }
}
