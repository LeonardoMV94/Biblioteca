package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.TipoDocumentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoDocumentoRepository extends JpaRepository <TipoDocumentoEntity, Integer>{
}
