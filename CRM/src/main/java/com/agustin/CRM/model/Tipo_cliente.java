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
public class Tipo_cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID tipo_cliente_id;

    @NotNull
    private String nombre;

    private String descripcion;

    public UUID getTipo_cliente_id() {
        return tipo_cliente_id;
    }

    public void setTipo_cliente_id(UUID tipo_cliente_id) {
        this.tipo_cliente_id = tipo_cliente_id;
    }

    public @NotNull String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
