package com.agustin.CRM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Entity
public class Tipo_cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID tipo_cliente_id;

    @NotNull
    private String nombre;

    private String descripcion;
}
