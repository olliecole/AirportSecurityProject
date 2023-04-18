package as.userAccess;

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
    comments = "Source: userAccess.proto")
public final class userAccessServiceGrpc {

  private userAccessServiceGrpc() {}

  public static final String SERVICE_NAME = "userAccess.userAccessService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<as.userAccess.LoginRequest,
      as.userAccess.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = as.userAccess.LoginRequest.class,
      responseType = as.userAccess.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<as.userAccess.LoginRequest,
      as.userAccess.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<as.userAccess.LoginRequest, as.userAccess.LoginResponse> getLoginMethod;
    if ((getLoginMethod = userAccessServiceGrpc.getLoginMethod) == null) {
      synchronized (userAccessServiceGrpc.class) {
        if ((getLoginMethod = userAccessServiceGrpc.getLoginMethod) == null) {
          userAccessServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<as.userAccess.LoginRequest, as.userAccess.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userAccess.userAccessService", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.userAccess.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.userAccess.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAccessServiceMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<as.userAccess.LogoutRequest,
      as.userAccess.LogoutResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = as.userAccess.LogoutRequest.class,
      responseType = as.userAccess.LogoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<as.userAccess.LogoutRequest,
      as.userAccess.LogoutResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<as.userAccess.LogoutRequest, as.userAccess.LogoutResponse> getLogoutMethod;
    if ((getLogoutMethod = userAccessServiceGrpc.getLogoutMethod) == null) {
      synchronized (userAccessServiceGrpc.class) {
        if ((getLogoutMethod = userAccessServiceGrpc.getLogoutMethod) == null) {
          userAccessServiceGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<as.userAccess.LogoutRequest, as.userAccess.LogoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userAccess.userAccessService", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.userAccess.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  as.userAccess.LogoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new userAccessServiceMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userAccessServiceStub newStub(io.grpc.Channel channel) {
    return new userAccessServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userAccessServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userAccessServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userAccessServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userAccessServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static abstract class userAccessServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(as.userAccess.LoginRequest request,
        io.grpc.stub.StreamObserver<as.userAccess.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(as.userAccess.LogoutRequest request,
        io.grpc.stub.StreamObserver<as.userAccess.LogoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                as.userAccess.LoginRequest,
                as.userAccess.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                as.userAccess.LogoutRequest,
                as.userAccess.LogoutResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static final class userAccessServiceStub extends io.grpc.stub.AbstractStub<userAccessServiceStub> {
    private userAccessServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAccessServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAccessServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAccessServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(as.userAccess.LoginRequest request,
        io.grpc.stub.StreamObserver<as.userAccess.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(as.userAccess.LogoutRequest request,
        io.grpc.stub.StreamObserver<as.userAccess.LogoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static final class userAccessServiceBlockingStub extends io.grpc.stub.AbstractStub<userAccessServiceBlockingStub> {
    private userAccessServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAccessServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAccessServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAccessServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public as.userAccess.LoginResponse login(as.userAccess.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public as.userAccess.LogoutResponse logout(as.userAccess.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Interface exported by the server.
   * </pre>
   */
  public static final class userAccessServiceFutureStub extends io.grpc.stub.AbstractStub<userAccessServiceFutureStub> {
    private userAccessServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userAccessServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userAccessServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userAccessServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<as.userAccess.LoginResponse> login(
        as.userAccess.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<as.userAccess.LogoutResponse> logout(
        as.userAccess.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userAccessServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userAccessServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((as.userAccess.LoginRequest) request,
              (io.grpc.stub.StreamObserver<as.userAccess.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((as.userAccess.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<as.userAccess.LogoutResponse>) responseObserver);
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

  private static abstract class userAccessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userAccessServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return as.userAccess.userAccessServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userAccessService");
    }
  }

  private static final class userAccessServiceFileDescriptorSupplier
      extends userAccessServiceBaseDescriptorSupplier {
    userAccessServiceFileDescriptorSupplier() {}
  }

  private static final class userAccessServiceMethodDescriptorSupplier
      extends userAccessServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userAccessServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (userAccessServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userAccessServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
