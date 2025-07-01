package com.agustin.CRM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
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

    @OneToMany(mappedBy = "contacto")
    private Set<Cliente_contacto> clientes;

    public UUID getContacto_id() {
        return contacto_id;
    }

    public void setContacto_id(UUID contacto_id) {
        this.contacto_id = contacto_id;
    }

    public @NotNull String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull String nombre) {
        this.nombre = nombre;
    }

    public @NotNull Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(@NotNull Integer telefono) {
        this.telefono = telefono;
    }

    public @NotNull @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotNull @Email String email) {
        this.email = email;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Set<Cliente_contacto> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente_contacto> clientes) {
        this.clientes = clientes;
    }
}
