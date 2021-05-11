package com.example.springdocker.service;

import com.example.springdocker.model.Drink;
import com.example.springdocker.model.Food;
import com.example.springdocker.repository.DrinkRepository;
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
public class DrinkService {
    private final DrinkRepository repository;


    public List<Drink> getDrinks() {
        return repository.findAll();
    }

    public void saveNewDrink(Drink drink) {
        repository.save(drink);
    }



}
