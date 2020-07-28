package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.DetalleCompralibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleCompraLibroRepository extends JpaRepository <DetalleCompralibroEntity, Integer> {
}
