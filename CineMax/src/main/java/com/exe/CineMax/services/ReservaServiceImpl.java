package com.exe.CineMax.services;

import com.exe.CineMax.repositories.ReservaEntity;
import com.exe.CineMax.repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    public ReservaRepository rr;
    @Override
    public List<ReservaEntity> getListaReserva() {
        return rr.findAll();
    }

    @Override
    public Optional<ReservaEntity> getReserva(int id) {
        return Optional.empty();
    }

    @Override
    public ReservaEntity agregarReserva(ReservaEntity reservaEntity) {
        return null;
    }

    @Override
    public void modificarReserva(ReservaEntity reservaEntity) {

    }

    @Override
    public void eliminarReserva(int id) {

    }
}
