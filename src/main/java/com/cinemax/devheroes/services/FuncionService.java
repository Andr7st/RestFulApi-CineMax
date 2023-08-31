package com.cinemax.devheroes.services;

import com.cinemax.devheroes.models.FuncionDTO;
import com.cinemax.devheroes.persistence.entities.FuncionEntity;

import java.util.List;
import java.util.Optional;

public interface FuncionService {

    public List<FuncionDTO> getListaFuncion();

    public Optional<FuncionEntity> getFuncion(int id);

    public FuncionEntity agregarFuncion(FuncionEntity funcionEntity);

    public void modificarFuncion(FuncionEntity funcionEntity);

    public void eliminarFuncion(int id);
}
