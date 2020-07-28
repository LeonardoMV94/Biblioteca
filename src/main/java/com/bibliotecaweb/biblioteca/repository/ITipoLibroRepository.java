package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.TipoLibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoLibroRepository extends JpaRepository <TipoLibroEntity, Integer> {
}
