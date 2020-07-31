package com.bibliotecaweb.biblioteca.service;

import com.bibliotecaweb.biblioteca.entity.LibroEntity;
import com.bibliotecaweb.biblioteca.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service("libroService")
public class LibroServiceImpl implements LibroService{
    @Qualifier("iLibroRepository")
    @Autowired
    private ILibroRepository iLibroRepository;

    @Override
    public List<LibroEntity> getAllLibroEntity() {
        return iLibroRepository.findAll();
    }

    @Override
    public LibroEntity getLibroEntityById(Integer idCodBarra) {
        Optional<LibroEntity> libro = iLibroRepository.findById(idCodBarra);
        if(libro.isPresent()){
            LibroEntity lib = libro.get();
            return lib;
        }
        return null;
    }

    @Override
    @Transactional
    public void save(LibroEntity l) {
       iLibroRepository.save(l);
    }

    @Override
    @Transactional
    public void delete(Integer idCodBarra) {
        iLibroRepository.deleteById(idCodBarra);
    }


}
