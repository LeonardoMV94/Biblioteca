package com.bibliotecaweb.biblioteca.service;

import com.bibliotecaweb.biblioteca.entity.LibroEntity;

import java.util.List;

public interface LibroService {

    List<LibroEntity> getAllLibroEntity();
    LibroEntity getLibroEntityById(Integer idCodBarra);
    Integer agregarLibro(LibroEntity l);
    Integer editarLibro(LibroEntity l);
    void deleteLibro(Integer idCodBarra);



}
