package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.primitives.Booleans;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ChargeResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChargeResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ChargeResult"})
@Immutable
public final class ImmutableChargeResult implements ChargeResult {
  private final String token;
  private final boolean success;
  private final String createdAt;
  private final String statusMessage;
  private final @Nullable String errorMessage;
  private final CardResult card;
  private final boolean captured;
  private final boolean authorisationExpired;
  private final ImmutableList<Transfer> transfer;
  private final BigDecimal amountRefunded;
  private final @Nullable BigDecimal totalFees;
  private final @Nullable BigDecimal merchantEntitlement;
  private final boolean refundPending;
  private final String settlementCurrency;
  private final String email;
  private final String description;
  private final Integer amount;
  private final @Nullable String ipAddress;
  private final String currency;
  private final ImmutableMap<String, String> metadata;

  private ImmutableChargeResult(
      String token,
      boolean success,
      String createdAt,
      String statusMessage,
      @Nullable String errorMessage,
      CardResult card,
      boolean captured,
      boolean authorisationExpired,
      ImmutableList<Transfer> transfer,
      BigDecimal amountRefunded,
      @Nullable BigDecimal totalFees,
      @Nullable BigDecimal merchantEntitlement,
      boolean refundPending,
      String settlementCurrency,
      String email,
      String description,
      Integer amount,
      @Nullable String ipAddress,
      String currency,
      ImmutableMap<String, String> metadata) {
    this.token = token;
    this.success = success;
    this.createdAt = createdAt;
    this.statusMessage = statusMessage;
    this.errorMessage = errorMessage;
    this.card = card;
    this.captured = captured;
    this.authorisationExpired = authorisationExpired;
    this.transfer = transfer;
    this.amountRefunded = amountRefunded;
    this.totalFees = totalFees;
    this.merchantEntitlement = merchantEntitlement;
    this.refundPending = refundPending;
    this.settlementCurrency = settlementCurrency;
    this.email = email;
    this.description = description;
    this.amount = amount;
    this.ipAddress = ipAddress;
    this.currency = currency;
    this.metadata = metadata;
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
  public boolean success() {
    return success;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @Override
  public String createdAt() {
    return createdAt;
  }

  /**
   * @return The value of the {@code statusMessage} attribute
   */
  @Override
  public String statusMessage() {
    return statusMessage;
  }

  /**
   * @return The value of the {@code errorMessage} attribute
   */
  @Override
  public @Nullable String errorMessage() {
    return errorMessage;
  }

  /**
   * @return The value of the {@code card} attribute
   */
  @Override
  public CardResult card() {
    return card;
  }

  /**
   * @return The value of the {@code captured} attribute
   */
  @Override
  public boolean captured() {
    return captured;
  }

  /**
   * @return The value of the {@code authorisationExpired} attribute
   */
  @Override
  public boolean authorisationExpired() {
    return authorisationExpired;
  }

  /**
   * @return The value of the {@code transfer} attribute
   */
  @Override
  public ImmutableList<Transfer> transfer() {
    return transfer;
  }

  /**
   * @return The value of the {@code amountRefunded} attribute
   */
  @Override
  public BigDecimal amountRefunded() {
    return amountRefunded;
  }

  /**
   * @return The value of the {@code totalFees} attribute
   */
  @Override
  public @Nullable BigDecimal totalFees() {
    return totalFees;
  }

  /**
   * @return The value of the {@code merchantEntitlement} attribute
   */
  @Override
  public @Nullable BigDecimal merchantEntitlement() {
    return merchantEntitlement;
  }

  /**
   * @return The value of the {@code refundPending} attribute
   */
  @Override
  public boolean refundPending() {
    return refundPending;
  }

  /**
   * @return The value of the {@code settlementCurrency} attribute
   */
  @Override
  public String settlementCurrency() {
    return settlementCurrency;
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
   * Copy the current immutable object by setting a value for the {@link ChargeResult#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withToken(String value) {
    if (this.token.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "token");
    return new ImmutableChargeResult(
        newValue,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#success() success} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for success
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withSuccess(boolean value) {
    if (this.success == value) return this;
    return new ImmutableChargeResult(
        this.token,
        value,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#createdAt() createdAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withCreatedAt(String value) {
    if (this.createdAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "createdAt");
    return new ImmutableChargeResult(
        this.token,
        this.success,
        newValue,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#statusMessage() statusMessage} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for statusMessage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withStatusMessage(String value) {
    if (this.statusMessage.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "statusMessage");
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        newValue,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#errorMessage() errorMessage} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorMessage (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withErrorMessage(@Nullable String value) {
    if (Objects.equal(this.errorMessage, value)) return this;
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        value,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#card() card} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for card
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withCard(CardResult value) {
    if (this.card == value) return this;
    CardResult newValue = Preconditions.checkNotNull(value, "card");
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        newValue,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#captured() captured} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for captured
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withCaptured(boolean value) {
    if (this.captured == value) return this;
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        value,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#authorisationExpired() authorisationExpired} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for authorisationExpired
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withAuthorisationExpired(boolean value) {
    if (this.authorisationExpired == value) return this;
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        value,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ChargeResult#transfer() transfer}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeResult withTransfer(Transfer... elements) {
    ImmutableList<Transfer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        newValue,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ChargeResult#transfer() transfer}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of transfer elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeResult withTransfer(Iterable<? extends Transfer> elements) {
    if (this.transfer == elements) return this;
    ImmutableList<Transfer> newValue = ImmutableList.copyOf(elements);
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        newValue,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#amountRefunded() amountRefunded} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amountRefunded
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withAmountRefunded(BigDecimal value) {
    if (this.amountRefunded.equals(value)) return this;
    BigDecimal newValue = Preconditions.checkNotNull(value, "amountRefunded");
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        newValue,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#totalFees() totalFees} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for totalFees (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withTotalFees(@Nullable BigDecimal value) {
    if (Objects.equal(this.totalFees, value)) return this;
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        value,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#merchantEntitlement() merchantEntitlement} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for merchantEntitlement (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withMerchantEntitlement(@Nullable BigDecimal value) {
    if (Objects.equal(this.merchantEntitlement, value)) return this;
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        value,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#refundPending() refundPending} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for refundPending
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withRefundPending(boolean value) {
    if (this.refundPending == value) return this;
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        value,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#settlementCurrency() settlementCurrency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for settlementCurrency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withSettlementCurrency(String value) {
    if (this.settlementCurrency.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "settlementCurrency");
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        newValue,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withEmail(String value) {
    if (this.email.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "email");
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        newValue,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#description() description} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for description
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withDescription(String value) {
    if (this.description.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "description");
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        newValue,
        this.amount,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#amount() amount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withAmount(Integer value) {
    if (this.amount.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "amount");
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        newValue,
        this.ipAddress,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#ipAddress() ipAddress} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for ipAddress (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withIpAddress(@Nullable String value) {
    if (Objects.equal(this.ipAddress, value)) return this;
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        value,
        this.currency,
        this.metadata);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResult#currency() currency} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for currency
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResult withCurrency(String value) {
    if (this.currency.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "currency");
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        newValue,
        this.metadata);
  }

  /**
   * Copy the current immutable object by replacing the {@link ChargeResult#metadata() metadata} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the metadata map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeResult withMetadata(Map<String, ? extends String> entries) {
    if (this.metadata == entries) return this;
    ImmutableMap<String, String> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableChargeResult(
        this.token,
        this.success,
        this.createdAt,
        this.statusMessage,
        this.errorMessage,
        this.card,
        this.captured,
        this.authorisationExpired,
        this.transfer,
        this.amountRefunded,
        this.totalFees,
        this.merchantEntitlement,
        this.refundPending,
        this.settlementCurrency,
        this.email,
        this.description,
        this.amount,
        this.ipAddress,
        this.currency,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChargeResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChargeResult
        && equalTo((ImmutableChargeResult) another);
  }

  private boolean equalTo(ImmutableChargeResult another) {
    return token.equals(another.token)
        && success == another.success
        && createdAt.equals(another.createdAt)
        && statusMessage.equals(another.statusMessage)
        && Objects.equal(errorMessage, another.errorMessage)
        && card.equals(another.card)
        && captured == another.captured
        && authorisationExpired == another.authorisationExpired
        && transfer.equals(another.transfer)
        && amountRefunded.equals(another.amountRefunded)
        && Objects.equal(totalFees, another.totalFees)
        && Objects.equal(merchantEntitlement, another.merchantEntitlement)
        && refundPending == another.refundPending
        && settlementCurrency.equals(another.settlementCurrency)
        && email.equals(another.email)
        && description.equals(another.description)
        && amount.equals(another.amount)
        && Objects.equal(ipAddress, another.ipAddress)
        && currency.equals(another.currency)
        && metadata.equals(another.metadata);
  }

  /**
   * Computes a hash code from attributes: {@code token}, {@code success}, {@code createdAt}, {@code statusMessage}, {@code errorMessage}, {@code card}, {@code captured}, {@code authorisationExpired}, {@code transfer}, {@code amountRefunded}, {@code totalFees}, {@code merchantEntitlement}, {@code refundPending}, {@code settlementCurrency}, {@code email}, {@code description}, {@code amount}, {@code ipAddress}, {@code currency}, {@code metadata}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + token.hashCode();
    h += (h << 5) + Booleans.hashCode(success);
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + statusMessage.hashCode();
    h += (h << 5) + Objects.hashCode(errorMessage);
    h += (h << 5) + card.hashCode();
    h += (h << 5) + Booleans.hashCode(captured);
    h += (h << 5) + Booleans.hashCode(authorisationExpired);
    h += (h << 5) + transfer.hashCode();
    h += (h << 5) + amountRefunded.hashCode();
    h += (h << 5) + Objects.hashCode(totalFees);
    h += (h << 5) + Objects.hashCode(merchantEntitlement);
    h += (h << 5) + Booleans.hashCode(refundPending);
    h += (h << 5) + settlementCurrency.hashCode();
    h += (h << 5) + email.hashCode();
    h += (h << 5) + description.hashCode();
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + Objects.hashCode(ipAddress);
    h += (h << 5) + currency.hashCode();
    h += (h << 5) + metadata.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ChargeResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ChargeResult")
        .omitNullValues()
        .add("token", token)
        .add("success", success)
        .add("createdAt", createdAt)
        .add("statusMessage", statusMessage)
        .add("errorMessage", errorMessage)
        .add("card", card)
        .add("captured", captured)
        .add("authorisationExpired", authorisationExpired)
        .add("transfer", transfer)
        .add("amountRefunded", amountRefunded)
        .add("totalFees", totalFees)
        .add("merchantEntitlement", merchantEntitlement)
        .add("refundPending", refundPending)
        .add("settlementCurrency", settlementCurrency)
        .add("email", email)
        .add("description", description)
        .add("amount", amount)
        .add("ipAddress", ipAddress)
        .add("currency", currency)
        .add("metadata", metadata)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ChargeResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChargeResult instance
   */
  public static ImmutableChargeResult copyOf(ChargeResult instance) {
    if (instance instanceof ImmutableChargeResult) {
      return (ImmutableChargeResult) instance;
    }
    return ImmutableChargeResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableChargeResult ImmutableChargeResult}.
   * @return A new ImmutableChargeResult builder
   */
  public static ImmutableChargeResult.Builder builder() {
    return new ImmutableChargeResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableChargeResult ImmutableChargeResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOKEN = 0x1L;
    private static final long INIT_BIT_SUCCESS = 0x2L;
    private static final long INIT_BIT_CREATED_AT = 0x4L;
    private static final long INIT_BIT_STATUS_MESSAGE = 0x8L;
    private static final long INIT_BIT_CARD = 0x10L;
    private static final long INIT_BIT_CAPTURED = 0x20L;
    private static final long INIT_BIT_AUTHORISATION_EXPIRED = 0x40L;
    private static final long INIT_BIT_AMOUNT_REFUNDED = 0x80L;
    private static final long INIT_BIT_REFUND_PENDING = 0x100L;
    private static final long INIT_BIT_SETTLEMENT_CURRENCY = 0x200L;
    private static final long INIT_BIT_EMAIL = 0x400L;
    private static final long INIT_BIT_DESCRIPTION = 0x800L;
    private static final long INIT_BIT_AMOUNT = 0x1000L;
    private static final long INIT_BIT_CURRENCY = 0x2000L;
    private long initBits = 0x3fffL;

    private @Nullable String token;
    private boolean success;
    private @Nullable String createdAt;
    private @Nullable String statusMessage;
    private @Nullable String errorMessage;
    private @Nullable CardResult card;
    private boolean captured;
    private boolean authorisationExpired;
    private ImmutableList.Builder<Transfer> transfer = ImmutableList.builder();
    private @Nullable BigDecimal amountRefunded;
    private @Nullable BigDecimal totalFees;
    private @Nullable BigDecimal merchantEntitlement;
    private boolean refundPending;
    private @Nullable String settlementCurrency;
    private @Nullable String email;
    private @Nullable String description;
    private @Nullable Integer amount;
    private @Nullable String ipAddress;
    private @Nullable String currency;
    private ImmutableMap.Builder<String, String> metadata = ImmutableMap.builder();

    private Builder() {
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

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.ChargeResult} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ChargeResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
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
      if (object instanceof ChargeResult) {
        ChargeResult instance = (ChargeResult) object;
        @Nullable BigDecimal totalFeesValue = instance.totalFees();
        if (totalFeesValue != null) {
          totalFees(totalFeesValue);
        }
        authorisationExpired(instance.authorisationExpired());
        @Nullable String errorMessageValue = instance.errorMessage();
        if (errorMessageValue != null) {
          errorMessage(errorMessageValue);
        }
        statusMessage(instance.statusMessage());
        token(instance.token());
        createdAt(instance.createdAt());
        addAllTransfer(instance.transfer());
        settlementCurrency(instance.settlementCurrency());
        @Nullable BigDecimal merchantEntitlementValue = instance.merchantEntitlement();
        if (merchantEntitlementValue != null) {
          merchantEntitlement(merchantEntitlementValue);
        }
        success(instance.success());
        captured(instance.captured());
        amountRefunded(instance.amountRefunded());
        refundPending(instance.refundPending());
        card(instance.card());
      }
    }

    /**
     * Initializes the value for the {@link ChargeResult#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder token(String token) {
      this.token = Preconditions.checkNotNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#success() success} attribute.
     * @param success The value for success 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder success(boolean success) {
      this.success = success;
      initBits &= ~INIT_BIT_SUCCESS;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder createdAt(String createdAt) {
      this.createdAt = Preconditions.checkNotNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#statusMessage() statusMessage} attribute.
     * @param statusMessage The value for statusMessage 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder statusMessage(String statusMessage) {
      this.statusMessage = Preconditions.checkNotNull(statusMessage, "statusMessage");
      initBits &= ~INIT_BIT_STATUS_MESSAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#errorMessage() errorMessage} attribute.
     * @param errorMessage The value for errorMessage (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorMessage(@Nullable String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#card() card} attribute.
     * @param card The value for card 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder card(CardResult card) {
      this.card = Preconditions.checkNotNull(card, "card");
      initBits &= ~INIT_BIT_CARD;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#captured() captured} attribute.
     * @param captured The value for captured 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder captured(boolean captured) {
      this.captured = captured;
      initBits &= ~INIT_BIT_CAPTURED;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#authorisationExpired() authorisationExpired} attribute.
     * @param authorisationExpired The value for authorisationExpired 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder authorisationExpired(boolean authorisationExpired) {
      this.authorisationExpired = authorisationExpired;
      initBits &= ~INIT_BIT_AUTHORISATION_EXPIRED;
      return this;
    }

    /**
     * Adds one element to {@link ChargeResult#transfer() transfer} list.
     * @param element A transfer element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTransfer(Transfer element) {
      this.transfer.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ChargeResult#transfer() transfer} list.
     * @param elements An array of transfer elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addTransfer(Transfer... elements) {
      this.transfer.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ChargeResult#transfer() transfer} list.
     * @param elements An iterable of transfer elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder transfer(Iterable<? extends Transfer> elements) {
      this.transfer = ImmutableList.builder();
      return addAllTransfer(elements);
    }

    /**
     * Adds elements to {@link ChargeResult#transfer() transfer} list.
     * @param elements An iterable of transfer elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllTransfer(Iterable<? extends Transfer> elements) {
      this.transfer.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#amountRefunded() amountRefunded} attribute.
     * @param amountRefunded The value for amountRefunded 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder amountRefunded(BigDecimal amountRefunded) {
      this.amountRefunded = Preconditions.checkNotNull(amountRefunded, "amountRefunded");
      initBits &= ~INIT_BIT_AMOUNT_REFUNDED;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#totalFees() totalFees} attribute.
     * @param totalFees The value for totalFees (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder totalFees(@Nullable BigDecimal totalFees) {
      this.totalFees = totalFees;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#merchantEntitlement() merchantEntitlement} attribute.
     * @param merchantEntitlement The value for merchantEntitlement (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder merchantEntitlement(@Nullable BigDecimal merchantEntitlement) {
      this.merchantEntitlement = merchantEntitlement;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#refundPending() refundPending} attribute.
     * @param refundPending The value for refundPending 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder refundPending(boolean refundPending) {
      this.refundPending = refundPending;
      initBits &= ~INIT_BIT_REFUND_PENDING;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#settlementCurrency() settlementCurrency} attribute.
     * @param settlementCurrency The value for settlementCurrency 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder settlementCurrency(String settlementCurrency) {
      this.settlementCurrency = Preconditions.checkNotNull(settlementCurrency, "settlementCurrency");
      initBits &= ~INIT_BIT_SETTLEMENT_CURRENCY;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder email(String email) {
      this.email = Preconditions.checkNotNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#description() description} attribute.
     * @param description The value for description 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder description(String description) {
      this.description = Preconditions.checkNotNull(description, "description");
      initBits &= ~INIT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder amount(Integer amount) {
      this.amount = Preconditions.checkNotNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#ipAddress() ipAddress} attribute.
     * @param ipAddress The value for ipAddress (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder ipAddress(@Nullable String ipAddress) {
      this.ipAddress = ipAddress;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResult#currency() currency} attribute.
     * @param currency The value for currency 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder currency(String currency) {
      this.currency = Preconditions.checkNotNull(currency, "currency");
      initBits &= ~INIT_BIT_CURRENCY;
      return this;
    }

    /**
     * Put one entry to the {@link ChargeResult#metadata() metadata} map.
     * @param key The key in the metadata map
     * @param value The associated value in the metadata map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putMetadata(String key, String value) {
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link ChargeResult#metadata() metadata} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putMetadata(Map.Entry<String, ? extends String> entry) {
      this.metadata.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link ChargeResult#metadata() metadata} map. Nulls are not permitted
     * @param metadata The entries that will be added to the metadata map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder metadata(Map<String, ? extends String> metadata) {
      this.metadata = ImmutableMap.builder();
      return putAllMetadata(metadata);
    }

    /**
     * Put all mappings from the specified map as entries to {@link ChargeResult#metadata() metadata} map. Nulls are not permitted
     * @param metadata The entries that will be added to the metadata map
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder putAllMetadata(Map<String, ? extends String> metadata) {
      this.metadata.putAll(metadata);
      return this;
    }

    /**
     * Builds a new {@link ImmutableChargeResult ImmutableChargeResult}.
     * @return An immutable instance of ChargeResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableChargeResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableChargeResult(
          token,
          success,
          createdAt,
          statusMessage,
          errorMessage,
          card,
          captured,
          authorisationExpired,
          transfer.build(),
          amountRefunded,
          totalFees,
          merchantEntitlement,
          refundPending,
          settlementCurrency,
          email,
          description,
          amount,
          ipAddress,
          currency,
          metadata.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      if ((initBits & INIT_BIT_SUCCESS) != 0) attributes.add("success");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      if ((initBits & INIT_BIT_STATUS_MESSAGE) != 0) attributes.add("statusMessage");
      if ((initBits & INIT_BIT_CARD) != 0) attributes.add("card");
      if ((initBits & INIT_BIT_CAPTURED) != 0) attributes.add("captured");
      if ((initBits & INIT_BIT_AUTHORISATION_EXPIRED) != 0) attributes.add("authorisationExpired");
      if ((initBits & INIT_BIT_AMOUNT_REFUNDED) != 0) attributes.add("amountRefunded");
      if ((initBits & INIT_BIT_REFUND_PENDING) != 0) attributes.add("refundPending");
      if ((initBits & INIT_BIT_SETTLEMENT_CURRENCY) != 0) attributes.add("settlementCurrency");
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      if ((initBits & INIT_BIT_DESCRIPTION) != 0) attributes.add("description");
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      if ((initBits & INIT_BIT_CURRENCY) != 0) attributes.add("currency");
      return "Cannot build ChargeResult, some of required attributes are not set " + attributes;
    }
  }
}
