package com.exe.CineMax.persistence.repositories;

import com.exe.CineMax.persistence.entities.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<ReservaEntity, Integer> {
}
