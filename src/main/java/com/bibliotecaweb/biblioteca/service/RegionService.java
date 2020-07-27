package com.bibliotecaweb.biblioteca.service;

import com.bibliotecaweb.biblioteca.entity.RegionEntity;
import com.bibliotecaweb.biblioteca.repository.IRegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {

    @Autowired
    private IRegionRepository repo;

    public List<RegionEntity> listarTodas(){
        return repo.findAll();
    }

    public void guardarRegion(RegionEntity reg) {
        repo.save(reg);
    }

    public Optional<RegionEntity> obtenerRegion(int id) {
       return repo.findById(id);
    }

    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
