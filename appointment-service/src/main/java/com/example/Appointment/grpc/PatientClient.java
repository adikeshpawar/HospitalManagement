package com.example.Appointment.grpc;

import com.example.patientmanagement.grpc.PatientRequest;
import com.example.patientmanagement.grpc.PatientResponse;
import com.example.patientmanagement.grpc.PatientServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class PatientClient {

    private PatientServiceGrpc.PatientServiceBlockingStub patientStub;

    @PostConstruct
    public void init() {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9090)  // patient-service gRPC port
                .usePlaintext()
                .build();

        patientStub = PatientServiceGrpc.newBlockingStub(channel);
    }

    public PatientResponse getPatientById(String id) {

        PatientRequest request = PatientRequest.newBuilder()
                .setId(id)
                .build();

        return patientStub.getPatientById(request);
    }
}
