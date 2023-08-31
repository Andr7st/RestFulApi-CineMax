package com.cinemax.devheroes.persistence.repositories;

import com.cinemax.devheroes.persistence.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
}
