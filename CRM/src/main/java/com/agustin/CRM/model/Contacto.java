package com.agustin.CRM.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Entity
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID contacto_id;

    @NotNull
    private String nombre;

    @NotNull
    private Integer telefono;

    @NotNull
    @Email
    private String email;

    private String observacion;
}
