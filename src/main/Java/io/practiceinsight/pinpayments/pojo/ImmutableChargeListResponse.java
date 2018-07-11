package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ChargeListResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChargeListResponse.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ChargeListResponse"})
@Immutable
public final class ImmutableChargeListResponse
    implements ChargeListResponse {
  private final @Nullable ImmutableList<ChargeResult> response;
  private final @Nullable Pagination pagination;
  private final @Nullable ErrorResponse errorResponse;

  private ImmutableChargeListResponse(
      @Nullable ImmutableList<ChargeResult> response,
      @Nullable Pagination pagination,
      @Nullable ErrorResponse errorResponse) {
    this.response = response;
    this.pagination = pagination;
    this.errorResponse = errorResponse;
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @Override
  public @Nullable ImmutableList<ChargeResult> response() {
    return response;
  }

  /**
   * @return The value of the {@code pagination} attribute
   */
  @Override
  public @Nullable Pagination pagination() {
    return pagination;
  }

  /**
   * @return The value of the {@code errorResponse} attribute
   */
  @Override
  public @Nullable ErrorResponse errorResponse() {
    return errorResponse;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ChargeListResponse#response() response}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeListResponse withResponse(@Nullable ChargeResult... elements) {
    if (elements == null) {
      return new ImmutableChargeListResponse(null, this.pagination, this.errorResponse);
    }
    @Nullable ImmutableList<ChargeResult> newValue = elements == null ? null : ImmutableList.copyOf(elements);
    return new ImmutableChargeListResponse(newValue, this.pagination, this.errorResponse);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ChargeListResponse#response() response}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of response elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeListResponse withResponse(@Nullable Iterable<? extends ChargeResult> elements) {
    if (this.response == elements) return this;
    @Nullable ImmutableList<ChargeResult> newValue = elements == null ? null : ImmutableList.copyOf(elements);
    return new ImmutableChargeListResponse(newValue, this.pagination, this.errorResponse);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeListResponse#pagination() pagination} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pagination (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeListResponse withPagination(@Nullable Pagination value) {
    if (this.pagination == value) return this;
    return new ImmutableChargeListResponse(this.response, value, this.errorResponse);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeListResponse#errorResponse() errorResponse} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorResponse (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeListResponse withErrorResponse(@Nullable ErrorResponse value) {
    if (this.errorResponse == value) return this;
    return new ImmutableChargeListResponse(this.response, this.pagination, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChargeListResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChargeListResponse
        && equalTo((ImmutableChargeListResponse) another);
  }

  private boolean equalTo(ImmutableChargeListResponse another) {
    return Objects.equal(response, another.response)
        && Objects.equal(pagination, another.pagination)
        && Objects.equal(errorResponse, another.errorResponse);
  }

  /**
   * Computes a hash code from attributes: {@code response}, {@code pagination}, {@code errorResponse}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(response);
    h += (h << 5) + Objects.hashCode(pagination);
    h += (h << 5) + Objects.hashCode(errorResponse);
    return h;
  }

  /**
   * Prints the immutable value {@code ChargeListResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ChargeListResponse")
        .omitNullValues()
        .add("response", response)
        .add("pagination", pagination)
        .add("errorResponse", errorResponse)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ChargeListResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChargeListResponse instance
   */
  public static ImmutableChargeListResponse copyOf(ChargeListResponse instance) {
    if (instance instanceof ImmutableChargeListResponse) {
      return (ImmutableChargeListResponse) instance;
    }
    return ImmutableChargeListResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableChargeListResponse ImmutableChargeListResponse}.
   * @return A new ImmutableChargeListResponse builder
   */
  public static ImmutableChargeListResponse.Builder builder() {
    return new ImmutableChargeListResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableChargeListResponse ImmutableChargeListResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private ImmutableList.Builder<ChargeResult> response = null;
    private @Nullable Pagination pagination;
    private @Nullable ErrorResponse errorResponse;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ChargeListResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ChargeListResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      @Nullable List<ChargeResult> responseValue = instance.response();
      if (responseValue != null) {
        addAllResponse(responseValue);
      }
      @Nullable Pagination paginationValue = instance.pagination();
      if (paginationValue != null) {
        pagination(paginationValue);
      }
      @Nullable ErrorResponse errorResponseValue = instance.errorResponse();
      if (errorResponseValue != null) {
        errorResponse(errorResponseValue);
      }
      return this;
    }

    /**
     * Adds one element to {@link ChargeListResponse#response() response} list.
     * @param element A response element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addResponse(ChargeResult element) {
      if (this.response == null) {
        this.response = ImmutableList.builder();
      }
      this.response.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ChargeListResponse#response() response} list.
     * @param elements An array of response elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addResponse(ChargeResult... elements) {
      if (this.response == null) {
        this.response = ImmutableList.builder();
      }
      this.response.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ChargeListResponse#response() response} list.
     * @param elements An iterable of response elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder response(@Nullable Iterable<? extends ChargeResult> elements) {
      if (elements == null) {
        this.response = null;
        return this;
      }
      this.response = ImmutableList.builder();
      return addAllResponse(elements);
    }

    /**
     * Adds elements to {@link ChargeListResponse#response() response} list.
     * @param elements An iterable of response elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllResponse(Iterable<? extends ChargeResult> elements) {
      Preconditions.checkNotNull(elements, "response element");
      if (this.response == null) {
        this.response = ImmutableList.builder();
      }
      this.response.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeListResponse#pagination() pagination} attribute.
     * @param pagination The value for pagination (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pagination(@Nullable Pagination pagination) {
      this.pagination = pagination;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeListResponse#errorResponse() errorResponse} attribute.
     * @param errorResponse The value for errorResponse (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorResponse(@Nullable ErrorResponse errorResponse) {
      this.errorResponse = errorResponse;
      return this;
    }

    /**
     * Builds a new {@link ImmutableChargeListResponse ImmutableChargeListResponse}.
     * @return An immutable instance of ChargeListResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableChargeListResponse build() {
      return new ImmutableChargeListResponse(response == null ? null : response.build(), pagination, errorResponse);
    }
  }
}
