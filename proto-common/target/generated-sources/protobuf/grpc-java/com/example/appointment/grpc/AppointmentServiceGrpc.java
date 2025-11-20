package com.example.appointment.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.53.0)",
    comments = "Source: appointment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AppointmentServiceGrpc {

  private AppointmentServiceGrpc() {}

  public static final String SERVICE_NAME = "appointment.AppointmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.appointment.grpc.AppointmentCreateRequest,
      com.example.appointment.grpc.AppointmentResponse> getBookAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookAppointment",
      requestType = com.example.appointment.grpc.AppointmentCreateRequest.class,
      responseType = com.example.appointment.grpc.AppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.appointment.grpc.AppointmentCreateRequest,
      com.example.appointment.grpc.AppointmentResponse> getBookAppointmentMethod() {
    io.grpc.MethodDescriptor<com.example.appointment.grpc.AppointmentCreateRequest, com.example.appointment.grpc.AppointmentResponse> getBookAppointmentMethod;
    if ((getBookAppointmentMethod = AppointmentServiceGrpc.getBookAppointmentMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getBookAppointmentMethod = AppointmentServiceGrpc.getBookAppointmentMethod) == null) {
          AppointmentServiceGrpc.getBookAppointmentMethod = getBookAppointmentMethod =
              io.grpc.MethodDescriptor.<com.example.appointment.grpc.AppointmentCreateRequest, com.example.appointment.grpc.AppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BookAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.appointment.grpc.AppointmentCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.appointment.grpc.AppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("BookAppointment"))
              .build();
        }
      }
    }
    return getBookAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.appointment.grpc.AppointmentIdRequest,
      com.example.appointment.grpc.AppointmentResponse> getGetAppointmentByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointmentById",
      requestType = com.example.appointment.grpc.AppointmentIdRequest.class,
      responseType = com.example.appointment.grpc.AppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.appointment.grpc.AppointmentIdRequest,
      com.example.appointment.grpc.AppointmentResponse> getGetAppointmentByIdMethod() {
    io.grpc.MethodDescriptor<com.example.appointment.grpc.AppointmentIdRequest, com.example.appointment.grpc.AppointmentResponse> getGetAppointmentByIdMethod;
    if ((getGetAppointmentByIdMethod = AppointmentServiceGrpc.getGetAppointmentByIdMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getGetAppointmentByIdMethod = AppointmentServiceGrpc.getGetAppointmentByIdMethod) == null) {
          AppointmentServiceGrpc.getGetAppointmentByIdMethod = getGetAppointmentByIdMethod =
              io.grpc.MethodDescriptor.<com.example.appointment.grpc.AppointmentIdRequest, com.example.appointment.grpc.AppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointmentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.appointment.grpc.AppointmentIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.appointment.grpc.AppointmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("GetAppointmentById"))
              .build();
        }
      }
    }
    return getGetAppointmentByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.appointment.grpc.PatientIdRequest,
      com.example.appointment.grpc.AppointmentListResponse> getGetAppointmentsByPatientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointmentsByPatient",
      requestType = com.example.appointment.grpc.PatientIdRequest.class,
      responseType = com.example.appointment.grpc.AppointmentListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.appointment.grpc.PatientIdRequest,
      com.example.appointment.grpc.AppointmentListResponse> getGetAppointmentsByPatientMethod() {
    io.grpc.MethodDescriptor<com.example.appointment.grpc.PatientIdRequest, com.example.appointment.grpc.AppointmentListResponse> getGetAppointmentsByPatientMethod;
    if ((getGetAppointmentsByPatientMethod = AppointmentServiceGrpc.getGetAppointmentsByPatientMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getGetAppointmentsByPatientMethod = AppointmentServiceGrpc.getGetAppointmentsByPatientMethod) == null) {
          AppointmentServiceGrpc.getGetAppointmentsByPatientMethod = getGetAppointmentsByPatientMethod =
              io.grpc.MethodDescriptor.<com.example.appointment.grpc.PatientIdRequest, com.example.appointment.grpc.AppointmentListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointmentsByPatient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.appointment.grpc.PatientIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.appointment.grpc.AppointmentListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("GetAppointmentsByPatient"))
              .build();
        }
      }
    }
    return getGetAppointmentsByPatientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.appointment.grpc.DoctorIdRequest,
      com.example.appointment.grpc.AppointmentListResponse> getGetAppointmentsByDoctorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAppointmentsByDoctor",
      requestType = com.example.appointment.grpc.DoctorIdRequest.class,
      responseType = com.example.appointment.grpc.AppointmentListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.appointment.grpc.DoctorIdRequest,
      com.example.appointment.grpc.AppointmentListResponse> getGetAppointmentsByDoctorMethod() {
    io.grpc.MethodDescriptor<com.example.appointment.grpc.DoctorIdRequest, com.example.appointment.grpc.AppointmentListResponse> getGetAppointmentsByDoctorMethod;
    if ((getGetAppointmentsByDoctorMethod = AppointmentServiceGrpc.getGetAppointmentsByDoctorMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getGetAppointmentsByDoctorMethod = AppointmentServiceGrpc.getGetAppointmentsByDoctorMethod) == null) {
          AppointmentServiceGrpc.getGetAppointmentsByDoctorMethod = getGetAppointmentsByDoctorMethod =
              io.grpc.MethodDescriptor.<com.example.appointment.grpc.DoctorIdRequest, com.example.appointment.grpc.AppointmentListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAppointmentsByDoctor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.appointment.grpc.DoctorIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.appointment.grpc.AppointmentListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("GetAppointmentsByDoctor"))
              .build();
        }
      }
    }
    return getGetAppointmentsByDoctorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.appointment.grpc.TestRequest,
      com.example.appointment.grpc.TestResponse> getTestConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestConnection",
      requestType = com.example.appointment.grpc.TestRequest.class,
      responseType = com.example.appointment.grpc.TestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.appointment.grpc.TestRequest,
      com.example.appointment.grpc.TestResponse> getTestConnectionMethod() {
    io.grpc.MethodDescriptor<com.example.appointment.grpc.TestRequest, com.example.appointment.grpc.TestResponse> getTestConnectionMethod;
    if ((getTestConnectionMethod = AppointmentServiceGrpc.getTestConnectionMethod) == null) {
      synchronized (AppointmentServiceGrpc.class) {
        if ((getTestConnectionMethod = AppointmentServiceGrpc.getTestConnectionMethod) == null) {
          AppointmentServiceGrpc.getTestConnectionMethod = getTestConnectionMethod =
              io.grpc.MethodDescriptor.<com.example.appointment.grpc.TestRequest, com.example.appointment.grpc.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.appointment.grpc.TestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.appointment.grpc.TestResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AppointmentServiceMethodDescriptorSupplier("TestConnection"))
              .build();
        }
      }
    }
    return getTestConnectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AppointmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceStub>() {
        @java.lang.Override
        public AppointmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceStub(channel, callOptions);
        }
      };
    return AppointmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AppointmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceBlockingStub>() {
        @java.lang.Override
        public AppointmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceBlockingStub(channel, callOptions);
        }
      };
    return AppointmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AppointmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AppointmentServiceFutureStub>() {
        @java.lang.Override
        public AppointmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AppointmentServiceFutureStub(channel, callOptions);
        }
      };
    return AppointmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AppointmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void bookAppointment(com.example.appointment.grpc.AppointmentCreateRequest request,
        io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookAppointmentMethod(), responseObserver);
    }

    /**
     */
    public void getAppointmentById(com.example.appointment.grpc.AppointmentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAppointmentsByPatient(com.example.appointment.grpc.PatientIdRequest request,
        io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentsByPatientMethod(), responseObserver);
    }

    /**
     */
    public void getAppointmentsByDoctor(com.example.appointment.grpc.DoctorIdRequest request,
        io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppointmentsByDoctorMethod(), responseObserver);
    }

    /**
     */
    public void testConnection(com.example.appointment.grpc.TestRequest request,
        io.grpc.stub.StreamObserver<com.example.appointment.grpc.TestResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestConnectionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBookAppointmentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.appointment.grpc.AppointmentCreateRequest,
                com.example.appointment.grpc.AppointmentResponse>(
                  this, METHODID_BOOK_APPOINTMENT)))
          .addMethod(
            getGetAppointmentByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.appointment.grpc.AppointmentIdRequest,
                com.example.appointment.grpc.AppointmentResponse>(
                  this, METHODID_GET_APPOINTMENT_BY_ID)))
          .addMethod(
            getGetAppointmentsByPatientMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.appointment.grpc.PatientIdRequest,
                com.example.appointment.grpc.AppointmentListResponse>(
                  this, METHODID_GET_APPOINTMENTS_BY_PATIENT)))
          .addMethod(
            getGetAppointmentsByDoctorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.appointment.grpc.DoctorIdRequest,
                com.example.appointment.grpc.AppointmentListResponse>(
                  this, METHODID_GET_APPOINTMENTS_BY_DOCTOR)))
          .addMethod(
            getTestConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.appointment.grpc.TestRequest,
                com.example.appointment.grpc.TestResponse>(
                  this, METHODID_TEST_CONNECTION)))
          .build();
    }
  }

  /**
   */
  public static final class AppointmentServiceStub extends io.grpc.stub.AbstractAsyncStub<AppointmentServiceStub> {
    private AppointmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void bookAppointment(com.example.appointment.grpc.AppointmentCreateRequest request,
        io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAppointmentById(com.example.appointment.grpc.AppointmentIdRequest request,
        io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAppointmentsByPatient(com.example.appointment.grpc.PatientIdRequest request,
        io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentsByPatientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAppointmentsByDoctor(com.example.appointment.grpc.DoctorIdRequest request,
        io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppointmentsByDoctorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testConnection(com.example.appointment.grpc.TestRequest request,
        io.grpc.stub.StreamObserver<com.example.appointment.grpc.TestResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestConnectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AppointmentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AppointmentServiceBlockingStub> {
    private AppointmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.appointment.grpc.AppointmentResponse bookAppointment(com.example.appointment.grpc.AppointmentCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookAppointmentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.appointment.grpc.AppointmentResponse getAppointmentById(com.example.appointment.grpc.AppointmentIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.appointment.grpc.AppointmentListResponse getAppointmentsByPatient(com.example.appointment.grpc.PatientIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentsByPatientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.appointment.grpc.AppointmentListResponse getAppointmentsByDoctor(com.example.appointment.grpc.DoctorIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppointmentsByDoctorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.appointment.grpc.TestResponse testConnection(com.example.appointment.grpc.TestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestConnectionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AppointmentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AppointmentServiceFutureStub> {
    private AppointmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AppointmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AppointmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.appointment.grpc.AppointmentResponse> bookAppointment(
        com.example.appointment.grpc.AppointmentCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookAppointmentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.appointment.grpc.AppointmentResponse> getAppointmentById(
        com.example.appointment.grpc.AppointmentIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.appointment.grpc.AppointmentListResponse> getAppointmentsByPatient(
        com.example.appointment.grpc.PatientIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentsByPatientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.appointment.grpc.AppointmentListResponse> getAppointmentsByDoctor(
        com.example.appointment.grpc.DoctorIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppointmentsByDoctorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.appointment.grpc.TestResponse> testConnection(
        com.example.appointment.grpc.TestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestConnectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_APPOINTMENT = 0;
  private static final int METHODID_GET_APPOINTMENT_BY_ID = 1;
  private static final int METHODID_GET_APPOINTMENTS_BY_PATIENT = 2;
  private static final int METHODID_GET_APPOINTMENTS_BY_DOCTOR = 3;
  private static final int METHODID_TEST_CONNECTION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AppointmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AppointmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOK_APPOINTMENT:
          serviceImpl.bookAppointment((com.example.appointment.grpc.AppointmentCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENT_BY_ID:
          serviceImpl.getAppointmentById((com.example.appointment.grpc.AppointmentIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENTS_BY_PATIENT:
          serviceImpl.getAppointmentsByPatient((com.example.appointment.grpc.PatientIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentListResponse>) responseObserver);
          break;
        case METHODID_GET_APPOINTMENTS_BY_DOCTOR:
          serviceImpl.getAppointmentsByDoctor((com.example.appointment.grpc.DoctorIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.appointment.grpc.AppointmentListResponse>) responseObserver);
          break;
        case METHODID_TEST_CONNECTION:
          serviceImpl.testConnection((com.example.appointment.grpc.TestRequest) request,
              (io.grpc.stub.StreamObserver<com.example.appointment.grpc.TestResponse>) responseObserver);
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

  private static abstract class AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AppointmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.appointment.grpc.AppointmentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AppointmentService");
    }
  }

  private static final class AppointmentServiceFileDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier {
    AppointmentServiceFileDescriptorSupplier() {}
  }

  private static final class AppointmentServiceMethodDescriptorSupplier
      extends AppointmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AppointmentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AppointmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AppointmentServiceFileDescriptorSupplier())
              .addMethod(getBookAppointmentMethod())
              .addMethod(getGetAppointmentByIdMethod())
              .addMethod(getGetAppointmentsByPatientMethod())
              .addMethod(getGetAppointmentsByDoctorMethod())
              .addMethod(getTestConnectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
