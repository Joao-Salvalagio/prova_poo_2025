package com.prova.poo.repositories;

import com.prova.poo.models.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository extends JpaRepository<EstudanteModel, Long> {
}
