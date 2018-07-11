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
 * Immutable implementation of {@link ErrorMessage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableErrorMessage.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ErrorMessage"})
@Immutable
public final class ImmutableErrorMessage implements ErrorMessage {
  private final String param;
  private final String code;
  private final String message;

  private ImmutableErrorMessage(String param, String code, String message) {
    this.param = param;
    this.code = code;
    this.message = message;
  }

  /**
   * @return The value of the {@code param} attribute
   */
  @Override
  public String param() {
    return param;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @Override
  public String code() {
    return code;
  }

  /**
   * @return The value of the {@code message} attribute
   */
  @Override
  public String message() {
    return message;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorMessage#param() param} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for param
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessage withParam(String value) {
    if (this.param.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "param");
    return new ImmutableErrorMessage(newValue, this.code, this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorMessage#code() code} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessage withCode(String value) {
    if (this.code.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "code");
    return new ImmutableErrorMessage(this.param, newValue, this.message);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ErrorMessage#message() message} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for message
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableErrorMessage withMessage(String value) {
    if (this.message.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "message");
    return new ImmutableErrorMessage(this.param, this.code, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableErrorMessage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableErrorMessage
        && equalTo((ImmutableErrorMessage) another);
  }

  private boolean equalTo(ImmutableErrorMessage another) {
    return param.equals(another.param)
        && code.equals(another.code)
        && message.equals(another.message);
  }

  /**
   * Computes a hash code from attributes: {@code param}, {@code code}, {@code message}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + param.hashCode();
    h += (h << 5) + code.hashCode();
    h += (h << 5) + message.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ErrorMessage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ErrorMessage")
        .omitNullValues()
        .add("param", param)
        .add("code", code)
        .add("message", message)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link ErrorMessage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ErrorMessage instance
   */
  public static ImmutableErrorMessage copyOf(ErrorMessage instance) {
    if (instance instanceof ImmutableErrorMessage) {
      return (ImmutableErrorMessage) instance;
    }
    return ImmutableErrorMessage.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableErrorMessage ImmutableErrorMessage}.
   * @return A new ImmutableErrorMessage builder
   */
  public static ImmutableErrorMessage.Builder builder() {
    return new ImmutableErrorMessage.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableErrorMessage ImmutableErrorMessage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_PARAM = 0x1L;
    private static final long INIT_BIT_CODE = 0x2L;
    private static final long INIT_BIT_MESSAGE = 0x4L;
    private long initBits = 0x7L;

    private @Nullable String param;
    private @Nullable String code;
    private @Nullable String message;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ErrorMessage} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ErrorMessage instance) {
      Preconditions.checkNotNull(instance, "instance");
      param(instance.param());
      code(instance.code());
      message(instance.message());
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorMessage#param() param} attribute.
     * @param param The value for param 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder param(String param) {
      this.param = Preconditions.checkNotNull(param, "param");
      initBits &= ~INIT_BIT_PARAM;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorMessage#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder code(String code) {
      this.code = Preconditions.checkNotNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link ErrorMessage#message() message} attribute.
     * @param message The value for message 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder message(String message) {
      this.message = Preconditions.checkNotNull(message, "message");
      initBits &= ~INIT_BIT_MESSAGE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableErrorMessage ImmutableErrorMessage}.
     * @return An immutable instance of ErrorMessage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableErrorMessage build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableErrorMessage(param, code, message);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PARAM) != 0) attributes.add("param");
      if ((initBits & INIT_BIT_CODE) != 0) attributes.add("code");
      if ((initBits & INIT_BIT_MESSAGE) != 0) attributes.add("message");
      return "Cannot build ErrorMessage, some of required attributes are not set " + attributes;
    }
  }
}
