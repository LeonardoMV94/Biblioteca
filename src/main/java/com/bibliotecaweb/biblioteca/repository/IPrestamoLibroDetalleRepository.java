package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.PrestamoLibroDetalleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPrestamoLibroDetalleRepository extends JpaRepository <PrestamoLibroDetalleEntity, Integer> {
}
