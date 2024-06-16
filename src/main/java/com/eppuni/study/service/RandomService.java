package com.eppuni.study.service;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class RandomService {

    public Set<Integer> getRandom() {
        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 6) {
            int number = random.nextInt(45) + 1;
            numbers.add(number);
        }

        return numbers;
    }
}
