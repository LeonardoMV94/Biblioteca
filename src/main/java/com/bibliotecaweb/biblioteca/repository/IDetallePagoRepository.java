package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.DetallePagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetallePagoRepository extends JpaRepository <DetallePagoEntity, Integer> {
}
