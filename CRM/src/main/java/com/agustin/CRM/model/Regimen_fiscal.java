package com.agustin.CRM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Regimen_fiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID regimen_fiscal_id;

    @NotNull
    private String nombre;

    private String tipo_factura;
}
