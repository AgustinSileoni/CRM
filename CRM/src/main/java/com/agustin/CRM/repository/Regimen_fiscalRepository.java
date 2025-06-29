package com.agustin.CRM.repository;

import com.agustin.CRM.model.Regimen_fiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface Regimen_fiscalRepository extends JpaRepository<Regimen_fiscal, UUID> {
}
