package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.CorreosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICorreosRepository  extends JpaRepository<CorreosEntity, Integer> {
}
