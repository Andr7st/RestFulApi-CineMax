package com.cinemax.devheroes.controllers;

import com.cinemax.devheroes.services.SalaService;
import com.cinemax.devheroes.persistence.entities.SalaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/sala")
public class SalaController {
    @Autowired
    public SalaService ss;
    @GetMapping
    public List<SalaEntity> getAll(){
        return ss.getListaSalas();
    }

    @GetMapping("/{idSala}")
    public Optional<SalaEntity> buscarSala(@PathVariable int idSala){
        return ss.getSala(idSala);
    }

    @PostMapping
    public SalaEntity agregarSala(@RequestBody SalaEntity salaEntity){
        return ss.agregarSala(salaEntity);
    }
    @PutMapping
    public void modificarSala(@RequestBody SalaEntity salaEntity){

        ss.modificarSala(salaEntity);
    }

    @DeleteMapping("/{idSala}")
    public void eliminarSala(@PathVariable int idSala){
        ss.eliminarSala(idSala);

    }
}
