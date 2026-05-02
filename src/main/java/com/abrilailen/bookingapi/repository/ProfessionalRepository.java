package com.abrilailen.bookingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abrilailen.bookingapi.model.Professional;
import java.util.Optional;


@Repository
public interface ProfessionalRepository extends JpaRepository<Professional, Long>{
    Optional<Professional> findByNationalId(String nationalId);
}
