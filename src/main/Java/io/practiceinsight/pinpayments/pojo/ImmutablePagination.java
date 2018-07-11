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
 * Immutable implementation of {@link Pagination}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePagination.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "Pagination"})
@Immutable
public final class ImmutablePagination implements Pagination {
  private final int current;
  private final int perPage;
  private final int count;

  private ImmutablePagination(int current, int perPage, int count) {
    this.current = current;
    this.perPage = perPage;
    this.count = count;
  }

  /**
   * @return The value of the {@code current} attribute
   */
  @Override
  public int current() {
    return current;
  }

  /**
   * @return The value of the {@code perPage} attribute
   */
  @Override
  public int perPage() {
    return perPage;
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @Override
  public int count() {
    return count;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Pagination#current() current} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for current
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePagination withCurrent(int value) {
    if (this.current == value) return this;
    return new ImmutablePagination(value, this.perPage, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Pagination#perPage() perPage} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for perPage
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePagination withPerPage(int value) {
    if (this.perPage == value) return this;
    return new ImmutablePagination(this.current, value, this.count);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Pagination#count() count} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for count
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePagination withCount(int value) {
    if (this.count == value) return this;
    return new ImmutablePagination(this.current, this.perPage, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePagination} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePagination
        && equalTo((ImmutablePagination) another);
  }

  private boolean equalTo(ImmutablePagination another) {
    return current == another.current
        && perPage == another.perPage
        && count == another.count;
  }

  /**
   * Computes a hash code from attributes: {@code current}, {@code perPage}, {@code count}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + current;
    h += (h << 5) + perPage;
    h += (h << 5) + count;
    return h;
  }

  /**
   * Prints the immutable value {@code Pagination} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Pagination")
        .omitNullValues()
        .add("current", current)
        .add("perPage", perPage)
        .add("count", count)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Pagination} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Pagination instance
   */
  public static ImmutablePagination copyOf(Pagination instance) {
    if (instance instanceof ImmutablePagination) {
      return (ImmutablePagination) instance;
    }
    return ImmutablePagination.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePagination ImmutablePagination}.
   * @return A new ImmutablePagination builder
   */
  public static ImmutablePagination.Builder builder() {
    return new ImmutablePagination.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePagination ImmutablePagination}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_CURRENT = 0x1L;
    private static final long INIT_BIT_PER_PAGE = 0x2L;
    private static final long INIT_BIT_COUNT = 0x4L;
    private long initBits = 0x7L;

    private int current;
    private int perPage;
    private int count;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Pagination} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(Pagination instance) {
      Preconditions.checkNotNull(instance, "instance");
      current(instance.current());
      perPage(instance.perPage());
      count(instance.count());
      return this;
    }

    /**
     * Initializes the value for the {@link Pagination#current() current} attribute.
     * @param current The value for current 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder current(int current) {
      this.current = current;
      initBits &= ~INIT_BIT_CURRENT;
      return this;
    }

    /**
     * Initializes the value for the {@link Pagination#perPage() perPage} attribute.
     * @param perPage The value for perPage 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder perPage(int perPage) {
      this.perPage = perPage;
      initBits &= ~INIT_BIT_PER_PAGE;
      return this;
    }

    /**
     * Initializes the value for the {@link Pagination#count() count} attribute.
     * @param count The value for count 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder count(int count) {
      this.count = count;
      initBits &= ~INIT_BIT_COUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePagination ImmutablePagination}.
     * @return An immutable instance of Pagination
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePagination build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePagination(current, perPage, count);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_CURRENT) != 0) attributes.add("current");
      if ((initBits & INIT_BIT_PER_PAGE) != 0) attributes.add("perPage");
      if ((initBits & INIT_BIT_COUNT) != 0) attributes.add("count");
      return "Cannot build Pagination, some of required attributes are not set " + attributes;
    }
  }
}
