package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.EstadoLibUsadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoLibUsadoRepository extends JpaRepository <EstadoLibUsadoEntity, Integer> {
}
