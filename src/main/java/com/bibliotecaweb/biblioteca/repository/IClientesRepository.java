package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientesRepository extends JpaRepository <ClientesEntity, Integer>{
}
