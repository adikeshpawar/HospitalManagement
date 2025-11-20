package com.example.doctor.repository;

import com.example.doctor.model.Doctor;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepo extends JpaRepository<Doctor, UUID> {
}
