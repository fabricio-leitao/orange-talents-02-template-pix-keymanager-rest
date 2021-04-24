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
public final class KeymanagerConsultaGrpcServiceGrpc {

  private KeymanagerConsultaGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.edu.KeymanagerConsultaGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.edu.CarregaChavePixRequest,
      br.com.zup.edu.CarregaChavePixResponse> getConsultaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "consulta",
      requestType = br.com.zup.edu.CarregaChavePixRequest.class,
      responseType = br.com.zup.edu.CarregaChavePixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.edu.CarregaChavePixRequest,
      br.com.zup.edu.CarregaChavePixResponse> getConsultaMethod() {
    io.grpc.MethodDescriptor<br.com.zup.edu.CarregaChavePixRequest, br.com.zup.edu.CarregaChavePixResponse> getConsultaMethod;
    if ((getConsultaMethod = KeymanagerConsultaGrpcServiceGrpc.getConsultaMethod) == null) {
      synchronized (KeymanagerConsultaGrpcServiceGrpc.class) {
        if ((getConsultaMethod = KeymanagerConsultaGrpcServiceGrpc.getConsultaMethod) == null) {
          KeymanagerConsultaGrpcServiceGrpc.getConsultaMethod = getConsultaMethod =
              io.grpc.MethodDescriptor.<br.com.zup.edu.CarregaChavePixRequest, br.com.zup.edu.CarregaChavePixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "consulta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.CarregaChavePixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.CarregaChavePixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeymanagerConsultaGrpcServiceMethodDescriptorSupplier("consulta"))
              .build();
        }
      }
    }
    return getConsultaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeymanagerConsultaGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerConsultaGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerConsultaGrpcServiceStub>() {
        @java.lang.Override
        public KeymanagerConsultaGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerConsultaGrpcServiceStub(channel, callOptions);
        }
      };
    return KeymanagerConsultaGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeymanagerConsultaGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerConsultaGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerConsultaGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeymanagerConsultaGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerConsultaGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeymanagerConsultaGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeymanagerConsultaGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerConsultaGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerConsultaGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeymanagerConsultaGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerConsultaGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeymanagerConsultaGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeymanagerConsultaGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void consulta(br.com.zup.edu.CarregaChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.CarregaChavePixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConsultaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConsultaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.edu.CarregaChavePixRequest,
                br.com.zup.edu.CarregaChavePixResponse>(
                  this, METHODID_CONSULTA)))
          .build();
    }
  }

  /**
   */
  public static final class KeymanagerConsultaGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeymanagerConsultaGrpcServiceStub> {
    private KeymanagerConsultaGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerConsultaGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerConsultaGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void consulta(br.com.zup.edu.CarregaChavePixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.CarregaChavePixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsultaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeymanagerConsultaGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeymanagerConsultaGrpcServiceBlockingStub> {
    private KeymanagerConsultaGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerConsultaGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerConsultaGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.edu.CarregaChavePixResponse consulta(br.com.zup.edu.CarregaChavePixRequest request) {
      return blockingUnaryCall(
          getChannel(), getConsultaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeymanagerConsultaGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeymanagerConsultaGrpcServiceFutureStub> {
    private KeymanagerConsultaGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerConsultaGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerConsultaGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.edu.CarregaChavePixResponse> consulta(
        br.com.zup.edu.CarregaChavePixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConsultaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONSULTA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeymanagerConsultaGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeymanagerConsultaGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONSULTA:
          serviceImpl.consulta((br.com.zup.edu.CarregaChavePixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.edu.CarregaChavePixResponse>) responseObserver);
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

  private static abstract class KeymanagerConsultaGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeymanagerConsultaGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.edu.KeyManagerRest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeymanagerConsultaGrpcService");
    }
  }

  private static final class KeymanagerConsultaGrpcServiceFileDescriptorSupplier
      extends KeymanagerConsultaGrpcServiceBaseDescriptorSupplier {
    KeymanagerConsultaGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeymanagerConsultaGrpcServiceMethodDescriptorSupplier
      extends KeymanagerConsultaGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeymanagerConsultaGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeymanagerConsultaGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeymanagerConsultaGrpcServiceFileDescriptorSupplier())
              .addMethod(getConsultaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
