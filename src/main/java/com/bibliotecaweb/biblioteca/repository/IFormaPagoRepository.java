package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.FormaPagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFormaPagoRepository extends JpaRepository <FormaPagoEntity, Integer> {
}
