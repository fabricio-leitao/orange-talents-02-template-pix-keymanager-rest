package br.com.zup.edu;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: keyManagerRest.proto")
public final class KeymanagerRemoveGrpcServiceGrpc {

  private KeymanagerRemoveGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.edu.KeymanagerRemoveGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.edu.RemoveChavePixRequest,
      br.com.zup.edu.RemoveChavePixResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "remove",
      requestType = br.com.zup.edu.RemoveChavePixRequest.class,
      responseType = br.com.zup.edu.RemoveChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.edu.RemoveChavePixRequest,
      br.com.zup.edu.RemoveChavePixResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<br.com.zup.edu.RemoveChavePixRequest, br.com.zup.edu.RemoveChavePixResponse> getRemoveMethod;
    if ((getRemoveMethod = KeymanagerRemoveGrpcServiceGrpc.getRemoveMethod) == null) {
      synchronized (KeymanagerRemoveGrpcServiceGrpc.class) {
        if ((getRemoveMethod = KeymanagerRemoveGrpcServiceGrpc.getRemoveMethod) == null) {
          KeymanagerRemoveGrpcServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<br.com.zup.edu.RemoveChavePixRequest, br.com.zup.edu.RemoveChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.RemoveChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.RemoveChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeymanagerRemoveGrpcServiceMethodDescriptorSupplier("remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeymanagerRemoveGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerRemoveGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerRemoveGrpcServiceStub>() {
        @java.lang.Override
        public KeymanagerRemoveGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerRemoveGrpcServiceStub(channel, callOptions);
        }
      };
    return KeymanagerRemoveGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeymanagerRemoveGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerRemoveGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerRemoveGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeymanagerRemoveGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerRemoveGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeymanagerRemoveGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeymanagerRemoveGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerRemoveGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerRemoveGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeymanagerRemoveGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerRemoveGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeymanagerRemoveGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeymanagerRemoveGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void remove(br.com.zup.edu.RemoveChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.RemoveChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.edu.RemoveChavePixRequest,
                br.com.zup.edu.RemoveChavePixResponse>(
                  this, METHODID_REMOVE)))
          .build();
    }
  }

  /**
   */
  public static final class KeymanagerRemoveGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeymanagerRemoveGrpcServiceStub> {
    private KeymanagerRemoveGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerRemoveGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerRemoveGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void remove(br.com.zup.edu.RemoveChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.RemoveChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeymanagerRemoveGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeymanagerRemoveGrpcServiceBlockingStub> {
    private KeymanagerRemoveGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerRemoveGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerRemoveGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.edu.RemoveChavePixResponse remove(br.com.zup.edu.RemoveChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeymanagerRemoveGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeymanagerRemoveGrpcServiceFutureStub> {
    private KeymanagerRemoveGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerRemoveGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerRemoveGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.edu.RemoveChavePixResponse> remove(
        br.com.zup.edu.RemoveChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeymanagerRemoveGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeymanagerRemoveGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REMOVE:
          serviceImpl.remove((br.com.zup.edu.RemoveChavePixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.edu.RemoveChavePixResponse>) responseObserver);
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

  private static abstract class KeymanagerRemoveGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeymanagerRemoveGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.edu.KeyManagerRest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeymanagerRemoveGrpcService");
    }
  }

  private static final class KeymanagerRemoveGrpcServiceFileDescriptorSupplier
      extends KeymanagerRemoveGrpcServiceBaseDescriptorSupplier {
    KeymanagerRemoveGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeymanagerRemoveGrpcServiceMethodDescriptorSupplier
      extends KeymanagerRemoveGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeymanagerRemoveGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeymanagerRemoveGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeymanagerRemoveGrpcServiceFileDescriptorSupplier())
              .addMethod(getRemoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
