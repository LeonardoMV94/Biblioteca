package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.ComunaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComunaRepository extends JpaRepository <ComunaEntity, Integer> {
}
