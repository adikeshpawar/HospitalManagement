package com.example.patientmanagement.service;

import com.example.patientmanagement.dto.PatientDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface PatientService {
    PatientDto createPatient (PatientDto patientDto);
    List<PatientDto> getAllPatient();
    PatientDto getPatientById(UUID id);
    PatientDto updatePatient(PatientDto patientDto,UUID id);
    void  deletePatient(UUID id);
}
