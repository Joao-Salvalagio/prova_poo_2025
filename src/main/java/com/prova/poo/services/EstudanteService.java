package com.prova.poo.services;

import com.prova.poo.models.EstudanteModel;
import com.prova.poo.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {
    @Autowired
    private EstudanteRepository estudanteRepository;

    public List<EstudanteModel> findAll() {
        return estudanteRepository.findAll();
    }

    public EstudanteModel createEstudante(EstudanteModel estudanteModel) {
        return estudanteRepository.save(estudanteModel);
    }

    public EstudanteModel deleteById(Long id) {
        EstudanteModel estudanteModel = estudanteRepository.findById(id).get();
        estudanteRepository.delete(estudanteModel);
        return estudanteModel;

    }

    public EstudanteModel findById(Long id) {
        return estudanteRepository.findById(id).get();
    }
}
