package com.agustin.CRM.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CiudadResponseDTO {

    private String ciudad_id;
    private String codigo_ciudad;
    private String codigo_postal;
    private String nombre;
    private String provincia;
}
