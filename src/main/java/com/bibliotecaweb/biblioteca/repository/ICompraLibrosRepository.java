package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.CompralibrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompraLibrosRepository extends JpaRepository <CompralibrosEntity, Integer> {
}
