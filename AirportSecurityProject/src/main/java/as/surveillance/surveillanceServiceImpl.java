// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: surveillance.proto

package as.surveillance;

public final class surveillanceServiceImpl {
  private surveillanceServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_surveillance_accessRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_surveillance_accessRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_surveillance_accessResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_surveillance_accessResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_surveillance_cameraRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_surveillance_cameraRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_surveillance_cameraResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_surveillance_cameraResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_surveillance_fireRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_surveillance_fireRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_surveillance_fireResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_surveillance_fireResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_surveillance_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_surveillance_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022surveillance.proto\022\014surveillance\"\035\n\rac" +
      "cessRequest\022\014\n\004code\030\001 \001(\005\"!\n\016accessRespo" +
      "nse\022\017\n\007message\030\001 \001(\t\" \n\rcameraRequest\022\017\n" +
      "\007message\030\001 \001(\t\"!\n\016cameraResponse\022\017\n\007mess" +
      "age\030\001 \001(\t\"\036\n\013fireRequest\022\017\n\007message\030\001 \001(" +
      "\t\"\037\n\014fireResponse\022\017\n\007message\030\001 \001(\t\"\007\n\005Em" +
      "pty2\344\001\n\023surveillanceService\022E\n\006access\022\033." +
      "surveillance.accessRequest\032\034.surveillanc" +
      "e.accessResponse\"\000\022E\n\006camera\022\033.surveilla" +
      "nce.cameraRequest\032\034.surveillance.cameraR" +
      "esponse\"\000\022?\n\004fire\022\031.surveillance.fireReq" +
      "uest\032\032.surveillance.fireResponse\"\000B,\n\017as" +
      ".surveillanceB\027surveillanceServiceImplP\001" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_surveillance_accessRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_surveillance_accessRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_surveillance_accessRequest_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_surveillance_accessResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_surveillance_accessResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_surveillance_accessResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_surveillance_cameraRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_surveillance_cameraRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_surveillance_cameraRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_surveillance_cameraResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_surveillance_cameraResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_surveillance_cameraResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_surveillance_fireRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_surveillance_fireRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_surveillance_fireRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_surveillance_fireResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_surveillance_fireResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_surveillance_fireResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_surveillance_Empty_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_surveillance_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_surveillance_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}