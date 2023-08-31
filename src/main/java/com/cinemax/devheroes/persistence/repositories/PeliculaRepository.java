package com.cinemax.devheroes.persistence.repositories;

import com.cinemax.devheroes.persistence.entities.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Integer> {


}
