package com.exe.CineMax.services;

import com.exe.CineMax.repositories.ReservaEntity;

import java.util.List;
import java.util.Optional;

public interface ReservaService {

    public List<ReservaEntity> getListaReserva();

    public Optional<ReservaEntity> getReserva(int id);

    public ReservaEntity agregarReserva(ReservaEntity reservaEntity);

    public void modificarReserva(ReservaEntity reservaEntity);

    public void eliminarReserva(int id);
}
