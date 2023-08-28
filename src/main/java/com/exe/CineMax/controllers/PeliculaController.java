package com.exe.CineMax.controllers;

import com.exe.CineMax.models.PeliculaDTO;
import com.exe.CineMax.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public PeliculaDTO buscarPelicula(@PathVariable int idPelicula){
        return ps.getPelicula(idPelicula);
    }

    @PostMapping
    public PeliculaDTO agregarPelicula(@RequestBody PeliculaDTO peliculaDTO){

        return ps.agregarPelicula(peliculaDTO);

    }
    @PutMapping
    public PeliculaDTO modificarPelicula(@RequestBody PeliculaDTO peliculaDTO){

        return ps.modificarPelicula(peliculaDTO);
    }

    @DeleteMapping("/{idPelicula}")
    public void eliminarPelicula(@PathVariable int idPelicula){
        ps.eliminarPelicula(idPelicula);
    }
}
