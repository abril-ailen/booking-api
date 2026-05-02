package com.abrilailen.bookingapi.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.abrilailen.bookingapi.dto.ProfessionalRequestDTO;
import com.abrilailen.bookingapi.dto.ProfessionalResponseDTO;
import com.abrilailen.bookingapi.model.Professional;

@Mapper(componentModel = "spring")
public interface ProfessionalMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "isActive", ignore = true)
    Professional toEntity(ProfessionalRequestDTO dto);
    
    ProfessionalResponseDTO toResponseDTO(Professional entity);
    
    List<ProfessionalResponseDTO> toResponseList(List<Professional> professionals);
}
