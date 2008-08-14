// Generated by the protocol buffer compiler.  DO NOT EDIT!

package slowbcl;

public final class Slowbcl {
  private Slowbcl() {}
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static final com.google.protobuf.Descriptors.FileDescriptor
      descriptor = buildDescriptor();
  private static
      com.google.protobuf.Descriptors.FileDescriptor
      buildDescriptor() {
    java.lang.String descriptorData =
      "\n\rslowbcl.proto\022\007slowbcl\"\255\001\n\010TimeSpan\022\r\n" +
      "\005value\030\001 \001(\022\0224\n\005scale\030\002 \001(\0162\037.slowbcl.Ti" +
      "meSpan.TimeSpanScale:\004DAYS\"\\\n\rTimeSpanSc" +
      "ale\022\010\n\004DAYS\020\000\022\t\n\005HOURS\020\001\022\013\n\007MINUTES\020\002\022\013\n" +
      "\007SECONDS\020\003\022\020\n\014MILLISECONDS\020\004\022\n\n\006MINMAX\020\017" +
      "\"\255\001\n\010DateTime\022\r\n\005value\030\001 \001(\022\0224\n\005scale\030\002 " +
      "\001(\0162\037.slowbcl.DateTime.TimeSpanScale:\004DA" +
      "YS\"\\\n\rTimeSpanScale\022\010\n\004DAYS\020\000\022\t\n\005HOURS\020\001" +
      "\022\013\n\007MINUTES\020\002\022\013\n\007SECONDS\020\003\022\020\n\014MILLISECON" +
      "DS\020\004\022\n\n\006MINMAX\020\017\"\036\n\004Guid\022\n\n\002lo\030\001 \001(\006\022\n\n\002" +
      "hi\030\002 \001(\006\"4\n\007Decimal\022\n\n\002lo\030\001 \001(\004\022\n\n\002hi\030\002 " +
      "\001(\r\022\021\n\tsignScale\030\003 \001(\rB4\302>\036Google.Protoc" +
      "olBuffers.SlowBcl\312>\020SlowBclProtoFile";
    try {
      return com.google.protobuf.Descriptors.FileDescriptor
        .internalBuildGeneratedFileFrom(descriptorData,
          new com.google.protobuf.Descriptors.FileDescriptor[] {
          });
    } catch (Exception e) {
      throw new RuntimeException(
        "Failed to parse protocol buffer descriptor for " +
        "\"slowbcl.proto\".", e);
    }
  }
  
  public static final class TimeSpan extends
      com.google.protobuf.GeneratedMessage {
    // Use TimeSpan.newBuilder() to construct.
    private TimeSpan() {}
    
    private static final TimeSpan defaultInstance = new TimeSpan();
    public static TimeSpan getDefaultInstance() {
      return defaultInstance;
    }
    
    public TimeSpan getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return slowbcl.Slowbcl.internal_static_slowbcl_TimeSpan_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return slowbcl.Slowbcl.internal_static_slowbcl_TimeSpan_fieldAccessorTable;
    }
    
    public static enum TimeSpanScale {
      DAYS(0, 0),
      HOURS(1, 1),
      MINUTES(2, 2),
      SECONDS(3, 3),
      MILLISECONDS(4, 4),
      MINMAX(5, 15),
      ;
      
      
      public final int getNumber() { return value; }
      
      public static TimeSpanScale valueOf(int value) {
        switch (value) {
          case 0: return DAYS;
          case 1: return HOURS;
          case 2: return MINUTES;
          case 3: return SECONDS;
          case 4: return MILLISECONDS;
          case 15: return MINMAX;
          default: return null;
        }
      }
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return slowbcl.Slowbcl.TimeSpan.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final TimeSpanScale[] VALUES = {
        DAYS, HOURS, MINUTES, SECONDS, MILLISECONDS, MINMAX, 
      };
      public static TimeSpanScale valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      private final int index;
      private final int value;
      private TimeSpanScale(int index, int value) {
        this.index = index;
        this.value = value;
      }
    }
    
    // optional sint64 value = 1;
    private boolean hasValue;
    private long value_ = 0L;
    public boolean hasValue() { return hasValue; }
    public long getValue() { return value_; }
    
    // optional .slowbcl.TimeSpan.TimeSpanScale scale = 2 [default = DAYS];
    private boolean hasScale;
    private slowbcl.Slowbcl.TimeSpan.TimeSpanScale scale_ = slowbcl.Slowbcl.TimeSpan.TimeSpanScale.DAYS;
    public boolean hasScale() { return hasScale; }
    public slowbcl.Slowbcl.TimeSpan.TimeSpanScale getScale() { return scale_; }
    
    public static slowbcl.Slowbcl.TimeSpan parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static slowbcl.Slowbcl.TimeSpan parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.TimeSpan parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static slowbcl.Slowbcl.TimeSpan parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.TimeSpan parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static slowbcl.Slowbcl.TimeSpan parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.TimeSpan parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static slowbcl.Slowbcl.TimeSpan parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return new Builder(); }
    public Builder newBuilderForType() { return new Builder(); }
    public static Builder newBuilder(slowbcl.Slowbcl.TimeSpan prototype) {
      return new Builder().mergeFrom(prototype);
    }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      // Construct using slowbcl.Slowbcl.TimeSpan.newBuilder()
      private Builder() {}
      
      slowbcl.Slowbcl.TimeSpan result = new slowbcl.Slowbcl.TimeSpan();
      
      protected slowbcl.Slowbcl.TimeSpan internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        result = new slowbcl.Slowbcl.TimeSpan();
        return this;
      }
      
      public Builder clone() {
        return new Builder().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return slowbcl.Slowbcl.TimeSpan.getDescriptor();
      }
      
      public slowbcl.Slowbcl.TimeSpan getDefaultInstanceForType() {
        return slowbcl.Slowbcl.TimeSpan.getDefaultInstance();
      }
      
      public slowbcl.Slowbcl.TimeSpan build() {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result);
        }
        return buildPartial();
      }
      
      private slowbcl.Slowbcl.TimeSpan buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public slowbcl.Slowbcl.TimeSpan buildPartial() {
        slowbcl.Slowbcl.TimeSpan returnMe = result;
        result = null;
        return returnMe;
      }
      
      
      // optional sint64 value = 1;
      public boolean hasValue() {
        return result.hasValue();
      }
      public long getValue() {
        return result.getValue();
      }
      public Builder setValue(long value) {
        result.hasValue = true;
        result.value_ = value;
        return this;
      }
      public Builder clearValue() {
        result.hasValue = false;
        result.value_ = 0L;
        return this;
      }
      
      // optional .slowbcl.TimeSpan.TimeSpanScale scale = 2 [default = DAYS];
      public boolean hasScale() {
        return result.hasScale();
      }
      public slowbcl.Slowbcl.TimeSpan.TimeSpanScale getScale() {
        return result.getScale();
      }
      public Builder setScale(slowbcl.Slowbcl.TimeSpan.TimeSpanScale value) {
        result.hasScale = true;
        result.scale_ = value;
        return this;
      }
      public Builder clearScale() {
        result.hasScale = false;
        result.scale_ = slowbcl.Slowbcl.TimeSpan.TimeSpanScale.DAYS;
        return this;
      }
    }
  }
  
  public static final class DateTime extends
      com.google.protobuf.GeneratedMessage {
    // Use DateTime.newBuilder() to construct.
    private DateTime() {}
    
    private static final DateTime defaultInstance = new DateTime();
    public static DateTime getDefaultInstance() {
      return defaultInstance;
    }
    
    public DateTime getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return slowbcl.Slowbcl.internal_static_slowbcl_DateTime_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return slowbcl.Slowbcl.internal_static_slowbcl_DateTime_fieldAccessorTable;
    }
    
    public static enum TimeSpanScale {
      DAYS(0, 0),
      HOURS(1, 1),
      MINUTES(2, 2),
      SECONDS(3, 3),
      MILLISECONDS(4, 4),
      MINMAX(5, 15),
      ;
      
      
      public final int getNumber() { return value; }
      
      public static TimeSpanScale valueOf(int value) {
        switch (value) {
          case 0: return DAYS;
          case 1: return HOURS;
          case 2: return MINUTES;
          case 3: return SECONDS;
          case 4: return MILLISECONDS;
          case 15: return MINMAX;
          default: return null;
        }
      }
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return slowbcl.Slowbcl.DateTime.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final TimeSpanScale[] VALUES = {
        DAYS, HOURS, MINUTES, SECONDS, MILLISECONDS, MINMAX, 
      };
      public static TimeSpanScale valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      private final int index;
      private final int value;
      private TimeSpanScale(int index, int value) {
        this.index = index;
        this.value = value;
      }
    }
    
    // optional sint64 value = 1;
    private boolean hasValue;
    private long value_ = 0L;
    public boolean hasValue() { return hasValue; }
    public long getValue() { return value_; }
    
    // optional .slowbcl.DateTime.TimeSpanScale scale = 2 [default = DAYS];
    private boolean hasScale;
    private slowbcl.Slowbcl.DateTime.TimeSpanScale scale_ = slowbcl.Slowbcl.DateTime.TimeSpanScale.DAYS;
    public boolean hasScale() { return hasScale; }
    public slowbcl.Slowbcl.DateTime.TimeSpanScale getScale() { return scale_; }
    
    public static slowbcl.Slowbcl.DateTime parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static slowbcl.Slowbcl.DateTime parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.DateTime parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static slowbcl.Slowbcl.DateTime parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.DateTime parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static slowbcl.Slowbcl.DateTime parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.DateTime parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static slowbcl.Slowbcl.DateTime parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return new Builder(); }
    public Builder newBuilderForType() { return new Builder(); }
    public static Builder newBuilder(slowbcl.Slowbcl.DateTime prototype) {
      return new Builder().mergeFrom(prototype);
    }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      // Construct using slowbcl.Slowbcl.DateTime.newBuilder()
      private Builder() {}
      
      slowbcl.Slowbcl.DateTime result = new slowbcl.Slowbcl.DateTime();
      
      protected slowbcl.Slowbcl.DateTime internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        result = new slowbcl.Slowbcl.DateTime();
        return this;
      }
      
      public Builder clone() {
        return new Builder().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return slowbcl.Slowbcl.DateTime.getDescriptor();
      }
      
      public slowbcl.Slowbcl.DateTime getDefaultInstanceForType() {
        return slowbcl.Slowbcl.DateTime.getDefaultInstance();
      }
      
      public slowbcl.Slowbcl.DateTime build() {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result);
        }
        return buildPartial();
      }
      
      private slowbcl.Slowbcl.DateTime buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public slowbcl.Slowbcl.DateTime buildPartial() {
        slowbcl.Slowbcl.DateTime returnMe = result;
        result = null;
        return returnMe;
      }
      
      
      // optional sint64 value = 1;
      public boolean hasValue() {
        return result.hasValue();
      }
      public long getValue() {
        return result.getValue();
      }
      public Builder setValue(long value) {
        result.hasValue = true;
        result.value_ = value;
        return this;
      }
      public Builder clearValue() {
        result.hasValue = false;
        result.value_ = 0L;
        return this;
      }
      
      // optional .slowbcl.DateTime.TimeSpanScale scale = 2 [default = DAYS];
      public boolean hasScale() {
        return result.hasScale();
      }
      public slowbcl.Slowbcl.DateTime.TimeSpanScale getScale() {
        return result.getScale();
      }
      public Builder setScale(slowbcl.Slowbcl.DateTime.TimeSpanScale value) {
        result.hasScale = true;
        result.scale_ = value;
        return this;
      }
      public Builder clearScale() {
        result.hasScale = false;
        result.scale_ = slowbcl.Slowbcl.DateTime.TimeSpanScale.DAYS;
        return this;
      }
    }
  }
  
  public static final class Guid extends
      com.google.protobuf.GeneratedMessage {
    // Use Guid.newBuilder() to construct.
    private Guid() {}
    
    private static final Guid defaultInstance = new Guid();
    public static Guid getDefaultInstance() {
      return defaultInstance;
    }
    
    public Guid getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return slowbcl.Slowbcl.internal_static_slowbcl_Guid_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return slowbcl.Slowbcl.internal_static_slowbcl_Guid_fieldAccessorTable;
    }
    
    // optional fixed64 lo = 1;
    private boolean hasLo;
    private long lo_ = 0L;
    public boolean hasLo() { return hasLo; }
    public long getLo() { return lo_; }
    
    // optional fixed64 hi = 2;
    private boolean hasHi;
    private long hi_ = 0L;
    public boolean hasHi() { return hasHi; }
    public long getHi() { return hi_; }
    
    public static slowbcl.Slowbcl.Guid parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static slowbcl.Slowbcl.Guid parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.Guid parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static slowbcl.Slowbcl.Guid parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.Guid parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static slowbcl.Slowbcl.Guid parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.Guid parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static slowbcl.Slowbcl.Guid parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return new Builder(); }
    public Builder newBuilderForType() { return new Builder(); }
    public static Builder newBuilder(slowbcl.Slowbcl.Guid prototype) {
      return new Builder().mergeFrom(prototype);
    }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      // Construct using slowbcl.Slowbcl.Guid.newBuilder()
      private Builder() {}
      
      slowbcl.Slowbcl.Guid result = new slowbcl.Slowbcl.Guid();
      
      protected slowbcl.Slowbcl.Guid internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        result = new slowbcl.Slowbcl.Guid();
        return this;
      }
      
      public Builder clone() {
        return new Builder().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return slowbcl.Slowbcl.Guid.getDescriptor();
      }
      
      public slowbcl.Slowbcl.Guid getDefaultInstanceForType() {
        return slowbcl.Slowbcl.Guid.getDefaultInstance();
      }
      
      public slowbcl.Slowbcl.Guid build() {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result);
        }
        return buildPartial();
      }
      
      private slowbcl.Slowbcl.Guid buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public slowbcl.Slowbcl.Guid buildPartial() {
        slowbcl.Slowbcl.Guid returnMe = result;
        result = null;
        return returnMe;
      }
      
      
      // optional fixed64 lo = 1;
      public boolean hasLo() {
        return result.hasLo();
      }
      public long getLo() {
        return result.getLo();
      }
      public Builder setLo(long value) {
        result.hasLo = true;
        result.lo_ = value;
        return this;
      }
      public Builder clearLo() {
        result.hasLo = false;
        result.lo_ = 0L;
        return this;
      }
      
      // optional fixed64 hi = 2;
      public boolean hasHi() {
        return result.hasHi();
      }
      public long getHi() {
        return result.getHi();
      }
      public Builder setHi(long value) {
        result.hasHi = true;
        result.hi_ = value;
        return this;
      }
      public Builder clearHi() {
        result.hasHi = false;
        result.hi_ = 0L;
        return this;
      }
    }
  }
  
  public static final class Decimal extends
      com.google.protobuf.GeneratedMessage {
    // Use Decimal.newBuilder() to construct.
    private Decimal() {}
    
    private static final Decimal defaultInstance = new Decimal();
    public static Decimal getDefaultInstance() {
      return defaultInstance;
    }
    
    public Decimal getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return slowbcl.Slowbcl.internal_static_slowbcl_Decimal_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return slowbcl.Slowbcl.internal_static_slowbcl_Decimal_fieldAccessorTable;
    }
    
    // optional uint64 lo = 1;
    private boolean hasLo;
    private long lo_ = 0L;
    public boolean hasLo() { return hasLo; }
    public long getLo() { return lo_; }
    
    // optional uint32 hi = 2;
    private boolean hasHi;
    private int hi_ = 0;
    public boolean hasHi() { return hasHi; }
    public int getHi() { return hi_; }
    
    // optional uint32 signScale = 3;
    private boolean hasSignScale;
    private int signScale_ = 0;
    public boolean hasSignScale() { return hasSignScale; }
    public int getSignScale() { return signScale_; }
    
    public static slowbcl.Slowbcl.Decimal parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static slowbcl.Slowbcl.Decimal parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.Decimal parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static slowbcl.Slowbcl.Decimal parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.Decimal parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static slowbcl.Slowbcl.Decimal parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static slowbcl.Slowbcl.Decimal parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static slowbcl.Slowbcl.Decimal parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistry extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return new Builder(); }
    public Builder newBuilderForType() { return new Builder(); }
    public static Builder newBuilder(slowbcl.Slowbcl.Decimal prototype) {
      return new Builder().mergeFrom(prototype);
    }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      // Construct using slowbcl.Slowbcl.Decimal.newBuilder()
      private Builder() {}
      
      slowbcl.Slowbcl.Decimal result = new slowbcl.Slowbcl.Decimal();
      
      protected slowbcl.Slowbcl.Decimal internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        result = new slowbcl.Slowbcl.Decimal();
        return this;
      }
      
      public Builder clone() {
        return new Builder().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return slowbcl.Slowbcl.Decimal.getDescriptor();
      }
      
      public slowbcl.Slowbcl.Decimal getDefaultInstanceForType() {
        return slowbcl.Slowbcl.Decimal.getDefaultInstance();
      }
      
      public slowbcl.Slowbcl.Decimal build() {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result);
        }
        return buildPartial();
      }
      
      private slowbcl.Slowbcl.Decimal buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw new com.google.protobuf.UninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public slowbcl.Slowbcl.Decimal buildPartial() {
        slowbcl.Slowbcl.Decimal returnMe = result;
        result = null;
        return returnMe;
      }
      
      
      // optional uint64 lo = 1;
      public boolean hasLo() {
        return result.hasLo();
      }
      public long getLo() {
        return result.getLo();
      }
      public Builder setLo(long value) {
        result.hasLo = true;
        result.lo_ = value;
        return this;
      }
      public Builder clearLo() {
        result.hasLo = false;
        result.lo_ = 0L;
        return this;
      }
      
      // optional uint32 hi = 2;
      public boolean hasHi() {
        return result.hasHi();
      }
      public int getHi() {
        return result.getHi();
      }
      public Builder setHi(int value) {
        result.hasHi = true;
        result.hi_ = value;
        return this;
      }
      public Builder clearHi() {
        result.hasHi = false;
        result.hi_ = 0;
        return this;
      }
      
      // optional uint32 signScale = 3;
      public boolean hasSignScale() {
        return result.hasSignScale();
      }
      public int getSignScale() {
        return result.getSignScale();
      }
      public Builder setSignScale(int value) {
        result.hasSignScale = true;
        result.signScale_ = value;
        return this;
      }
      public Builder clearSignScale() {
        result.hasSignScale = false;
        result.signScale_ = 0;
        return this;
      }
    }
  }
  
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_slowbcl_TimeSpan_descriptor =
      getDescriptor().getMessageTypes().get(0);
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_slowbcl_TimeSpan_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
          internal_static_slowbcl_TimeSpan_descriptor,
          new java.lang.String[] { "Value", "Scale", },
          slowbcl.Slowbcl.TimeSpan.class,
          slowbcl.Slowbcl.TimeSpan.Builder.class);
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_slowbcl_DateTime_descriptor =
      getDescriptor().getMessageTypes().get(1);
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_slowbcl_DateTime_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
          internal_static_slowbcl_DateTime_descriptor,
          new java.lang.String[] { "Value", "Scale", },
          slowbcl.Slowbcl.DateTime.class,
          slowbcl.Slowbcl.DateTime.Builder.class);
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_slowbcl_Guid_descriptor =
      getDescriptor().getMessageTypes().get(2);
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_slowbcl_Guid_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
          internal_static_slowbcl_Guid_descriptor,
          new java.lang.String[] { "Lo", "Hi", },
          slowbcl.Slowbcl.Guid.class,
          slowbcl.Slowbcl.Guid.Builder.class);
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_slowbcl_Decimal_descriptor =
      getDescriptor().getMessageTypes().get(3);
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_slowbcl_Decimal_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessage.FieldAccessorTable(
          internal_static_slowbcl_Decimal_descriptor,
          new java.lang.String[] { "Lo", "Hi", "SignScale", },
          slowbcl.Slowbcl.Decimal.class,
          slowbcl.Slowbcl.Decimal.Builder.class);
}