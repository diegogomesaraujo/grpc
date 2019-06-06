// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: people.proto

package com.github.diegogomesaraujo.people.grpc;

/**
 * Protobuf type {@code com.github.diegogomesaraujo.people.grpc.Phone}
 */
public  final class Phone extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.diegogomesaraujo.people.grpc.Phone)
    PhoneOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Phone.newBuilder() to construct.
  private Phone(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Phone() {
    type_ = 0;
    number_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Phone(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            number_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.github.diegogomesaraujo.people.grpc.People.internal_static_com_github_diegogomesaraujo_people_grpc_Phone_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.diegogomesaraujo.people.grpc.People.internal_static_com_github_diegogomesaraujo_people_grpc_Phone_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.diegogomesaraujo.people.grpc.Phone.class, com.github.diegogomesaraujo.people.grpc.Phone.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.com.github.diegogomesaraujo.people.grpc.PhoneType type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.com.github.diegogomesaraujo.people.grpc.PhoneType type = 1;</code>
   */
  public com.github.diegogomesaraujo.people.grpc.PhoneType getType() {
    @SuppressWarnings("deprecation")
    com.github.diegogomesaraujo.people.grpc.PhoneType result = com.github.diegogomesaraujo.people.grpc.PhoneType.valueOf(type_);
    return result == null ? com.github.diegogomesaraujo.people.grpc.PhoneType.UNRECOGNIZED : result;
  }

  public static final int NUMBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object number_;
  /**
   * <code>string number = 2;</code>
   */
  public java.lang.String getNumber() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      number_ = s;
      return s;
    }
  }
  /**
   * <code>string number = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNumberBytes() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      number_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (type_ != com.github.diegogomesaraujo.people.grpc.PhoneType.MOBILE.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!getNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, number_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.github.diegogomesaraujo.people.grpc.PhoneType.MOBILE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (!getNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, number_);
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
    if (!(obj instanceof com.github.diegogomesaraujo.people.grpc.Phone)) {
      return super.equals(obj);
    }
    com.github.diegogomesaraujo.people.grpc.Phone other = (com.github.diegogomesaraujo.people.grpc.Phone) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && getNumber()
        .equals(other.getNumber());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.diegogomesaraujo.people.grpc.Phone parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.diegogomesaraujo.people.grpc.Phone parseFrom(
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
  public static Builder newBuilder(com.github.diegogomesaraujo.people.grpc.Phone prototype) {
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
   * Protobuf type {@code com.github.diegogomesaraujo.people.grpc.Phone}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.diegogomesaraujo.people.grpc.Phone)
      com.github.diegogomesaraujo.people.grpc.PhoneOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.diegogomesaraujo.people.grpc.People.internal_static_com_github_diegogomesaraujo_people_grpc_Phone_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.diegogomesaraujo.people.grpc.People.internal_static_com_github_diegogomesaraujo_people_grpc_Phone_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.diegogomesaraujo.people.grpc.Phone.class, com.github.diegogomesaraujo.people.grpc.Phone.Builder.class);
    }

    // Construct using com.github.diegogomesaraujo.people.grpc.Phone.newBuilder()
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
      type_ = 0;

      number_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.diegogomesaraujo.people.grpc.People.internal_static_com_github_diegogomesaraujo_people_grpc_Phone_descriptor;
    }

    @java.lang.Override
    public com.github.diegogomesaraujo.people.grpc.Phone getDefaultInstanceForType() {
      return com.github.diegogomesaraujo.people.grpc.Phone.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.diegogomesaraujo.people.grpc.Phone build() {
      com.github.diegogomesaraujo.people.grpc.Phone result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.diegogomesaraujo.people.grpc.Phone buildPartial() {
      com.github.diegogomesaraujo.people.grpc.Phone result = new com.github.diegogomesaraujo.people.grpc.Phone(this);
      result.type_ = type_;
      result.number_ = number_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.diegogomesaraujo.people.grpc.Phone) {
        return mergeFrom((com.github.diegogomesaraujo.people.grpc.Phone)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.diegogomesaraujo.people.grpc.Phone other) {
      if (other == com.github.diegogomesaraujo.people.grpc.Phone.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getNumber().isEmpty()) {
        number_ = other.number_;
        onChanged();
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
      com.github.diegogomesaraujo.people.grpc.Phone parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.diegogomesaraujo.people.grpc.Phone) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.com.github.diegogomesaraujo.people.grpc.PhoneType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.com.github.diegogomesaraujo.people.grpc.PhoneType type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.github.diegogomesaraujo.people.grpc.PhoneType type = 1;</code>
     */
    public com.github.diegogomesaraujo.people.grpc.PhoneType getType() {
      @SuppressWarnings("deprecation")
      com.github.diegogomesaraujo.people.grpc.PhoneType result = com.github.diegogomesaraujo.people.grpc.PhoneType.valueOf(type_);
      return result == null ? com.github.diegogomesaraujo.people.grpc.PhoneType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.github.diegogomesaraujo.people.grpc.PhoneType type = 1;</code>
     */
    public Builder setType(com.github.diegogomesaraujo.people.grpc.PhoneType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.github.diegogomesaraujo.people.grpc.PhoneType type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object number_ = "";
    /**
     * <code>string number = 2;</code>
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string number = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string number = 2;</code>
     */
    public Builder setNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string number = 2;</code>
     */
    public Builder clearNumber() {
      
      number_ = getDefaultInstance().getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string number = 2;</code>
     */
    public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      number_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.github.diegogomesaraujo.people.grpc.Phone)
  }

  // @@protoc_insertion_point(class_scope:com.github.diegogomesaraujo.people.grpc.Phone)
  private static final com.github.diegogomesaraujo.people.grpc.Phone DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.diegogomesaraujo.people.grpc.Phone();
  }

  public static com.github.diegogomesaraujo.people.grpc.Phone getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Phone>
      PARSER = new com.google.protobuf.AbstractParser<Phone>() {
    @java.lang.Override
    public Phone parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Phone(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Phone> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Phone> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.diegogomesaraujo.people.grpc.Phone getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
