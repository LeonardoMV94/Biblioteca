package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.TipoDireccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoDireccionRepository extends JpaRepository <TipoDireccionEntity, Integer> {
}
