package com.exe.CineMax.controllers;

import com.exe.CineMax.persistence.entities.SalaEntity;
import com.exe.CineMax.persistence.entities.UsuarioEntity;
import com.exe.CineMax.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    public UsuarioService us;

    @GetMapping
    public List<UsuarioEntity> getAll(){
        return us.getListaUsuario();
    }

    @GetMapping("{idUsuario}")
    public Optional<UsuarioEntity> buscarUsuario(@PathVariable int idUsuario){
        return us.getUsuario(idUsuario);
    }

    @PostMapping
    public UsuarioEntity agregarUsuario(@RequestBody UsuarioEntity usuarioEntity){
        return us.agregarUsuario(usuarioEntity);
    }

    @PutMapping
    public void modificarUsuario(@RequestBody UsuarioEntity usuarioEntity){

       us.modificarUsuario(usuarioEntity);
    }

    @DeleteMapping("/{idSala}")
    public void eliminarUsuario(@PathVariable int idUsuario){
        us.eliminarUsuario(idUsuario);

    }
}
