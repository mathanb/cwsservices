package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
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
 * Immutable implementation of {@link WebhookResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableWebhookResult.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "WebhookResult"})
@Immutable
public final class ImmutableWebhookResult implements WebhookResult {
  private final String token;
  private final String status;
  private final String url;
  private final String eventToken;
  private final String createdAt;
  private final String acceptedAt;
  private final @Nullable String nextRun;
  private final Integer retries;
  private final HashMap<String, Object> errors;

  private ImmutableWebhookResult(
      String token,
      String status,
      String url,
      String eventToken,
      String createdAt,
      String acceptedAt,
      @Nullable String nextRun,
      Integer retries,
      HashMap<String, Object> errors) {
    this.token = token;
    this.status = status;
    this.url = url;
    this.eventToken = eventToken;
    this.createdAt = createdAt;
    this.acceptedAt = acceptedAt;
    this.nextRun = nextRun;
    this.retries = retries;
    this.errors = errors;
  }

  /**
   * @return The value of the {@code token} attribute
   */
  @Override
  public String token() {
    return token;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @Override
  public String status() {
    return status;
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @Override
  public String url() {
    return url;
  }

  /**
   * @return The value of the {@code eventToken} attribute
   */
  @Override
  public String eventToken() {
    return eventToken;
  }

  /**
   * @return The value of the {@code createdAt} attribute
   */
  @Override
  public String createdAt() {
    return createdAt;
  }

  /**
   * @return The value of the {@code acceptedAt} attribute
   */
  @Override
  public String acceptedAt() {
    return acceptedAt;
  }

  /**
   * @return The value of the {@code nextRun} attribute
   */
  @Override
  public @Nullable String nextRun() {
    return nextRun;
  }

  /**
   * @return The value of the {@code retries} attribute
   */
  @Override
  public Integer retries() {
    return retries;
  }

  /**
   * @return The value of the {@code errors} attribute
   */
  @Override
  public HashMap<String, Object> errors() {
    return errors;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookResult#token() token} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for token
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookResult withToken(String value) {
    if (this.token.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "token");
    return new ImmutableWebhookResult(
        newValue,
        this.status,
        this.url,
        this.eventToken,
        this.createdAt,
        this.acceptedAt,
        this.nextRun,
        this.retries,
        this.errors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookResult#status() status} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookResult withStatus(String value) {
    if (this.status.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "status");
    return new ImmutableWebhookResult(
        this.token,
        newValue,
        this.url,
        this.eventToken,
        this.createdAt,
        this.acceptedAt,
        this.nextRun,
        this.retries,
        this.errors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookResult#url() url} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for url
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookResult withUrl(String value) {
    if (this.url.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "url");
    return new ImmutableWebhookResult(
        this.token,
        this.status,
        newValue,
        this.eventToken,
        this.createdAt,
        this.acceptedAt,
        this.nextRun,
        this.retries,
        this.errors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookResult#eventToken() eventToken} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for eventToken
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookResult withEventToken(String value) {
    if (this.eventToken.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "eventToken");
    return new ImmutableWebhookResult(
        this.token,
        this.status,
        this.url,
        newValue,
        this.createdAt,
        this.acceptedAt,
        this.nextRun,
        this.retries,
        this.errors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookResult#createdAt() createdAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for createdAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookResult withCreatedAt(String value) {
    if (this.createdAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "createdAt");
    return new ImmutableWebhookResult(
        this.token,
        this.status,
        this.url,
        this.eventToken,
        newValue,
        this.acceptedAt,
        this.nextRun,
        this.retries,
        this.errors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookResult#acceptedAt() acceptedAt} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for acceptedAt
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookResult withAcceptedAt(String value) {
    if (this.acceptedAt.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "acceptedAt");
    return new ImmutableWebhookResult(
        this.token,
        this.status,
        this.url,
        this.eventToken,
        this.createdAt,
        newValue,
        this.nextRun,
        this.retries,
        this.errors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookResult#nextRun() nextRun} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for nextRun (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookResult withNextRun(@Nullable String value) {
    if (Objects.equal(this.nextRun, value)) return this;
    return new ImmutableWebhookResult(
        this.token,
        this.status,
        this.url,
        this.eventToken,
        this.createdAt,
        this.acceptedAt,
        value,
        this.retries,
        this.errors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookResult#retries() retries} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for retries
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookResult withRetries(Integer value) {
    if (this.retries.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "retries");
    return new ImmutableWebhookResult(
        this.token,
        this.status,
        this.url,
        this.eventToken,
        this.createdAt,
        this.acceptedAt,
        this.nextRun,
        newValue,
        this.errors);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookResult#errors() errors} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for errors
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookResult withErrors(HashMap<String, Object> value) {
    if (this.errors == value) return this;
    HashMap<String, Object> newValue = Preconditions.checkNotNull(value, "errors");
    return new ImmutableWebhookResult(
        this.token,
        this.status,
        this.url,
        this.eventToken,
        this.createdAt,
        this.acceptedAt,
        this.nextRun,
        this.retries,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableWebhookResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableWebhookResult
        && equalTo((ImmutableWebhookResult) another);
  }

  private boolean equalTo(ImmutableWebhookResult another) {
    return token.equals(another.token)
        && status.equals(another.status)
        && url.equals(another.url)
        && eventToken.equals(another.eventToken)
        && createdAt.equals(another.createdAt)
        && acceptedAt.equals(another.acceptedAt)
        && Objects.equal(nextRun, another.nextRun)
        && retries.equals(another.retries)
        && errors.equals(another.errors);
  }

  /**
   * Computes a hash code from attributes: {@code token}, {@code status}, {@code url}, {@code eventToken}, {@code createdAt}, {@code acceptedAt}, {@code nextRun}, {@code retries}, {@code errors}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + token.hashCode();
    h += (h << 5) + status.hashCode();
    h += (h << 5) + url.hashCode();
    h += (h << 5) + eventToken.hashCode();
    h += (h << 5) + createdAt.hashCode();
    h += (h << 5) + acceptedAt.hashCode();
    h += (h << 5) + Objects.hashCode(nextRun);
    h += (h << 5) + retries.hashCode();
    h += (h << 5) + errors.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code WebhookResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("WebhookResult")
        .omitNullValues()
        .add("token", token)
        .add("status", status)
        .add("url", url)
        .add("eventToken", eventToken)
        .add("createdAt", createdAt)
        .add("acceptedAt", acceptedAt)
        .add("nextRun", nextRun)
        .add("retries", retries)
        .add("errors", errors)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link WebhookResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable WebhookResult instance
   */
  public static ImmutableWebhookResult copyOf(WebhookResult instance) {
    if (instance instanceof ImmutableWebhookResult) {
      return (ImmutableWebhookResult) instance;
    }
    return ImmutableWebhookResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableWebhookResult ImmutableWebhookResult}.
   * @return A new ImmutableWebhookResult builder
   */
  public static ImmutableWebhookResult.Builder builder() {
    return new ImmutableWebhookResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableWebhookResult ImmutableWebhookResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TOKEN = 0x1L;
    private static final long INIT_BIT_STATUS = 0x2L;
    private static final long INIT_BIT_URL = 0x4L;
    private static final long INIT_BIT_EVENT_TOKEN = 0x8L;
    private static final long INIT_BIT_CREATED_AT = 0x10L;
    private static final long INIT_BIT_ACCEPTED_AT = 0x20L;
    private static final long INIT_BIT_RETRIES = 0x40L;
    private static final long INIT_BIT_ERRORS = 0x80L;
    private long initBits = 0xffL;

    private @Nullable String token;
    private @Nullable String status;
    private @Nullable String url;
    private @Nullable String eventToken;
    private @Nullable String createdAt;
    private @Nullable String acceptedAt;
    private @Nullable String nextRun;
    private @Nullable Integer retries;
    private @Nullable HashMap<String, Object> errors;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code WebhookResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(WebhookResult instance) {
      Preconditions.checkNotNull(instance, "instance");
      token(instance.token());
      status(instance.status());
      url(instance.url());
      eventToken(instance.eventToken());
      createdAt(instance.createdAt());
      acceptedAt(instance.acceptedAt());
      @Nullable String nextRunValue = instance.nextRun();
      if (nextRunValue != null) {
        nextRun(nextRunValue);
      }
      retries(instance.retries());
      errors(instance.errors());
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookResult#token() token} attribute.
     * @param token The value for token 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder token(String token) {
      this.token = Preconditions.checkNotNull(token, "token");
      initBits &= ~INIT_BIT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookResult#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder status(String status) {
      this.status = Preconditions.checkNotNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookResult#url() url} attribute.
     * @param url The value for url 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder url(String url) {
      this.url = Preconditions.checkNotNull(url, "url");
      initBits &= ~INIT_BIT_URL;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookResult#eventToken() eventToken} attribute.
     * @param eventToken The value for eventToken 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder eventToken(String eventToken) {
      this.eventToken = Preconditions.checkNotNull(eventToken, "eventToken");
      initBits &= ~INIT_BIT_EVENT_TOKEN;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookResult#createdAt() createdAt} attribute.
     * @param createdAt The value for createdAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder createdAt(String createdAt) {
      this.createdAt = Preconditions.checkNotNull(createdAt, "createdAt");
      initBits &= ~INIT_BIT_CREATED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookResult#acceptedAt() acceptedAt} attribute.
     * @param acceptedAt The value for acceptedAt 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder acceptedAt(String acceptedAt) {
      this.acceptedAt = Preconditions.checkNotNull(acceptedAt, "acceptedAt");
      initBits &= ~INIT_BIT_ACCEPTED_AT;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookResult#nextRun() nextRun} attribute.
     * @param nextRun The value for nextRun (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder nextRun(@Nullable String nextRun) {
      this.nextRun = nextRun;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookResult#retries() retries} attribute.
     * @param retries The value for retries 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder retries(Integer retries) {
      this.retries = Preconditions.checkNotNull(retries, "retries");
      initBits &= ~INIT_BIT_RETRIES;
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookResult#errors() errors} attribute.
     * @param errors The value for errors 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder errors(HashMap<String, Object> errors) {
      this.errors = Preconditions.checkNotNull(errors, "errors");
      initBits &= ~INIT_BIT_ERRORS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableWebhookResult ImmutableWebhookResult}.
     * @return An immutable instance of WebhookResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableWebhookResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableWebhookResult(token, status, url, eventToken, createdAt, acceptedAt, nextRun, retries, errors);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TOKEN) != 0) attributes.add("token");
      if ((initBits & INIT_BIT_STATUS) != 0) attributes.add("status");
      if ((initBits & INIT_BIT_URL) != 0) attributes.add("url");
      if ((initBits & INIT_BIT_EVENT_TOKEN) != 0) attributes.add("eventToken");
      if ((initBits & INIT_BIT_CREATED_AT) != 0) attributes.add("createdAt");
      if ((initBits & INIT_BIT_ACCEPTED_AT) != 0) attributes.add("acceptedAt");
      if ((initBits & INIT_BIT_RETRIES) != 0) attributes.add("retries");
      if ((initBits & INIT_BIT_ERRORS) != 0) attributes.add("errors");
      return "Cannot build WebhookResult, some of required attributes are not set " + attributes;
    }
  }
}
