package com.example.Appointment.repository;

import com.example.Appointment.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.UUID;

public interface AppointmentRepo extends JpaRepository<Appointment, UUID> {

    boolean existsByDoctorIdAndDateAndTime(UUID doctorId, LocalDate date, LocalTime time);

    List<Appointment> findByPatientId(UUID patientId);

    List<Appointment> findByDoctorId(UUID doctorId);
}
