package com.cinemax.devheroes.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "salas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idSala;

    String nombreSala;

    private int capacidad;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "sala_funcion", joinColumns = @JoinColumn(name = "id_sala"),
    inverseJoinColumns = @JoinColumn(name = "id_funcion"))
    private List<FuncionEntity> listaFunciones;
}
