package com.abrilailen.bookingapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abrilailen.bookingapi.model.Professional;

@Repository
public interface ProfessionalRepository extends JpaRepository<Professional, Long>{

}
