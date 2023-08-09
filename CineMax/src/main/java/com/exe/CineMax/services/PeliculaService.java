package com.exe.CineMax.services;

import com.exe.CineMax.repositories.PeliculaEntity;
import com.exe.CineMax.models.PeliculaDTO;

import java.util.List;
import java.util.Optional;

public interface PeliculaService {

    public List<PeliculaDTO> getListaPeliculas();

    public Optional<PeliculaEntity> getPelicula(int id);

    public PeliculaEntity agregarPelicula(PeliculaEntity peliculaEntity);

    public void modificarPelicula(PeliculaEntity peliculaEntity);

    public void eliminarPelicula(int id);






}
