package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.DireccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDireccionRepository  extends JpaRepository <DireccionEntity, Integer> {
}
