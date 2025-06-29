package com.agustin.CRM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Contacto extends JpaRepository<Contacto, UUID> {
}
