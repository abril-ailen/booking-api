package com.abrilailen.bookingapi.dto;

import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfessionalResponseDTO {

    private Long id;
    private String fullName;
    private String specialty;
    private LocalTime startTime;
    private LocalTime endTime;
    private Boolean isActive;
    private String email;
}
