package com.example.springdocker.controller;

import com.example.springdocker.model.Car;
import com.example.springdocker.model.Drink;
import com.example.springdocker.service.DrinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Daniel Bojic
 * Date: 2021-05-11
 * Time: 11:58
 * Project: spring-docker-demo
 * Copyright: MIT
 */

@RequiredArgsConstructor
@RestController
public class DrinkController {

    private final DrinkService service;

    @GetMapping("/drinks")
    public List<Drink> getDrinks() {
        return service.getDrinks();
    }

    @PostMapping("/drinks")
    public void saveNewDrink(@RequestBody Drink drink) {
        service.saveNewDrink(drink);
    }

}
