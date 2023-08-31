package com.cinemax.devheroes.controllers;

import com.cinemax.devheroes.models.FuncionDTO;
import com.cinemax.devheroes.services.FuncionService;
import com.cinemax.devheroes.persistence.entities.FuncionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/funcion")
public class FuncionController {

    @Autowired
    public FuncionService fs;

    @GetMapping
    public List<FuncionDTO> getAll(){

        return fs.getListaFuncion();
    }
    @GetMapping("/{idFuncion}")
    public Optional<FuncionEntity> buscarFuncion(@PathVariable int idFuncion){

        return fs.getFuncion(idFuncion);
    }

    @PostMapping
    public FuncionEntity agregarFuncion(@RequestBody FuncionEntity funcionEntity){
        return fs.agregarFuncion(funcionEntity);
    }

    @PutMapping
    public void modificarFuncion(@RequestBody FuncionEntity funcionEntity){
        fs.modificarFuncion(funcionEntity);
    }

    @DeleteMapping("/{idFuncion}")
    public void eliminarFuncion(@PathVariable int idFuncion){
        fs.eliminarFuncion(idFuncion);
    }

}
