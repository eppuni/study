package com.eppuni.study.controller;

import com.eppuni.study.dto.Dog;
import com.eppuni.study.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/dog")
public class DogController {

    private final DogService dogService;

    @PostMapping(value = "/create")
    public ResponseEntity<Object> createDog(@RequestBody Dog dog) {
        return ResponseEntity.ok(dogService.createDog(dog));
    }
    @GetMapping(value = "/list")
    public ResponseEntity<Object> getDog() {
        return ResponseEntity.ok(dogService.getDogList());
    }
}
