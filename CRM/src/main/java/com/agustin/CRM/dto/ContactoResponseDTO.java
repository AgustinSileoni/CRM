package com.agustin.CRM.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactoResponseDTO {

    private String contacto_id;
    private String nombre;
    private String telefono;
    private String email;
    private String observacion;
}
