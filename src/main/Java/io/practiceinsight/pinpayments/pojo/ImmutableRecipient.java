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
 * Immutable implementation of {@link Recipient}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRecipient.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Recipient"})
@Immutable
public final class ImmutableRecipient implements Recipient {
  private final @Nullable BankAccount bankAccount;
  private final @Nullable String bankAccountToken;
  private final String email;
  private final @Nullable String name;

  private ImmutableRecipient(
      @Nullable BankAccount bankAccount,
      @Nullable String bankAccountToken,
      String email,
      @Nullable String name) {
    this.bankAccount = bankAccount;
    this.bankAccountToken = bankAccountToken;
    this.email = email;
    this.name = name;
  }

  /**
   * @return The value of the {@code bankAccount} attribute
   */
  @Override
  public @Nullable BankAccount bankAccount() {
    return bankAccount;
  }

  /**
   * @return The value of the {@code bankAccountToken} attribute
   */
  @Override
  public @Nullable String bankAccountToken() {
    return bankAccountToken;
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
   * Copy the current immutable object by setting a value for the {@link Recipient#bankAccount() bankAccount} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bankAccount (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRecipient withBankAccount(@Nullable BankAccount value) {
    if (this.bankAccount == value) return this;
    return new ImmutableRecipient(value, this.bankAccountToken, this.email, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Recipient#bankAccountToken() bankAccountToken} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bankAccountToken (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRecipient withBankAccountToken(@Nullable String value) {
    if (Objects.equal(this.bankAccountToken, value)) return this;
    return new ImmutableRecipient(this.bankAccount, value, this.email, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Recipient#email() email} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for email
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRecipient withEmail(String value) {
    if (this.email.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "email");
    return new ImmutableRecipient(this.bankAccount, this.bankAccountToken, newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Recipient#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRecipient withName(@Nullable String value) {
    if (Objects.equal(this.name, value)) return this;
    return new ImmutableRecipient(this.bankAccount, this.bankAccountToken, this.email, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRecipient} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRecipient
        && equalTo((ImmutableRecipient) another);
  }

  private boolean equalTo(ImmutableRecipient another) {
    return Objects.equal(bankAccount, another.bankAccount)
        && Objects.equal(bankAccountToken, another.bankAccountToken)
        && email.equals(another.email)
        && Objects.equal(name, another.name);
  }

  /**
   * Computes a hash code from attributes: {@code bankAccount}, {@code bankAccountToken}, {@code email}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(bankAccount);
    h += (h << 5) + Objects.hashCode(bankAccountToken);
    h += (h << 5) + email.hashCode();
    h += (h << 5) + Objects.hashCode(name);
    return h;
  }

  /**
   * Prints the immutable value {@code Recipient} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Recipient")
        .omitNullValues()
        .add("bankAccount", bankAccount)
        .add("bankAccountToken", bankAccountToken)
        .add("email", email)
        .add("name", name)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Recipient} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Recipient instance
   */
  public static ImmutableRecipient copyOf(Recipient instance) {
    if (instance instanceof ImmutableRecipient) {
      return (ImmutableRecipient) instance;
    }
    return ImmutableRecipient.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRecipient ImmutableRecipient}.
   * @return A new ImmutableRecipient builder
   */
  public static ImmutableRecipient.Builder builder() {
    return new ImmutableRecipient.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRecipient ImmutableRecipient}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_EMAIL = 0x1L;
    private long initBits = 0x1L;

    private @Nullable BankAccount bankAccount;
    private @Nullable String bankAccountToken;
    private @Nullable String email;
    private @Nullable String name;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.Recipient} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Recipient instance) {
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
      if (object instanceof Recipient) {
        Recipient instance = (Recipient) object;
        @Nullable BankAccount bankAccountValue = instance.bankAccount();
        if (bankAccountValue != null) {
          bankAccount(bankAccountValue);
        }
        @Nullable String bankAccountTokenValue = instance.bankAccountToken();
        if (bankAccountTokenValue != null) {
          bankAccountToken(bankAccountTokenValue);
        }
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
     * Initializes the value for the {@link Recipient#bankAccount() bankAccount} attribute.
     * @param bankAccount The value for bankAccount (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bankAccount(@Nullable BankAccount bankAccount) {
      this.bankAccount = bankAccount;
      return this;
    }

    /**
     * Initializes the value for the {@link Recipient#bankAccountToken() bankAccountToken} attribute.
     * @param bankAccountToken The value for bankAccountToken (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bankAccountToken(@Nullable String bankAccountToken) {
      this.bankAccountToken = bankAccountToken;
      return this;
    }

    /**
     * Initializes the value for the {@link Recipient#email() email} attribute.
     * @param email The value for email 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder email(String email) {
      this.email = Preconditions.checkNotNull(email, "email");
      initBits &= ~INIT_BIT_EMAIL;
      return this;
    }

    /**
     * Initializes the value for the {@link Recipient#name() name} attribute.
     * @param name The value for name (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(@Nullable String name) {
      this.name = name;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRecipient ImmutableRecipient}.
     * @return An immutable instance of Recipient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRecipient build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableRecipient(bankAccount, bankAccountToken, email, name);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_EMAIL) != 0) attributes.add("email");
      return "Cannot build Recipient, some of required attributes are not set " + attributes;
    }
  }
}
