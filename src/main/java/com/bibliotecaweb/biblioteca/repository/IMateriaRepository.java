package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.MateriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMateriaRepository extends JpaRepository <MateriaEntity, Integer> {
}
