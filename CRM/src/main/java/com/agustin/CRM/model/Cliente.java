package com.agustin.CRM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;


@Getter
@Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cliente_id;

    @Column(unique = true)
    private Integer numero_cliente;

    @NotNull
    private String razon_social;

    @NotNull
    @Column(unique = true)
    private Integer dni;

    @NotNull
    @Column(unique = true)
    private Integer cuit;

    @NotNull
    private Integer telefono;

    @NotNull
    @Email
    private String email;

    private String observacion;

    private LocalDate fecha_nacimiento;

    @NotNull
    private LocalDate fecha_registro;


    @NotNull
    @ManyToOne
    @JoinColumn(name = "ciudad_id")
    private Ciudad ciudad;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "regimen_fiscal_id")
    private Regimen_fiscal regimen_fiscal;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tipo_cliente_id")
    private Tipo_cliente tipo_cliente;

    @OneToMany(mappedBy = "cliente")
    private Set<Cliente_contacto> contactos;

}
