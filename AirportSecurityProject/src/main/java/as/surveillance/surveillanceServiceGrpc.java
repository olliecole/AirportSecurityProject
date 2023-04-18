package as.surveillance;

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
 *Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: surveillance.proto")
public final class surveillanceServiceGrpc {

  private surveillanceServiceGrpc() {}

  public static final String SERVICE_NAME = "surveillance.surveillanceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<as.surveillance.accessRequest,
      as.surveillance.accessResponse> getAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "access",
      requestType = as.surveillance.accessRequest.class,
      responseType = as.surveillance.accessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<as.surveillance.accessRequest,
      as.surveillance.accessResponse> getAccessMethod() {
    io.grpc.MethodDescriptor<as.surveillance.accessRequest, as.surveillance.accessResponse> getAccessMethod;
    if ((getAccessMethod = surveillanceServiceGrpc.getAccessMethod) == null) {
      synchronized (surveillanceServiceGrpc.class) {
        if ((getAccessMethod = surveillanceServiceGrpc.getAccessMethod) == null) {
          surveillanceServiceGrpc.getAccessMethod = getAccessMethod = 
              io.grpc.MethodDescriptor.<as.surveillance.accessRequest, as.surveillance.accessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surveillance.surveillanceService", "access"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.surveillance.accessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.surveillance.accessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new surveillanceServiceMethodDescriptorSupplier("access"))
                  .build();
          }
        }
     }
     return getAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<as.surveillance.cameraRequest,
      as.surveillance.cameraResponse> getCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "camera",
      requestType = as.surveillance.cameraRequest.class,
      responseType = as.surveillance.cameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<as.surveillance.cameraRequest,
      as.surveillance.cameraResponse> getCameraMethod() {
    io.grpc.MethodDescriptor<as.surveillance.cameraRequest, as.surveillance.cameraResponse> getCameraMethod;
    if ((getCameraMethod = surveillanceServiceGrpc.getCameraMethod) == null) {
      synchronized (surveillanceServiceGrpc.class) {
        if ((getCameraMethod = surveillanceServiceGrpc.getCameraMethod) == null) {
          surveillanceServiceGrpc.getCameraMethod = getCameraMethod = 
              io.grpc.MethodDescriptor.<as.surveillance.cameraRequest, as.surveillance.cameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surveillance.surveillanceService", "camera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.surveillance.cameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.surveillance.cameraResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new surveillanceServiceMethodDescriptorSupplier("camera"))
                  .build();
          }
        }
     }
     return getCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<as.surveillance.fireRequest,
      as.surveillance.fireResponse> getFireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fire",
      requestType = as.surveillance.fireRequest.class,
      responseType = as.surveillance.fireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<as.surveillance.fireRequest,
      as.surveillance.fireResponse> getFireMethod() {
    io.grpc.MethodDescriptor<as.surveillance.fireRequest, as.surveillance.fireResponse> getFireMethod;
    if ((getFireMethod = surveillanceServiceGrpc.getFireMethod) == null) {
      synchronized (surveillanceServiceGrpc.class) {
        if ((getFireMethod = surveillanceServiceGrpc.getFireMethod) == null) {
          surveillanceServiceGrpc.getFireMethod = getFireMethod = 
              io.grpc.MethodDescriptor.<as.surveillance.fireRequest, as.surveillance.fireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "surveillance.surveillanceService", "fire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.surveillance.fireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.surveillance.fireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new surveillanceServiceMethodDescriptorSupplier("fire"))
                  .build();
          }
        }
     }
     return getFireMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static surveillanceServiceStub newStub(io.grpc.Channel channel) {
    return new surveillanceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static surveillanceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new surveillanceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static surveillanceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new surveillanceServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static abstract class surveillanceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void access(as.surveillance.accessRequest request,
        io.grpc.stub.StreamObserver<as.surveillance.accessResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAccessMethod(), responseObserver);
    }

    /**
     */
    public void camera(as.surveillance.cameraRequest request,
        io.grpc.stub.StreamObserver<as.surveillance.cameraResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCameraMethod(), responseObserver);
    }

    /**
     */
    public void fire(as.surveillance.fireRequest request,
        io.grpc.stub.StreamObserver<as.surveillance.fireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFireMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                as.surveillance.accessRequest,
                as.surveillance.accessResponse>(
                  this, METHODID_ACCESS)))
          .addMethod(
            getCameraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                as.surveillance.cameraRequest,
                as.surveillance.cameraResponse>(
                  this, METHODID_CAMERA)))
          .addMethod(
            getFireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                as.surveillance.fireRequest,
                as.surveillance.fireResponse>(
                  this, METHODID_FIRE)))
          .build();
    }
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static final class surveillanceServiceStub extends io.grpc.stub.AbstractStub<surveillanceServiceStub> {
    private surveillanceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private surveillanceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected surveillanceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new surveillanceServiceStub(channel, callOptions);
    }

    /**
     */
    public void access(as.surveillance.accessRequest request,
        io.grpc.stub.StreamObserver<as.surveillance.accessResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void camera(as.surveillance.cameraRequest request,
        io.grpc.stub.StreamObserver<as.surveillance.cameraResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCameraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void fire(as.surveillance.fireRequest request,
        io.grpc.stub.StreamObserver<as.surveillance.fireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFireMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static final class surveillanceServiceBlockingStub extends io.grpc.stub.AbstractStub<surveillanceServiceBlockingStub> {
    private surveillanceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private surveillanceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected surveillanceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new surveillanceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public as.surveillance.accessResponse access(as.surveillance.accessRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccessMethod(), getCallOptions(), request);
    }

    /**
     */
    public as.surveillance.cameraResponse camera(as.surveillance.cameraRequest request) {
      return blockingUnaryCall(
          getChannel(), getCameraMethod(), getCallOptions(), request);
    }

    /**
     */
    public as.surveillance.fireResponse fire(as.surveillance.fireRequest request) {
      return blockingUnaryCall(
          getChannel(), getFireMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static final class surveillanceServiceFutureStub extends io.grpc.stub.AbstractStub<surveillanceServiceFutureStub> {
    private surveillanceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private surveillanceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected surveillanceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new surveillanceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<as.surveillance.accessResponse> access(
        as.surveillance.accessRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<as.surveillance.cameraResponse> camera(
        as.surveillance.cameraRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCameraMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<as.surveillance.fireResponse> fire(
        as.surveillance.fireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFireMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCESS = 0;
  private static final int METHODID_CAMERA = 1;
  private static final int METHODID_FIRE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final surveillanceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(surveillanceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACCESS:
          serviceImpl.access((as.surveillance.accessRequest) request,
              (io.grpc.stub.StreamObserver<as.surveillance.accessResponse>) responseObserver);
          break;
        case METHODID_CAMERA:
          serviceImpl.camera((as.surveillance.cameraRequest) request,
              (io.grpc.stub.StreamObserver<as.surveillance.cameraResponse>) responseObserver);
          break;
        case METHODID_FIRE:
          serviceImpl.fire((as.surveillance.fireRequest) request,
              (io.grpc.stub.StreamObserver<as.surveillance.fireResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class surveillanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    surveillanceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return as.surveillance.surveillanceServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("surveillanceService");
    }
  }

  private static final class surveillanceServiceFileDescriptorSupplier
      extends surveillanceServiceBaseDescriptorSupplier {
    surveillanceServiceFileDescriptorSupplier() {}
  }

  private static final class surveillanceServiceMethodDescriptorSupplier
      extends surveillanceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    surveillanceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (surveillanceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new surveillanceServiceFileDescriptorSupplier())
              .addMethod(getAccessMethod())
              .addMethod(getCameraMethod())
              .addMethod(getFireMethod())
              .build();
        }
      }
    }
    return result;
  }
}
