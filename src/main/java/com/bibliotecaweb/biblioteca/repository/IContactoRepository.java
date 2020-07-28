package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.ContactoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactoRepository extends JpaRepository <ContactoEntity, Integer> {
}
