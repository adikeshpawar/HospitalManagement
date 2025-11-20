package com.example.Appointment.service;

import com.example.Appointment.model.Appointment;

import java.util.List;
import java.util.UUID;

public interface AppointmentService {

    Appointment bookAppointment(UUID patientId, UUID doctorId, String date, String time);

    Appointment getAppointmentById(UUID id);

    List<Appointment> getAppointmentsByPatient(UUID patientId);

    List<Appointment> getAppointmentsByDoctor(UUID doctorId);
}
