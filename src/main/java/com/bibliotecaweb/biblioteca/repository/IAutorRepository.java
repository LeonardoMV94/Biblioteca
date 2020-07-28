package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.AutorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutorRepository extends JpaRepository <AutorEntity, Integer> {

}
