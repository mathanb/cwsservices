package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.primitives.Booleans;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link DeletionResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeletionResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "DeletionResult"})
@Immutable
public final class ImmutableDeletionResult implements DeletionResult {
  private final boolean success;
  private final @Nullable ErrorResponse errorResponse;

  private ImmutableDeletionResult(
      boolean success,
      @Nullable ErrorResponse errorResponse) {
    this.success = success;
    this.errorResponse = errorResponse;
  }

  /**
   * @return The value of the {@code success} attribute
   */
  @Override
  public boolean success() {
    return success;
  }

  /**
   * @return The value of the {@code errorResponse} attribute
   */
  @Override
  public @Nullable ErrorResponse errorResponse() {
    return errorResponse;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeletionResult#success() success} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for success
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeletionResult withSuccess(boolean value) {
    if (this.success == value) return this;
    return new ImmutableDeletionResult(value, this.errorResponse);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeletionResult#errorResponse() errorResponse} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorResponse (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeletionResult withErrorResponse(@Nullable ErrorResponse value) {
    if (this.errorResponse == value) return this;
    return new ImmutableDeletionResult(this.success, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeletionResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeletionResult
        && equalTo((ImmutableDeletionResult) another);
  }

  private boolean equalTo(ImmutableDeletionResult another) {
    return success == another.success
        && Objects.equal(errorResponse, another.errorResponse);
  }

  /**
   * Computes a hash code from attributes: {@code success}, {@code errorResponse}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Booleans.hashCode(success);
    h += (h << 5) + Objects.hashCode(errorResponse);
    return h;
  }

  /**
   * Prints the immutable value {@code DeletionResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("DeletionResult")
        .omitNullValues()
        .add("success", success)
        .add("errorResponse", errorResponse)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link DeletionResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeletionResult instance
   */
  public static ImmutableDeletionResult copyOf(DeletionResult instance) {
    if (instance instanceof ImmutableDeletionResult) {
      return (ImmutableDeletionResult) instance;
    }
    return ImmutableDeletionResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDeletionResult ImmutableDeletionResult}.
   * @return A new ImmutableDeletionResult builder
   */
  public static ImmutableDeletionResult.Builder builder() {
    return new ImmutableDeletionResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDeletionResult ImmutableDeletionResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_SUCCESS = 0x1L;
    private long initBits = 0x1L;

    private boolean success;
    private @Nullable ErrorResponse errorResponse;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DeletionResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DeletionResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      success(instance.success());
      @Nullable ErrorResponse errorResponseValue = instance.errorResponse();
      if (errorResponseValue != null) {
        errorResponse(errorResponseValue);
      }
      return this;
    }

    /**
     * Initializes the value for the {@link DeletionResult#success() success} attribute.
     * @param success The value for success 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder success(boolean success) {
      this.success = success;
      initBits &= ~INIT_BIT_SUCCESS;
      return this;
    }

    /**
     * Initializes the value for the {@link DeletionResult#errorResponse() errorResponse} attribute.
     * @param errorResponse The value for errorResponse (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorResponse(@Nullable ErrorResponse errorResponse) {
      this.errorResponse = errorResponse;
      return this;
    }

    /**
     * Builds a new {@link ImmutableDeletionResult ImmutableDeletionResult}.
     * @return An immutable instance of DeletionResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDeletionResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDeletionResult(success, errorResponse);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_SUCCESS) != 0) attributes.add("success");
      return "Cannot build DeletionResult, some of required attributes are not set " + attributes;
    }
  }
}
