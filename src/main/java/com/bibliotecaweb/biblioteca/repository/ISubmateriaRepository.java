package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.SubmateriaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISubmateriaRepository extends JpaRepository <SubmateriaEntity, Integer> {
}
