package com.example.doctor.dto;

import lombok.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Doctordto {

    private UUID id;
    private String name;
    private String speciality;
    private String phone;
    private String email;
}
