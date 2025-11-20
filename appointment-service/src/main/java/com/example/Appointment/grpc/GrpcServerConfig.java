package com.example.Appointment.grpc;

import com.example.appointment.grpc.AppointmentServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class GrpcServerConfig {

    private final AppointmentGrpcService appointmentGrpcService;

    public GrpcServerConfig(AppointmentGrpcService appointmentGrpcService) {
        this.appointmentGrpcService = appointmentGrpcService;
    }

    @PostConstruct
    public void startGrpcServer() throws Exception {

        Server server = ServerBuilder
                .forPort(9092)   // appointment-service gRPC port
                .addService(appointmentGrpcService)
                .build()
                .start();

        System.out.println("🚀 gRPC Server started on port 9092");

        Runtime.getRuntime().addShutdownHook(new Thread(server::shutdown));
    }
}
