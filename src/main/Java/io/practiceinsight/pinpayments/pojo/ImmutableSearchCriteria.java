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
import org.joda.time.DateTime;

/**
 * Immutable implementation of {@link SearchCriteria}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSearchCriteria.builder()}.
 */
@SuppressWarnings({"AbstractClassName", "all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "SearchCriteria"})
@Immutable
public final class ImmutableSearchCriteria extends SearchCriteria {
  private final @Nullable String query;
  private final @Nullable DateTime startDate;
  private final @Nullable DateTime endDate;
  private final @Nullable String sort;
  private final int direction;

  private ImmutableSearchCriteria(ImmutableSearchCriteria.Builder builder) {
    this.query = builder.query;
    this.startDate = builder.startDate;
    this.endDate = builder.endDate;
    this.sort = builder.sort;
    this.direction = builder.directionIsSet()
        ? builder.direction
        : super.direction();
  }

  private ImmutableSearchCriteria(
      @Nullable String query,
      @Nullable DateTime startDate,
      @Nullable DateTime endDate,
      @Nullable String sort,
      int direction) {
    this.query = query;
    this.startDate = startDate;
    this.endDate = endDate;
    this.sort = sort;
    this.direction = direction;
  }

  /**
   * @return The value of the {@code query} attribute
   */
  @Override
  public @Nullable String query() {
    return query;
  }

  /**
   * @return The value of the {@code startDate} attribute
   */
  @Override
  public @Nullable DateTime startDate() {
    return startDate;
  }

  /**
   * @return The value of the {@code endDate} attribute
   */
  @Override
  public @Nullable DateTime endDate() {
    return endDate;
  }

  /**
   * @return The value of the {@code sort} attribute
   */
  @Override
  public @Nullable String sort() {
    return sort;
  }

  /**
   * The direction in which to sort the transfers (1 for ascending or -1 for descending).
   * Default value is 1.
   * @return The direction specified.
   */
  @Override
  public int direction() {
    return direction;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchCriteria#query() query} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for query (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchCriteria withQuery(@Nullable String value) {
    if (Objects.equal(this.query, value)) return this;
    return new ImmutableSearchCriteria(value, this.startDate, this.endDate, this.sort, this.direction);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchCriteria#startDate() startDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for startDate (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchCriteria withStartDate(@Nullable DateTime value) {
    if (this.startDate == value) return this;
    return new ImmutableSearchCriteria(this.query, value, this.endDate, this.sort, this.direction);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchCriteria#endDate() endDate} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for endDate (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchCriteria withEndDate(@Nullable DateTime value) {
    if (this.endDate == value) return this;
    return new ImmutableSearchCriteria(this.query, this.startDate, value, this.sort, this.direction);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchCriteria#sort() sort} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for sort (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchCriteria withSort(@Nullable String value) {
    if (Objects.equal(this.sort, value)) return this;
    return new ImmutableSearchCriteria(this.query, this.startDate, this.endDate, value, this.direction);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchCriteria#direction() direction} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for direction
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchCriteria withDirection(int value) {
    if (this.direction == value) return this;
    return new ImmutableSearchCriteria(this.query, this.startDate, this.endDate, this.sort, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSearchCriteria} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSearchCriteria
        && equalTo((ImmutableSearchCriteria) another);
  }

  private boolean equalTo(ImmutableSearchCriteria another) {
    return Objects.equal(query, another.query)
        && Objects.equal(startDate, another.startDate)
        && Objects.equal(endDate, another.endDate)
        && Objects.equal(sort, another.sort)
        && direction == another.direction;
  }

  /**
   * Computes a hash code from attributes: {@code query}, {@code startDate}, {@code endDate}, {@code sort}, {@code direction}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(query);
    h += (h << 5) + Objects.hashCode(startDate);
    h += (h << 5) + Objects.hashCode(endDate);
    h += (h << 5) + Objects.hashCode(sort);
    h += (h << 5) + direction;
    return h;
  }

  /**
   * Prints the immutable value {@code SearchCriteria} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("SearchCriteria")
        .omitNullValues()
        .add("query", query)
        .add("startDate", startDate)
        .add("endDate", endDate)
        .add("sort", sort)
        .add("direction", direction)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link SearchCriteria} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SearchCriteria instance
   */
  public static ImmutableSearchCriteria copyOf(SearchCriteria instance) {
    if (instance instanceof ImmutableSearchCriteria) {
      return (ImmutableSearchCriteria) instance;
    }
    return ImmutableSearchCriteria.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableSearchCriteria ImmutableSearchCriteria}.
   * @return A new ImmutableSearchCriteria builder
   */
  public static ImmutableSearchCriteria.Builder builder() {
    return new ImmutableSearchCriteria.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableSearchCriteria ImmutableSearchCriteria}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DIRECTION = 0x1L;
    private long optBits;

    private @Nullable String query;
    private @Nullable DateTime startDate;
    private @Nullable DateTime endDate;
    private @Nullable String sort;
    private int direction;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code SearchCriteria} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(SearchCriteria instance) {
      Preconditions.checkNotNull(instance, "instance");
      @Nullable String queryValue = instance.query();
      if (queryValue != null) {
        query(queryValue);
      }
      @Nullable DateTime startDateValue = instance.startDate();
      if (startDateValue != null) {
        startDate(startDateValue);
      }
      @Nullable DateTime endDateValue = instance.endDate();
      if (endDateValue != null) {
        endDate(endDateValue);
      }
      @Nullable String sortValue = instance.sort();
      if (sortValue != null) {
        sort(sortValue);
      }
      direction(instance.direction());
      return this;
    }

    /**
     * Initializes the value for the {@link SearchCriteria#query() query} attribute.
     * @param query The value for query (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder query(@Nullable String query) {
      this.query = query;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchCriteria#startDate() startDate} attribute.
     * @param startDate The value for startDate (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder startDate(@Nullable DateTime startDate) {
      this.startDate = startDate;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchCriteria#endDate() endDate} attribute.
     * @param endDate The value for endDate (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder endDate(@Nullable DateTime endDate) {
      this.endDate = endDate;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchCriteria#sort() sort} attribute.
     * @param sort The value for sort (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder sort(@Nullable String sort) {
      this.sort = sort;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchCriteria#direction() direction} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link SearchCriteria#direction() direction}.</em>
     * @param direction The value for direction 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder direction(int direction) {
      this.direction = direction;
      optBits |= OPT_BIT_DIRECTION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableSearchCriteria ImmutableSearchCriteria}.
     * @return An immutable instance of SearchCriteria
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableSearchCriteria build() {
      return new ImmutableSearchCriteria(this);
    }

    private boolean directionIsSet() {
      return (optBits & OPT_BIT_DIRECTION) != 0;
    }
  }
}
