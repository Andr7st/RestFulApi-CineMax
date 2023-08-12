package com.exe.CineMax.controllers;

import com.exe.CineMax.repositories.ReservaEntity;
import com.exe.CineMax.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {

    @Autowired
    public ReservaService rs;
    @GetMapping
    public List<ReservaEntity> getAll(){
        return rs.getListaReserva();
    }
}
