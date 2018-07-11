package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link Refund}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRefund.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Refund"})
@Immutable
public final class ImmutableRefund implements Refund {
  private final @Nullable Integer amount;

  private ImmutableRefund(@Nullable Integer amount) {
    this.amount = amount;
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @Override
  public @Nullable Integer amount() {
    return amount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Refund#amount() amount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefund withAmount(@Nullable Integer value) {
    if (Objects.equal(this.amount, value)) return this;
    return new ImmutableRefund(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRefund} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRefund
        && equalTo((ImmutableRefund) another);
  }

  private boolean equalTo(ImmutableRefund another) {
    return Objects.equal(amount, another.amount);
  }

  /**
   * Computes a hash code from attributes: {@code amount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(amount);
    return h;
  }

  /**
   * Prints the immutable value {@code Refund} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Refund")
        .omitNullValues()
        .add("amount", amount)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Refund} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Refund instance
   */
  public static ImmutableRefund copyOf(Refund instance) {
    if (instance instanceof ImmutableRefund) {
      return (ImmutableRefund) instance;
    }
    return ImmutableRefund.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRefund ImmutableRefund}.
   * @return A new ImmutableRefund builder
   */
  public static ImmutableRefund.Builder builder() {
    return new ImmutableRefund.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRefund ImmutableRefund}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable Integer amount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Refund} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Refund instance) {
      Preconditions.checkNotNull(instance, "instance");
      @Nullable Integer amountValue = instance.amount();
      if (amountValue != null) {
        amount(amountValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link Refund#amount() amount} attribute.
     * @param amount The value for amount (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder amount(@Nullable Integer amount) {
      this.amount = amount;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRefund ImmutableRefund}.
     * @return An immutable instance of Refund
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRefund build() {
      return new ImmutableRefund(amount);
    }
  }
}
