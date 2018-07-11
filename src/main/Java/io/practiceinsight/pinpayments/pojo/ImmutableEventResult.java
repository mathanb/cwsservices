package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link EventResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEventResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "EventResult"})
@Immutable
public final class ImmutableEventResult implements EventResult {
  private final String token;
  private final String type;
  private final HashMap<String, Object> data;
  private final String createdAt;

  private ImmutableEventResult(
      String token,
      String type,
      HashMap<String, Object> data,
      String createdAt) {
    this.token = token;
    this.type = type;
    this.data = data;
    this.createdAt = createdAt;
  }

  /**
   * @return The value of the {@code token} attribute
   */
  @Override
  public String token() {
    return token;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @Override
  public String type() {
    return type;
  }

  /**
   * @return The value of the {@code data} attribute
   */
  @Override
  public HashMap<String, Object> data() {
    return data;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @Override
  public String createdAt() {
    return createdAt;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EventResult#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEventResult withToken(String value) {
    if (this.token.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "token");
    return new ImmutableEventResult(newValue, this.type, this.data, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EventResult#type() type} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEventResult withType(String value) {
    if (this.type.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "type");
    return new ImmutableEventResult(this.token, newValue, this.data, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EventResult#data() data} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for data
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEventResult withData(HashMap<String, Object> value) {
    if (this.data == value) return this;
    HashMap<String, Object> newValue = Preconditions.checkNotNull(value, "data");
    return new ImmutableEventResult(this.token, this.type, newValue, this.createdAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EventResult#createdAt() createdAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEventResult withCreatedAt(String value) {
    if (this.createdAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "createdAt");
    return new ImmutableEventResult(this.token, this.type, this.data, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEventResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEventResult
        && equalTo((ImmutableEventResult) another);
  }

  private boolean equalTo(ImmutableEventResult another) {
    return token.equals(another.token)
        && type.equals(another.type)
        && data.equals(another.data)
        && createdAt.equals(another.createdAt);
  }

  /**
   * Computes a hash code from attributes: {@code token}, {@code type}, {@code data}, {@code createdAt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + token.hashCode();
    h += (h << 5) + type.hashCode();
    h += (h << 5) + data.hashCode();
    h += (h << 5) + createdAt.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code EventResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("EventResult")
        .omitNullValues()
        .add("token", token)
        .add("type", type)
        .add("data", data)
        .add("createdAt", createdAt)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link EventResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EventResult instance
   */
  public static ImmutableEventResult copyOf(EventResult instance) {
    if (instance instanceof ImmutableEventResult) {
      return (ImmutableEventResult) instance;
    }
    return ImmutableEventResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableEventResult ImmutableEventResult}.
   * @return A new ImmutableEventResult builder
   */
  public static ImmutableEventResult.Builder builder() {
    return new ImmutableEventResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableEventResult ImmutableEventResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOKEN = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long INIT_BIT_DATA = 0x4L;
    private static final long INIT_BIT_CREATED_AT = 0x8L;
    private long initBits = 0xfL;

    private @Nullable String token;
    private @Nullable String type;
    private @Nullable HashMap<String, Object> data;
    private @Nullable String createdAt;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code EventResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(EventResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      token(instance.token());
      type(instance.type());
      data(instance.data());
      createdAt(instance.createdAt());
      return this;
    }

    /**
     * Initializes the value for the {@link EventResult#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder token(String token) {
      this.token = Preconditions.checkNotNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link EventResult#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder type(String type) {
      this.type = Preconditions.checkNotNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link EventResult#data() data} attribute.
     * @param data The value for data 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder data(HashMap<String, Object> data) {
      this.data = Preconditions.checkNotNull(data, "data");
      initBits &= ~INIT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the value for the {@link EventResult#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder createdAt(String createdAt) {
      this.createdAt = Preconditions.checkNotNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableEventResult ImmutableEventResult}.
     * @return An immutable instance of EventResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableEventResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableEventResult(token, type, data, createdAt);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      if ((initBits & INIT_BIT_DATA) != 0) attributes.add("data");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      return "Cannot build EventResult, some of required attributes are not set " + attributes;
    }
  }
}
