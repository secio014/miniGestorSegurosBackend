package com.example.demo.controller;

import com.example.demo.model.Seguro;
import com.example.demo.repository.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seguros")
public class SeguroController {

    @Autowired
    private SeguroRepository repository;

    @GetMapping
    public List<Seguro> listarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public Seguro salvar(@RequestBody Seguro novoSeguro) { return repository.save(novoSeguro); }
}