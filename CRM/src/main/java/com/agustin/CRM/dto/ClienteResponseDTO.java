package com.agustin.CRM.dto;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ClienteResponseDTO {

    private String cliente_id;
    private String numero_cliente;
    private String razon_social;
    private String dni;
    private String cuit;
    private String telefono;
    private String email;
    private String fecha_nacimiento;
    private String ciudad;
    private String regimen_fiscal;
    private String observacion;



}


