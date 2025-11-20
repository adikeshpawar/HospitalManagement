package com.example.doctor.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: doctor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DoctorServiceGrpc {

  private DoctorServiceGrpc() {}

  public static final String SERVICE_NAME = "doctor.DoctorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.doctor.grpc.DoctorRequest,
      com.example.doctor.grpc.DoctorResponse> getGetDoctorByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDoctorById",
      requestType = com.example.doctor.grpc.DoctorRequest.class,
      responseType = com.example.doctor.grpc.DoctorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.doctor.grpc.DoctorRequest,
      com.example.doctor.grpc.DoctorResponse> getGetDoctorByIdMethod() {
    io.grpc.MethodDescriptor<com.example.doctor.grpc.DoctorRequest, com.example.doctor.grpc.DoctorResponse> getGetDoctorByIdMethod;
    if ((getGetDoctorByIdMethod = DoctorServiceGrpc.getGetDoctorByIdMethod) == null) {
      synchronized (DoctorServiceGrpc.class) {
        if ((getGetDoctorByIdMethod = DoctorServiceGrpc.getGetDoctorByIdMethod) == null) {
          DoctorServiceGrpc.getGetDoctorByIdMethod = getGetDoctorByIdMethod =
              io.grpc.MethodDescriptor.<com.example.doctor.grpc.DoctorRequest, com.example.doctor.grpc.DoctorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDoctorById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.doctor.grpc.DoctorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.doctor.grpc.DoctorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DoctorServiceMethodDescriptorSupplier("getDoctorById"))
              .build();
        }
      }
    }
    return getGetDoctorByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DoctorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoctorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoctorServiceStub>() {
        @java.lang.Override
        public DoctorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoctorServiceStub(channel, callOptions);
        }
      };
    return DoctorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DoctorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoctorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoctorServiceBlockingStub>() {
        @java.lang.Override
        public DoctorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoctorServiceBlockingStub(channel, callOptions);
        }
      };
    return DoctorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DoctorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DoctorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DoctorServiceFutureStub>() {
        @java.lang.Override
        public DoctorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DoctorServiceFutureStub(channel, callOptions);
        }
      };
    return DoctorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DoctorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDoctorById(com.example.doctor.grpc.DoctorRequest request,
        io.grpc.stub.StreamObserver<com.example.doctor.grpc.DoctorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDoctorByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetDoctorByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.doctor.grpc.DoctorRequest,
                com.example.doctor.grpc.DoctorResponse>(
                  this, METHODID_GET_DOCTOR_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class DoctorServiceStub extends io.grpc.stub.AbstractAsyncStub<DoctorServiceStub> {
    private DoctorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoctorServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDoctorById(com.example.doctor.grpc.DoctorRequest request,
        io.grpc.stub.StreamObserver<com.example.doctor.grpc.DoctorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDoctorByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DoctorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DoctorServiceBlockingStub> {
    private DoctorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoctorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.doctor.grpc.DoctorResponse getDoctorById(com.example.doctor.grpc.DoctorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDoctorByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DoctorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DoctorServiceFutureStub> {
    private DoctorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoctorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DoctorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.doctor.grpc.DoctorResponse> getDoctorById(
        com.example.doctor.grpc.DoctorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDoctorByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOCTOR_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DoctorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DoctorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DOCTOR_BY_ID:
          serviceImpl.getDoctorById((com.example.doctor.grpc.DoctorRequest) request,
              (io.grpc.stub.StreamObserver<com.example.doctor.grpc.DoctorResponse>) responseObserver);
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

  private static abstract class DoctorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DoctorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.doctor.grpc.DoctorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DoctorService");
    }
  }

  private static final class DoctorServiceFileDescriptorSupplier
      extends DoctorServiceBaseDescriptorSupplier {
    DoctorServiceFileDescriptorSupplier() {}
  }

  private static final class DoctorServiceMethodDescriptorSupplier
      extends DoctorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DoctorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DoctorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DoctorServiceFileDescriptorSupplier())
              .addMethod(getGetDoctorByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
