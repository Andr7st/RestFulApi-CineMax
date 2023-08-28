package com.exe.CineMax.persistence.repositories;

import com.exe.CineMax.persistence.entities.FuncionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionRepository extends JpaRepository<FuncionEntity, Integer> {
}
