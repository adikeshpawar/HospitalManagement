package com.example.patientmanagement.grpc;

import com.example.patientmanagement.model.Patient;
import com.example.patientmanagement.repository.PatientRepository;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.UUID;

@RequiredArgsConstructor
@GrpcService
public class PatientGrpcService extends  PatientServiceGrpc.PatientServiceImplBase{

    private final PatientRepository patientRepository;

    @Override
    public void getPatientById(PatientRequest patientRequest, StreamObserver<PatientResponse>patientResponseStreamObserver){
        UUID id = UUID.fromString(patientRequest.getId());
        Patient patient = patientRepository.findById(id).orElseThrow(()->new RuntimeException("patient with the id not found"));

        PatientResponse patientResponse = PatientResponse.newBuilder()
                .setId(patientRequest.getId())
                .setName(patient.getName())
                .setEmail(patient.getEmail())
                .setAge(patient.getAge())
                .build();
        patientResponseStreamObserver.onNext(patientResponse);
        patientResponseStreamObserver.onCompleted();

    }
}
