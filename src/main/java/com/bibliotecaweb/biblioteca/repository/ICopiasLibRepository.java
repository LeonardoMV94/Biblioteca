package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.CopiaslibEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICopiasLibRepository extends JpaRepository<CopiaslibEntity, Integer> {
}
