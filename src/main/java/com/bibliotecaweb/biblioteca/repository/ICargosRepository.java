package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.CargosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICargosRepository  extends JpaRepository <CargosEntity, Integer> {
}
