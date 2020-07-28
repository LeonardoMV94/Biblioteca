package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.PrestamoDevolucionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPrestamoDevolucionRepository extends JpaRepository <PrestamoDevolucionEntity, Integer> {
}
