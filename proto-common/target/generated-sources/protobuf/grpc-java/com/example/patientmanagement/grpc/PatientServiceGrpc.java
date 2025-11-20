package com.example.patientmanagement.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: patient.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PatientServiceGrpc {

  private PatientServiceGrpc() {}

  public static final String SERVICE_NAME = "patient.PatientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.patientmanagement.grpc.PatientRequest,
      com.example.patientmanagement.grpc.PatientResponse> getGetPatientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPatientById",
      requestType = com.example.patientmanagement.grpc.PatientRequest.class,
      responseType = com.example.patientmanagement.grpc.PatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.patientmanagement.grpc.PatientRequest,
      com.example.patientmanagement.grpc.PatientResponse> getGetPatientByIdMethod() {
    io.grpc.MethodDescriptor<com.example.patientmanagement.grpc.PatientRequest, com.example.patientmanagement.grpc.PatientResponse> getGetPatientByIdMethod;
    if ((getGetPatientByIdMethod = PatientServiceGrpc.getGetPatientByIdMethod) == null) {
      synchronized (PatientServiceGrpc.class) {
        if ((getGetPatientByIdMethod = PatientServiceGrpc.getGetPatientByIdMethod) == null) {
          PatientServiceGrpc.getGetPatientByIdMethod = getGetPatientByIdMethod =
              io.grpc.MethodDescriptor.<com.example.patientmanagement.grpc.PatientRequest, com.example.patientmanagement.grpc.PatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPatientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.patientmanagement.grpc.PatientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.patientmanagement.grpc.PatientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PatientServiceMethodDescriptorSupplier("GetPatientById"))
              .build();
        }
      }
    }
    return getGetPatientByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PatientServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServiceStub>() {
        @java.lang.Override
        public PatientServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServiceStub(channel, callOptions);
        }
      };
    return PatientServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PatientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServiceBlockingStub>() {
        @java.lang.Override
        public PatientServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServiceBlockingStub(channel, callOptions);
        }
      };
    return PatientServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PatientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PatientServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PatientServiceFutureStub>() {
        @java.lang.Override
        public PatientServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PatientServiceFutureStub(channel, callOptions);
        }
      };
    return PatientServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PatientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPatientById(com.example.patientmanagement.grpc.PatientRequest request,
        io.grpc.stub.StreamObserver<com.example.patientmanagement.grpc.PatientResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPatientByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPatientByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.patientmanagement.grpc.PatientRequest,
                com.example.patientmanagement.grpc.PatientResponse>(
                  this, METHODID_GET_PATIENT_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class PatientServiceStub extends io.grpc.stub.AbstractAsyncStub<PatientServiceStub> {
    private PatientServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPatientById(com.example.patientmanagement.grpc.PatientRequest request,
        io.grpc.stub.StreamObserver<com.example.patientmanagement.grpc.PatientResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPatientByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PatientServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PatientServiceBlockingStub> {
    private PatientServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.patientmanagement.grpc.PatientResponse getPatientById(com.example.patientmanagement.grpc.PatientRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPatientByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PatientServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PatientServiceFutureStub> {
    private PatientServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PatientServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PatientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.patientmanagement.grpc.PatientResponse> getPatientById(
        com.example.patientmanagement.grpc.PatientRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPatientByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PATIENT_BY_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PatientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PatientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PATIENT_BY_ID:
          serviceImpl.getPatientById((com.example.patientmanagement.grpc.PatientRequest) request,
              (io.grpc.stub.StreamObserver<com.example.patientmanagement.grpc.PatientResponse>) responseObserver);
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

  private static abstract class PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PatientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.patientmanagement.grpc.PatientProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PatientService");
    }
  }

  private static final class PatientServiceFileDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier {
    PatientServiceFileDescriptorSupplier() {}
  }

  private static final class PatientServiceMethodDescriptorSupplier
      extends PatientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PatientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PatientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PatientServiceFileDescriptorSupplier())
              .addMethod(getGetPatientByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
