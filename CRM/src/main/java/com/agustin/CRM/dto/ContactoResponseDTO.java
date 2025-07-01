package com.agustin.CRM.dto;

import lombok.Getter;
import lombok.Setter;

public class ContactoResponseDTO {

    private String contacto_id;
    private String nombre;
    private String telefono;
    private String email;
    private String observacion;

    public String getContacto_id() {
        return contacto_id;
    }

    public void setContacto_id(String contacto_id) {
        this.contacto_id = contacto_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
