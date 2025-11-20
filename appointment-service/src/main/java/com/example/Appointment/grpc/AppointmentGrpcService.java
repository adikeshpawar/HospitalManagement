package com.example.Appointment.grpc;

import com.example.appointment.grpc.AppointmentServiceGrpc;
import com.example.appointment.grpc.TestRequest;
import com.example.appointment.grpc.TestResponse;

import com.example.doctor.grpc.DoctorResponse;
import com.example.patientmanagement.grpc.PatientResponse;

import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service   // Spring bean, not gRPC server annotation
public class AppointmentGrpcService extends AppointmentServiceGrpc.AppointmentServiceImplBase {

    private final DoctorClient doctorClient;
    private final PatientClient patientClient;

    public AppointmentGrpcService(DoctorClient doctorClient, PatientClient patientClient) {
        this.doctorClient = doctorClient;
        this.patientClient = patientClient;
    }

    @Override
    public void testConnection(
            TestRequest testRequest,
            StreamObserver<TestResponse> responseObserver) {

        // 1️⃣ Call patient-service via PatientClient
        PatientResponse patient = patientClient.getPatientById(testRequest.getPatientId());

        // 2️⃣ Call doctor-service via DoctorClient
        DoctorResponse doctor = doctorClient.getDoctorById(testRequest.getDoctorId());

        // 3️⃣ Build response
        TestResponse response = TestResponse.newBuilder()
                .setPatientName(patient.getName())
                .setDoctorName(doctor.getName())
                .build();

        // 4️⃣ Return response
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
