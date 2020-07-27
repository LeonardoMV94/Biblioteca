package com.bibliotecaweb.biblioteca.repository;

import com.bibliotecaweb.biblioteca.entity.RegionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRegionRepository extends JpaRepository<RegionEntity, Integer>{
}
