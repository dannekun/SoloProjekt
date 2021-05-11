package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Toy;
import com.example.springdocker.repository.ToyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Daniel Bojic
 * Date: 2021-05-11
 * Time: 12:20
 * Project: spring-docker-demo
 * Copyright: MIT
 */

@RequiredArgsConstructor
@Service
public class ToyService {
    private final ToyRepository repository;

    public List<Toy> getToys() {
        return repository.findAll();
    }

    public void saveNewToy(Toy toy) {
        repository.save(toy);
    }

}
