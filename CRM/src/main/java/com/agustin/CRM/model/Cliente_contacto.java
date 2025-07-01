package com.agustin.CRM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

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

    public UUID getCliente_contacto_id() {
        return cliente_contacto_id;
    }

    public void setCliente_contacto_id(UUID cliente_contacto_id) {
        this.cliente_contacto_id = cliente_contacto_id;
    }

    public @NotNull Cliente getCliente() {
        return cliente;
    }

    public void setCliente(@NotNull Cliente cliente) {
        this.cliente = cliente;
    }

    public @NotNull Contacto getContacto() {
        return contacto;
    }

    public void setContacto(@NotNull Contacto contacto) {
        this.contacto = contacto;
    }

    public @NotNull String getRol() {
        return rol;
    }

    public void setRol(@NotNull String rol) {
        this.rol = rol;
    }
}
