package com.agustin.CRM.service;

import com.agustin.CRM.dto.ClienteResponseDTO;
import com.agustin.CRM.mapper.ClienteMapper;
import com.agustin.CRM.model.Cliente;
import com.agustin.CRM.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository=clienteRepository;
    }

    public List<ClienteResponseDTO> getClientes(){
        List<Cliente> clientes = clienteRepository.findAll();
        List<ClienteResponseDTO> clienteResponseDTOS= clientes.stream()
                .map(ClienteMapper::toDTO).toList();
        return clienteResponseDTOS;
    }
}
