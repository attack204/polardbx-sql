// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DumperServer.proto

package com.alibaba.polardbx.rpc.cdc;

/**
 * Protobuf type {@code dumper.DumpStream}
 */
public final class DumpStream extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dumper.DumpStream)
    DumpStreamOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DumpStream.newBuilder() to construct.
  private DumpStream(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DumpStream() {
    payload_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DumpStream();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DumpStream(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {

            payload_ = input.readBytes();
            break;
          }
          case 16: {

            isHeartBeat_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.alibaba.polardbx.rpc.cdc.DumperServer.internal_static_dumper_DumpStream_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.polardbx.rpc.cdc.DumperServer.internal_static_dumper_DumpStream_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.polardbx.rpc.cdc.DumpStream.class, com.alibaba.polardbx.rpc.cdc.DumpStream.Builder.class);
  }

  public static final int PAYLOAD_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString payload_;
  /**
   * <code>bytes payload = 1;</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
  }

  public static final int ISHEARTBEAT_FIELD_NUMBER = 2;
  private boolean isHeartBeat_;
  /**
   * <code>bool isHeartBeat = 2;</code>
   * @return The isHeartBeat.
   */
  @java.lang.Override
  public boolean getIsHeartBeat() {
    return isHeartBeat_;
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
    if (!payload_.isEmpty()) {
      output.writeBytes(1, payload_);
    }
    if (isHeartBeat_ != false) {
      output.writeBool(2, isHeartBeat_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, payload_);
    }
    if (isHeartBeat_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isHeartBeat_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.alibaba.polardbx.rpc.cdc.DumpStream)) {
      return super.equals(obj);
    }
    com.alibaba.polardbx.rpc.cdc.DumpStream other = (com.alibaba.polardbx.rpc.cdc.DumpStream) obj;

    if (!getPayload()
        .equals(other.getPayload())) return false;
    if (getIsHeartBeat()
        != other.getIsHeartBeat()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (37 * hash) + ISHEARTBEAT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsHeartBeat());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.polardbx.rpc.cdc.DumpStream parseFrom(
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
  public static Builder newBuilder(com.alibaba.polardbx.rpc.cdc.DumpStream prototype) {
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
   * Protobuf type {@code dumper.DumpStream}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dumper.DumpStream)
      com.alibaba.polardbx.rpc.cdc.DumpStreamOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.polardbx.rpc.cdc.DumperServer.internal_static_dumper_DumpStream_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.polardbx.rpc.cdc.DumperServer.internal_static_dumper_DumpStream_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.polardbx.rpc.cdc.DumpStream.class, com.alibaba.polardbx.rpc.cdc.DumpStream.Builder.class);
    }

    // Construct using com.alibaba.polardbx.rpc.cdc.DumpStream.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      payload_ = com.google.protobuf.ByteString.EMPTY;

      isHeartBeat_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.polardbx.rpc.cdc.DumperServer.internal_static_dumper_DumpStream_descriptor;
    }

    @java.lang.Override
    public com.alibaba.polardbx.rpc.cdc.DumpStream getDefaultInstanceForType() {
      return com.alibaba.polardbx.rpc.cdc.DumpStream.getDefaultInstance();
    }

    @java.lang.Override
    public com.alibaba.polardbx.rpc.cdc.DumpStream build() {
      com.alibaba.polardbx.rpc.cdc.DumpStream result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.alibaba.polardbx.rpc.cdc.DumpStream buildPartial() {
      com.alibaba.polardbx.rpc.cdc.DumpStream result = new com.alibaba.polardbx.rpc.cdc.DumpStream(this);
      result.payload_ = payload_;
      result.isHeartBeat_ = isHeartBeat_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.alibaba.polardbx.rpc.cdc.DumpStream) {
        return mergeFrom((com.alibaba.polardbx.rpc.cdc.DumpStream)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.polardbx.rpc.cdc.DumpStream other) {
      if (other == com.alibaba.polardbx.rpc.cdc.DumpStream.getDefaultInstance()) return this;
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
      }
      if (other.getIsHeartBeat() != false) {
        setIsHeartBeat(other.getIsHeartBeat());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.alibaba.polardbx.rpc.cdc.DumpStream parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.polardbx.rpc.cdc.DumpStream) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 1;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>bytes payload = 1;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }

    private boolean isHeartBeat_ ;
    /**
     * <code>bool isHeartBeat = 2;</code>
     * @return The isHeartBeat.
     */
    @java.lang.Override
    public boolean getIsHeartBeat() {
      return isHeartBeat_;
    }
    /**
     * <code>bool isHeartBeat = 2;</code>
     * @param value The isHeartBeat to set.
     * @return This builder for chaining.
     */
    public Builder setIsHeartBeat(boolean value) {
      
      isHeartBeat_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isHeartBeat = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsHeartBeat() {
      
      isHeartBeat_ = false;
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


    // @@protoc_insertion_point(builder_scope:dumper.DumpStream)
  }

  // @@protoc_insertion_point(class_scope:dumper.DumpStream)
  private static final com.alibaba.polardbx.rpc.cdc.DumpStream DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.polardbx.rpc.cdc.DumpStream();
  }

  public static com.alibaba.polardbx.rpc.cdc.DumpStream getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DumpStream>
      PARSER = new com.google.protobuf.AbstractParser<DumpStream>() {
    @java.lang.Override
    public DumpStream parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DumpStream(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DumpStream> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DumpStream> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.alibaba.polardbx.rpc.cdc.DumpStream getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

