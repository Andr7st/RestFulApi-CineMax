package com.cinemax.devheroes.persistence.repositories;

import com.cinemax.devheroes.persistence.entities.FuncionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionRepository extends JpaRepository<FuncionEntity, Integer> {
}
