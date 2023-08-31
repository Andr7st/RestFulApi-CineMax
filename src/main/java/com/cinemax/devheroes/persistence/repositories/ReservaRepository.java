package com.cinemax.devheroes.persistence.repositories;

import com.cinemax.devheroes.persistence.entities.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<ReservaEntity, Integer> {
}
