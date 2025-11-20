package com.example.doctor.service;

import com.example.doctor.dto.Doctordto;

import java.util.List;
import java.util.UUID;

public interface DoctorService {
    Doctordto createDoctor(Doctordto dto);

    Doctordto getDoctorById(UUID id);

    List<Doctordto> getAllDoctors();

    Doctordto updateDoctor(UUID id, Doctordto dto);

    void deleteDoctor(UUID id);
}
