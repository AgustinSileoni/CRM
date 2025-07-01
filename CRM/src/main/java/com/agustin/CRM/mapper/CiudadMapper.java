package com.agustin.CRM.mapper;


import com.agustin.CRM.dto.CiudadResponseDTO;
import com.agustin.CRM.model.Ciudad;

public class CiudadMapper {

    public static CiudadResponseDTO toDTO(Ciudad ciudad){
        CiudadResponseDTO ciudadDTO = new CiudadResponseDTO();
        System.out.println( ciudad.getCiudad_id().toString());
        ciudadDTO.setCiudad_id(ciudad.getCiudad_id().toString());
        ciudadDTO.setCodigo_ciudad(ciudad.getCodigo_ciudad().toString());
        ciudadDTO.setNombre(ciudad.getNombre());
        ciudadDTO.setCodigo_postal(ciudad.getCodigo_postal().toString());
        return ciudadDTO;

    }

}
