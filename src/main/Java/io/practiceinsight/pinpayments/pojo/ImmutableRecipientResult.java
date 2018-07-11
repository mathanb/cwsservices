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
 * Immutable implementation of {@link RecipientResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRecipientResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "RecipientResult"})
@Immutable
public final class ImmutableRecipientResult implements RecipientResult {
  private final String token;
  private final String createdAt;
  private final @Nullable BankAccountResult bankAccount;
  private final String email;
  private final @Nullable String name;

  private ImmutableRecipientResult(
      String token,
      String createdAt,
      @Nullable BankAccountResult bankAccount,
      String email,
      @Nullable String name) {
    this.token = token;
    this.createdAt = createdAt;
    this.bankAccount = bankAccount;
    this.email = email;
    this.name = name;
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
   * @return The value of the {@code bankAccount} attribute
   */
  @Override
  public @Nullable BankAccountResult bankAccount() {
    return bankAccount;
  }

  /**
   * @return The value of the {@code email} attribute
   */
  @Override
  public String email() {
    return email;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public @Nullable String name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RecipientResult#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRecipientResult withToken(String value) {
    if (this.token.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "token");
    return new ImmutableRecipientResult(newValue, this.createdAt, this.bankAccount, this.email, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RecipientResult#createdAt() createdAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRecipientResult withCreatedAt(String value) {
    if (this.createdAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "createdAt");
    return new ImmutableRecipientResult(this.token, newValue, this.bankAccount, this.email, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RecipientResult#bankAccount() bankAccount} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bankAccount (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRecipientResult withBankAccount(@Nullable BankAccountResult value) {
    if (this.bankAccount == value) return this;
    return new ImmutableRecipientResult(this.token, this.createdAt, value, this.email, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RecipientResult#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRecipientResult withEmail(String value) {
    if (this.email.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "email");
    return new ImmutableRecipientResult(this.token, this.createdAt, this.bankAccount, newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RecipientResult#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRecipientResult withName(@Nullable String value) {
    if (Objects.equal(this.name, value)) return this;
    return new ImmutableRecipientResult(this.token, this.createdAt, this.bankAccount, this.email, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRecipientResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRecipientResult
        && equalTo((ImmutableRecipientResult) another);
  }

  private boolean equalTo(ImmutableRecipientResult another) {
    return token.equals(another.token)
        && createdAt.equals(another.createdAt)
        && Objects.equal(bankAccount, another.bankAccount)
        && email.equals(another.email)
        && Objects.equal(name, another.name);
  }

  /**
   * Computes a hash code from attributes: {@code token}, {@code createdAt}, {@code bankAccount}, {@code email}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + token.hashCode();
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + Objects.hashCode(bankAccount);
    h += (h << 5) + email.hashCode();
    h += (h << 5) + Objects.hashCode(name);
    return h;
  }

  /**
   * Prints the immutable value {@code RecipientResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RecipientResult")
        .omitNullValues()
        .add("token", token)
        .add("createdAt", createdAt)
        .add("bankAccount", bankAccount)
        .add("email", email)
        .add("name", name)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link RecipientResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RecipientResult instance
   */
  public static ImmutableRecipientResult copyOf(RecipientResult instance) {
    if (instance instanceof ImmutableRecipientResult) {
      return (ImmutableRecipientResult) instance;
    }
    return ImmutableRecipientResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRecipientResult ImmutableRecipientResult}.
   * @return A new ImmutableRecipientResult builder
   */
  public static ImmutableRecipientResult.Builder builder() {
    return new ImmutableRecipientResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRecipientResult ImmutableRecipientResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOKEN = 0x1L;
    private static final long INIT_BIT_CREATED_AT = 0x2L;
    private static final long INIT_BIT_EMAIL = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String token;
    private @Nullable String createdAt;
    private @Nullable BankAccountResult bankAccount;
    private @Nullable String email;
    private @Nullable String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.RecipientResult} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RecipientResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.RecipientBase} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RecipientBase instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof RecipientResult) {
        RecipientResult instance = (RecipientResult) object;
        @Nullable BankAccountResult bankAccountValue = instance.bankAccount();
        if (bankAccountValue != null) {
          bankAccount(bankAccountValue);
        }
        createdAt(instance.createdAt());
        token(instance.token());
      }
      if (object instanceof RecipientBase) {
        RecipientBase instance = (RecipientBase) object;
        @Nullable String nameValue = instance.name();
        if (nameValue != null) {
          name(nameValue);
        }
        email(instance.email());
      }
    }

    /**
     * Initializes the value for the {@link RecipientResult#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder token(String token) {
      this.token = Preconditions.checkNotNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link RecipientResult#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder createdAt(String createdAt) {
      this.createdAt = Preconditions.checkNotNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link RecipientResult#bankAccount() bankAccount} attribute.
     * @param bankAccount The value for bankAccount (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bankAccount(@Nullable BankAccountResult bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    /**
     * Initializes the value for the {@link RecipientResult#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder email(String email) {
      this.email = Preconditions.checkNotNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link RecipientResult#name() name} attribute.
     * @param name The value for name (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(@Nullable String name) {
      this.name = name;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRecipientResult ImmutableRecipientResult}.
     * @return An immutable instance of RecipientResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRecipientResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRecipientResult(token, createdAt, bankAccount, email, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      return "Cannot build RecipientResult, some of required attributes are not set " + attributes;
    }
  }
}
