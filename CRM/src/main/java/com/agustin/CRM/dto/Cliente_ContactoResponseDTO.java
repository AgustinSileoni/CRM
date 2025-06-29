package com.agustin.CRM.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente_ContactoResponseDTO {

    private String cliente_contacto_id;
    private String cliente;
    private String contacto;
    private String rol;
}
