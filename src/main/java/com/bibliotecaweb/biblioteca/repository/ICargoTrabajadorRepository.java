package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.CargoTrabajadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICargoTrabajadorRepository extends JpaRepository<CargoTrabajadorEntity, Integer> {
}
