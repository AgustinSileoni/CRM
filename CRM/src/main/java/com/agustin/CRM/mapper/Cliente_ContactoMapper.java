package com.agustin.CRM.mapper;

import com.agustin.CRM.dto.ClienteResponseDTO;
import com.agustin.CRM.dto.Cliente_ContactoResponseDTO;
import com.agustin.CRM.model.Cliente_contacto;

public class Cliente_ContactoMapper {

    public static Cliente_ContactoResponseDTO toDTO(Cliente_contacto clienteContacto){
        Cliente_ContactoResponseDTO clienteContactoDTO = new Cliente_ContactoResponseDTO();

        clienteContactoDTO.setCliente_contacto_id(clienteContacto.getCliente_contacto_id().toString());
        clienteContactoDTO.setCliente(clienteContacto.getCliente().toString());
        clienteContactoDTO.setContacto(clienteContacto.getContacto().toString());
        clienteContactoDTO.setRol(clienteContacto.getRol().toString());
        return clienteContactoDTO;
    }


}
