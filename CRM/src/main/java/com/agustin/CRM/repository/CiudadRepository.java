package com.agustin.CRM.repository;

import com.agustin.CRM.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, UUID> {
}
