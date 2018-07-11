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
 * Immutable implementation of {@link ErrorResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorResponse.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ErrorResponse"})
@Immutable
public final class ImmutableErrorResponse implements ErrorResponse {
  private final String error;
  private final String errorDescription;
  private final ImmutableList<ErrorMessage> messages;

  private ImmutableErrorResponse(
      String error,
      String errorDescription,
      ImmutableList<ErrorMessage> messages) {
    this.error = error;
    this.errorDescription = errorDescription;
    this.messages = messages;
  }

  /**
   * @return The value of the {@code error} attribute
   */
  @Override
  public String error() {
    return error;
  }

  /**
   * @return The value of the {@code errorDescription} attribute
   */
  @Override
  public String errorDescription() {
    return errorDescription;
  }

  /**
   * @return The value of the {@code messages} attribute
   */
  @Override
  public ImmutableList<ErrorMessage> messages() {
    return messages;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorResponse#error() error} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for error
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorResponse withError(String value) {
    if (this.error.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "error");
    return new ImmutableErrorResponse(newValue, this.errorDescription, this.messages);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorResponse#errorDescription() errorDescription} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errorDescription
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorResponse withErrorDescription(String value) {
    if (this.errorDescription.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "errorDescription");
    return new ImmutableErrorResponse(this.error, newValue, this.messages);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ErrorResponse#messages() messages}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorResponse withMessages(ErrorMessage... elements) {
    ImmutableList<ErrorMessage> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorResponse(this.error, this.errorDescription, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ErrorResponse#messages() messages}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of messages elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableErrorResponse withMessages(Iterable<? extends ErrorMessage> elements) {
    if (this.messages == elements) return this;
    ImmutableList<ErrorMessage> newValue = ImmutableList.copyOf(elements);
    return new ImmutableErrorResponse(this.error, this.errorDescription, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorResponse
        && equalTo((ImmutableErrorResponse) another);
  }

  private boolean equalTo(ImmutableErrorResponse another) {
    return error.equals(another.error)
        && errorDescription.equals(another.errorDescription)
        && messages.equals(another.messages);
  }

  /**
   * Computes a hash code from attributes: {@code error}, {@code errorDescription}, {@code messages}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + error.hashCode();
    h += (h << 5) + errorDescription.hashCode();
    h += (h << 5) + messages.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorResponse")
        .omitNullValues()
        .add("error", error)
        .add("errorDescription", errorDescription)
        .add("messages", messages)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ErrorResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorResponse instance
   */
  public static ImmutableErrorResponse copyOf(ErrorResponse instance) {
    if (instance instanceof ImmutableErrorResponse) {
      return (ImmutableErrorResponse) instance;
    }
    return ImmutableErrorResponse.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorResponse ImmutableErrorResponse}.
   * @return A new ImmutableErrorResponse builder
   */
  public static ImmutableErrorResponse.Builder builder() {
    return new ImmutableErrorResponse.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorResponse ImmutableErrorResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_ERROR = 0x1L;
    private static final long INIT_BIT_ERROR_DESCRIPTION = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String error;
    private @Nullable String errorDescription;
    private ImmutableList.Builder<ErrorMessage> messages = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorResponse} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ErrorResponse instance) {
      Preconditions.checkNotNull(instance, "instance");
      error(instance.error());
      errorDescription(instance.errorDescription());
      addAllMessages(instance.messages());
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorResponse#error() error} attribute.
     * @param error The value for error 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder error(String error) {
      this.error = Preconditions.checkNotNull(error, "error");
      initBits &= ~INIT_BIT_ERROR;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorResponse#errorDescription() errorDescription} attribute.
     * @param errorDescription The value for errorDescription 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errorDescription(String errorDescription) {
      this.errorDescription = Preconditions.checkNotNull(errorDescription, "errorDescription");
      initBits &= ~INIT_BIT_ERROR_DESCRIPTION;
      return this;
    }

    /**
     * Adds one element to {@link ErrorResponse#messages() messages} list.
     * @param element A messages element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMessages(ErrorMessage element) {
      this.messages.add(element);
      return this;
    }

    /**
     * Adds elements to {@link ErrorResponse#messages() messages} list.
     * @param elements An array of messages elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addMessages(ErrorMessage... elements) {
      this.messages.add(elements);
      return this;
    }

    /**
     * Sets or replaces all elements for {@link ErrorResponse#messages() messages} list.
     * @param elements An iterable of messages elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder messages(Iterable<? extends ErrorMessage> elements) {
      this.messages = ImmutableList.builder();
      return addAllMessages(elements);
    }

    /**
     * Adds elements to {@link ErrorResponse#messages() messages} list.
     * @param elements An iterable of messages elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllMessages(Iterable<? extends ErrorMessage> elements) {
      this.messages.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorResponse ImmutableErrorResponse}.
     * @return An immutable instance of ErrorResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorResponse build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorResponse(error, errorDescription, messages.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_ERROR) != 0) attributes.add("error");
      if ((initBits & INIT_BIT_ERROR_DESCRIPTION) != 0) attributes.add("errorDescription");
      return "Cannot build ErrorResponse, some of required attributes are not set " + attributes;
    }
  }
}
