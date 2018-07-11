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
 * Immutable implementation of {@link CustomerResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCustomerResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "CustomerResult"})
@Immutable
public final class ImmutableCustomerResult implements CustomerResult {
  private final String token;
  private final String createdAt;
  private final CardResult card;
  private final String email;

  private ImmutableCustomerResult(
      String token,
      String createdAt,
      CardResult card,
      String email) {
    this.token = token;
    this.createdAt = createdAt;
    this.card = card;
    this.email = email;
  }

  /**
   * @return The value of the {@code token} attribute
   */
  @Override
  public String token() {
    return token;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @Override
  public String createdAt() {
    return createdAt;
  }

  /**
   * @return The value of the {@code card} attribute
   */
  @Override
  public CardResult card() {
    return card;
  }

  /**
   * @return The value of the {@code email} attribute
   */
  @Override
  public String email() {
    return email;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CustomerResult#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomerResult withToken(String value) {
    if (this.token.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "token");
    return new ImmutableCustomerResult(newValue, this.createdAt, this.card, this.email);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CustomerResult#createdAt() createdAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomerResult withCreatedAt(String value) {
    if (this.createdAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "createdAt");
    return new ImmutableCustomerResult(this.token, newValue, this.card, this.email);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CustomerResult#card() card} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for card
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomerResult withCard(CardResult value) {
    if (this.card == value) return this;
    CardResult newValue = Preconditions.checkNotNull(value, "card");
    return new ImmutableCustomerResult(this.token, this.createdAt, newValue, this.email);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CustomerResult#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCustomerResult withEmail(String value) {
    if (this.email.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "email");
    return new ImmutableCustomerResult(this.token, this.createdAt, this.card, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCustomerResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCustomerResult
        && equalTo((ImmutableCustomerResult) another);
  }

  private boolean equalTo(ImmutableCustomerResult another) {
    return token.equals(another.token)
        && createdAt.equals(another.createdAt)
        && card.equals(another.card)
        && email.equals(another.email);
  }

  /**
   * Computes a hash code from attributes: {@code token}, {@code createdAt}, {@code card}, {@code email}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + token.hashCode();
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + card.hashCode();
    h += (h << 5) + email.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CustomerResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CustomerResult")
        .omitNullValues()
        .add("token", token)
        .add("createdAt", createdAt)
        .add("card", card)
        .add("email", email)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link CustomerResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CustomerResult instance
   */
  public static ImmutableCustomerResult copyOf(CustomerResult instance) {
    if (instance instanceof ImmutableCustomerResult) {
      return (ImmutableCustomerResult) instance;
    }
    return ImmutableCustomerResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCustomerResult ImmutableCustomerResult}.
   * @return A new ImmutableCustomerResult builder
   */
  public static ImmutableCustomerResult.Builder builder() {
    return new ImmutableCustomerResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCustomerResult ImmutableCustomerResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOKEN = 0x1L;
    private static final long INIT_BIT_CREATED_AT = 0x2L;
    private static final long INIT_BIT_CARD = 0x4L;
    private static final long INIT_BIT_EMAIL = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String token;
    private @Nullable String createdAt;
    private @Nullable CardResult card;
    private @Nullable String email;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.CustomerResult} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CustomerResult instance) {
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
      if (object instanceof CustomerResult) {
        CustomerResult instance = (CustomerResult) object;
        createdAt(instance.createdAt());
        card(instance.card());
        token(instance.token());
      }
      if (object instanceof CustomerBase) {
        CustomerBase instance = (CustomerBase) object;
        email(instance.email());
      }
    }

    /**
     * Initializes the value for the {@link CustomerResult#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder token(String token) {
      this.token = Preconditions.checkNotNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link CustomerResult#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder createdAt(String createdAt) {
      this.createdAt = Preconditions.checkNotNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link CustomerResult#card() card} attribute.
     * @param card The value for card 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder card(CardResult card) {
      this.card = Preconditions.checkNotNull(card, "card");
      initBits &= ~INIT_BIT_CARD;
      return this;
    }

    /**
     * Initializes the value for the {@link CustomerResult#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder email(String email) {
      this.email = Preconditions.checkNotNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCustomerResult ImmutableCustomerResult}.
     * @return An immutable instance of CustomerResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCustomerResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCustomerResult(token, createdAt, card, email);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      if ((initBits & INIT_BIT_CARD) != 0) attributes.add("card");
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      return "Cannot build CustomerResult, some of required attributes are not set " + attributes;
    }
  }
}
