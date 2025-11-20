package com.example.Appointment.service.impl;

import com.example.Appointment.dto.AppointmentDto;
import com.example.Appointment.model.Appointment;
import com.example.Appointment.repository.AppointmentRepo;
import com.example.Appointment.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepo appointmentRepo;

    @Override
    public Appointment bookAppointment(UUID patientId, UUID doctorId, String date, String time) {

        LocalDate parsedDate = LocalDate.parse(date);
        LocalTime parsedTime = LocalTime.parse(time);

        // ------ CHECK IF DOCTOR ALREADY BOOKED AT THIS SLOT ------
        boolean exists = appointmentRepo
                .existsByDoctorIdAndDateAndTime(doctorId, parsedDate, parsedTime);

        if (exists) {
            throw new RuntimeException("Doctor already has an appointment at this time");
        }

        // ------ CREATE NEW APPOINTMENT ------
        Appointment appointment = Appointment.builder()
                .patientId(patientId)
                .doctorId(doctorId)
                .date(parsedDate)
                .time(parsedTime)
                .status("BOOKED")
                .build();

        return appointmentRepo.save(appointment);
    }

    @Override
    public Appointment getAppointmentById(UUID id) {
        return appointmentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));
    }

    @Override
    public List<Appointment> getAppointmentsByPatient(UUID patientId) {
        return appointmentRepo.findByPatientId(patientId);
    }

    @Override
    public List<Appointment> getAppointmentsByDoctor(UUID doctorId) {
        return appointmentRepo.findByDoctorId(doctorId);
    }
}
