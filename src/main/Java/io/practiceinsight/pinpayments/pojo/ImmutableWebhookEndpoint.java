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
 * Immutable implementation of {@link WebhookEndpoint}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableWebhookEndpoint.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "WebhookEndpoint"})
@Immutable
public final class ImmutableWebhookEndpoint implements WebhookEndpoint {
  private final String url;

  private ImmutableWebhookEndpoint(String url) {
    this.url = url;
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @Override
  public String url() {
    return url;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link WebhookEndpoint#url() url} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for url
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableWebhookEndpoint withUrl(String value) {
    if (this.url.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "url");
    return new ImmutableWebhookEndpoint(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableWebhookEndpoint} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableWebhookEndpoint
        && equalTo((ImmutableWebhookEndpoint) another);
  }

  private boolean equalTo(ImmutableWebhookEndpoint another) {
    return url.equals(another.url);
  }

  /**
   * Computes a hash code from attributes: {@code url}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + url.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code WebhookEndpoint} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("WebhookEndpoint")
        .omitNullValues()
        .add("url", url)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link WebhookEndpoint} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable WebhookEndpoint instance
   */
  public static ImmutableWebhookEndpoint copyOf(WebhookEndpoint instance) {
    if (instance instanceof ImmutableWebhookEndpoint) {
      return (ImmutableWebhookEndpoint) instance;
    }
    return ImmutableWebhookEndpoint.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableWebhookEndpoint ImmutableWebhookEndpoint}.
   * @return A new ImmutableWebhookEndpoint builder
   */
  public static ImmutableWebhookEndpoint.Builder builder() {
    return new ImmutableWebhookEndpoint.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableWebhookEndpoint ImmutableWebhookEndpoint}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_URL = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String url;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code WebhookEndpoint} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(WebhookEndpoint instance) {
      Preconditions.checkNotNull(instance, "instance");
      url(instance.url());
      return this;
    }

    /**
     * Initializes the value for the {@link WebhookEndpoint#url() url} attribute.
     * @param url The value for url 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder url(String url) {
      this.url = Preconditions.checkNotNull(url, "url");
      initBits &= ~INIT_BIT_URL;
      return this;
    }

    /**
     * Builds a new {@link ImmutableWebhookEndpoint ImmutableWebhookEndpoint}.
     * @return An immutable instance of WebhookEndpoint
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableWebhookEndpoint build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableWebhookEndpoint(url);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_URL) != 0) attributes.add("url");
      return "Cannot build WebhookEndpoint, some of required attributes are not set " + attributes;
    }
  }
}
