package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.ProveedorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProveedorRepository extends JpaRepository <ProveedorEntity, Integer> {
}
