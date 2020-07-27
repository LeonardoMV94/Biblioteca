package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Integer>{
    UsuarioEntity findByRutUsuario(String rut);
}
