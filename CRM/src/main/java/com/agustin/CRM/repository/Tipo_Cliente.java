package com.agustin.CRM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Tipo_Cliente extends JpaRepository<Tipo_Cliente, UUID> {
}
