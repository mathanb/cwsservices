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
 * Immutable implementation of {@link RefundResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRefundResponse.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "RefundResponse"})
@Immutable
public final class ImmutableRefundResponse implements RefundResponse {
  private final @Nullable RefundResult response;
  private final @Nullable ErrorResponse errorResponse;

  private ImmutableRefundResponse(
      @Nullable RefundResult response,
      @Nullable ErrorResponse errorResponse) {
    this.response = response;
    this.errorResponse = errorResponse;
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @Override
  public @Nullable RefundResult response() {
    return response;
  }

  /**
   * @return The value of the {@code errorResponse} attribute
   */
  @Override
  public @Nullable ErrorResponse errorResponse() {
    return errorResponse;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RefundResponse#response() response} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for response (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefundResponse withResponse(@Nullable RefundResult value) {
    if (this.response == value) return this;
    return new ImmutableRefundResponse(value, this.errorResponse);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RefundResponse#errorResponse() errorResponse} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorResponse (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefundResponse withErrorResponse(@Nullable ErrorResponse value) {
    if (this.errorResponse == value) return this;
    return new ImmutableRefundResponse(this.response, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRefundResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRefundResponse
        && equalTo((ImmutableRefundResponse) another);
  }

  private boolean equalTo(ImmutableRefundResponse another) {
    return Objects.equal(response, another.response)
        && Objects.equal(errorResponse, another.errorResponse);
  }

  /**
   * Computes a hash code from attributes: {@code response}, {@code errorResponse}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(response);
    h += (h << 5) + Objects.hashCode(errorResponse);
    return h;
  }

  /**
   * Prints the immutable value {@code RefundResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("RefundResponse")
        .omitNullValues()
        .add("response", response)
        .add("errorResponse", errorResponse)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link RefundResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RefundResponse instance
   */
  public static ImmutableRefundResponse copyOf(RefundResponse instance) {
    if (instance instanceof ImmutableRefundResponse) {
      return (ImmutableRefundResponse) instance;
    }
    return ImmutableRefundResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableRefundResponse ImmutableRefundResponse}.
   * @return A new ImmutableRefundResponse builder
   */
  public static ImmutableRefundResponse.Builder builder() {
    return new ImmutableRefundResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableRefundResponse ImmutableRefundResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable RefundResult response;
    private @Nullable ErrorResponse errorResponse;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code RefundResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(RefundResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      @Nullable RefundResult responseValue = instance.response();
      if (responseValue != null) {
        response(responseValue);
      }
      @Nullable ErrorResponse errorResponseValue = instance.errorResponse();
      if (errorResponseValue != null) {
        errorResponse(errorResponseValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link RefundResponse#response() response} attribute.
     * @param response The value for response (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder response(@Nullable RefundResult response) {
      this.response = response;
      return this;
    }

    /**
     * Initializes the value for the {@link RefundResponse#errorResponse() errorResponse} attribute.
     * @param errorResponse The value for errorResponse (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorResponse(@Nullable ErrorResponse errorResponse) {
      this.errorResponse = errorResponse;
      return this;
    }

    /**
     * Builds a new {@link ImmutableRefundResponse ImmutableRefundResponse}.
     * @return An immutable instance of RefundResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableRefundResponse build() {
      return new ImmutableRefundResponse(response, errorResponse);
    }
  }
}
