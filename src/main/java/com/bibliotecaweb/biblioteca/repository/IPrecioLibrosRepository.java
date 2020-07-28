package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.PrecioLibrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPrecioLibrosRepository extends JpaRepository <PrecioLibrosEntity, Integer> {
}
