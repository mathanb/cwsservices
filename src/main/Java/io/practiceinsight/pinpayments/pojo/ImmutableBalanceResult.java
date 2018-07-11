package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link BalanceResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBalanceResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "BalanceResult"})
@Immutable
public final class ImmutableBalanceResult implements BalanceResult {
  private final ImmutableList<Balance> available;
  private final ImmutableList<Balance> pending;

  private ImmutableBalanceResult(
      ImmutableList<Balance> available,
      ImmutableList<Balance> pending) {
    this.available = available;
    this.pending = pending;
  }

  /**
   * @return The value of the {@code available} attribute
   */
  @Override
  public ImmutableList<Balance> available() {
    return available;
  }

  /**
   * @return The value of the {@code pending} attribute
   */
  @Override
  public ImmutableList<Balance> pending() {
    return pending;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link BalanceResult#available() available}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBalanceResult withAvailable(Balance... elements) {
    ImmutableList<Balance> newValue = ImmutableList.copyOf(elements);
    return new ImmutableBalanceResult(newValue, this.pending);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link BalanceResult#available() available}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of available elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBalanceResult withAvailable(Iterable<? extends Balance> elements) {
    if (this.available == elements) return this;
    ImmutableList<Balance> newValue = ImmutableList.copyOf(elements);
    return new ImmutableBalanceResult(newValue, this.pending);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link BalanceResult#pending() pending}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBalanceResult withPending(Balance... elements) {
    ImmutableList<Balance> newValue = ImmutableList.copyOf(elements);
    return new ImmutableBalanceResult(this.available, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link BalanceResult#pending() pending}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of pending elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBalanceResult withPending(Iterable<? extends Balance> elements) {
    if (this.pending == elements) return this;
    ImmutableList<Balance> newValue = ImmutableList.copyOf(elements);
    return new ImmutableBalanceResult(this.available, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBalanceResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBalanceResult
        && equalTo((ImmutableBalanceResult) another);
  }

  private boolean equalTo(ImmutableBalanceResult another) {
    return available.equals(another.available)
        && pending.equals(another.pending);
  }

  /**
   * Computes a hash code from attributes: {@code available}, {@code pending}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + available.hashCode();
    h += (h << 5) + pending.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code BalanceResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("BalanceResult")
        .omitNullValues()
        .add("available", available)
        .add("pending", pending)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link BalanceResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BalanceResult instance
   */
  public static ImmutableBalanceResult copyOf(BalanceResult instance) {
    if (instance instanceof ImmutableBalanceResult) {
      return (ImmutableBalanceResult) instance;
    }
    return ImmutableBalanceResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBalanceResult ImmutableBalanceResult}.
   * @return A new ImmutableBalanceResult builder
   */
  public static ImmutableBalanceResult.Builder builder() {
    return new ImmutableBalanceResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBalanceResult ImmutableBalanceResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<Balance> available = ImmutableList.builder();
    private ImmutableList.Builder<Balance> pending = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code BalanceResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(BalanceResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllAvailable(instance.available());
      addAllPending(instance.pending());
      return this;
    }

    /**
     * Adds one element to {@link BalanceResult#available() available} list.
     * @param element A available element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAvailable(Balance element) {
      this.available.add(element);
      return this;
    }

    /**
     * Adds elements to {@link BalanceResult#available() available} list.
     * @param elements An array of available elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAvailable(Balance... elements) {
      this.available.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link BalanceResult#available() available} list.
     * @param elements An iterable of available elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder available(Iterable<? extends Balance> elements) {
      this.available = ImmutableList.builder();
      return addAllAvailable(elements);
    }

    /**
     * Adds elements to {@link BalanceResult#available() available} list.
     * @param elements An iterable of available elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAvailable(Iterable<? extends Balance> elements) {
      this.available.addAll(elements);
      return this;
    }

    /**
     * Adds one element to {@link BalanceResult#pending() pending} list.
     * @param element A pending element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPending(Balance element) {
      this.pending.add(element);
      return this;
    }

    /**
     * Adds elements to {@link BalanceResult#pending() pending} list.
     * @param elements An array of pending elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addPending(Balance... elements) {
      this.pending.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link BalanceResult#pending() pending} list.
     * @param elements An iterable of pending elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pending(Iterable<? extends Balance> elements) {
      this.pending = ImmutableList.builder();
      return addAllPending(elements);
    }

    /**
     * Adds elements to {@link BalanceResult#pending() pending} list.
     * @param elements An iterable of pending elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllPending(Iterable<? extends Balance> elements) {
      this.pending.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableBalanceResult ImmutableBalanceResult}.
     * @return An immutable instance of BalanceResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBalanceResult build() {
      return new ImmutableBalanceResult(available.build(), pending.build());
    }
  }
}
