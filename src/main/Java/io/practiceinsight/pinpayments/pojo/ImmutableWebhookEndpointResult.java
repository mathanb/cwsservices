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
 * Immutable implementation of {@link WebhookEndpointResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableWebhookEndpointResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "WebhookEndpointResult"})
@Immutable
public final class ImmutableWebhookEndpointResult
    implements WebhookEndpointResult {
  private final String token;
  private final String url;
  private final String key;
  private final String createdAt;
  private final String updatedAt;

  private ImmutableWebhookEndpointResult(
      String token,
      String url,
      String key,
      String createdAt,
      String updatedAt) {
    this.token = token;
    this.url = url;
    this.key = key;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  /**
   * @return The value of the {@code token} attribute
   */
  @Override
  public String token() {
    return token;
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @Override
  public String url() {
    return url;
  }

  /**
   * @return The value of the {@code key} attribute
   */
  @Override
  public String key() {
    return key;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @Override
  public String createdAt() {
    return createdAt;
  }

  /**
   * @return The value of the {@code updatedAt} attribute
   */
  @Override
  public String updatedAt() {
    return updatedAt;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookEndpointResult#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookEndpointResult withToken(String value) {
    if (this.token.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "token");
    return new ImmutableWebhookEndpointResult(newValue, this.url, this.key, this.createdAt, this.updatedAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookEndpointResult#url() url} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for url
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookEndpointResult withUrl(String value) {
    if (this.url.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "url");
    return new ImmutableWebhookEndpointResult(this.token, newValue, this.key, this.createdAt, this.updatedAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookEndpointResult#key() key} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for key
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookEndpointResult withKey(String value) {
    if (this.key.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "key");
    return new ImmutableWebhookEndpointResult(this.token, this.url, newValue, this.createdAt, this.updatedAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookEndpointResult#createdAt() createdAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookEndpointResult withCreatedAt(String value) {
    if (this.createdAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "createdAt");
    return new ImmutableWebhookEndpointResult(this.token, this.url, this.key, newValue, this.updatedAt);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookEndpointResult#updatedAt() updatedAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for updatedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookEndpointResult withUpdatedAt(String value) {
    if (this.updatedAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "updatedAt");
    return new ImmutableWebhookEndpointResult(this.token, this.url, this.key, this.createdAt, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableWebhookEndpointResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableWebhookEndpointResult
        && equalTo((ImmutableWebhookEndpointResult) another);
  }

  private boolean equalTo(ImmutableWebhookEndpointResult another) {
    return token.equals(another.token)
        && url.equals(another.url)
        && key.equals(another.key)
        && createdAt.equals(another.createdAt)
        && updatedAt.equals(another.updatedAt);
  }

  /**
   * Computes a hash code from attributes: {@code token}, {@code url}, {@code key}, {@code createdAt}, {@code updatedAt}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + token.hashCode();
    h += (h << 5) + url.hashCode();
    h += (h << 5) + key.hashCode();
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + updatedAt.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code WebhookEndpointResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("WebhookEndpointResult")
        .omitNullValues()
        .add("token", token)
        .add("url", url)
        .add("key", key)
        .add("createdAt", createdAt)
        .add("updatedAt", updatedAt)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link WebhookEndpointResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable WebhookEndpointResult instance
   */
  public static ImmutableWebhookEndpointResult copyOf(WebhookEndpointResult instance) {
    if (instance instanceof ImmutableWebhookEndpointResult) {
      return (ImmutableWebhookEndpointResult) instance;
    }
    return ImmutableWebhookEndpointResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableWebhookEndpointResult ImmutableWebhookEndpointResult}.
   * @return A new ImmutableWebhookEndpointResult builder
   */
  public static ImmutableWebhookEndpointResult.Builder builder() {
    return new ImmutableWebhookEndpointResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableWebhookEndpointResult ImmutableWebhookEndpointResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOKEN = 0x1L;
    private static final long INIT_BIT_URL = 0x2L;
    private static final long INIT_BIT_KEY = 0x4L;
    private static final long INIT_BIT_CREATED_AT = 0x8L;
    private static final long INIT_BIT_UPDATED_AT = 0x10L;
    private long initBits = 0x1fL;

    private @Nullable String token;
    private @Nullable String url;
    private @Nullable String key;
    private @Nullable String createdAt;
    private @Nullable String updatedAt;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code WebhookEndpointResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(WebhookEndpointResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      token(instance.token());
      url(instance.url());
      key(instance.key());
      createdAt(instance.createdAt());
      updatedAt(instance.updatedAt());
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookEndpointResult#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder token(String token) {
      this.token = Preconditions.checkNotNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookEndpointResult#url() url} attribute.
     * @param url The value for url 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder url(String url) {
      this.url = Preconditions.checkNotNull(url, "url");
      initBits &= ~INIT_BIT_URL;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookEndpointResult#key() key} attribute.
     * @param key The value for key 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder key(String key) {
      this.key = Preconditions.checkNotNull(key, "key");
      initBits &= ~INIT_BIT_KEY;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookEndpointResult#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder createdAt(String createdAt) {
      this.createdAt = Preconditions.checkNotNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookEndpointResult#updatedAt() updatedAt} attribute.
     * @param updatedAt The value for updatedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder updatedAt(String updatedAt) {
      this.updatedAt = Preconditions.checkNotNull(updatedAt, "updatedAt");
      initBits &= ~INIT_BIT_UPDATED_AT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableWebhookEndpointResult ImmutableWebhookEndpointResult}.
     * @return An immutable instance of WebhookEndpointResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableWebhookEndpointResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableWebhookEndpointResult(token, url, key, createdAt, updatedAt);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      if ((initBits & INIT_BIT_URL) != 0) attributes.add("url");
      if ((initBits & INIT_BIT_KEY) != 0) attributes.add("key");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      if ((initBits & INIT_BIT_UPDATED_AT) != 0) attributes.add("updatedAt");
      return "Cannot build WebhookEndpointResult, some of required attributes are not set " + attributes;
    }
  }
}
