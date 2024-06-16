package com.eppuni.study.service;

import com.eppuni.study.dto.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public Car createCar() {

        Car car = new Car();
        car.setModel("소나타");
        car.setName("붕붕이");
        car.setYear(2023);
        car.setWheelNo(4);
        return car;
    }

    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();



        for (int i = 0; i < 4; i++ ) {
            carList.add(createCar());
        }
        return carList;
    }

}
