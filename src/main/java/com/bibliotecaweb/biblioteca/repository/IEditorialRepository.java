package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.EditorialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEditorialRepository extends JpaRepository <EditorialEntity, Integer> {
}
