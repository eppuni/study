package com.eppuni.study.service;

import com.eppuni.study.dto.Dog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogService {

    private static List<Dog> dogList = new ArrayList<>();

    public Dog createDog(Dog dog) {

        dogList.add(dog);
        return dog;
    }

    public List<Dog> getDogList() {
        return dogList;
    }
}
