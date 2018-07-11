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
 * Immutable implementation of {@link RefundResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRefundResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "RefundResult"})
@Immutable
public final class ImmutableRefundResult implements RefundResult {
  private final String token;
  private final @Nullable Boolean success;
  private final Integer amount;
  private final String currency;
  private final String charge;
  private final String createdAt;
  private final @Nullable String errorMessage;
  private final @Nullable String statusMessage;

  private ImmutableRefundResult(
      String token,
      @Nullable Boolean success,
      Integer amount,
      String currency,
      String charge,
      String createdAt,
      @Nullable String errorMessage,
      @Nullable String statusMessage) {
    this.token = token;
    this.success = success;
    this.amount = amount;
    this.currency = currency;
    this.charge = charge;
    this.createdAt = createdAt;
    this.errorMessage = errorMessage;
    this.statusMessage = statusMessage;
  }

  /**
   * @return The value of the {@code token} attribute
   */
  @Override
  public String token() {
    return token;
  }

  /**
   * @return The value of the {@code success} attribute
   */
  @Override
  public @Nullable Boolean success() {
    return success;
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
   * @return The value of the {@code charge} attribute
   */
  @Override
  public String charge() {
    return charge;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @Override
  public String createdAt() {
    return createdAt;
  }

  /**
   * @return The value of the {@code errorMessage} attribute
   */
  @Override
  public @Nullable String errorMessage() {
    return errorMessage;
  }

  /**
   * @return The value of the {@code statusMessage} attribute
   */
  @Override
  public @Nullable String statusMessage() {
    return statusMessage;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RefundResult#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefundResult withToken(String value) {
    if (this.token.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "token");
    return new ImmutableRefundResult(
        newValue,
        this.success,
        this.amount,
        this.currency,
        this.charge,
        this.createdAt,
        this.errorMessage,
        this.statusMessage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RefundResult#success() success} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for success (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefundResult withSuccess(@Nullable Boolean value) {
    if (Objects.equal(this.success, value)) return this;
    return new ImmutableRefundResult(
        this.token,
        value,
        this.amount,
        this.currency,
        this.charge,
        this.createdAt,
        this.errorMessage,
        this.statusMessage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RefundResult#amount() amount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefundResult withAmount(Integer value) {
    if (this.amount.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "amount");
    return new ImmutableRefundResult(
        this.token,
        this.success,
        newValue,
        this.currency,
        this.charge,
        this.createdAt,
        this.errorMessage,
        this.statusMessage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RefundResult#currency() currency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for currency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefundResult withCurrency(String value) {
    if (this.currency.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "currency");
    return new ImmutableRefundResult(
        this.token,
        this.success,
        this.amount,
        newValue,
        this.charge,
        this.createdAt,
        this.errorMessage,
        this.statusMessage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RefundResult#charge() charge} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for charge
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefundResult withCharge(String value) {
    if (this.charge.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "charge");
    return new ImmutableRefundResult(
        this.token,
        this.success,
        this.amount,
        this.currency,
        newValue,
        this.createdAt,
        this.errorMessage,
        this.statusMessage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RefundResult#createdAt() createdAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefundResult withCreatedAt(String value) {
    if (this.createdAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "createdAt");
    return new ImmutableRefundResult(
        this.token,
        this.success,
        this.amount,
        this.currency,
        this.charge,
        newValue,
        this.errorMessage,
        this.statusMessage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RefundResult#errorMessage() errorMessage} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorMessage (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefundResult withErrorMessage(@Nullable String value) {
    if (Objects.equal(this.errorMessage, value)) return this;
    return new ImmutableRefundResult(
        this.token,
        this.success,
        this.amount,
        this.currency,
        this.charge,
        this.createdAt,
        value,
        this.statusMessage);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RefundResult#statusMessage() statusMessage} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for statusMessage (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefundResult withStatusMessage(@Nullable String value) {
    if (Objects.equal(this.statusMessage, value)) return this;
    return new ImmutableRefundResult(
        this.token,
        this.success,
        this.amount,
        this.currency,
        this.charge,
        this.createdAt,
        this.errorMessage,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRefundResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRefundResult
        && equalTo((ImmutableRefundResult) another);
  }

  private boolean equalTo(ImmutableRefundResult another) {
    return token.equals(another.token)
        && Objects.equal(success, another.success)
        && amount.equals(another.amount)
        && currency.equals(another.currency)
        && charge.equals(another.charge)
        && createdAt.equals(another.createdAt)
        && Objects.equal(errorMessage, another.errorMessage)
        && Objects.equal(statusMessage, another.statusMessage);
  }

  /**
   * Computes a hash code from attributes: {@code token}, {@code success}, {@code amount}, {@code currency}, {@code charge}, {@code createdAt}, {@code errorMessage}, {@code statusMessage}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + token.hashCode();
    h += (h << 5) + Objects.hashCode(success);
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + currency.hashCode();
    h += (h << 5) + charge.hashCode();
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + Objects.hashCode(errorMessage);
    h += (h << 5) + Objects.hashCode(statusMessage);
    return h;
  }

  /**
   * Prints the immutable value {@code RefundResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RefundResult")
        .omitNullValues()
        .add("token", token)
        .add("success", success)
        .add("amount", amount)
        .add("currency", currency)
        .add("charge", charge)
        .add("createdAt", createdAt)
        .add("errorMessage", errorMessage)
        .add("statusMessage", statusMessage)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link RefundResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RefundResult instance
   */
  public static ImmutableRefundResult copyOf(RefundResult instance) {
    if (instance instanceof ImmutableRefundResult) {
      return (ImmutableRefundResult) instance;
    }
    return ImmutableRefundResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRefundResult ImmutableRefundResult}.
   * @return A new ImmutableRefundResult builder
   */
  public static ImmutableRefundResult.Builder builder() {
    return new ImmutableRefundResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRefundResult ImmutableRefundResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOKEN = 0x1L;
    private static final long INIT_BIT_AMOUNT = 0x2L;
    private static final long INIT_BIT_CURRENCY = 0x4L;
    private static final long INIT_BIT_CHARGE = 0x8L;
    private static final long INIT_BIT_CREATED_AT = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable String token;
    private @Nullable Boolean success;
    private @Nullable Integer amount;
    private @Nullable String currency;
    private @Nullable String charge;
    private @Nullable String createdAt;
    private @Nullable String errorMessage;
    private @Nullable String statusMessage;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RefundResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RefundResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      token(instance.token());
      @Nullable Boolean successValue = instance.success();
      if (successValue != null) {
        success(successValue);
      }
      amount(instance.amount());
      currency(instance.currency());
      charge(instance.charge());
      createdAt(instance.createdAt());
      @Nullable String errorMessageValue = instance.errorMessage();
      if (errorMessageValue != null) {
        errorMessage(errorMessageValue);
      }
      @Nullable String statusMessageValue = instance.statusMessage();
      if (statusMessageValue != null) {
        statusMessage(statusMessageValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link RefundResult#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder token(String token) {
      this.token = Preconditions.checkNotNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link RefundResult#success() success} attribute.
     * @param success The value for success (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder success(@Nullable Boolean success) {
      this.success = success;
      return this;
    }

    /**
     * Initializes the value for the {@link RefundResult#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder amount(Integer amount) {
      this.amount = Preconditions.checkNotNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link RefundResult#currency() currency} attribute.
     * @param currency The value for currency 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder currency(String currency) {
      this.currency = Preconditions.checkNotNull(currency, "currency");
      initBits &= ~INIT_BIT_CURRENCY;
      return this;
    }

    /**
     * Initializes the value for the {@link RefundResult#charge() charge} attribute.
     * @param charge The value for charge 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder charge(String charge) {
      this.charge = Preconditions.checkNotNull(charge, "charge");
      initBits &= ~INIT_BIT_CHARGE;
      return this;
    }

    /**
     * Initializes the value for the {@link RefundResult#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder createdAt(String createdAt) {
      this.createdAt = Preconditions.checkNotNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link RefundResult#errorMessage() errorMessage} attribute.
     * @param errorMessage The value for errorMessage (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorMessage(@Nullable String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    /**
     * Initializes the value for the {@link RefundResult#statusMessage() statusMessage} attribute.
     * @param statusMessage The value for statusMessage (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder statusMessage(@Nullable String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRefundResult ImmutableRefundResult}.
     * @return An immutable instance of RefundResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRefundResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRefundResult(token, success, amount, currency, charge, createdAt, errorMessage, statusMessage);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      if ((initBits & INIT_BIT_CURRENCY) != 0) attributes.add("currency");
      if ((initBits & INIT_BIT_CHARGE) != 0) attributes.add("charge");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      return "Cannot build RefundResult, some of required attributes are not set " + attributes;
    }
  }
}
