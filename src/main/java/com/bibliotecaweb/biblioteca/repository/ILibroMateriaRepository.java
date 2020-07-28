package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.LibroMateriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILibroMateriaRepository extends JpaRepository <LibroMateriaEntity, Integer> {
}
