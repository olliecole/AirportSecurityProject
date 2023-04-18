package as.security;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: security.proto")
public final class SecurityServiceGrpc {

  private SecurityServiceGrpc() {}

  public static final String SERVICE_NAME = "security.SecurityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<as.security.RequestDetails,
      as.security.ResponseDetails> getPassportDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "passportDetails",
      requestType = as.security.RequestDetails.class,
      responseType = as.security.ResponseDetails.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<as.security.RequestDetails,
      as.security.ResponseDetails> getPassportDetailsMethod() {
    io.grpc.MethodDescriptor<as.security.RequestDetails, as.security.ResponseDetails> getPassportDetailsMethod;
    if ((getPassportDetailsMethod = SecurityServiceGrpc.getPassportDetailsMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getPassportDetailsMethod = SecurityServiceGrpc.getPassportDetailsMethod) == null) {
          SecurityServiceGrpc.getPassportDetailsMethod = getPassportDetailsMethod = 
              io.grpc.MethodDescriptor.<as.security.RequestDetails, as.security.ResponseDetails>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "security.SecurityService", "passportDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.security.RequestDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.security.ResponseDetails.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("passportDetails"))
                  .build();
          }
        }
     }
     return getPassportDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<as.security.RequestClearance,
      as.security.ResponseClearance> getClearanceDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clearanceDetails",
      requestType = as.security.RequestClearance.class,
      responseType = as.security.ResponseClearance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<as.security.RequestClearance,
      as.security.ResponseClearance> getClearanceDetailsMethod() {
    io.grpc.MethodDescriptor<as.security.RequestClearance, as.security.ResponseClearance> getClearanceDetailsMethod;
    if ((getClearanceDetailsMethod = SecurityServiceGrpc.getClearanceDetailsMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getClearanceDetailsMethod = SecurityServiceGrpc.getClearanceDetailsMethod) == null) {
          SecurityServiceGrpc.getClearanceDetailsMethod = getClearanceDetailsMethod = 
              io.grpc.MethodDescriptor.<as.security.RequestClearance, as.security.ResponseClearance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "security.SecurityService", "clearanceDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.security.RequestClearance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.security.ResponseClearance.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("clearanceDetails"))
                  .build();
          }
        }
     }
     return getClearanceDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<as.security.RequestBoarding,
      as.security.ResponseBoarding> getBoardingDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "boardingDetails",
      requestType = as.security.RequestBoarding.class,
      responseType = as.security.ResponseBoarding.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<as.security.RequestBoarding,
      as.security.ResponseBoarding> getBoardingDetailsMethod() {
    io.grpc.MethodDescriptor<as.security.RequestBoarding, as.security.ResponseBoarding> getBoardingDetailsMethod;
    if ((getBoardingDetailsMethod = SecurityServiceGrpc.getBoardingDetailsMethod) == null) {
      synchronized (SecurityServiceGrpc.class) {
        if ((getBoardingDetailsMethod = SecurityServiceGrpc.getBoardingDetailsMethod) == null) {
          SecurityServiceGrpc.getBoardingDetailsMethod = getBoardingDetailsMethod = 
              io.grpc.MethodDescriptor.<as.security.RequestBoarding, as.security.ResponseBoarding>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "security.SecurityService", "boardingDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.security.RequestBoarding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.security.ResponseBoarding.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityServiceMethodDescriptorSupplier("boardingDetails"))
                  .build();
          }
        }
     }
     return getBoardingDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityServiceStub newStub(io.grpc.Channel channel) {
    return new SecurityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecurityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecurityServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class SecurityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<as.security.RequestDetails> passportDetails(
        io.grpc.stub.StreamObserver<as.security.ResponseDetails> responseObserver) {
      return asyncUnimplementedStreamingCall(getPassportDetailsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<as.security.RequestClearance> clearanceDetails(
        io.grpc.stub.StreamObserver<as.security.ResponseClearance> responseObserver) {
      return asyncUnimplementedStreamingCall(getClearanceDetailsMethod(), responseObserver);
    }

    /**
     */
    public void boardingDetails(as.security.RequestBoarding request,
        io.grpc.stub.StreamObserver<as.security.ResponseBoarding> responseObserver) {
      asyncUnimplementedUnaryCall(getBoardingDetailsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPassportDetailsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                as.security.RequestDetails,
                as.security.ResponseDetails>(
                  this, METHODID_PASSPORT_DETAILS)))
          .addMethod(
            getClearanceDetailsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                as.security.RequestClearance,
                as.security.ResponseClearance>(
                  this, METHODID_CLEARANCE_DETAILS)))
          .addMethod(
            getBoardingDetailsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                as.security.RequestBoarding,
                as.security.ResponseBoarding>(
                  this, METHODID_BOARDING_DETAILS)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SecurityServiceStub extends io.grpc.stub.AbstractStub<SecurityServiceStub> {
    private SecurityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<as.security.RequestDetails> passportDetails(
        io.grpc.stub.StreamObserver<as.security.ResponseDetails> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getPassportDetailsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<as.security.RequestClearance> clearanceDetails(
        io.grpc.stub.StreamObserver<as.security.ResponseClearance> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getClearanceDetailsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void boardingDetails(as.security.RequestBoarding request,
        io.grpc.stub.StreamObserver<as.security.ResponseBoarding> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getBoardingDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SecurityServiceBlockingStub extends io.grpc.stub.AbstractStub<SecurityServiceBlockingStub> {
    private SecurityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<as.security.ResponseBoarding> boardingDetails(
        as.security.RequestBoarding request) {
      return blockingServerStreamingCall(
          getChannel(), getBoardingDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SecurityServiceFutureStub extends io.grpc.stub.AbstractStub<SecurityServiceFutureStub> {
    private SecurityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_BOARDING_DETAILS = 0;
  private static final int METHODID_PASSPORT_DETAILS = 1;
  private static final int METHODID_CLEARANCE_DETAILS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecurityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecurityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOARDING_DETAILS:
          serviceImpl.boardingDetails((as.security.RequestBoarding) request,
              (io.grpc.stub.StreamObserver<as.security.ResponseBoarding>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PASSPORT_DETAILS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.passportDetails(
              (io.grpc.stub.StreamObserver<as.security.ResponseDetails>) responseObserver);
        case METHODID_CLEARANCE_DETAILS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clearanceDetails(
              (io.grpc.stub.StreamObserver<as.security.ResponseClearance>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecurityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return as.security.SecurityServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecurityService");
    }
  }

  private static final class SecurityServiceFileDescriptorSupplier
      extends SecurityServiceBaseDescriptorSupplier {
    SecurityServiceFileDescriptorSupplier() {}
  }

  private static final class SecurityServiceMethodDescriptorSupplier
      extends SecurityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecurityServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SecurityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityServiceFileDescriptorSupplier())
              .addMethod(getPassportDetailsMethod())
              .addMethod(getClearanceDetailsMethod())
              .addMethod(getBoardingDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
