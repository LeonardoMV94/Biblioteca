package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.AnotacionesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnotacionesRepository extends JpaRepository<AnotacionesEntity, Integer> {
}
