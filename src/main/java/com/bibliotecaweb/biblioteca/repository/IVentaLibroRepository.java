package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.VentaLibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaLibroRepository extends JpaRepository <VentaLibroEntity, Integer> {
}
