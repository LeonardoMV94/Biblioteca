package com.bibliotecaweb.biblioteca.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class errorController {

        @ExceptionHandler(Exception.class)
        public String exceptionHandler(){
            return "redirect:error/404";
        }
    }


