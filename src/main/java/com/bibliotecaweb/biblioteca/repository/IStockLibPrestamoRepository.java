package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.StockLibPrestamoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStockLibPrestamoRepository extends JpaRepository <StockLibPrestamoEntity, Integer> {
}
