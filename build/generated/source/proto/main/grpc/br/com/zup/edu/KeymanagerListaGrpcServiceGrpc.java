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
public final class KeymanagerListaGrpcServiceGrpc {

  private KeymanagerListaGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.edu.KeymanagerListaGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.edu.ListaChavesPixRequest,
      br.com.zup.edu.ListaChavesPixResponse> getListaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "lista",
      requestType = br.com.zup.edu.ListaChavesPixRequest.class,
      responseType = br.com.zup.edu.ListaChavesPixResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.edu.ListaChavesPixRequest,
      br.com.zup.edu.ListaChavesPixResponse> getListaMethod() {
    io.grpc.MethodDescriptor<br.com.zup.edu.ListaChavesPixRequest, br.com.zup.edu.ListaChavesPixResponse> getListaMethod;
    if ((getListaMethod = KeymanagerListaGrpcServiceGrpc.getListaMethod) == null) {
      synchronized (KeymanagerListaGrpcServiceGrpc.class) {
        if ((getListaMethod = KeymanagerListaGrpcServiceGrpc.getListaMethod) == null) {
          KeymanagerListaGrpcServiceGrpc.getListaMethod = getListaMethod =
              io.grpc.MethodDescriptor.<br.com.zup.edu.ListaChavesPixRequest, br.com.zup.edu.ListaChavesPixResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "lista"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.ListaChavesPixRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.edu.ListaChavesPixResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeymanagerListaGrpcServiceMethodDescriptorSupplier("lista"))
              .build();
        }
      }
    }
    return getListaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeymanagerListaGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerListaGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerListaGrpcServiceStub>() {
        @java.lang.Override
        public KeymanagerListaGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerListaGrpcServiceStub(channel, callOptions);
        }
      };
    return KeymanagerListaGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeymanagerListaGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerListaGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerListaGrpcServiceBlockingStub>() {
        @java.lang.Override
        public KeymanagerListaGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerListaGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return KeymanagerListaGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeymanagerListaGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymanagerListaGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymanagerListaGrpcServiceFutureStub>() {
        @java.lang.Override
        public KeymanagerListaGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymanagerListaGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return KeymanagerListaGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeymanagerListaGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void lista(br.com.zup.edu.ListaChavesPixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.ListaChavesPixResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.edu.ListaChavesPixRequest,
                br.com.zup.edu.ListaChavesPixResponse>(
                  this, METHODID_LISTA)))
          .build();
    }
  }

  /**
   */
  public static final class KeymanagerListaGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<KeymanagerListaGrpcServiceStub> {
    private KeymanagerListaGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerListaGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerListaGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void lista(br.com.zup.edu.ListaChavesPixRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.edu.ListaChavesPixResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeymanagerListaGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeymanagerListaGrpcServiceBlockingStub> {
    private KeymanagerListaGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerListaGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerListaGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.edu.ListaChavesPixResponse lista(br.com.zup.edu.ListaChavesPixRequest request) {
      return blockingUnaryCall(
          getChannel(), getListaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeymanagerListaGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeymanagerListaGrpcServiceFutureStub> {
    private KeymanagerListaGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymanagerListaGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymanagerListaGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.edu.ListaChavesPixResponse> lista(
        br.com.zup.edu.ListaChavesPixRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LISTA = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeymanagerListaGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeymanagerListaGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LISTA:
          serviceImpl.lista((br.com.zup.edu.ListaChavesPixRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.edu.ListaChavesPixResponse>) responseObserver);
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

  private static abstract class KeymanagerListaGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeymanagerListaGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.edu.KeyManagerRest.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeymanagerListaGrpcService");
    }
  }

  private static final class KeymanagerListaGrpcServiceFileDescriptorSupplier
      extends KeymanagerListaGrpcServiceBaseDescriptorSupplier {
    KeymanagerListaGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class KeymanagerListaGrpcServiceMethodDescriptorSupplier
      extends KeymanagerListaGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeymanagerListaGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeymanagerListaGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeymanagerListaGrpcServiceFileDescriptorSupplier())
              .addMethod(getListaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
