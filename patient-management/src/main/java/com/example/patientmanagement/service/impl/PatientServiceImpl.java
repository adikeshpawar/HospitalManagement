package com.example.patientmanagement.service.impl;

import com.example.patientmanagement.dto.PatientDto;
import com.example.patientmanagement.model.Patient;
import com.example.patientmanagement.repository.PatientRepository;
import com.example.patientmanagement.service.PatientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private ModelMapper modelMapper;

    // ✅ CREATE Patient
    @Override
    public PatientDto createPatient(PatientDto patientDto) {
        Patient patient = modelMapper.map(patientDto, Patient.class);
        Patient savedPatient = patientRepository.save(patient);
        return modelMapper.map(savedPatient, PatientDto.class);
    }

    // ✅ READ - Get All Patients
    @Override
    public List<PatientDto> getAllPatient() {
        return patientRepository.findAll()
                .stream()
                .map(patient -> modelMapper.map(patient, PatientDto.class))
                .collect(Collectors.toList());
    }

    // ✅ READ - Get Patient by ID
    @Override
    public PatientDto getPatientById(UUID id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with ID: " + id));
        return modelMapper.map(patient, PatientDto.class);
    }

    // ✅ UPDATE Patient
    @Override
    public PatientDto updatePatient(PatientDto patientDto, UUID id) {
        Patient existingPatient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with ID: " + id));

        // ✅ Don't map the ID — manually set only updatable fields
        existingPatient.setName(patientDto.getName());
        existingPatient.setEmail(patientDto.getEmail());
        existingPatient.setAddress(patientDto.getAddress());
        existingPatient.setDateOfBirth(patientDto.getDateOfBirth());
        existingPatient.setRegisteredDate(patientDto.getRegisteredDate());
        existingPatient.setAge(patientDto.getAge());
        Patient updatedPatient = patientRepository.save(existingPatient);
        return modelMapper.map(updatedPatient, PatientDto.class);
    }

    // ✅ DELETE Patient
    @Override
    public void deletePatient(UUID id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with ID: " + id));
        patientRepository.delete(patient);
    }
}
