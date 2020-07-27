package com.bibliotecaweb.biblioteca.controller;


import com.bibliotecaweb.biblioteca.entity.RegionEntity;
import com.bibliotecaweb.biblioteca.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/region")
public class regionController {

    @Autowired
    private RegionService service;

    @RequestMapping("/")
    public String listaRegiones(Model modelo){
        List<RegionEntity> listarRegiones = service.listarTodas();
        modelo.addAttribute("regiones", listarRegiones);
        return "regiones";
    }

    @PostMapping("/add")
    public String addRegion(){

        return "addReg";
    }




    /*
    @PostMapping("/add")
    public String addUser( user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-user";
        }

        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());
        return "redirect:/index";
    }*/

}
