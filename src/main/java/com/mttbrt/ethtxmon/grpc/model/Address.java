// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethtx.proto

package com.mttbrt.ethtxmon.grpc.model;

/**
 * Protobuf type {@code Address}
 */
public final class Address extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Address)
    AddressOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Address.newBuilder() to construct.
  private Address(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Address() {
    hash_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Address();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.mttbrt.ethtxmon.grpc.model.Ethtx.internal_static_Address_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mttbrt.ethtxmon.grpc.model.Ethtx.internal_static_Address_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mttbrt.ethtxmon.grpc.model.Address.class, com.mttbrt.ethtxmon.grpc.model.Address.Builder.class);
  }

  public static final int HASH_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes hash = 1;</code>
   * @return The hash.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHash() {
    return hash_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!hash_.isEmpty()) {
      output.writeBytes(1, hash_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!hash_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, hash_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.mttbrt.ethtxmon.grpc.model.Address)) {
      return super.equals(obj);
    }
    com.mttbrt.ethtxmon.grpc.model.Address other = (com.mttbrt.ethtxmon.grpc.model.Address) obj;

    if (!getHash()
        .equals(other.getHash())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + getHash().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mttbrt.ethtxmon.grpc.model.Address parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mttbrt.ethtxmon.grpc.model.Address parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mttbrt.ethtxmon.grpc.model.Address parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mttbrt.ethtxmon.grpc.model.Address parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mttbrt.ethtxmon.grpc.model.Address parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mttbrt.ethtxmon.grpc.model.Address parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mttbrt.ethtxmon.grpc.model.Address parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mttbrt.ethtxmon.grpc.model.Address parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.mttbrt.ethtxmon.grpc.model.Address parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.mttbrt.ethtxmon.grpc.model.Address parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mttbrt.ethtxmon.grpc.model.Address parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mttbrt.ethtxmon.grpc.model.Address parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.mttbrt.ethtxmon.grpc.model.Address prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Address}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Address)
      com.mttbrt.ethtxmon.grpc.model.AddressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mttbrt.ethtxmon.grpc.model.Ethtx.internal_static_Address_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mttbrt.ethtxmon.grpc.model.Ethtx.internal_static_Address_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mttbrt.ethtxmon.grpc.model.Address.class, com.mttbrt.ethtxmon.grpc.model.Address.Builder.class);
    }

    // Construct using com.mttbrt.ethtxmon.grpc.model.Address.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hash_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mttbrt.ethtxmon.grpc.model.Ethtx.internal_static_Address_descriptor;
    }

    @java.lang.Override
    public com.mttbrt.ethtxmon.grpc.model.Address getDefaultInstanceForType() {
      return com.mttbrt.ethtxmon.grpc.model.Address.getDefaultInstance();
    }

    @java.lang.Override
    public com.mttbrt.ethtxmon.grpc.model.Address build() {
      com.mttbrt.ethtxmon.grpc.model.Address result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mttbrt.ethtxmon.grpc.model.Address buildPartial() {
      com.mttbrt.ethtxmon.grpc.model.Address result = new com.mttbrt.ethtxmon.grpc.model.Address(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.mttbrt.ethtxmon.grpc.model.Address result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hash_ = hash_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.mttbrt.ethtxmon.grpc.model.Address) {
        return mergeFrom((com.mttbrt.ethtxmon.grpc.model.Address)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mttbrt.ethtxmon.grpc.model.Address other) {
      if (other == com.mttbrt.ethtxmon.grpc.model.Address.getDefaultInstance()) return this;
      if (other.getHash() != com.google.protobuf.ByteString.EMPTY) {
        setHash(other.getHash());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              hash_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString hash_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes hash = 1;</code>
     * @return The hash.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getHash() {
      return hash_;
    }
    /**
     * <code>bytes hash = 1;</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      hash_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes hash = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hash_ = getDefaultInstance().getHash();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Address)
  }

  // @@protoc_insertion_point(class_scope:Address)
  private static final com.mttbrt.ethtxmon.grpc.model.Address DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mttbrt.ethtxmon.grpc.model.Address();
  }

  public static com.mttbrt.ethtxmon.grpc.model.Address getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Address>
      PARSER = new com.google.protobuf.AbstractParser<Address>() {
    @java.lang.Override
    public Address parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Address> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Address> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mttbrt.ethtxmon.grpc.model.Address getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

