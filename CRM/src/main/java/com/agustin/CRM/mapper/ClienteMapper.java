package com.agustin.CRM.mapper;

import com.agustin.CRM.dto.ClienteResponseDTO;
import com.agustin.CRM.model.Cliente;

public class ClienteMapper {

    public static ClienteResponseDTO toDTO(Cliente cliente){
        ClienteResponseDTO clienteDTO = new ClienteResponseDTO();
        clienteDTO.setCliente_id(cliente.getCliente_id().toString());
        clienteDTO.setNumero_cliente(cliente.getNumero_cliente().toString());
        return clienteDTO;
    }
}
