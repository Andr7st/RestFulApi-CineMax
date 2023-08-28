package com.exe.CineMax.services;

import com.exe.CineMax.models.PeliculaDTO;

import java.util.List;

public interface PeliculaService {

    public List<PeliculaDTO> getListaPeliculas();

    public PeliculaDTO getPelicula(int id);

    public PeliculaDTO agregarPelicula(PeliculaDTO peliculaDTO);

    public PeliculaDTO modificarPelicula(PeliculaDTO peliculaDTO);

    public void eliminarPelicula(int id);






}
