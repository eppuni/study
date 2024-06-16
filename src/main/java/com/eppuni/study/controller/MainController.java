package com.eppuni.study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String getMain() {
        return "WeLLCOME TO THIS WAY";
    }

    @GetMapping(value = "/health/checker")
    public String healthChekcer(){
        return "Success";
    }

}
