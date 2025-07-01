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
public class Regimen_fiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID regimen_fiscal_id;

    @NotNull
    private String nombre;

    private String tipo_factura;

    public UUID getRegimen_fiscal_id() {
        return regimen_fiscal_id;
    }

    public void setRegimen_fiscal_id(UUID regimen_fiscal_id) {
        this.regimen_fiscal_id = regimen_fiscal_id;
    }

    public @NotNull String getNombre() {
        return nombre;
    }

    public void setNombre(@NotNull String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_factura() {
        return tipo_factura;
    }

    public void setTipo_factura(String tipo_factura) {
        this.tipo_factura = tipo_factura;
    }
}
