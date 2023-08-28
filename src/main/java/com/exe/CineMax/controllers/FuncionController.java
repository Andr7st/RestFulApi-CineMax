package com.exe.CineMax.controllers;

import com.exe.CineMax.persistence.entities.FuncionEntity;
import com.exe.CineMax.models.FuncionDTO;
import com.exe.CineMax.services.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
