package com.bibliotecaweb.biblioteca.service;

import com.bibliotecaweb.biblioteca.entity.ProvinciaEntity;
import com.bibliotecaweb.biblioteca.repository.IProvinciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinciaService {

    @Autowired
    private IProvinciaRepository repo;

    public List<ProvinciaEntity> listarTodas(){
        return repo.findAll();
    }

    public void guardarRegion(ProvinciaEntity reg) {
        repo.save(reg);
    }

    public Optional<ProvinciaEntity> obtenerPorID(int id) {
        return repo.findById(id);
    }

    public void eliminar(int id) {
        repo.deleteById(id);
    }

}
