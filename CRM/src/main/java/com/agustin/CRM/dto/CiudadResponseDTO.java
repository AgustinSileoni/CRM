package com.agustin.CRM.dto;

import lombok.Getter;
import lombok.Setter;

public class CiudadResponseDTO {

    private String ciudad_id;
    private String codigo_ciudad;
    private String codigo_postal;
    private String nombre;
    private String provincia;

    public String getCiudad_id() {
        return ciudad_id;
    }

    public void setCiudad_id(String ciudad_id) {
        this.ciudad_id = ciudad_id;
    }

    public String getCodigo_ciudad() {
        return codigo_ciudad;
    }

    public void setCodigo_ciudad(String codigo_ciudad) {
        this.codigo_ciudad = codigo_ciudad;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
