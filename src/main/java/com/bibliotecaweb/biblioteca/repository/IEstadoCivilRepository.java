package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.EstadoCivilEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoCivilRepository extends JpaRepository <EstadoCivilEntity, Integer> {
}
