package com.example.Appointment.grpc;

import com.example.doctor.grpc.DoctorRequest;
import com.example.doctor.grpc.DoctorResponse;
import com.example.doctor.grpc.DoctorServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DoctorClient {

    private DoctorServiceGrpc.DoctorServiceBlockingStub doctorStub;

    @PostConstruct
    public void init() {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9091)  // doctor-service gRPC port
                .usePlaintext()
                .build();

        doctorStub = DoctorServiceGrpc.newBlockingStub(channel);
    }

    public DoctorResponse getDoctorById(String id) {

        DoctorRequest request = DoctorRequest.newBuilder()
                .setId(id)
                .build();

        return doctorStub.getDoctorById(request);
    }
}
