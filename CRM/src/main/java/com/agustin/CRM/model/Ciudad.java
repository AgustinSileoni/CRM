package com.agustin.CRM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ciudad_id;

    @NotNull
    @Column(unique = true)
    private Integer codigo_ciudad;

    @NotNull
    private Integer codigo_postal;

    @NotNull
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;


}
