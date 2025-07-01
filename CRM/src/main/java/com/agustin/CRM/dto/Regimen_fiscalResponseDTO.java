package com.agustin.CRM.dto;

import lombok.Getter;
import lombok.Setter;


public class Regimen_fiscalResponseDTO {

    private String regimen_fiscal_id;
    private String nombre;
    private String tipo_factura;

    public String getRegimen_fiscal_id() {
        return regimen_fiscal_id;
    }

    public void setRegimen_fiscal_id(String regimen_fiscal_id) {
        this.regimen_fiscal_id = regimen_fiscal_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_factura() {
        return tipo_factura;
    }

    public void setTipo_factura(String tipo_factura) {
        this.tipo_factura = tipo_factura;
    }
}
