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
 * Immutable implementation of {@link CardResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCardResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "CardResult"})
@Immutable
public final class ImmutableCardResult implements CardResult {
  private final String token;
  private final String scheme;
  private final String displayNumber;
  private final @Nullable Boolean primary;
  private final String expiryMonth;
  private final String expiryYear;
  private final String name;
  private final String addressLine1;
  private final @Nullable String addressLine2;
  private final String addressCity;
  private final @Nullable String addressPostcode;
  private final @Nullable String addressState;
  private final String addressCountry;

  private ImmutableCardResult(
      String token,
      String scheme,
      String displayNumber,
      @Nullable Boolean primary,
      String expiryMonth,
      String expiryYear,
      String name,
      String addressLine1,
      @Nullable String addressLine2,
      String addressCity,
      @Nullable String addressPostcode,
      @Nullable String addressState,
      String addressCountry) {
    this.token = token;
    this.scheme = scheme;
    this.displayNumber = displayNumber;
    this.primary = primary;
    this.expiryMonth = expiryMonth;
    this.expiryYear = expiryYear;
    this.name = name;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.addressCity = addressCity;
    this.addressPostcode = addressPostcode;
    this.addressState = addressState;
    this.addressCountry = addressCountry;
  }

  /**
   * @return The value of the {@code token} attribute
   */
  @Override
  public String token() {
    return token;
  }

  /**
   * @return The value of the {@code scheme} attribute
   */
  @Override
  public String scheme() {
    return scheme;
  }

  /**
   * @return The value of the {@code displayNumber} attribute
   */
  @Override
  public String displayNumber() {
    return displayNumber;
  }

  /**
   * @return The value of the {@code primary} attribute
   */
  @Override
  public @Nullable Boolean primary() {
    return primary;
  }

  /**
   * @return The value of the {@code expiryMonth} attribute
   */
  @Override
  public String expiryMonth() {
    return expiryMonth;
  }

  /**
   * @return The value of the {@code expiryYear} attribute
   */
  @Override
  public String expiryYear() {
    return expiryYear;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @Override
  public String name() {
    return name;
  }

  /**
   * @return The value of the {@code addressLine1} attribute
   */
  @Override
  public String addressLine1() {
    return addressLine1;
  }

  /**
   * @return The value of the {@code addressLine2} attribute
   */
  @Override
  public @Nullable String addressLine2() {
    return addressLine2;
  }

  /**
   * @return The value of the {@code addressCity} attribute
   */
  @Override
  public String addressCity() {
    return addressCity;
  }

  /**
   * @return The value of the {@code addressPostcode} attribute
   */
  @Override
  public @Nullable String addressPostcode() {
    return addressPostcode;
  }

  /**
   * @return The value of the {@code addressState} attribute
   */
  @Override
  public @Nullable String addressState() {
    return addressState;
  }

  /**
   * @return The value of the {@code addressCountry} attribute
   */
  @Override
  public String addressCountry() {
    return addressCountry;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withToken(String value) {
    if (this.token.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "token");
    return new ImmutableCardResult(
        newValue,
        this.scheme,
        this.displayNumber,
        this.primary,
        this.expiryMonth,
        this.expiryYear,
        this.name,
        this.addressLine1,
        this.addressLine2,
        this.addressCity,
        this.addressPostcode,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#scheme() scheme} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scheme
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withScheme(String value) {
    if (this.scheme.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "scheme");
    return new ImmutableCardResult(
        this.token,
        newValue,
        this.displayNumber,
        this.primary,
        this.expiryMonth,
        this.expiryYear,
        this.name,
        this.addressLine1,
        this.addressLine2,
        this.addressCity,
        this.addressPostcode,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#displayNumber() displayNumber} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for displayNumber
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withDisplayNumber(String value) {
    if (this.displayNumber.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "displayNumber");
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        newValue,
        this.primary,
        this.expiryMonth,
        this.expiryYear,
        this.name,
        this.addressLine1,
        this.addressLine2,
        this.addressCity,
        this.addressPostcode,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#primary() primary} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for primary (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withPrimary(@Nullable Boolean value) {
    if (Objects.equal(this.primary, value)) return this;
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        this.displayNumber,
        value,
        this.expiryMonth,
        this.expiryYear,
        this.name,
        this.addressLine1,
        this.addressLine2,
        this.addressCity,
        this.addressPostcode,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#expiryMonth() expiryMonth} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for expiryMonth
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withExpiryMonth(String value) {
    if (this.expiryMonth.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "expiryMonth");
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        this.displayNumber,
        this.primary,
        newValue,
        this.expiryYear,
        this.name,
        this.addressLine1,
        this.addressLine2,
        this.addressCity,
        this.addressPostcode,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#expiryYear() expiryYear} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for expiryYear
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withExpiryYear(String value) {
    if (this.expiryYear.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "expiryYear");
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        this.displayNumber,
        this.primary,
        this.expiryMonth,
        newValue,
        this.name,
        this.addressLine1,
        this.addressLine2,
        this.addressCity,
        this.addressPostcode,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        this.displayNumber,
        this.primary,
        this.expiryMonth,
        this.expiryYear,
        newValue,
        this.addressLine1,
        this.addressLine2,
        this.addressCity,
        this.addressPostcode,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#addressLine1() addressLine1} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressLine1
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withAddressLine1(String value) {
    if (this.addressLine1.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "addressLine1");
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        this.displayNumber,
        this.primary,
        this.expiryMonth,
        this.expiryYear,
        this.name,
        newValue,
        this.addressLine2,
        this.addressCity,
        this.addressPostcode,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#addressLine2() addressLine2} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressLine2 (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withAddressLine2(@Nullable String value) {
    if (Objects.equal(this.addressLine2, value)) return this;
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        this.displayNumber,
        this.primary,
        this.expiryMonth,
        this.expiryYear,
        this.name,
        this.addressLine1,
        value,
        this.addressCity,
        this.addressPostcode,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#addressCity() addressCity} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressCity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withAddressCity(String value) {
    if (this.addressCity.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "addressCity");
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        this.displayNumber,
        this.primary,
        this.expiryMonth,
        this.expiryYear,
        this.name,
        this.addressLine1,
        this.addressLine2,
        newValue,
        this.addressPostcode,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#addressPostcode() addressPostcode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressPostcode (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withAddressPostcode(@Nullable String value) {
    if (Objects.equal(this.addressPostcode, value)) return this;
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        this.displayNumber,
        this.primary,
        this.expiryMonth,
        this.expiryYear,
        this.name,
        this.addressLine1,
        this.addressLine2,
        this.addressCity,
        value,
        this.addressState,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#addressState() addressState} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressState (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withAddressState(@Nullable String value) {
    if (Objects.equal(this.addressState, value)) return this;
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        this.displayNumber,
        this.primary,
        this.expiryMonth,
        this.expiryYear,
        this.name,
        this.addressLine1,
        this.addressLine2,
        this.addressCity,
        this.addressPostcode,
        value,
        this.addressCountry);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CardResult#addressCountry() addressCountry} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressCountry
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCardResult withAddressCountry(String value) {
    if (this.addressCountry.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "addressCountry");
    return new ImmutableCardResult(
        this.token,
        this.scheme,
        this.displayNumber,
        this.primary,
        this.expiryMonth,
        this.expiryYear,
        this.name,
        this.addressLine1,
        this.addressLine2,
        this.addressCity,
        this.addressPostcode,
        this.addressState,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCardResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCardResult
        && equalTo((ImmutableCardResult) another);
  }

  private boolean equalTo(ImmutableCardResult another) {
    return token.equals(another.token)
        && scheme.equals(another.scheme)
        && displayNumber.equals(another.displayNumber)
        && Objects.equal(primary, another.primary)
        && expiryMonth.equals(another.expiryMonth)
        && expiryYear.equals(another.expiryYear)
        && name.equals(another.name)
        && addressLine1.equals(another.addressLine1)
        && Objects.equal(addressLine2, another.addressLine2)
        && addressCity.equals(another.addressCity)
        && Objects.equal(addressPostcode, another.addressPostcode)
        && Objects.equal(addressState, another.addressState)
        && addressCountry.equals(another.addressCountry);
  }

  /**
   * Computes a hash code from attributes: {@code token}, {@code scheme}, {@code displayNumber}, {@code primary}, {@code expiryMonth}, {@code expiryYear}, {@code name}, {@code addressLine1}, {@code addressLine2}, {@code addressCity}, {@code addressPostcode}, {@code addressState}, {@code addressCountry}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + token.hashCode();
    h += (h << 5) + scheme.hashCode();
    h += (h << 5) + displayNumber.hashCode();
    h += (h << 5) + Objects.hashCode(primary);
    h += (h << 5) + expiryMonth.hashCode();
    h += (h << 5) + expiryYear.hashCode();
    h += (h << 5) + name.hashCode();
    h += (h << 5) + addressLine1.hashCode();
    h += (h << 5) + Objects.hashCode(addressLine2);
    h += (h << 5) + addressCity.hashCode();
    h += (h << 5) + Objects.hashCode(addressPostcode);
    h += (h << 5) + Objects.hashCode(addressState);
    h += (h << 5) + addressCountry.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code CardResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("CardResult")
        .omitNullValues()
        .add("token", token)
        .add("scheme", scheme)
        .add("displayNumber", displayNumber)
        .add("primary", primary)
        .add("expiryMonth", expiryMonth)
        .add("expiryYear", expiryYear)
        .add("name", name)
        .add("addressLine1", addressLine1)
        .add("addressLine2", addressLine2)
        .add("addressCity", addressCity)
        .add("addressPostcode", addressPostcode)
        .add("addressState", addressState)
        .add("addressCountry", addressCountry)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link CardResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CardResult instance
   */
  public static ImmutableCardResult copyOf(CardResult instance) {
    if (instance instanceof ImmutableCardResult) {
      return (ImmutableCardResult) instance;
    }
    return ImmutableCardResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCardResult ImmutableCardResult}.
   * @return A new ImmutableCardResult builder
   */
  public static ImmutableCardResult.Builder builder() {
    return new ImmutableCardResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCardResult ImmutableCardResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOKEN = 0x1L;
    private static final long INIT_BIT_SCHEME = 0x2L;
    private static final long INIT_BIT_DISPLAY_NUMBER = 0x4L;
    private static final long INIT_BIT_EXPIRY_MONTH = 0x8L;
    private static final long INIT_BIT_EXPIRY_YEAR = 0x10L;
    private static final long INIT_BIT_NAME = 0x20L;
    private static final long INIT_BIT_ADDRESS_LINE1 = 0x40L;
    private static final long INIT_BIT_ADDRESS_CITY = 0x80L;
    private static final long INIT_BIT_ADDRESS_COUNTRY = 0x100L;
    private long initBits = 0x1ffL;

    private @Nullable String token;
    private @Nullable String scheme;
    private @Nullable String displayNumber;
    private @Nullable Boolean primary;
    private @Nullable String expiryMonth;
    private @Nullable String expiryYear;
    private @Nullable String name;
    private @Nullable String addressLine1;
    private @Nullable String addressLine2;
    private @Nullable String addressCity;
    private @Nullable String addressPostcode;
    private @Nullable String addressState;
    private @Nullable String addressCountry;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.CardBase} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CardBase instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.CardResult} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(CardResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof CardBase) {
        CardBase instance = (CardBase) object;
        addressCountry(instance.addressCountry());
        @Nullable String addressPostcodeValue = instance.addressPostcode();
        if (addressPostcodeValue != null) {
          addressPostcode(addressPostcodeValue);
        }
        expiryMonth(instance.expiryMonth());
        name(instance.name());
        addressLine1(instance.addressLine1());
        @Nullable String addressStateValue = instance.addressState();
        if (addressStateValue != null) {
          addressState(addressStateValue);
        }
        @Nullable String addressLine2Value = instance.addressLine2();
        if (addressLine2Value != null) {
          addressLine2(addressLine2Value);
        }
        expiryYear(instance.expiryYear());
        addressCity(instance.addressCity());
      }
      if (object instanceof CardResult) {
        CardResult instance = (CardResult) object;
        displayNumber(instance.displayNumber());
        scheme(instance.scheme());
        token(instance.token());
        @Nullable Boolean primaryValue = instance.primary();
        if (primaryValue != null) {
          primary(primaryValue);
        }
      }
    }

    /**
     * Initializes the value for the {@link CardResult#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder token(String token) {
      this.token = Preconditions.checkNotNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#scheme() scheme} attribute.
     * @param scheme The value for scheme 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder scheme(String scheme) {
      this.scheme = Preconditions.checkNotNull(scheme, "scheme");
      initBits &= ~INIT_BIT_SCHEME;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#displayNumber() displayNumber} attribute.
     * @param displayNumber The value for displayNumber 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder displayNumber(String displayNumber) {
      this.displayNumber = Preconditions.checkNotNull(displayNumber, "displayNumber");
      initBits &= ~INIT_BIT_DISPLAY_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#primary() primary} attribute.
     * @param primary The value for primary (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder primary(@Nullable Boolean primary) {
      this.primary = primary;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#expiryMonth() expiryMonth} attribute.
     * @param expiryMonth The value for expiryMonth 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder expiryMonth(String expiryMonth) {
      this.expiryMonth = Preconditions.checkNotNull(expiryMonth, "expiryMonth");
      initBits &= ~INIT_BIT_EXPIRY_MONTH;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#expiryYear() expiryYear} attribute.
     * @param expiryYear The value for expiryYear 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder expiryYear(String expiryYear) {
      this.expiryYear = Preconditions.checkNotNull(expiryYear, "expiryYear");
      initBits &= ~INIT_BIT_EXPIRY_YEAR;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#addressLine1() addressLine1} attribute.
     * @param addressLine1 The value for addressLine1 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressLine1(String addressLine1) {
      this.addressLine1 = Preconditions.checkNotNull(addressLine1, "addressLine1");
      initBits &= ~INIT_BIT_ADDRESS_LINE1;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#addressLine2() addressLine2} attribute.
     * @param addressLine2 The value for addressLine2 (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressLine2(@Nullable String addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#addressCity() addressCity} attribute.
     * @param addressCity The value for addressCity 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressCity(String addressCity) {
      this.addressCity = Preconditions.checkNotNull(addressCity, "addressCity");
      initBits &= ~INIT_BIT_ADDRESS_CITY;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#addressPostcode() addressPostcode} attribute.
     * @param addressPostcode The value for addressPostcode (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressPostcode(@Nullable String addressPostcode) {
      this.addressPostcode = addressPostcode;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#addressState() addressState} attribute.
     * @param addressState The value for addressState (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressState(@Nullable String addressState) {
      this.addressState = addressState;
      return this;
    }

    /**
     * Initializes the value for the {@link CardResult#addressCountry() addressCountry} attribute.
     * @param addressCountry The value for addressCountry 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressCountry(String addressCountry) {
      this.addressCountry = Preconditions.checkNotNull(addressCountry, "addressCountry");
      initBits &= ~INIT_BIT_ADDRESS_COUNTRY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCardResult ImmutableCardResult}.
     * @return An immutable instance of CardResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCardResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCardResult(
          token,
          scheme,
          displayNumber,
          primary,
          expiryMonth,
          expiryYear,
          name,
          addressLine1,
          addressLine2,
          addressCity,
          addressPostcode,
          addressState,
          addressCountry);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      if ((initBits & INIT_BIT_SCHEME) != 0) attributes.add("scheme");
      if ((initBits & INIT_BIT_DISPLAY_NUMBER) != 0) attributes.add("displayNumber");
      if ((initBits & INIT_BIT_EXPIRY_MONTH) != 0) attributes.add("expiryMonth");
      if ((initBits & INIT_BIT_EXPIRY_YEAR) != 0) attributes.add("expiryYear");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_ADDRESS_LINE1) != 0) attributes.add("addressLine1");
      if ((initBits & INIT_BIT_ADDRESS_CITY) != 0) attributes.add("addressCity");
      if ((initBits & INIT_BIT_ADDRESS_COUNTRY) != 0) attributes.add("addressCountry");
      return "Cannot build CardResult, some of required attributes are not set " + attributes;
    }
  }
}
