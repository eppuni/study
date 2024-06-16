package com.eppuni.study.controller;


import com.eppuni.study.service.RandomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/random")
public class RandomController {

    private RandomService randomService;

    public RandomController(RandomService randomService) {
        this.randomService = randomService;
    }


    @GetMapping(value ="/list")
    public ResponseEntity<Object> getRandom() {
        return ResponseEntity.ok(randomService.getRandom());
    }


}
