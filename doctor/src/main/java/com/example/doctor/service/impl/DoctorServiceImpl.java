package com.example.doctor.service.impl;

import com.example.doctor.dto.Doctordto;
import com.example.doctor.model.Doctor;
import com.example.doctor.repository.DoctorRepo;
import com.example.doctor.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class DoctorServiceImpl implements DoctorService {


    private final DoctorRepo doctorRepository;


    public DoctorServiceImpl(
            DoctorRepo doctorRepository

    ) {
        this.doctorRepository = doctorRepository;
          // <-- gRPC client injection
    }
    @Override
    public Doctordto createDoctor(Doctordto dto) {

        Doctor doctor = new Doctor();
        doctor.setName(dto.getName());
        doctor.setSpeciality(dto.getSpeciality());
        doctor.setPhone(dto.getPhone());
        doctor.setEmail(dto.getEmail());

        Doctor savedDoctor = doctorRepository.save(doctor);

        return new Doctordto(
                savedDoctor.getId(),
                savedDoctor.getName(),
                savedDoctor.getSpeciality(),
                savedDoctor.getPhone(),
                savedDoctor.getEmail()
        );
    }

    @Override
    public Doctordto getDoctorById(UUID id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        return new Doctordto(
                doctor.getId(),
                doctor.getName(),
                doctor.getSpeciality(),
                doctor.getPhone(),
                doctor.getEmail()
        );
    }

    @Override
    public List<Doctordto> getAllDoctors() {
        return doctorRepository.findAll()
                .stream()
                .map(doctor -> new Doctordto(
                        doctor.getId(),
                        doctor.getName(),
                        doctor.getSpeciality(),
                        doctor.getPhone(),
                        doctor.getEmail()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public Doctordto updateDoctor(UUID id, Doctordto dto) {

        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        doctor.setName(dto.getName());
        doctor.setSpeciality(dto.getSpeciality());
        doctor.setPhone(dto.getPhone());
        doctor.setEmail(dto.getEmail());

        Doctor updatedDoctor = doctorRepository.save(doctor);

        return new Doctordto(
                updatedDoctor.getId(),
                updatedDoctor.getName(),
                updatedDoctor.getSpeciality(),
                updatedDoctor.getPhone(),
                updatedDoctor.getEmail()
        );
    }

    @Override
    public void deleteDoctor(UUID id) {
        doctorRepository.deleteById(id);
    }
}
