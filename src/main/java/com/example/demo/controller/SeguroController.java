package com.example.demo.controller;

import com.example.demo.model.Seguro;
import com.example.demo.repository.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}