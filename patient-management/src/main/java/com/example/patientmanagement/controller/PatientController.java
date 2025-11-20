package com.example.patientmanagement.controller;

import com.example.patientmanagement.dto.PatientDto;
import com.example.patientmanagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    // CREATE
    @PostMapping
    public ResponseEntity<PatientDto> createPatient(@RequestBody PatientDto patientDto) {
        return ResponseEntity.ok(patientService.createPatient(patientDto));
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<PatientDto>> getAllPatients() {
        return ResponseEntity.ok(patientService.getAllPatient());
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<PatientDto> getPatientById(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(patientService.getPatientById(id));
    }
    @PutMapping("/{id}")
    public ResponseEntity<PatientDto> updatePatient(
            @RequestBody PatientDto patientDto,
            @PathVariable("id") UUID id) {

        return ResponseEntity.ok(patientService.updatePatient(patientDto, id));
    }


    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable UUID id) {
        patientService.deletePatient(id);
        return ResponseEntity.noContent().build();
    }
}
