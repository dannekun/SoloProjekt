package com.example.springdocker.repository;

import com.example.springdocker.model.Car;
import com.example.springdocker.model.Food;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Daniel Bojic
 * Date: 2021-05-11
 * Time: 11:55
 * Project: spring-docker-demo
 * Copyright: MIT
 */

@Repository
public interface CarRepository extends MongoRepository<Car, String> {
}
