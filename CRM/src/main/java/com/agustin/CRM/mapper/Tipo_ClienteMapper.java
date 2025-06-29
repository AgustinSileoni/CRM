package com.agustin.CRM.mapper;

import com.agustin.CRM.dto.Tipo_ClienteResponseDTO;
import com.agustin.CRM.model.Tipo_cliente;

public class Tipo_ClienteMapper  {

    public static Tipo_ClienteResponseDTO toDTO(Tipo_cliente tipo_cliente){
        Tipo_ClienteResponseDTO tipoClienteDTO = new Tipo_ClienteResponseDTO();

        tipoClienteDTO.setTipo_cliente_id(tipo_cliente.getTipo_cliente_id().toString());
        tipoClienteDTO.setNombre(tipo_cliente.getNombre());
        tipoClienteDTO.setDescripcion(tipo_cliente.getDescripcion());

        return tipoClienteDTO;

    }
}
