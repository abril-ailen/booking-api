package com.abrilailen.bookingapi.dto;

import java.time.LocalTime;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfessionalRequestDTO {

    @NotBlank
    private String firstName;
    
    @NotBlank
    private String lastName;
    
    @NotBlank
    @Pattern(regexp = "^[0-9]{7,8}$")
    private String nationalId;

    private String specialty;

    @NotNull
    private LocalTime startTime;

    @NotNull
    private LocalTime endTime;

    @Email
    @NotBlank
    private String email;    
}
