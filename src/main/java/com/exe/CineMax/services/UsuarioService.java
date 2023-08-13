package com.exe.CineMax.services;

import com.exe.CineMax.repositories.UsuarioEntity;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    public List<UsuarioEntity> getListaUsuario();

    public Optional<UsuarioEntity> getUsuario(int id);

    public UsuarioEntity agregarUsuario(UsuarioEntity usuarioEntity);

    public void modificarUsuario(UsuarioEntity usuarioEntity);

    public void eliminarUsuario(int id);
}
