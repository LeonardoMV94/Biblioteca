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

    public String editarRegion(RegionEntity regionEditar){
        int id = regionEditar.getIdRegion();
        if (repo.findById(id).isPresent()){
            RegionEntity region = new RegionEntity();
            region.setIdRegion(regionEditar.getIdRegion());
            region.setNombreReg(regionEditar.getNombreReg());
            region.setNumeroReg(regionEditar.getNumeroReg());
            // Guardado Listo
           repo.save(region);
            return "region guardada";
        }
        return "error al guardar region";
    }



}
