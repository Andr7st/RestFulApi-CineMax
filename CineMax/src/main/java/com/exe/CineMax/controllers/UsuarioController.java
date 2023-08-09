package com.exe.CineMax.controllers;

import com.exe.CineMax.repositories.UsuarioEntity;
import com.exe.CineMax.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    public UsuarioService us;

    @GetMapping
    public List<UsuarioEntity> getAll(){
        return us.getListaUsuario();
    }
}
