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
 * Immutable implementation of {@link ChargeResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChargeResponse.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ChargeResponse"})
@Immutable
public final class ImmutableChargeResponse implements ChargeResponse {
  private final @Nullable ChargeResult response;
  private final @Nullable ErrorResponse errorResponse;

  private ImmutableChargeResponse(
      @Nullable ChargeResult response,
      @Nullable ErrorResponse errorResponse) {
    this.response = response;
    this.errorResponse = errorResponse;
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @Override
  public @Nullable ChargeResult response() {
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
   * Copy the current immutable object by setting a value for the {@link ChargeResponse#response() response} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for response (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResponse withResponse(@Nullable ChargeResult value) {
    if (this.response == value) return this;
    return new ImmutableChargeResponse(value, this.errorResponse);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeResponse#errorResponse() errorResponse} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorResponse (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeResponse withErrorResponse(@Nullable ErrorResponse value) {
    if (this.errorResponse == value) return this;
    return new ImmutableChargeResponse(this.response, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChargeResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChargeResponse
        && equalTo((ImmutableChargeResponse) another);
  }

  private boolean equalTo(ImmutableChargeResponse another) {
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
   * Prints the immutable value {@code ChargeResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ChargeResponse")
        .omitNullValues()
        .add("response", response)
        .add("errorResponse", errorResponse)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ChargeResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChargeResponse instance
   */
  public static ImmutableChargeResponse copyOf(ChargeResponse instance) {
    if (instance instanceof ImmutableChargeResponse) {
      return (ImmutableChargeResponse) instance;
    }
    return ImmutableChargeResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableChargeResponse ImmutableChargeResponse}.
   * @return A new ImmutableChargeResponse builder
   */
  public static ImmutableChargeResponse.Builder builder() {
    return new ImmutableChargeResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableChargeResponse ImmutableChargeResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private @Nullable ChargeResult response;
    private @Nullable ErrorResponse errorResponse;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ChargeResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ChargeResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      @Nullable ChargeResult responseValue = instance.response();
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
     * Initializes the value for the {@link ChargeResponse#response() response} attribute.
     * @param response The value for response (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder response(@Nullable ChargeResult response) {
      this.response = response;
      return this;
    }

    /**
     * Initializes the value for the {@link ChargeResponse#errorResponse() errorResponse} attribute.
     * @param errorResponse The value for errorResponse (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorResponse(@Nullable ErrorResponse errorResponse) {
      this.errorResponse = errorResponse;
      return this;
    }

    /**
     * Builds a new {@link ImmutableChargeResponse ImmutableChargeResponse}.
     * @return An immutable instance of ChargeResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableChargeResponse build() {
      return new ImmutableChargeResponse(response, errorResponse);
    }
  }
}
