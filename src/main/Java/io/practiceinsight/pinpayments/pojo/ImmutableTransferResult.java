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
 * Immutable implementation of {@link TransferResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransferResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransferResult"})
@Immutable
public final class ImmutableTransferResult implements TransferResult {
  private final String token;
  private final String status;
  private final Integer totalDebits;
  private final Integer totalCredits;
  private final String createdAt;
  private final String paidAt;
  private final BankAccountResult bankAccount;
  private final String description;
  private final Integer amount;
  private final String currency;
  private final String recipient;

  private ImmutableTransferResult(
      String token,
      String status,
      Integer totalDebits,
      Integer totalCredits,
      String createdAt,
      String paidAt,
      BankAccountResult bankAccount,
      String description,
      Integer amount,
      String currency,
      String recipient) {
    this.token = token;
    this.status = status;
    this.totalDebits = totalDebits;
    this.totalCredits = totalCredits;
    this.createdAt = createdAt;
    this.paidAt = paidAt;
    this.bankAccount = bankAccount;
    this.description = description;
    this.amount = amount;
    this.currency = currency;
    this.recipient = recipient;
  }

  /**
   * @return The value of the {@code token} attribute
   */
  @Override
  public String token() {
    return token;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @Override
  public String status() {
    return status;
  }

  /**
   * @return The value of the {@code totalDebits} attribute
   */
  @Override
  public Integer totalDebits() {
    return totalDebits;
  }

  /**
   * @return The value of the {@code totalCredits} attribute
   */
  @Override
  public Integer totalCredits() {
    return totalCredits;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @Override
  public String createdAt() {
    return createdAt;
  }

  /**
   * @return The value of the {@code paidAt} attribute
   */
  @Override
  public String paidAt() {
    return paidAt;
  }

  /**
   * @return The value of the {@code bankAccount} attribute
   */
  @Override
  public BankAccountResult bankAccount() {
    return bankAccount;
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
   * Copy the current immutable object by setting a value for the {@link TransferResult#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withToken(String value) {
    if (this.token.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "token");
    return new ImmutableTransferResult(
        newValue,
        this.status,
        this.totalDebits,
        this.totalCredits,
        this.createdAt,
        this.paidAt,
        this.bankAccount,
        this.description,
        this.amount,
        this.currency,
        this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferResult#status() status} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withStatus(String value) {
    if (this.status.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "status");
    return new ImmutableTransferResult(
        this.token,
        newValue,
        this.totalDebits,
        this.totalCredits,
        this.createdAt,
        this.paidAt,
        this.bankAccount,
        this.description,
        this.amount,
        this.currency,
        this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferResult#totalDebits() totalDebits} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalDebits
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withTotalDebits(Integer value) {
    if (this.totalDebits.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "totalDebits");
    return new ImmutableTransferResult(
        this.token,
        this.status,
        newValue,
        this.totalCredits,
        this.createdAt,
        this.paidAt,
        this.bankAccount,
        this.description,
        this.amount,
        this.currency,
        this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferResult#totalCredits() totalCredits} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalCredits
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withTotalCredits(Integer value) {
    if (this.totalCredits.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "totalCredits");
    return new ImmutableTransferResult(
        this.token,
        this.status,
        this.totalDebits,
        newValue,
        this.createdAt,
        this.paidAt,
        this.bankAccount,
        this.description,
        this.amount,
        this.currency,
        this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferResult#createdAt() createdAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withCreatedAt(String value) {
    if (this.createdAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "createdAt");
    return new ImmutableTransferResult(
        this.token,
        this.status,
        this.totalDebits,
        this.totalCredits,
        newValue,
        this.paidAt,
        this.bankAccount,
        this.description,
        this.amount,
        this.currency,
        this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferResult#paidAt() paidAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for paidAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withPaidAt(String value) {
    if (this.paidAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "paidAt");
    return new ImmutableTransferResult(
        this.token,
        this.status,
        this.totalDebits,
        this.totalCredits,
        this.createdAt,
        newValue,
        this.bankAccount,
        this.description,
        this.amount,
        this.currency,
        this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferResult#bankAccount() bankAccount} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bankAccount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withBankAccount(BankAccountResult value) {
    if (this.bankAccount == value) return this;
    BankAccountResult newValue = Preconditions.checkNotNull(value, "bankAccount");
    return new ImmutableTransferResult(
        this.token,
        this.status,
        this.totalDebits,
        this.totalCredits,
        this.createdAt,
        this.paidAt,
        newValue,
        this.description,
        this.amount,
        this.currency,
        this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferResult#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "description");
    return new ImmutableTransferResult(
        this.token,
        this.status,
        this.totalDebits,
        this.totalCredits,
        this.createdAt,
        this.paidAt,
        this.bankAccount,
        newValue,
        this.amount,
        this.currency,
        this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferResult#amount() amount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withAmount(Integer value) {
    if (this.amount.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "amount");
    return new ImmutableTransferResult(
        this.token,
        this.status,
        this.totalDebits,
        this.totalCredits,
        this.createdAt,
        this.paidAt,
        this.bankAccount,
        this.description,
        newValue,
        this.currency,
        this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferResult#currency() currency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for currency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withCurrency(String value) {
    if (this.currency.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "currency");
    return new ImmutableTransferResult(
        this.token,
        this.status,
        this.totalDebits,
        this.totalCredits,
        this.createdAt,
        this.paidAt,
        this.bankAccount,
        this.description,
        this.amount,
        newValue,
        this.recipient);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferResult#recipient() recipient} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for recipient
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferResult withRecipient(String value) {
    if (this.recipient.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "recipient");
    return new ImmutableTransferResult(
        this.token,
        this.status,
        this.totalDebits,
        this.totalCredits,
        this.createdAt,
        this.paidAt,
        this.bankAccount,
        this.description,
        this.amount,
        this.currency,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransferResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransferResult
        && equalTo((ImmutableTransferResult) another);
  }

  private boolean equalTo(ImmutableTransferResult another) {
    return token.equals(another.token)
        && status.equals(another.status)
        && totalDebits.equals(another.totalDebits)
        && totalCredits.equals(another.totalCredits)
        && createdAt.equals(another.createdAt)
        && paidAt.equals(another.paidAt)
        && bankAccount.equals(another.bankAccount)
        && description.equals(another.description)
        && amount.equals(another.amount)
        && currency.equals(another.currency)
        && recipient.equals(another.recipient);
  }

  /**
   * Computes a hash code from attributes: {@code token}, {@code status}, {@code totalDebits}, {@code totalCredits}, {@code createdAt}, {@code paidAt}, {@code bankAccount}, {@code description}, {@code amount}, {@code currency}, {@code recipient}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + token.hashCode();
    h += (h << 5) + status.hashCode();
    h += (h << 5) + totalDebits.hashCode();
    h += (h << 5) + totalCredits.hashCode();
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + paidAt.hashCode();
    h += (h << 5) + bankAccount.hashCode();
    h += (h << 5) + description.hashCode();
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + currency.hashCode();
    h += (h << 5) + recipient.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TransferResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransferResult")
        .omitNullValues()
        .add("token", token)
        .add("status", status)
        .add("totalDebits", totalDebits)
        .add("totalCredits", totalCredits)
        .add("createdAt", createdAt)
        .add("paidAt", paidAt)
        .add("bankAccount", bankAccount)
        .add("description", description)
        .add("amount", amount)
        .add("currency", currency)
        .add("recipient", recipient)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link TransferResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransferResult instance
   */
  public static ImmutableTransferResult copyOf(TransferResult instance) {
    if (instance instanceof ImmutableTransferResult) {
      return (ImmutableTransferResult) instance;
    }
    return ImmutableTransferResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransferResult ImmutableTransferResult}.
   * @return A new ImmutableTransferResult builder
   */
  public static ImmutableTransferResult.Builder builder() {
    return new ImmutableTransferResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransferResult ImmutableTransferResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOKEN = 0x1L;
    private static final long INIT_BIT_STATUS = 0x2L;
    private static final long INIT_BIT_TOTAL_DEBITS = 0x4L;
    private static final long INIT_BIT_TOTAL_CREDITS = 0x8L;
    private static final long INIT_BIT_CREATED_AT = 0x10L;
    private static final long INIT_BIT_PAID_AT = 0x20L;
    private static final long INIT_BIT_BANK_ACCOUNT = 0x40L;
    private static final long INIT_BIT_DESCRIPTION = 0x80L;
    private static final long INIT_BIT_AMOUNT = 0x100L;
    private static final long INIT_BIT_CURRENCY = 0x200L;
    private static final long INIT_BIT_RECIPIENT = 0x400L;
    private long initBits = 0x7ffL;

    private @Nullable String token;
    private @Nullable String status;
    private @Nullable Integer totalDebits;
    private @Nullable Integer totalCredits;
    private @Nullable String createdAt;
    private @Nullable String paidAt;
    private @Nullable BankAccountResult bankAccount;
    private @Nullable String description;
    private @Nullable Integer amount;
    private @Nullable String currency;
    private @Nullable String recipient;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.TransferResult} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TransferResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
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

    private void from(Object object) {
      if (object instanceof TransferResult) {
        TransferResult instance = (TransferResult) object;
        bankAccount(instance.bankAccount());
        createdAt(instance.createdAt());
        totalCredits(instance.totalCredits());
        paidAt(instance.paidAt());
        totalDebits(instance.totalDebits());
        token(instance.token());
        status(instance.status());
      }
      if (object instanceof TransferBase) {
        TransferBase instance = (TransferBase) object;
        recipient(instance.recipient());
        description(instance.description());
        amount(instance.amount());
        currency(instance.currency());
      }
    }

    /**
     * Initializes the value for the {@link TransferResult#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder token(String token) {
      this.token = Preconditions.checkNotNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferResult#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder status(String status) {
      this.status = Preconditions.checkNotNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferResult#totalDebits() totalDebits} attribute.
     * @param totalDebits The value for totalDebits 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalDebits(Integer totalDebits) {
      this.totalDebits = Preconditions.checkNotNull(totalDebits, "totalDebits");
      initBits &= ~INIT_BIT_TOTAL_DEBITS;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferResult#totalCredits() totalCredits} attribute.
     * @param totalCredits The value for totalCredits 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalCredits(Integer totalCredits) {
      this.totalCredits = Preconditions.checkNotNull(totalCredits, "totalCredits");
      initBits &= ~INIT_BIT_TOTAL_CREDITS;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferResult#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder createdAt(String createdAt) {
      this.createdAt = Preconditions.checkNotNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferResult#paidAt() paidAt} attribute.
     * @param paidAt The value for paidAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder paidAt(String paidAt) {
      this.paidAt = Preconditions.checkNotNull(paidAt, "paidAt");
      initBits &= ~INIT_BIT_PAID_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferResult#bankAccount() bankAccount} attribute.
     * @param bankAccount The value for bankAccount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bankAccount(BankAccountResult bankAccount) {
      this.bankAccount = Preconditions.checkNotNull(bankAccount, "bankAccount");
      initBits &= ~INIT_BIT_BANK_ACCOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferResult#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(String description) {
      this.description = Preconditions.checkNotNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferResult#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder amount(Integer amount) {
      this.amount = Preconditions.checkNotNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferResult#currency() currency} attribute.
     * @param currency The value for currency 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder currency(String currency) {
      this.currency = Preconditions.checkNotNull(currency, "currency");
      initBits &= ~INIT_BIT_CURRENCY;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferResult#recipient() recipient} attribute.
     * @param recipient The value for recipient 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder recipient(String recipient) {
      this.recipient = Preconditions.checkNotNull(recipient, "recipient");
      initBits &= ~INIT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransferResult ImmutableTransferResult}.
     * @return An immutable instance of TransferResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransferResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransferResult(
          token,
          status,
          totalDebits,
          totalCredits,
          createdAt,
          paidAt,
          bankAccount,
          description,
          amount,
          currency,
          recipient);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_TOTAL_DEBITS) != 0) attributes.add("totalDebits");
      if ((initBits & INIT_BIT_TOTAL_CREDITS) != 0) attributes.add("totalCredits");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      if ((initBits & INIT_BIT_PAID_AT) != 0) attributes.add("paidAt");
      if ((initBits & INIT_BIT_BANK_ACCOUNT) != 0) attributes.add("bankAccount");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      if ((initBits & INIT_BIT_CURRENCY) != 0) attributes.add("currency");
      if ((initBits & INIT_BIT_RECIPIENT) != 0) attributes.add("recipient");
      return "Cannot build TransferResult, some of required attributes are not set " + attributes;
    }
  }
}
