package com.agustin.CRM.controller;

import com.agustin.CRM.dto.ClienteResponseDTO;
import com.agustin.CRM.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.beans.ConstructorProperties;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<ClienteResponseDTO>> getClientes(){
        List<ClienteResponseDTO> clientes = clienteService.getClientes();
        return ResponseEntity.ok().body(clientes);
    }


}
