package com.chaos.remoting.grpc;

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
    value = "by gRPC proto compiler (version 1.15.1)",
    comments = "Source: services.proto")
public final class RemotingServiceGrpc {

  private RemotingServiceGrpc() {}

  public static final String SERVICE_NAME = "com.chaos.remoting.grpc.RemotingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.chaos.remoting.grpc.Messages.RemoteInvocationRequest,
      com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> getExecuteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "execute",
      requestType = com.chaos.remoting.grpc.Messages.RemoteInvocationRequest.class,
      responseType = com.chaos.remoting.grpc.Messages.RemoteInvocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chaos.remoting.grpc.Messages.RemoteInvocationRequest,
      com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> getExecuteMethod() {
    io.grpc.MethodDescriptor<com.chaos.remoting.grpc.Messages.RemoteInvocationRequest, com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> getExecuteMethod;
    if ((getExecuteMethod = RemotingServiceGrpc.getExecuteMethod) == null) {
      synchronized (RemotingServiceGrpc.class) {
        if ((getExecuteMethod = RemotingServiceGrpc.getExecuteMethod) == null) {
          RemotingServiceGrpc.getExecuteMethod = getExecuteMethod = 
              io.grpc.MethodDescriptor.<com.chaos.remoting.grpc.Messages.RemoteInvocationRequest, com.chaos.remoting.grpc.Messages.RemoteInvocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.chaos.remoting.grpc.RemotingService", "execute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chaos.remoting.grpc.Messages.RemoteInvocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chaos.remoting.grpc.Messages.RemoteInvocationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RemotingServiceMethodDescriptorSupplier("execute"))
                  .build();
          }
        }
     }
     return getExecuteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chaos.remoting.grpc.Messages.RemoteInvocationRequest,
      com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> getGetRemoteInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRemoteInfo",
      requestType = com.chaos.remoting.grpc.Messages.RemoteInvocationRequest.class,
      responseType = com.chaos.remoting.grpc.Messages.RemoteInvocationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chaos.remoting.grpc.Messages.RemoteInvocationRequest,
      com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> getGetRemoteInfoMethod() {
    io.grpc.MethodDescriptor<com.chaos.remoting.grpc.Messages.RemoteInvocationRequest, com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> getGetRemoteInfoMethod;
    if ((getGetRemoteInfoMethod = RemotingServiceGrpc.getGetRemoteInfoMethod) == null) {
      synchronized (RemotingServiceGrpc.class) {
        if ((getGetRemoteInfoMethod = RemotingServiceGrpc.getGetRemoteInfoMethod) == null) {
          RemotingServiceGrpc.getGetRemoteInfoMethod = getGetRemoteInfoMethod = 
              io.grpc.MethodDescriptor.<com.chaos.remoting.grpc.Messages.RemoteInvocationRequest, com.chaos.remoting.grpc.Messages.RemoteInvocationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.chaos.remoting.grpc.RemotingService", "getRemoteInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chaos.remoting.grpc.Messages.RemoteInvocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chaos.remoting.grpc.Messages.RemoteInvocationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RemotingServiceMethodDescriptorSupplier("getRemoteInfo"))
                  .build();
          }
        }
     }
     return getGetRemoteInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemotingServiceStub newStub(io.grpc.Channel channel) {
    return new RemotingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemotingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RemotingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemotingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RemotingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RemotingServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void execute(com.chaos.remoting.grpc.Messages.RemoteInvocationRequest request,
        io.grpc.stub.StreamObserver<com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getExecuteMethod(), responseObserver);
    }

    /**
     */
    public void getRemoteInfo(com.chaos.remoting.grpc.Messages.RemoteInvocationRequest request,
        io.grpc.stub.StreamObserver<com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRemoteInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExecuteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.chaos.remoting.grpc.Messages.RemoteInvocationRequest,
                com.chaos.remoting.grpc.Messages.RemoteInvocationResponse>(
                  this, METHODID_EXECUTE)))
          .addMethod(
            getGetRemoteInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.chaos.remoting.grpc.Messages.RemoteInvocationRequest,
                com.chaos.remoting.grpc.Messages.RemoteInvocationResponse>(
                  this, METHODID_GET_REMOTE_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class RemotingServiceStub extends io.grpc.stub.AbstractStub<RemotingServiceStub> {
    private RemotingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RemotingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemotingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RemotingServiceStub(channel, callOptions);
    }

    /**
     */
    public void execute(com.chaos.remoting.grpc.Messages.RemoteInvocationRequest request,
        io.grpc.stub.StreamObserver<com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRemoteInfo(com.chaos.remoting.grpc.Messages.RemoteInvocationRequest request,
        io.grpc.stub.StreamObserver<com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRemoteInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RemotingServiceBlockingStub extends io.grpc.stub.AbstractStub<RemotingServiceBlockingStub> {
    private RemotingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RemotingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemotingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RemotingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.chaos.remoting.grpc.Messages.RemoteInvocationResponse execute(com.chaos.remoting.grpc.Messages.RemoteInvocationRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecuteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.chaos.remoting.grpc.Messages.RemoteInvocationResponse getRemoteInfo(com.chaos.remoting.grpc.Messages.RemoteInvocationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRemoteInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RemotingServiceFutureStub extends io.grpc.stub.AbstractStub<RemotingServiceFutureStub> {
    private RemotingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RemotingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemotingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RemotingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> execute(
        com.chaos.remoting.grpc.Messages.RemoteInvocationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecuteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chaos.remoting.grpc.Messages.RemoteInvocationResponse> getRemoteInfo(
        com.chaos.remoting.grpc.Messages.RemoteInvocationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRemoteInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE = 0;
  private static final int METHODID_GET_REMOTE_INFO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RemotingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RemotingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXECUTE:
          serviceImpl.execute((com.chaos.remoting.grpc.Messages.RemoteInvocationRequest) request,
              (io.grpc.stub.StreamObserver<com.chaos.remoting.grpc.Messages.RemoteInvocationResponse>) responseObserver);
          break;
        case METHODID_GET_REMOTE_INFO:
          serviceImpl.getRemoteInfo((com.chaos.remoting.grpc.Messages.RemoteInvocationRequest) request,
              (io.grpc.stub.StreamObserver<com.chaos.remoting.grpc.Messages.RemoteInvocationResponse>) responseObserver);
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

  private static abstract class RemotingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemotingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.chaos.remoting.grpc.Services.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RemotingService");
    }
  }

  private static final class RemotingServiceFileDescriptorSupplier
      extends RemotingServiceBaseDescriptorSupplier {
    RemotingServiceFileDescriptorSupplier() {}
  }

  private static final class RemotingServiceMethodDescriptorSupplier
      extends RemotingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RemotingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RemotingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RemotingServiceFileDescriptorSupplier())
              .addMethod(getExecuteMethod())
              .addMethod(getGetRemoteInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
