package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.StockLibEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStockLibRespository extends JpaRepository <StockLibEntity, Integer> {
}
