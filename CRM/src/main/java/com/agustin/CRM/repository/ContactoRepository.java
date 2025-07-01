package com.agustin.CRM.repository;

import com.agustin.CRM.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, UUID> {
}
