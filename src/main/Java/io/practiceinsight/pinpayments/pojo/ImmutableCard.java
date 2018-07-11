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
 * Immutable implementation of {@link Card}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCard.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Card"})
@Immutable
public final class ImmutableCard implements Card {
  private final String number;
  private final String cvc;
  private final String expiryMonth;
  private final String expiryYear;
  private final String name;
  private final String addressLine1;
  private final @Nullable String addressLine2;
  private final String addressCity;
  private final @Nullable String addressPostcode;
  private final @Nullable String addressState;
  private final String addressCountry;

  private ImmutableCard(
      String number,
      String cvc,
      String expiryMonth,
      String expiryYear,
      String name,
      String addressLine1,
      @Nullable String addressLine2,
      String addressCity,
      @Nullable String addressPostcode,
      @Nullable String addressState,
      String addressCountry) {
    this.number = number;
    this.cvc = cvc;
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
   * @return The value of the {@code number} attribute
   */
  @Override
  public String number() {
    return number;
  }

  /**
   * @return The value of the {@code cvc} attribute
   */
  @Override
  public String cvc() {
    return cvc;
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
   * Copy the current immutable object by setting a value for the {@link Card#number() number} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for number
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withNumber(String value) {
    if (this.number.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "number");
    return new ImmutableCard(
        newValue,
        this.cvc,
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
   * Copy the current immutable object by setting a value for the {@link Card#cvc() cvc} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for cvc
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withCvc(String value) {
    if (this.cvc.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "cvc");
    return new ImmutableCard(
        this.number,
        newValue,
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
   * Copy the current immutable object by setting a value for the {@link Card#expiryMonth() expiryMonth} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for expiryMonth
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withExpiryMonth(String value) {
    if (this.expiryMonth.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "expiryMonth");
    return new ImmutableCard(
        this.number,
        this.cvc,
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
   * Copy the current immutable object by setting a value for the {@link Card#expiryYear() expiryYear} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for expiryYear
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withExpiryYear(String value) {
    if (this.expiryYear.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "expiryYear");
    return new ImmutableCard(
        this.number,
        this.cvc,
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
   * Copy the current immutable object by setting a value for the {@link Card#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withName(String value) {
    if (this.name.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "name");
    return new ImmutableCard(
        this.number,
        this.cvc,
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
   * Copy the current immutable object by setting a value for the {@link Card#addressLine1() addressLine1} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressLine1
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withAddressLine1(String value) {
    if (this.addressLine1.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "addressLine1");
    return new ImmutableCard(
        this.number,
        this.cvc,
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
   * Copy the current immutable object by setting a value for the {@link Card#addressLine2() addressLine2} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressLine2 (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withAddressLine2(@Nullable String value) {
    if (Objects.equal(this.addressLine2, value)) return this;
    return new ImmutableCard(
        this.number,
        this.cvc,
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
   * Copy the current immutable object by setting a value for the {@link Card#addressCity() addressCity} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressCity
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withAddressCity(String value) {
    if (this.addressCity.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "addressCity");
    return new ImmutableCard(
        this.number,
        this.cvc,
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
   * Copy the current immutable object by setting a value for the {@link Card#addressPostcode() addressPostcode} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressPostcode (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withAddressPostcode(@Nullable String value) {
    if (Objects.equal(this.addressPostcode, value)) return this;
    return new ImmutableCard(
        this.number,
        this.cvc,
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
   * Copy the current immutable object by setting a value for the {@link Card#addressState() addressState} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressState (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withAddressState(@Nullable String value) {
    if (Objects.equal(this.addressState, value)) return this;
    return new ImmutableCard(
        this.number,
        this.cvc,
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
   * Copy the current immutable object by setting a value for the {@link Card#addressCountry() addressCountry} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for addressCountry
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withAddressCountry(String value) {
    if (this.addressCountry.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "addressCountry");
    return new ImmutableCard(
        this.number,
        this.cvc,
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
   * This instance is equal to all instances of {@code ImmutableCard} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCard
        && equalTo((ImmutableCard) another);
  }

  private boolean equalTo(ImmutableCard another) {
    return number.equals(another.number)
        && cvc.equals(another.cvc)
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
   * Computes a hash code from attributes: {@code number}, {@code cvc}, {@code expiryMonth}, {@code expiryYear}, {@code name}, {@code addressLine1}, {@code addressLine2}, {@code addressCity}, {@code addressPostcode}, {@code addressState}, {@code addressCountry}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + number.hashCode();
    h += (h << 5) + cvc.hashCode();
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
   * Prints the immutable value {@code Card} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Card")
        .omitNullValues()
        .add("number", number)
        .add("cvc", cvc)
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
   * Creates an immutable copy of a {@link Card} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Card instance
   */
  public static ImmutableCard copyOf(Card instance) {
    if (instance instanceof ImmutableCard) {
      return (ImmutableCard) instance;
    }
    return ImmutableCard.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCard ImmutableCard}.
   * @return A new ImmutableCard builder
   */
  public static ImmutableCard.Builder builder() {
    return new ImmutableCard.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCard ImmutableCard}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_NUMBER = 0x1L;
    private static final long INIT_BIT_CVC = 0x2L;
    private static final long INIT_BIT_EXPIRY_MONTH = 0x4L;
    private static final long INIT_BIT_EXPIRY_YEAR = 0x8L;
    private static final long INIT_BIT_NAME = 0x10L;
    private static final long INIT_BIT_ADDRESS_LINE1 = 0x20L;
    private static final long INIT_BIT_ADDRESS_CITY = 0x40L;
    private static final long INIT_BIT_ADDRESS_COUNTRY = 0x80L;
    private long initBits = 0xffL;

    private @Nullable String number;
    private @Nullable String cvc;
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
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.Card} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Card instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
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

    private void from(Object object) {
      if (object instanceof Card) {
        Card instance = (Card) object;
        number(instance.number());
        cvc(instance.cvc());
      }
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
        @Nullable String addressLine2Value = instance.addressLine2();
        if (addressLine2Value != null) {
          addressLine2(addressLine2Value);
        }
        @Nullable String addressStateValue = instance.addressState();
        if (addressStateValue != null) {
          addressState(addressStateValue);
        }
        expiryYear(instance.expiryYear());
        addressCity(instance.addressCity());
      }
    }

    /**
     * Initializes the value for the {@link Card#number() number} attribute.
     * @param number The value for number 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder number(String number) {
      this.number = Preconditions.checkNotNull(number, "number");
      initBits &= ~INIT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#cvc() cvc} attribute.
     * @param cvc The value for cvc 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder cvc(String cvc) {
      this.cvc = Preconditions.checkNotNull(cvc, "cvc");
      initBits &= ~INIT_BIT_CVC;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#expiryMonth() expiryMonth} attribute.
     * @param expiryMonth The value for expiryMonth 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder expiryMonth(String expiryMonth) {
      this.expiryMonth = Preconditions.checkNotNull(expiryMonth, "expiryMonth");
      initBits &= ~INIT_BIT_EXPIRY_MONTH;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#expiryYear() expiryYear} attribute.
     * @param expiryYear The value for expiryYear 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder expiryYear(String expiryYear) {
      this.expiryYear = Preconditions.checkNotNull(expiryYear, "expiryYear");
      initBits &= ~INIT_BIT_EXPIRY_YEAR;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder name(String name) {
      this.name = Preconditions.checkNotNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#addressLine1() addressLine1} attribute.
     * @param addressLine1 The value for addressLine1 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressLine1(String addressLine1) {
      this.addressLine1 = Preconditions.checkNotNull(addressLine1, "addressLine1");
      initBits &= ~INIT_BIT_ADDRESS_LINE1;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#addressLine2() addressLine2} attribute.
     * @param addressLine2 The value for addressLine2 (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressLine2(@Nullable String addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#addressCity() addressCity} attribute.
     * @param addressCity The value for addressCity 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressCity(String addressCity) {
      this.addressCity = Preconditions.checkNotNull(addressCity, "addressCity");
      initBits &= ~INIT_BIT_ADDRESS_CITY;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#addressPostcode() addressPostcode} attribute.
     * @param addressPostcode The value for addressPostcode (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressPostcode(@Nullable String addressPostcode) {
      this.addressPostcode = addressPostcode;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#addressState() addressState} attribute.
     * @param addressState The value for addressState (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressState(@Nullable String addressState) {
      this.addressState = addressState;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#addressCountry() addressCountry} attribute.
     * @param addressCountry The value for addressCountry 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addressCountry(String addressCountry) {
      this.addressCountry = Preconditions.checkNotNull(addressCountry, "addressCountry");
      initBits &= ~INIT_BIT_ADDRESS_COUNTRY;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCard ImmutableCard}.
     * @return An immutable instance of Card
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCard build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCard(
          number,
          cvc,
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
      if ((initBits & INIT_BIT_NUMBER) != 0) attributes.add("number");
      if ((initBits & INIT_BIT_CVC) != 0) attributes.add("cvc");
      if ((initBits & INIT_BIT_EXPIRY_MONTH) != 0) attributes.add("expiryMonth");
      if ((initBits & INIT_BIT_EXPIRY_YEAR) != 0) attributes.add("expiryYear");
      if ((initBits & INIT_BIT_NAME) != 0) attributes.add("name");
      if ((initBits & INIT_BIT_ADDRESS_LINE1) != 0) attributes.add("addressLine1");
      if ((initBits & INIT_BIT_ADDRESS_CITY) != 0) attributes.add("addressCity");
      if ((initBits & INIT_BIT_ADDRESS_COUNTRY) != 0) attributes.add("addressCountry");
      return "Cannot build Card, some of required attributes are not set " + attributes;
    }
  }
}
