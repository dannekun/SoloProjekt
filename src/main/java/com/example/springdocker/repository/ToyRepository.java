package com.example.springdocker.repository;

import com.example.springdocker.model.Drink;
import com.example.springdocker.model.Toy;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Daniel Bojic
 * Date: 2021-05-11
 * Time: 11:55
 * Project: spring-docker-demo
 * Copyright: MIT
 */
public interface ToyRepository  extends MongoRepository<Toy, String> {
}
