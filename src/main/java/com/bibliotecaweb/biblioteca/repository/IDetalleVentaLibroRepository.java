package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.DetalleVentaLibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleVentaLibroRepository extends JpaRepository<DetalleVentaLibroEntity, Integer> {
}
