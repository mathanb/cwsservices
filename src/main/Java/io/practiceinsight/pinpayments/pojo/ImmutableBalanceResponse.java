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
 * Immutable implementation of {@link BalanceResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBalanceResponse.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "BalanceResponse"})
@Immutable
public final class ImmutableBalanceResponse implements BalanceResponse {
  private final BalanceResult response;

  private ImmutableBalanceResponse(BalanceResult response) {
    this.response = response;
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @Override
  public BalanceResult response() {
    return response;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link BalanceResponse#response() response} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for response
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableBalanceResponse withResponse(BalanceResult value) {
    if (this.response == value) return this;
    BalanceResult newValue = Preconditions.checkNotNull(value, "response");
    return new ImmutableBalanceResponse(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBalanceResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBalanceResponse
        && equalTo((ImmutableBalanceResponse) another);
  }

  private boolean equalTo(ImmutableBalanceResponse another) {
    return response.equals(another.response);
  }

  /**
   * Computes a hash code from attributes: {@code response}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + response.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code BalanceResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("BalanceResponse")
        .omitNullValues()
        .add("response", response)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link BalanceResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable BalanceResponse instance
   */
  public static ImmutableBalanceResponse copyOf(BalanceResponse instance) {
    if (instance instanceof ImmutableBalanceResponse) {
      return (ImmutableBalanceResponse) instance;
    }
    return ImmutableBalanceResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableBalanceResponse ImmutableBalanceResponse}.
   * @return A new ImmutableBalanceResponse builder
   */
  public static ImmutableBalanceResponse.Builder builder() {
    return new ImmutableBalanceResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableBalanceResponse ImmutableBalanceResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_RESPONSE = 0x1L;
    private long initBits = 0x1L;

    private @Nullable BalanceResult response;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code BalanceResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(BalanceResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      response(instance.response());
      return this;
    }

    /**
     * Initializes the value for the {@link BalanceResponse#response() response} attribute.
     * @param response The value for response 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder response(BalanceResult response) {
      this.response = Preconditions.checkNotNull(response, "response");
      initBits &= ~INIT_BIT_RESPONSE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableBalanceResponse ImmutableBalanceResponse}.
     * @return An immutable instance of BalanceResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableBalanceResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableBalanceResponse(response);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_RESPONSE) != 0) attributes.add("response");
      return "Cannot build BalanceResponse, some of required attributes are not set " + attributes;
    }
  }
}
