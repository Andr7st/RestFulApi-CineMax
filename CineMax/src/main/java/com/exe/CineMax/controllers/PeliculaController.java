package com.exe.CineMax.controllers;

import com.exe.CineMax.repositories.PeliculaEntity;
import com.exe.CineMax.models.PeliculaDTO;
import com.exe.CineMax.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pelicula")
public class PeliculaController {

    @Autowired
    private PeliculaService ps;

    @GetMapping
    public List<PeliculaDTO> getAll(){
        return ps.getListaPeliculas();
    }

    @GetMapping("/{idPelicula}")
    public Optional<PeliculaEntity> buscarPelicula(@PathVariable int idPelicula){
        return ps.getPelicula(idPelicula);
    }

    @PostMapping
    public PeliculaEntity agregarPelicula(@RequestBody PeliculaEntity peliculaEntity){

        return ps.agregarPelicula(peliculaEntity);
    }

    @PutMapping
    public void modificarPelicula(@RequestBody PeliculaEntity peliculaEntity){

        ps.modificarPelicula(peliculaEntity);
    }

    @DeleteMapping("/{idPelicula}")
    public void eliminarPelicula(@PathVariable int idPelicula){
        ps.eliminarPelicula(idPelicula);
    }
}
