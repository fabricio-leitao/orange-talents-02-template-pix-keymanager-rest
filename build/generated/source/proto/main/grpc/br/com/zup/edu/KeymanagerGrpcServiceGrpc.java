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
public final class KeymanagerGrpcServiceGrpc {

  private KeymanagerGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.edu.KeymanagerGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.edu.ChavePixRequest,
      br.com.zup.edu.ChavePixResponse> getRegistraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registra",
      requestType = br.com.zup.edu.ChavePixRequest.class,
      responseType = br.com.zup.edu.ChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.edu.ChavePixRequest,
      br.com.zup.edu.ChavePixResponse> getRegistraMethod() {
    io.grpc.MethodDescriptor<br.com.zup.edu.ChavePixRequest, br.com.zup.edu.ChavePixResponse> getRegistraMethod;
    if ((getRegistraMethod = KeymanagerGrpcServiceGrpc.getRegistraMethod) == null) {
      synchronized (KeymanagerGrpcServiceGrpc.class) {
        if ((getRegistraMethod = KeymanagerGrpcServiceGrpc.getRegistraMethod) == null) {
          KeymanagerGrpcServiceGrpc.getRegistraMethod = getRegistraMethod =
              io.grpc.MethodDescriptor.<br.com.zup.edu.ChavePixRequest, br.com.zup.edu.ChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registra"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.ChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.ChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeymanagerGrpcServiceMethodDescriptorSupplier("registra"))
              .build();
        }
      }
    }
    return getRegistraMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeymanagerGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerGrpcServiceStub>() {
        @java.lang.Override
        public KeymanagerGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerGrpcServiceStub(channel, callOptions);
        }
      };
    return KeymanagerGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeymanagerGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeymanagerGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeymanagerGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeymanagerGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeymanagerGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeymanagerGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeymanagerGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registra(br.com.zup.edu.ChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.ChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistraMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.edu.ChavePixRequest,
                br.com.zup.edu.ChavePixResponse>(
                  this, METHODID_REGISTRA)))
          .build();
    }
  }

  /**
   */
  public static final class KeymanagerGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeymanagerGrpcServiceStub> {
    private KeymanagerGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void registra(br.com.zup.edu.ChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.ChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistraMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeymanagerGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeymanagerGrpcServiceBlockingStub> {
    private KeymanagerGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.edu.ChavePixResponse registra(br.com.zup.edu.ChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegistraMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeymanagerGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeymanagerGrpcServiceFutureStub> {
    private KeymanagerGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.edu.ChavePixResponse> registra(
        br.com.zup.edu.ChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistraMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeymanagerGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeymanagerGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRA:
          serviceImpl.registra((br.com.zup.edu.ChavePixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.edu.ChavePixResponse>) responseObserver);
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

  private static abstract class KeymanagerGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeymanagerGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.edu.KeyManagerRest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeymanagerGrpcService");
    }
  }

  private static final class KeymanagerGrpcServiceFileDescriptorSupplier
      extends KeymanagerGrpcServiceBaseDescriptorSupplier {
    KeymanagerGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeymanagerGrpcServiceMethodDescriptorSupplier
      extends KeymanagerGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeymanagerGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeymanagerGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeymanagerGrpcServiceFileDescriptorSupplier())
              .addMethod(getRegistraMethod())
              .build();
        }
      }
    }
    return result;
  }
}
