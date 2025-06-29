package com.agustin.CRM.mapper;

import com.agustin.CRM.dto.ProvinciaResponseDTO;
import com.agustin.CRM.model.Provincia;

public class ProvinciaMapper {


    public static ProvinciaResponseDTO toDTO(Provincia provincia){
        ProvinciaResponseDTO provinciaDTO = new ProvinciaResponseDTO();

        provinciaDTO.setCodigo_provincia(provincia.getCodigo_provincia().toString());
        provinciaDTO.setProvincia_id(provincia.getProvincia_id().toString());
        provinciaDTO.setNombre(provincia.getNombre());
        return provinciaDTO;
    }
}
