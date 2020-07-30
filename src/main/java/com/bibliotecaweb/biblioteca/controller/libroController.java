package com.bibliotecaweb.biblioteca.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class libroController {

    @RequestMapping(path = "/libro", method = RequestMethod.GET)
    public String goHome(){
        return "listarLibro";
    }
}
