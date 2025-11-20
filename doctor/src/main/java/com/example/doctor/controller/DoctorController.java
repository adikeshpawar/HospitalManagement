package com.example.doctor.controller;

import com.example.doctor.dto.Doctordto;
import com.example.doctor.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/doctors")
@RequiredArgsConstructor
@CrossOrigin
public class DoctorController {

    private final DoctorService doctorService;
    @PostMapping
    public ResponseEntity<Doctordto> createDoctor(@RequestBody Doctordto dto) {
        Doctordto created = doctorService.createDoctor(dto);
        return ResponseEntity.ok(created);
    }


    @GetMapping
    public ResponseEntity<List<Doctordto>> getAllDoctors() {
        List<Doctordto> doctors = doctorService.getAllDoctors();
        return ResponseEntity.ok(doctors);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Doctordto> getDoctorById(@PathVariable("id") UUID id) {
        Doctordto doctor = doctorService.getDoctorById(id);
        return ResponseEntity.ok(doctor);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Doctordto> updateDoctor(
            @PathVariable("id") UUID id,
            @RequestBody Doctordto dto) {
        return ResponseEntity.ok(doctorService.updateDoctor(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDoctor(@PathVariable("id") UUID id) {
        doctorService.deleteDoctor(id);
        return ResponseEntity.ok("Doctor deleted successfully");
    }
    // ------------------------------------------------------------
    // 🔥 TEST gRPC CALL
    // ------------------------------------------------------------

}
