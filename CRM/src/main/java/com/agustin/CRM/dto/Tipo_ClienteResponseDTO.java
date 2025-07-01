package com.agustin.CRM.dto;

import lombok.Getter;
import lombok.Setter;


public class Tipo_ClienteResponseDTO {

    private String tipo_cliente_id;
    private String nombre;
    private String descripcion;

    public String getTipo_cliente_id() {
        return tipo_cliente_id;
    }

    public void setTipo_cliente_id(String tipo_cliente_id) {
        this.tipo_cliente_id = tipo_cliente_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


}
