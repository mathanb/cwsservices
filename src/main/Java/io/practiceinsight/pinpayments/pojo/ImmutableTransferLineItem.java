package io.practiceinsight.pinpayments.pojo;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
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
 * Immutable implementation of {@link TransferLineItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTransferLineItem.builder()}.
 */
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "TransferLineItem"})
@Immutable
public final class ImmutableTransferLineItem implements TransferLineItem {
  private final String type;
  private final @Nullable String object;
  private final Integer amount;

  private ImmutableTransferLineItem(String type, @Nullable String object, Integer amount) {
    this.type = type;
    this.object = object;
    this.amount = amount;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @Override
  public String type() {
    return type;
  }

  /**
   * @return The value of the {@code object} attribute
   */
  @Override
  public @Nullable String object() {
    return object;
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @Override
  public Integer amount() {
    return amount;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferLineItem#type() type} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferLineItem withType(String value) {
    if (this.type.equals(value)) return this;
    String newValue = Preconditions.checkNotNull(value, "type");
    return new ImmutableTransferLineItem(newValue, this.object, this.amount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferLineItem#object() object} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for object (can be {@code null})
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferLineItem withObject(@Nullable String value) {
    if (Objects.equal(this.object, value)) return this;
    return new ImmutableTransferLineItem(this.type, value, this.amount);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TransferLineItem#amount() amount} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTransferLineItem withAmount(Integer value) {
    if (this.amount.equals(value)) return this;
    Integer newValue = Preconditions.checkNotNull(value, "amount");
    return new ImmutableTransferLineItem(this.type, this.object, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTransferLineItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTransferLineItem
        && equalTo((ImmutableTransferLineItem) another);
  }

  private boolean equalTo(ImmutableTransferLineItem another) {
    return type.equals(another.type)
        && Objects.equal(object, another.object)
        && amount.equals(another.amount);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code object}, {@code amount}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(object);
    h += (h << 5) + amount.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code TransferLineItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("TransferLineItem")
        .omitNullValues()
        .add("type", type)
        .add("object", object)
        .add("amount", amount)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link TransferLineItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TransferLineItem instance
   */
  public static ImmutableTransferLineItem copyOf(TransferLineItem instance) {
    if (instance instanceof ImmutableTransferLineItem) {
      return (ImmutableTransferLineItem) instance;
    }
    return ImmutableTransferLineItem.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableTransferLineItem ImmutableTransferLineItem}.
   * @return A new ImmutableTransferLineItem builder
   */
  public static ImmutableTransferLineItem.Builder builder() {
    return new ImmutableTransferLineItem.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableTransferLineItem ImmutableTransferLineItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_AMOUNT = 0x2L;
    private long initBits = 0x3L;

    private @Nullable String type;
    private @Nullable String object;
    private @Nullable Integer amount;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.TransferLineItemBase} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TransferLineItemBase instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    /**
     * Fill a builder with attribute values from the provided {@code io.practiceinsight.pinpayments.pojo.TransferLineItem} instance.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(TransferLineItem instance) {
      Preconditions.checkNotNull(instance, "instance");
      from((Object) instance);
      return this;
    }

    private void from(Object object) {
      if (object instanceof TransferLineItemBase) {
        TransferLineItemBase instance = (TransferLineItemBase) object;
        type(instance.type());
        amount(instance.amount());
        @Nullable String objectValue = instance.object();
        if (objectValue != null) {
          object(objectValue);
        }
      }
    }

    /**
     * Initializes the value for the {@link TransferLineItem#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder type(String type) {
      this.type = Preconditions.checkNotNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferLineItem#object() object} attribute.
     * @param object The value for object (can be {@code null})
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder object(@Nullable String object) {
      this.object = object;
      return this;
    }

    /**
     * Initializes the value for the {@link TransferLineItem#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder amount(Integer amount) {
      this.amount = Preconditions.checkNotNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Builds a new {@link ImmutableTransferLineItem ImmutableTransferLineItem}.
     * @return An immutable instance of TransferLineItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableTransferLineItem build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableTransferLineItem(type, object, amount);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_TYPE) != 0) attributes.add("type");
      if ((initBits & INIT_BIT_AMOUNT) != 0) attributes.add("amount");
      return "Cannot build TransferLineItem, some of required attributes are not set " + attributes;
    }
  }
}
