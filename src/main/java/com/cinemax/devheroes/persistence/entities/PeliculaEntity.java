package com.cinemax.devheroes.persistence.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "peliculas")
///@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idPelicula")
//@Data
@AllArgsConstructor
@NoArgsConstructor
public class PeliculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPelicula;

    private String titulo;

    private String genero;

    private int duracion;

    private int estreno;


    //@OneToMany(mappedBy = "pelicula")

    @OneToMany(mappedBy = "peliculaEntity", cascade = CascadeType.MERGE, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<FuncionEntity> listaFuncionEntity = new ArrayList<>();

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEstreno() {
        return estreno;
    }

    public void setEstreno(int estreno) {
        this.estreno = estreno;
    }


    public List<FuncionEntity> getListaFuncionEntity() {
        return listaFuncionEntity;
    }

    public void setListaFuncionEntity(List<FuncionEntity> listaFuncionEntity) {
        this.listaFuncionEntity = listaFuncionEntity;
    }

    @Override
    public String toString() {
        return "PeliculaEntity{" +
                "idPelicula=" + idPelicula +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", estreno=" + estreno +
                ", listaFuncionEntity=" + listaFuncionEntity +
                '}';
    }
}
