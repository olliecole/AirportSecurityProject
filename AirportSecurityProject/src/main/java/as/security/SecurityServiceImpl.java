// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security.proto

package as.security;

public final class SecurityServiceImpl {
  private SecurityServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_security_RequestDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_security_RequestDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_security_ResponseDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_security_ResponseDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_security_RequestClearance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_security_RequestClearance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_security_ResponseClearance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_security_ResponseClearance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_security_RequestBoarding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_security_RequestBoarding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_security_ResponseBoarding_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_security_ResponseBoarding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_security_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_security_Empty_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016security.proto\022\010security\"C\n\016RequestDet" +
      "ails\022\014\n\004name\030\001 \001(\t\022\017\n\007message\030\002 \001(\t\022\022\n\np" +
      "assportNo\030\003 \001(\005\"*\n\017ResponseDetails\022\027\n\017re" +
      "sponseMessage\030\001 \001(\t\"4\n\020RequestClearance\022" +
      "\014\n\004name\030\001 \001(\t\022\022\n\npassportNo\030\002 \001(\005\"$\n\021Res" +
      "ponseClearance\022\017\n\007message\030\001 \001(\t\"#\n\017Reque" +
      "stBoarding\022\020\n\010flightId\030\001 \001(\t\"#\n\020Response" +
      "Boarding\022\017\n\007message\030\001 \001(\t\"\007\n\005Empty2\372\001\n\017S" +
      "ecurityService\022L\n\017passportDetails\022\030.secu" +
      "rity.RequestDetails\032\031.security.ResponseD" +
      "etails\"\000(\0010\001\022M\n\020clearanceDetails\022\032.secur" +
      "ity.RequestClearance\032\033.security.Response" +
      "Clearance(\001\022J\n\017boardingDetails\022\031.securit" +
      "y.RequestBoarding\032\032.security.ResponseBoa" +
      "rding0\001B$\n\013as.securityB\023SecurityServiceI" +
      "mplP\001b\006proto3"
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
    internal_static_security_RequestDetails_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_security_RequestDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_security_RequestDetails_descriptor,
        new java.lang.String[] { "Name", "Message", "PassportNo", });
    internal_static_security_ResponseDetails_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_security_ResponseDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_security_ResponseDetails_descriptor,
        new java.lang.String[] { "ResponseMessage", });
    internal_static_security_RequestClearance_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_security_RequestClearance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_security_RequestClearance_descriptor,
        new java.lang.String[] { "Name", "PassportNo", });
    internal_static_security_ResponseClearance_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_security_ResponseClearance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_security_ResponseClearance_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_security_RequestBoarding_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_security_RequestBoarding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_security_RequestBoarding_descriptor,
        new java.lang.String[] { "FlightId", });
    internal_static_security_ResponseBoarding_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_security_ResponseBoarding_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_security_ResponseBoarding_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_security_Empty_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_security_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_security_Empty_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
