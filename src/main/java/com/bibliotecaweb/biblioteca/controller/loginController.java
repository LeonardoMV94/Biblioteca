package com.bibliotecaweb.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.model.IModel;

@Controller
public class loginController {

    @RequestMapping("/logintra")
    public String login(Model model){
        model.addAttribute("titulo","Login");
        return "login";
    }
}
