package com.example.Appointment.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentDto {
    private String patientId;
    private String doctorId;
    private String date; // "YYYY-MM-DD"
    private String time; // "HH:mm"
}
