package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link TransferLineItemListResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransferLineItemListResponse.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransferLineItemListResponse"})
@Immutable
public final class ImmutableTransferLineItemListResponse
    implements TransferLineItemListResponse {
  private final ImmutableList<TransferLineItemResult> response;
  private final Pagination pagination;

  private ImmutableTransferLineItemListResponse(
      ImmutableList<TransferLineItemResult> response,
      Pagination pagination) {
    this.response = response;
    this.pagination = pagination;
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @Override
  public ImmutableList<TransferLineItemResult> response() {
    return response;
  }

  /**
   * @return The value of the {@code pagination} attribute
   */
  @Override
  public Pagination pagination() {
    return pagination;
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransferLineItemListResponse#response() response}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransferLineItemListResponse withResponse(TransferLineItemResult... elements) {
    ImmutableList<TransferLineItemResult> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTransferLineItemListResponse(newValue, this.pagination);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link TransferLineItemListResponse#response() response}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of response elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTransferLineItemListResponse withResponse(Iterable<? extends TransferLineItemResult> elements) {
    if (this.response == elements) return this;
    ImmutableList<TransferLineItemResult> newValue = ImmutableList.copyOf(elements);
    return new ImmutableTransferLineItemListResponse(newValue, this.pagination);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferLineItemListResponse#pagination() pagination} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for pagination
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferLineItemListResponse withPagination(Pagination value) {
    if (this.pagination == value) return this;
    Pagination newValue = Preconditions.checkNotNull(value, "pagination");
    return new ImmutableTransferLineItemListResponse(this.response, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransferLineItemListResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransferLineItemListResponse
        && equalTo((ImmutableTransferLineItemListResponse) another);
  }

  private boolean equalTo(ImmutableTransferLineItemListResponse another) {
    return response.equals(another.response)
        && pagination.equals(another.pagination);
  }

  /**
   * Computes a hash code from attributes: {@code response}, {@code pagination}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + response.hashCode();
    h += (h << 5) + pagination.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TransferLineItemListResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransferLineItemListResponse")
        .omitNullValues()
        .add("response", response)
        .add("pagination", pagination)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link TransferLineItemListResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransferLineItemListResponse instance
   */
  public static ImmutableTransferLineItemListResponse copyOf(TransferLineItemListResponse instance) {
    if (instance instanceof ImmutableTransferLineItemListResponse) {
      return (ImmutableTransferLineItemListResponse) instance;
    }
    return ImmutableTransferLineItemListResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransferLineItemListResponse ImmutableTransferLineItemListResponse}.
   * @return A new ImmutableTransferLineItemListResponse builder
   */
  public static ImmutableTransferLineItemListResponse.Builder builder() {
    return new ImmutableTransferLineItemListResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransferLineItemListResponse ImmutableTransferLineItemListResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PAGINATION = 0x1L;
    private long initBits = 0x1L;

    private ImmutableList.Builder<TransferLineItemResult> response = ImmutableList.builder();
    private @Nullable Pagination pagination;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code TransferLineItemListResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TransferLineItemListResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      addAllResponse(instance.response());
      pagination(instance.pagination());
      return this;
    }

    /**
     * Adds one element to {@link TransferLineItemListResponse#response() response} list.
     * @param element A response element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addResponse(TransferLineItemResult element) {
      this.response.add(element);
      return this;
    }

    /**
     * Adds elements to {@link TransferLineItemListResponse#response() response} list.
     * @param elements An array of response elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addResponse(TransferLineItemResult... elements) {
      this.response.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link TransferLineItemListResponse#response() response} list.
     * @param elements An iterable of response elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder response(Iterable<? extends TransferLineItemResult> elements) {
      this.response = ImmutableList.builder();
      return addAllResponse(elements);
    }

    /**
     * Adds elements to {@link TransferLineItemListResponse#response() response} list.
     * @param elements An iterable of response elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllResponse(Iterable<? extends TransferLineItemResult> elements) {
      this.response.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link TransferLineItemListResponse#pagination() pagination} attribute.
     * @param pagination The value for pagination 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder pagination(Pagination pagination) {
      this.pagination = Preconditions.checkNotNull(pagination, "pagination");
      initBits &= ~INIT_BIT_PAGINATION;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransferLineItemListResponse ImmutableTransferLineItemListResponse}.
     * @return An immutable instance of TransferLineItemListResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransferLineItemListResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransferLineItemListResponse(response.build(), pagination);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PAGINATION) != 0) attributes.add("pagination");
      return "Cannot build TransferLineItemListResponse, some of required attributes are not set " + attributes;
    }
  }
}
