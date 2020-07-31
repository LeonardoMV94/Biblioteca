package com.bibliotecaweb.biblioteca.service;

import com.bibliotecaweb.biblioteca.entity.LibroEntity;

import java.util.List;

public interface LibroService {

    List<LibroEntity> getAllLibroEntity();
    LibroEntity getLibroEntityById(Integer idCodBarra);
    void save(LibroEntity l);
    void delete(Integer idCodBarra);



}
