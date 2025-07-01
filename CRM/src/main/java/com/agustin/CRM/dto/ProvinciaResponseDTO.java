package com.agustin.CRM.dto;

import lombok.Getter;
import lombok.Setter;


public class ProvinciaResponseDTO {

    private String provincia_id;
    private String codigo_provincia;
    private String nombre;

    public String getProvincia_id() {
        return provincia_id;
    }

    public void setProvincia_id(String provincia_id) {
        this.provincia_id = provincia_id;
    }

    public String getCodigo_provincia() {
        return codigo_provincia;
    }

    public void setCodigo_provincia(String codigo_provincia) {
        this.codigo_provincia = codigo_provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
