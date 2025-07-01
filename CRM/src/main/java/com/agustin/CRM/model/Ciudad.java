package com.agustin.CRM.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Entity
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

    public UUID getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(UUID ciudad_id) {
        this.ciudad_id = ciudad_id;
    }

    public @NotNull Integer getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(@NotNull Integer codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public @NotNull Integer getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(@NotNull Integer codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public @NotNull String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull String nombre) {
        this.nombre = nombre;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
