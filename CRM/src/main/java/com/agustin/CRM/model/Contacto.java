package com.agustin.CRM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;


@Getter
@Setter
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

    @OneToMany(mappedBy = "contacto")
    private Set<Cliente_contacto> clientes;

}
