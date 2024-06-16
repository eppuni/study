package com.eppuni.study.controller;

import com.eppuni.study.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @GetMapping(value = "/create")
    public ResponseEntity<Object> createCar() {
        return ResponseEntity.ok(carService.createCar());
    }
    @GetMapping(value = "/list")
    public ResponseEntity<Object> getCar() {
        return ResponseEntity.ok(carService.getAllCars());
    }
}
