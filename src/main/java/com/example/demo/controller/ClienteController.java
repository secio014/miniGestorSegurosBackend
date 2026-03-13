package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente novoCliente) {
        return repository.save(novoCliente);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) { repository.deleteById(id); }
}