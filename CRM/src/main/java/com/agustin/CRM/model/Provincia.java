package com.agustin.CRM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

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

    public UUID getProvincia_id() {
        return provincia_id;
    }

    public void setProvincia_id(UUID provincia_id) {
        this.provincia_id = provincia_id;
    }

    public @NotNull Integer getCodigo_provincia() {
        return codigo_provincia;
    }

    public void setCodigo_provincia(@NotNull Integer codigo_provincia) {
        this.codigo_provincia = codigo_provincia;
    }

    public @NotNull String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull String nombre) {
        this.nombre = nombre;
    }
}
