package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.LibroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("iLibroRepository")
public interface ILibroRepository extends JpaRepository <LibroEntity, Integer> {

}
