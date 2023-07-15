package com.secommerce.customer.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
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
  private static volatile io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq,
      com.secommerce.customer.grpc.CustomerGrpc.Customers> getGetCustomersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomers",
      requestType = com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq.class,
      responseType = com.secommerce.customer.grpc.CustomerGrpc.Customers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq,
      com.secommerce.customer.grpc.CustomerGrpc.Customers> getGetCustomersMethod() {
    io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq, com.secommerce.customer.grpc.CustomerGrpc.Customers> getGetCustomersMethod;
    if ((getGetCustomersMethod = SeGrpcServiceGrpc.getGetCustomersMethod) == null) {
      synchronized (SeGrpcServiceGrpc.class) {
        if ((getGetCustomersMethod = SeGrpcServiceGrpc.getGetCustomersMethod) == null) {
          SeGrpcServiceGrpc.getGetCustomersMethod = getGetCustomersMethod = 
              io.grpc.MethodDescriptor.<com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq, com.secommerce.customer.grpc.CustomerGrpc.Customers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "customer.SeGrpcService", "GetCustomers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secommerce.customer.grpc.CustomerGrpc.Customers.getDefaultInstance()))
                  .setSchemaDescriptor(new SeGrpcServiceMethodDescriptorSupplier("GetCustomers"))
                  .build();
          }
        }
     }
     return getGetCustomersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq,
      com.secommerce.customer.grpc.CustomerGrpc.Customer> getGetCustomerByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerById",
      requestType = com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq.class,
      responseType = com.secommerce.customer.grpc.CustomerGrpc.Customer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq,
      com.secommerce.customer.grpc.CustomerGrpc.Customer> getGetCustomerByIdMethod() {
    io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq, com.secommerce.customer.grpc.CustomerGrpc.Customer> getGetCustomerByIdMethod;
    if ((getGetCustomerByIdMethod = SeGrpcServiceGrpc.getGetCustomerByIdMethod) == null) {
      synchronized (SeGrpcServiceGrpc.class) {
        if ((getGetCustomerByIdMethod = SeGrpcServiceGrpc.getGetCustomerByIdMethod) == null) {
          SeGrpcServiceGrpc.getGetCustomerByIdMethod = getGetCustomerByIdMethod = 
              io.grpc.MethodDescriptor.<com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq, com.secommerce.customer.grpc.CustomerGrpc.Customer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "customer.SeGrpcService", "GetCustomerById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secommerce.customer.grpc.CustomerGrpc.Customer.getDefaultInstance()))
                  .setSchemaDescriptor(new SeGrpcServiceMethodDescriptorSupplier("GetCustomerById"))
                  .build();
          }
        }
     }
     return getGetCustomerByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.Customer,
      com.google.protobuf.BoolValue> getCreateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomer",
      requestType = com.secommerce.customer.grpc.CustomerGrpc.Customer.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.Customer,
      com.google.protobuf.BoolValue> getCreateCustomerMethod() {
    io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.Customer, com.google.protobuf.BoolValue> getCreateCustomerMethod;
    if ((getCreateCustomerMethod = SeGrpcServiceGrpc.getCreateCustomerMethod) == null) {
      synchronized (SeGrpcServiceGrpc.class) {
        if ((getCreateCustomerMethod = SeGrpcServiceGrpc.getCreateCustomerMethod) == null) {
          SeGrpcServiceGrpc.getCreateCustomerMethod = getCreateCustomerMethod = 
              io.grpc.MethodDescriptor.<com.secommerce.customer.grpc.CustomerGrpc.Customer, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "customer.SeGrpcService", "CreateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secommerce.customer.grpc.CustomerGrpc.Customer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
                  .setSchemaDescriptor(new SeGrpcServiceMethodDescriptorSupplier("CreateCustomer"))
                  .build();
          }
        }
     }
     return getCreateCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq,
      com.google.protobuf.BoolValue> getUpdateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCustomer",
      requestType = com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq.class,
      responseType = com.google.protobuf.BoolValue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq,
      com.google.protobuf.BoolValue> getUpdateCustomerMethod() {
    io.grpc.MethodDescriptor<com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq, com.google.protobuf.BoolValue> getUpdateCustomerMethod;
    if ((getUpdateCustomerMethod = SeGrpcServiceGrpc.getUpdateCustomerMethod) == null) {
      synchronized (SeGrpcServiceGrpc.class) {
        if ((getUpdateCustomerMethod = SeGrpcServiceGrpc.getUpdateCustomerMethod) == null) {
          SeGrpcServiceGrpc.getUpdateCustomerMethod = getUpdateCustomerMethod = 
              io.grpc.MethodDescriptor.<com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq, com.google.protobuf.BoolValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "customer.SeGrpcService", "UpdateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BoolValue.getDefaultInstance()))
                  .setSchemaDescriptor(new SeGrpcServiceMethodDescriptorSupplier("UpdateCustomer"))
                  .build();
          }
        }
     }
     return getUpdateCustomerMethod;
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
    public void getCustomers(com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq request,
        io.grpc.stub.StreamObserver<com.secommerce.customer.grpc.CustomerGrpc.Customers> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomersMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerById(com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq request,
        io.grpc.stub.StreamObserver<com.secommerce.customer.grpc.CustomerGrpc.Customer> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerByIdMethod(), responseObserver);
    }

    /**
     */
    public void createCustomer(com.secommerce.customer.grpc.CustomerGrpc.Customer request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCustomerMethod(), responseObserver);
    }

    /**
     */
    public void updateCustomer(com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCustomerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq,
                com.secommerce.customer.grpc.CustomerGrpc.Customers>(
                  this, METHODID_GET_CUSTOMERS)))
          .addMethod(
            getGetCustomerByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq,
                com.secommerce.customer.grpc.CustomerGrpc.Customer>(
                  this, METHODID_GET_CUSTOMER_BY_ID)))
          .addMethod(
            getCreateCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.secommerce.customer.grpc.CustomerGrpc.Customer,
                com.google.protobuf.BoolValue>(
                  this, METHODID_CREATE_CUSTOMER)))
          .addMethod(
            getUpdateCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq,
                com.google.protobuf.BoolValue>(
                  this, METHODID_UPDATE_CUSTOMER)))
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
    public void getCustomers(com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq request,
        io.grpc.stub.StreamObserver<com.secommerce.customer.grpc.CustomerGrpc.Customers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerById(com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq request,
        io.grpc.stub.StreamObserver<com.secommerce.customer.grpc.CustomerGrpc.Customer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCustomer(com.secommerce.customer.grpc.CustomerGrpc.Customer request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCustomer(com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCustomerMethod(), getCallOptions()), request, responseObserver);
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
    public com.secommerce.customer.grpc.CustomerGrpc.Customers getCustomers(com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.secommerce.customer.grpc.CustomerGrpc.Customer getCustomerById(com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue createCustomer(com.secommerce.customer.grpc.CustomerGrpc.Customer request) {
      return blockingUnaryCall(
          getChannel(), getCreateCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue updateCustomer(com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCustomerMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.secommerce.customer.grpc.CustomerGrpc.Customers> getCustomers(
        com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.secommerce.customer.grpc.CustomerGrpc.Customer> getCustomerById(
        com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> createCustomer(
        com.secommerce.customer.grpc.CustomerGrpc.Customer request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> updateCustomer(
        com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMERS = 0;
  private static final int METHODID_GET_CUSTOMER_BY_ID = 1;
  private static final int METHODID_CREATE_CUSTOMER = 2;
  private static final int METHODID_UPDATE_CUSTOMER = 3;

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
        case METHODID_GET_CUSTOMERS:
          serviceImpl.getCustomers((com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq) request,
              (io.grpc.stub.StreamObserver<com.secommerce.customer.grpc.CustomerGrpc.Customers>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_BY_ID:
          serviceImpl.getCustomerById((com.secommerce.customer.grpc.CustomerGrpc.GetCustomersReq) request,
              (io.grpc.stub.StreamObserver<com.secommerce.customer.grpc.CustomerGrpc.Customer>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOMER:
          serviceImpl.createCustomer((com.secommerce.customer.grpc.CustomerGrpc.Customer) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        case METHODID_UPDATE_CUSTOMER:
          serviceImpl.updateCustomer((com.secommerce.customer.grpc.CustomerGrpc.UpdateCustomerReq) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
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
              .addMethod(getGetCustomersMethod())
              .addMethod(getGetCustomerByIdMethod())
              .addMethod(getCreateCustomerMethod())
              .addMethod(getUpdateCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
