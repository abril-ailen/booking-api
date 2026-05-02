package com.abrilailen.bookingapi.service;

import org.springframework.stereotype.Service;

import com.abrilailen.bookingapi.repository.ProfessionalRepository;

import jakarta.transaction.Transactional;

import com.abrilailen.bookingapi.dto.ProfessionalRequestDTO;
import com.abrilailen.bookingapi.dto.ProfessionalResponseDTO;
import com.abrilailen.bookingapi.exception.DuplicateResourceException;
import com.abrilailen.bookingapi.exception.ResourceNotFoundException;
import com.abrilailen.bookingapi.mapper.ProfessionalMapper;
import com.abrilailen.bookingapi.model.Professional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProfessionalService {

    private final ProfessionalRepository repository;
    private final ProfessionalMapper mapper;

    @Transactional
    public ProfessionalResponseDTO create(ProfessionalRequestDTO dto) {
        if (repository.findByNationalId(dto.getNationalId()) != null)
            throw new DuplicateResourceException("NationalId already in use: " + dto.getNationalId());
        Professional professional = mapper.toEntity(dto);
        return mapper.toResponseDTO(repository.save(professional));
    }

    public ProfessionalResponseDTO read(Long id) {
        return repository.findById(id)
                .map(mapper::toResponseDTO)
                .orElseThrow(() -> new ResourceNotFoundException("Professional not found, id: " + id));
    }
}
