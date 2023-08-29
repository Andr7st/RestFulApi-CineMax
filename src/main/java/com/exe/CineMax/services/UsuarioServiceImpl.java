package com.exe.CineMax.services;

import com.exe.CineMax.persistence.entities.UsuarioEntity;
import com.exe.CineMax.persistence.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    public UsuarioRepository ur;
    @Override
    public List<UsuarioEntity> getListaUsuario() {
        return ur.findAll();
    }

    @Override
    public Optional<UsuarioEntity> getUsuario(int id) {
        return ur.findById(id);
    }

    @Override
    public UsuarioEntity agregarUsuario(UsuarioEntity usuarioEntity) {
        return ur.save(usuarioEntity);
    }

    @Override
    public void modificarUsuario(UsuarioEntity usuarioEntity) {
        Optional<UsuarioEntity> miOp = ur.findById(usuarioEntity.getIdUsuario());

        if(miOp.isPresent()){
            ur.save(usuarioEntity);
        }
    }

    @Override
    public void eliminarUsuario(int id) {

        ur.deleteById(id);
    }
}
