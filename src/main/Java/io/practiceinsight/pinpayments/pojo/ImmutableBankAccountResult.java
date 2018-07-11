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
 * Immutable implementation of {@link BankAccountResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBankAccountResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "BankAccountResult"})
@Immutable
public final class ImmutableBankAccountResult implements BankAccountResult {
  private final String token;
  private final @Nullable String bankName;
  private final String name;
  private final String bsb;
  private final String number;

  private ImmutableBankAccountResult(
      String token,
      @Nullable String bankName,
      String name,
      String bsb,
      String number) {
    this.token = token;
    this.bankName = bankName;
    this.name = name;
    this.bsb = bsb;
    this.number = number;
  }

  /**
   * @return The value of the {@code token} attribute
   */
  @Override
  public String token() {
    return token;
  }

  /**
   * @return The value of the {@code bankName} attribute
   */
  @Override
  public @Nullable String bankName() {
    return bankName;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code bsb} attribute
   */
  @Override
  public String bsb() {
    return bsb;
  }

  /**
   * @return The value of the {@code number} attribute
   */
  @Override
  public String number() {
    return number;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BankAccountResult#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBankAccountResult withToken(String value) {
    if (this.token.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "token");
    return new ImmutableBankAccountResult(newValue, this.bankName, this.name, this.bsb, this.number);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BankAccountResult#bankName() bankName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bankName (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBankAccountResult withBankName(@Nullable String value) {
    if (Objects.equal(this.bankName, value)) return this;
    return new ImmutableBankAccountResult(this.token, value, this.name, this.bsb, this.number);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BankAccountResult#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBankAccountResult withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableBankAccountResult(this.token, this.bankName, newValue, this.bsb, this.number);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BankAccountResult#bsb() bsb} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bsb
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBankAccountResult withBsb(String value) {
    if (this.bsb.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "bsb");
    return new ImmutableBankAccountResult(this.token, this.bankName, this.name, newValue, this.number);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BankAccountResult#number() number} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for number
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBankAccountResult withNumber(String value) {
    if (this.number.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "number");
    return new ImmutableBankAccountResult(this.token, this.bankName, this.name, this.bsb, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBankAccountResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBankAccountResult
        && equalTo((ImmutableBankAccountResult) another);
  }

  private boolean equalTo(ImmutableBankAccountResult another) {
    return token.equals(another.token)
        && Objects.equal(bankName, another.bankName)
        && name.equals(another.name)
        && bsb.equals(another.bsb)
        && number.equals(another.number);
  }

  /**
   * Computes a hash code from attributes: {@code token}, {@code bankName}, {@code name}, {@code bsb}, {@code number}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + token.hashCode();
    h += (h << 5) + Objects.hashCode(bankName);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + bsb.hashCode();
    h += (h << 5) + number.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code BankAccountResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("BankAccountResult")
        .omitNullValues()
        .add("token", token)
        .add("bankName", bankName)
        .add("name", name)
        .add("bsb", bsb)
        .add("number", number)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link BankAccountResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BankAccountResult instance
   */
  public static ImmutableBankAccountResult copyOf(BankAccountResult instance) {
    if (instance instanceof ImmutableBankAccountResult) {
      return (ImmutableBankAccountResult) instance;
    }
    return ImmutableBankAccountResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBankAccountResult ImmutableBankAccountResult}.
   * @return A new ImmutableBankAccountResult builder
   */
  public static ImmutableBankAccountResult.Builder builder() {
    return new ImmutableBankAccountResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBankAccountResult ImmutableBankAccountResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOKEN = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long INIT_BIT_BSB = 0x4L;
    private static final long INIT_BIT_NUMBER = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String token;
    private @Nullable String bankName;
    private @Nullable String name;
    private @Nullable String bsb;
    private @Nullable String number;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.BankAccountBase} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(BankAccountBase instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.BankAccountResult} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(BankAccountResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof BankAccountBase) {
        BankAccountBase instance = (BankAccountBase) object;
        bsb(instance.bsb());
        name(instance.name());
        number(instance.number());
        @Nullable String bankNameValue = instance.bankName();
        if (bankNameValue != null) {
          bankName(bankNameValue);
        }
      }
      if (object instanceof BankAccountResult) {
        BankAccountResult instance = (BankAccountResult) object;
        token(instance.token());
      }
    }

    /**
     * Initializes the value for the {@link BankAccountResult#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder token(String token) {
      this.token = Preconditions.checkNotNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link BankAccountResult#bankName() bankName} attribute.
     * @param bankName The value for bankName (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bankName(@Nullable String bankName) {
      this.bankName = bankName;
      return this;
    }

    /**
     * Initializes the value for the {@link BankAccountResult#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link BankAccountResult#bsb() bsb} attribute.
     * @param bsb The value for bsb 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder bsb(String bsb) {
      this.bsb = Preconditions.checkNotNull(bsb, "bsb");
      initBits &= ~INIT_BIT_BSB;
      return this;
    }

    /**
     * Initializes the value for the {@link BankAccountResult#number() number} attribute.
     * @param number The value for number 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder number(String number) {
      this.number = Preconditions.checkNotNull(number, "number");
      initBits &= ~INIT_BIT_NUMBER;
      return this;
    }

    /**
     * Builds a new {@link ImmutableBankAccountResult ImmutableBankAccountResult}.
     * @return An immutable instance of BankAccountResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBankAccountResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBankAccountResult(token, bankName, name, bsb, number);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_BSB) != 0) attributes.add("bsb");
      if ((initBits & INIT_BIT_NUMBER) != 0) attributes.add("number");
      return "Cannot build BankAccountResult, some of required attributes are not set " + attributes;
    }
  }
}
