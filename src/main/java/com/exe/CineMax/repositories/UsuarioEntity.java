package com.exe.CineMax.repositories;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idUsuario;

    private String nombreUsuario;

    private String email;

    private String password;

    @ManyToMany(mappedBy = "listaUsuariosEntity")
    private List<ReservaEntity> listaReservaEntity;
}
