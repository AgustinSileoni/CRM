package com.agustin.CRM.repository;

import com.agustin.CRM.model.Cliente_contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Client_contactoRepository extends JpaRepository<Cliente_contacto, UUID> {
}
