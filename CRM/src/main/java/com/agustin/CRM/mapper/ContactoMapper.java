package com.agustin.CRM.mapper;

import com.agustin.CRM.dto.ContactoResponseDTO;
import com.agustin.CRM.model.Contacto;

public class ContactoMapper {


    public static ContactoResponseDTO toDTO(Contacto contacto){
        ContactoResponseDTO contactoDTO = new ContactoResponseDTO();

        contactoDTO.setContacto_id(contacto.getContacto_id().toString());
        contactoDTO.setNombre(contacto.getNombre());
        contactoDTO.setEmail(contacto.getEmail());
        contactoDTO.setTelefono(contacto.getTelefono().toString());
        contactoDTO.setObservacion(contacto.getObservacion());
        return contactoDTO;

    }
}
