package com.example.springdocker.service;

import com.example.springdocker.model.Car;
import com.example.springdocker.model.Food;
import com.example.springdocker.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Daniel Bojic
 * Date: 2021-05-11
 * Time: 12:19
 * Project: spring-docker-demo
 * Copyright: MIT
 */

@RequiredArgsConstructor
@Service
public class CarService {
    private final CarRepository repository;


    public List<Car> getCars() {
        return repository.findAll();
    }

    public void saveNewCar(Car car) {
        repository.save(car);
    }
}
