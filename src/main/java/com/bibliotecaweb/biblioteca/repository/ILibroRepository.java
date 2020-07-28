package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibroRepository extends JpaRepository <LibroEntity, Integer> {
}
