package com.cinemax.devheroes.services;

import com.cinemax.devheroes.persistence.entities.ReservaEntity;
import com.cinemax.devheroes.persistence.repositories.ReservaRepository;
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
        return rr.findById(id);
    }

    @Override
    public ReservaEntity agregarReserva(ReservaEntity reservaEntity) {
        return rr.save(reservaEntity);
    }

    @Override
    public void modificarReserva(ReservaEntity reservaEntity) {
        Optional<ReservaEntity> miOp = rr.findById(reservaEntity.getIdReserva());

        if(miOp.isPresent()){
            rr.save(reservaEntity);
        }
    }

    @Override
    public void eliminarReserva(int id) {

        rr.findById(id);

    }
}
