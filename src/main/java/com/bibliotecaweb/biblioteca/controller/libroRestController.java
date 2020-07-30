package com.bibliotecaweb.biblioteca.controller;


import com.bibliotecaweb.biblioteca.entity.LibroEntity;
import com.bibliotecaweb.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class libroRestController {

    @Autowired
    private LibroService libroService;

    @RequestMapping(path = "/books", method = RequestMethod.GET)
    public List<LibroEntity> getAllLibroEntities(){
        return libroService.getAllLibroEntity();
    }

    @RequestMapping(value = "/libros/{idCodBarra}", method = RequestMethod.GET)
    private LibroEntity getLibroEntityById(@PathVariable("idCodBarra") Integer idCodBarra){
        return libroService.getLibroEntityById(idCodBarra);
    }
}
