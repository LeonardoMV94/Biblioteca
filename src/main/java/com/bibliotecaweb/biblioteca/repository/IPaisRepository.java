package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.PaisEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaisRepository extends JpaRepository <PaisEntity, Integer> {
}
