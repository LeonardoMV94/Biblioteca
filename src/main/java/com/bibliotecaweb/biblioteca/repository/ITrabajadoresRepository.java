package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.TrabajadoresEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITrabajadoresRepository extends JpaRepository <TrabajadoresEntity, Integer> {
}
