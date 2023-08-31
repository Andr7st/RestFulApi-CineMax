package com.cinemax.devheroes.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonIgnore
    @ManyToMany(mappedBy = "listaUsuariosEntity")
    private List<ReservaEntity> listaReservaEntity;
}
