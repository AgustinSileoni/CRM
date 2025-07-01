package com.agustin.CRM.repository;

import com.agustin.CRM.model.Tipo_cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Tipo_ClienteRepository extends JpaRepository<Tipo_cliente, UUID> {
}
