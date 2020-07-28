package com.bibliotecaweb.biblioteca.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller("/")
public class indexController {


    @RequestMapping("/")
    public String index(Model model){

        model.addAttribute("saludo","Hola desde el controller");
        return "index";
    }
    

}
