package com.agustin.CRM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Entity
public class Cliente_contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cliente_contacto_id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "contacto_id")
    private Contacto contacto;

    @NotNull
    private String rol;

}
