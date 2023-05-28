package com.mttbrt.ethtxmon.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.55.1)",
    comments = "Source: ethtx.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EthTxGrpc {

  public static final String SERVICE_NAME = "EthTx";
  private static final int METHODID_SUBSCRIBE_TO_ADDRESS = 0;
  private static final int METHODID_UNSUBSCRIBE_TO_ADDRESS = 1;
  private static final int METHODID_GET_LATEST_TX = 2;
  private static final int METHODID_GET_PREVIOUS_TX = 3;
  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Response>
      getSubscribeToAddressMethod;
  private static volatile io.grpc.MethodDescriptor<
          com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Response>
      getUnsubscribeToAddressMethod;
  private static volatile io.grpc.MethodDescriptor<
          com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Tx>
      getGetLatestTxMethod;
  private static volatile io.grpc.MethodDescriptor<
          com.mttbrt.ethtxmon.model.TxRequest, com.mttbrt.ethtxmon.model.Tx>
      getGetPreviousTxMethod;
  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  private EthTxGrpc() {}

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeToAddress",
      requestType = com.mttbrt.ethtxmon.model.Address.class,
      responseType = com.mttbrt.ethtxmon.model.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Response>
      getSubscribeToAddressMethod() {
    io.grpc.MethodDescriptor<com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Response>
        getSubscribeToAddressMethod;
    if ((getSubscribeToAddressMethod = EthTxGrpc.getSubscribeToAddressMethod) == null) {
      synchronized (EthTxGrpc.class) {
        if ((getSubscribeToAddressMethod = EthTxGrpc.getSubscribeToAddressMethod) == null) {
          EthTxGrpc.getSubscribeToAddressMethod =
              getSubscribeToAddressMethod =
                  io.grpc.MethodDescriptor
                      .<com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Response>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubscribeToAddress"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.mttbrt.ethtxmon.model.Address.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.mttbrt.ethtxmon.model.Response.getDefaultInstance()))
                      .setSchemaDescriptor(new EthTxMethodDescriptorSupplier("SubscribeToAddress"))
                      .build();
        }
      }
    }
    return getSubscribeToAddressMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnsubscribeToAddress",
      requestType = com.mttbrt.ethtxmon.model.Address.class,
      responseType = com.mttbrt.ethtxmon.model.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Response>
      getUnsubscribeToAddressMethod() {
    io.grpc.MethodDescriptor<com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Response>
        getUnsubscribeToAddressMethod;
    if ((getUnsubscribeToAddressMethod = EthTxGrpc.getUnsubscribeToAddressMethod) == null) {
      synchronized (EthTxGrpc.class) {
        if ((getUnsubscribeToAddressMethod = EthTxGrpc.getUnsubscribeToAddressMethod) == null) {
          EthTxGrpc.getUnsubscribeToAddressMethod =
              getUnsubscribeToAddressMethod =
                  io.grpc.MethodDescriptor
                      .<com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Response>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UnsubscribeToAddress"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.mttbrt.ethtxmon.model.Address.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.mttbrt.ethtxmon.model.Response.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new EthTxMethodDescriptorSupplier("UnsubscribeToAddress"))
                      .build();
        }
      }
    }
    return getUnsubscribeToAddressMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLatestTx",
      requestType = com.mttbrt.ethtxmon.model.Address.class,
      responseType = com.mttbrt.ethtxmon.model.Tx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Tx>
      getGetLatestTxMethod() {
    io.grpc.MethodDescriptor<com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Tx>
        getGetLatestTxMethod;
    if ((getGetLatestTxMethod = EthTxGrpc.getGetLatestTxMethod) == null) {
      synchronized (EthTxGrpc.class) {
        if ((getGetLatestTxMethod = EthTxGrpc.getGetLatestTxMethod) == null) {
          EthTxGrpc.getGetLatestTxMethod =
              getGetLatestTxMethod =
                  io.grpc.MethodDescriptor
                      .<com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Tx>newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLatestTx"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.mttbrt.ethtxmon.model.Address.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.mttbrt.ethtxmon.model.Tx.getDefaultInstance()))
                      .setSchemaDescriptor(new EthTxMethodDescriptorSupplier("GetLatestTx"))
                      .build();
        }
      }
    }
    return getGetLatestTxMethod;
  }

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPreviousTx",
      requestType = com.mttbrt.ethtxmon.model.TxRequest.class,
      responseType = com.mttbrt.ethtxmon.model.Tx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<
          com.mttbrt.ethtxmon.model.TxRequest, com.mttbrt.ethtxmon.model.Tx>
      getGetPreviousTxMethod() {
    io.grpc.MethodDescriptor<com.mttbrt.ethtxmon.model.TxRequest, com.mttbrt.ethtxmon.model.Tx>
        getGetPreviousTxMethod;
    if ((getGetPreviousTxMethod = EthTxGrpc.getGetPreviousTxMethod) == null) {
      synchronized (EthTxGrpc.class) {
        if ((getGetPreviousTxMethod = EthTxGrpc.getGetPreviousTxMethod) == null) {
          EthTxGrpc.getGetPreviousTxMethod =
              getGetPreviousTxMethod =
                  io.grpc.MethodDescriptor
                      .<com.mttbrt.ethtxmon.model.TxRequest, com.mttbrt.ethtxmon.model.Tx>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPreviousTx"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.mttbrt.ethtxmon.model.TxRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.mttbrt.ethtxmon.model.Tx.getDefaultInstance()))
                      .setSchemaDescriptor(new EthTxMethodDescriptorSupplier("GetPreviousTx"))
                      .build();
        }
      }
    }
    return getGetPreviousTxMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static EthTxStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EthTxStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<EthTxStub>() {
          @java.lang.Override
          public EthTxStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new EthTxStub(channel, callOptions);
          }
        };
    return EthTxStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EthTxBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EthTxBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<EthTxBlockingStub>() {
          @java.lang.Override
          public EthTxBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new EthTxBlockingStub(channel, callOptions);
          }
        };
    return EthTxBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static EthTxFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EthTxFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<EthTxFutureStub>() {
          @java.lang.Override
          public EthTxFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new EthTxFutureStub(channel, callOptions);
          }
        };
    return EthTxFutureStub.newStub(factory, channel);
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
            getSubscribeToAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Response>(
                    service, METHODID_SUBSCRIBE_TO_ADDRESS)))
        .addMethod(
            getUnsubscribeToAddressMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<
                    com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Response>(
                    service, METHODID_UNSUBSCRIBE_TO_ADDRESS)))
        .addMethod(
            getGetLatestTxMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
                new MethodHandlers<com.mttbrt.ethtxmon.model.Address, com.mttbrt.ethtxmon.model.Tx>(
                    service, METHODID_GET_LATEST_TX)))
        .addMethod(
            getGetPreviousTxMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
                new MethodHandlers<
                    com.mttbrt.ethtxmon.model.TxRequest, com.mttbrt.ethtxmon.model.Tx>(
                    service, METHODID_GET_PREVIOUS_TX)))
        .build();
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EthTxGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new EthTxFileDescriptorSupplier())
                      .addMethod(getSubscribeToAddressMethod())
                      .addMethod(getUnsubscribeToAddressMethod())
                      .addMethod(getGetLatestTxMethod())
                      .addMethod(getGetPreviousTxMethod())
                      .build();
        }
      }
    }
    return result;
  }
  /** */
  public interface AsyncService {

    /**
     *
     *
     * <pre>
     * track transactions involving an ETH wallet address
     * </pre>
     */
    default void subscribeToAddress(
        com.mttbrt.ethtxmon.model.Address request,
        io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getSubscribeToAddressMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * stop tracking transactions involving an ETH wallet address
     * </pre>
     */
    default void unsubscribeToAddress(
        com.mttbrt.ethtxmon.model.Address request,
        io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getUnsubscribeToAddressMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * get the latest transaction involving an ETH wallet address
     * </pre>
     */
    default void getLatestTx(
        com.mttbrt.ethtxmon.model.Address request,
        io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Tx> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(
          getGetLatestTxMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * given an address and a transaction hash return the previous transaction
     * involving the same ETH wallet address
     * </pre>
     */
    default io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.TxRequest> getPreviousTx(
        io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Tx> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(
          getGetPreviousTxMethod(), responseObserver);
    }
  }

  /** Base class for the server implementation of the service EthTx. */
  public abstract static class EthTxImplBase implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return EthTxGrpc.bindService(this);
    }
  }

  /** A stub to allow clients to do asynchronous rpc calls to service EthTx. */
  public static final class EthTxStub extends io.grpc.stub.AbstractAsyncStub<EthTxStub> {
    private EthTxStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EthTxStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EthTxStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * track transactions involving an ETH wallet address
     * </pre>
     */
    public void subscribeToAddress(
        com.mttbrt.ethtxmon.model.Address request,
        io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubscribeToAddressMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * stop tracking transactions involving an ETH wallet address
     * </pre>
     */
    public void unsubscribeToAddress(
        com.mttbrt.ethtxmon.model.Address request,
        io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnsubscribeToAddressMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * get the latest transaction involving an ETH wallet address
     * </pre>
     */
    public void getLatestTx(
        com.mttbrt.ethtxmon.model.Address request,
        io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Tx> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLatestTxMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * given an address and a transaction hash return the previous transaction
     * involving the same ETH wallet address
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.TxRequest> getPreviousTx(
        io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Tx> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGetPreviousTxMethod(), getCallOptions()), responseObserver);
    }
  }

  /** A stub to allow clients to do synchronous rpc calls to service EthTx. */
  public static final class EthTxBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EthTxBlockingStub> {
    private EthTxBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EthTxBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EthTxBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * track transactions involving an ETH wallet address
     * </pre>
     */
    public com.mttbrt.ethtxmon.model.Response subscribeToAddress(
        com.mttbrt.ethtxmon.model.Address request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubscribeToAddressMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * stop tracking transactions involving an ETH wallet address
     * </pre>
     */
    public com.mttbrt.ethtxmon.model.Response unsubscribeToAddress(
        com.mttbrt.ethtxmon.model.Address request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnsubscribeToAddressMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * get the latest transaction involving an ETH wallet address
     * </pre>
     */
    public com.mttbrt.ethtxmon.model.Tx getLatestTx(com.mttbrt.ethtxmon.model.Address request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLatestTxMethod(), getCallOptions(), request);
    }
  }

  /** A stub to allow clients to do ListenableFuture-style rpc calls to service EthTx. */
  public static final class EthTxFutureStub
      extends io.grpc.stub.AbstractFutureStub<EthTxFutureStub> {
    private EthTxFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EthTxFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EthTxFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * track transactions involving an ETH wallet address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mttbrt.ethtxmon.model.Response>
        subscribeToAddress(com.mttbrt.ethtxmon.model.Address request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubscribeToAddressMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * stop tracking transactions involving an ETH wallet address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mttbrt.ethtxmon.model.Response>
        unsubscribeToAddress(com.mttbrt.ethtxmon.model.Address request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnsubscribeToAddressMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * get the latest transaction involving an ETH wallet address
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mttbrt.ethtxmon.model.Tx>
        getLatestTx(com.mttbrt.ethtxmon.model.Address request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLatestTxMethod(), getCallOptions()), request);
    }
  }

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE_TO_ADDRESS:
          serviceImpl.subscribeToAddress(
              (com.mttbrt.ethtxmon.model.Address) request,
              (io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Response>) responseObserver);
          break;
        case METHODID_UNSUBSCRIBE_TO_ADDRESS:
          serviceImpl.unsubscribeToAddress(
              (com.mttbrt.ethtxmon.model.Address) request,
              (io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Response>) responseObserver);
          break;
        case METHODID_GET_LATEST_TX:
          serviceImpl.getLatestTx(
              (com.mttbrt.ethtxmon.model.Address) request,
              (io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Tx>) responseObserver);
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
        case METHODID_GET_PREVIOUS_TX:
          return (io.grpc.stub.StreamObserver<Req>)
              serviceImpl.getPreviousTx(
                  (io.grpc.stub.StreamObserver<com.mttbrt.ethtxmon.model.Tx>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class EthTxBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EthTxBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mttbrt.ethtxmon.model.Ethtx.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EthTx");
    }
  }

  private static final class EthTxFileDescriptorSupplier extends EthTxBaseDescriptorSupplier {
    EthTxFileDescriptorSupplier() {}
  }

  private static final class EthTxMethodDescriptorSupplier extends EthTxBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EthTxMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }
}
