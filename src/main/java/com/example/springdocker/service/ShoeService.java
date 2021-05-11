package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.model.Shoe;
import com.example.springdocker.repository.ShoeRepository;
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
public class ShoeService {
    private final ShoeRepository repository;


    public List<Shoe> getShoes() {
        return repository.findAll();
    }

    public void saveNewShoe(Shoe shoe) {
        repository.save(shoe);
    }

}
