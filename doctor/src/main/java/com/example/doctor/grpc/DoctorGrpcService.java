package com.example.doctor.grpc;

import com.example.doctor.model.Doctor;
import com.example.doctor.repository.DoctorRepo;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.UUID;

@RequiredArgsConstructor
@GrpcService
public class DoctorGrpcService  extends  DoctorServiceGrpc.DoctorServiceImplBase{
    private final DoctorRepo doctorRepo;
    @Override
    public  void getDoctorById(DoctorRequest doctorRequest, StreamObserver<DoctorResponse>doctorResponseStreamObserver){
        UUID id = UUID.fromString(doctorRequest.getId());
        Doctor doctor = this.doctorRepo.findById(id).orElseThrow(()->new RuntimeException("doctor not found"));

        DoctorResponse doctorResponse = DoctorResponse.newBuilder()
                .setId(doctorRequest.getId())
                .setName(doctor.getName())
                .setSpeciality(doctor.getSpeciality())
                .build();
        doctorResponseStreamObserver.onNext(doctorResponse);
        doctorResponseStreamObserver.onCompleted();
    }

}