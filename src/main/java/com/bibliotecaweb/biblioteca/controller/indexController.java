package com.bibliotecaweb.biblioteca.controller;

import com.bibliotecaweb.biblioteca.entity.ProvinciaEntity;
import com.bibliotecaweb.biblioteca.service.ProvinciaService;
import com.bibliotecaweb.biblioteca.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller("/")
public class indexController {

    @Autowired(required = true)
    private RegionService service;

    @Autowired(required = true)
    private ProvinciaService serPro;


    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("regiones",service.listarTodas());

        model.addAttribute("nombre","Leonardo Muñoz");
        model.addAttribute("saludo","Hola desde el controller");
        return "index";
    }
    

}
