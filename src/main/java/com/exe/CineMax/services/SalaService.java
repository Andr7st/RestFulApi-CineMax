package com.exe.CineMax.services;

import com.exe.CineMax.repositories.SalaEntity;

import java.util.List;
import java.util.Optional;

public interface SalaService {

    public List<SalaEntity> getListaSalas();

    public Optional<SalaEntity> getSala(int id);

    public SalaEntity agregarSala(SalaEntity salaEntity);

    public void modificarSala(SalaEntity salaEntity);

    public void eliminarSala(int id);
}
