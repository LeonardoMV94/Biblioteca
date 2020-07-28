package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.UsadosVentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsadosRepository extends JpaRepository <UsadosVentaEntity, Integer> {
}
