package com.agustin.CRM.dto;

import lombok.Getter;
import lombok.Setter;


public class Cliente_ContactoResponseDTO {

    private String cliente_contacto_id;
    private String cliente;
    private String contacto;
    private String rol;

    public String getCliente_contacto_id() {
        return cliente_contacto_id;
    }

    public void setCliente_contacto_id(String cliente_contacto_id) {
        this.cliente_contacto_id = cliente_contacto_id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
