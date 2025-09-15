package com.prova.poo.controllers;


import com.prova.poo.models.EstudanteModel;
import com.prova.poo.repositories.EstudanteRepository;
import com.prova.poo.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @GetMapping
    public List<EstudanteModel> findAll() {
        return estudanteService.findAll();
    }

    @GetMapping(path = "/{id}")
    public EstudanteModel findById(@PathVariable Long id) {
        return estudanteService.findById(id);
    }

    @PostMapping
    public EstudanteModel save(@RequestBody EstudanteModel estudante) {
        return estudanteService.createEstudante(estudante);

    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        estudanteService.deleteById(id);
    }
}
