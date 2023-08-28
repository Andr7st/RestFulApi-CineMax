package com.exe.CineMax.controllers;

import com.exe.CineMax.persistence.entities.ReservaEntity;
import com.exe.CineMax.persistence.entities.UsuarioEntity;
import com.exe.CineMax.services.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {

    @Autowired
    public ReservaService rs;
    @GetMapping
    public List<ReservaEntity> getAll(){
        return rs.getListaReserva();
    }

    @GetMapping("{idReserva}")
    public Optional<ReservaEntity> buscarReserva(@PathVariable int idReserva){
        return rs.getReserva(idReserva);
    }

    @PostMapping
    public ReservaEntity agregarReserva(@RequestBody ReservaEntity reservaEntity){
        return rs.agregarReserva(reservaEntity);
    }

    @PutMapping
    public void modificarReserva(@RequestBody ReservaEntity reservaEntity){

        rs.modificarReserva(reservaEntity);
    }

    @DeleteMapping("/{idReserva}")
    public void eliminarReserva(@PathVariable int idReserva){
        rs.eliminarReserva(idReserva);

    }
}
