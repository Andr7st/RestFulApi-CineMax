package com.exe.CineMax.services;

import com.exe.CineMax.persistence.entities.FuncionEntity;
import com.exe.CineMax.models.FuncionDTO;

import java.util.List;
import java.util.Optional;

public interface FuncionService {

    public List<FuncionDTO> getListaFuncion();

    public Optional<FuncionEntity> getFuncion(int id);

    public FuncionEntity agregarFuncion(FuncionEntity funcionEntity);

    public void modificarFuncion(FuncionEntity funcionEntity);

    public void eliminarFuncion(int id);
}
