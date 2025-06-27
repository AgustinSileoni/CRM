package com.agustin.CRM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Entity
public class Provincia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID provincia_id;

    @NotNull
    @Column(unique = true)
    private Integer codigo_provincia;

    @NotNull
    private String nombre;
}
