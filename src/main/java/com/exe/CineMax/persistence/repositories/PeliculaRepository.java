package com.exe.CineMax.persistence.repositories;

import com.exe.CineMax.persistence.entities.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<PeliculaEntity, Integer> {


}
