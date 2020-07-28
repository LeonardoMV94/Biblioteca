package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.IdiomasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIdiomasRepository extends JpaRepository <IdiomasEntity, Integer> {
}
