package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.TipoClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoClienteRepository extends JpaRepository <TipoClienteEntity, Integer> {
}
