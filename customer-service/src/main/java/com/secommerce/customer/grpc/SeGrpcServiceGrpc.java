package com.secommerce.customer.grpc;

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
 * service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: customer.proto")
public final class SeGrpcServiceGrpc {

  private SeGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "customer.SeGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq,
      com.secommerce.customer.grpc.CustomerGrpc.Customers> getGetAllCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCustomers",
      requestType = com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq.class,
      responseType = com.secommerce.customer.grpc.CustomerGrpc.Customers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq,
      com.secommerce.customer.grpc.CustomerGrpc.Customers> getGetAllCustomersMethod() {
    io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq, com.secommerce.customer.grpc.CustomerGrpc.Customers> getGetAllCustomersMethod;
    if ((getGetAllCustomersMethod = SeGrpcServiceGrpc.getGetAllCustomersMethod) == null) {
      synchronized (SeGrpcServiceGrpc.class) {
        if ((getGetAllCustomersMethod = SeGrpcServiceGrpc.getGetAllCustomersMethod) == null) {
          SeGrpcServiceGrpc.getGetAllCustomersMethod = getGetAllCustomersMethod = 
              io.grpc.MethodDescriptor.<com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq, com.secommerce.customer.grpc.CustomerGrpc.Customers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "customer.SeGrpcService", "GetAllCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secommerce.customer.grpc.CustomerGrpc.Customers.getDefaultInstance()))
                  .setSchemaDescriptor(new SeGrpcServiceMethodDescriptorSupplier("GetAllCustomers"))
                  .build();
          }
        }
     }
     return getGetAllCustomersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SeGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new SeGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SeGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SeGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SeGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SeGrpcServiceFutureStub(channel);
  }

  /**
   * <pre>
   * service
   * </pre>
   */
  public static abstract class SeGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllCustomers(com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq request,
        io.grpc.stub.StreamObserver<com.secommerce.customer.grpc.CustomerGrpc.Customers> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllCustomersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllCustomersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq,
                com.secommerce.customer.grpc.CustomerGrpc.Customers>(
                  this, METHODID_GET_ALL_CUSTOMERS)))
          .build();
    }
  }

  /**
   * <pre>
   * service
   * </pre>
   */
  public static final class SeGrpcServiceStub extends io.grpc.stub.AbstractStub<SeGrpcServiceStub> {
    private SeGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllCustomers(com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq request,
        io.grpc.stub.StreamObserver<com.secommerce.customer.grpc.CustomerGrpc.Customers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllCustomersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * service
   * </pre>
   */
  public static final class SeGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<SeGrpcServiceBlockingStub> {
    private SeGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.secommerce.customer.grpc.CustomerGrpc.Customers getAllCustomers(com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq request) {
      return blockingUnaryCall(
          getChannel(), getGetAllCustomersMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * service
   * </pre>
   */
  public static final class SeGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<SeGrpcServiceFutureStub> {
    private SeGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SeGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SeGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SeGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secommerce.customer.grpc.CustomerGrpc.Customers> getAllCustomers(
        com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllCustomersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CUSTOMERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SeGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SeGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CUSTOMERS:
          serviceImpl.getAllCustomers((com.secommerce.customer.grpc.CustomerGrpc.GetAllCustomersReq) request,
              (io.grpc.stub.StreamObserver<com.secommerce.customer.grpc.CustomerGrpc.Customers>) responseObserver);
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

  private static abstract class SeGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SeGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.secommerce.customer.grpc.CustomerGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SeGrpcService");
    }
  }

  private static final class SeGrpcServiceFileDescriptorSupplier
      extends SeGrpcServiceBaseDescriptorSupplier {
    SeGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class SeGrpcServiceMethodDescriptorSupplier
      extends SeGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SeGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SeGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SeGrpcServiceFileDescriptorSupplier())
              .addMethod(getGetAllCustomersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
