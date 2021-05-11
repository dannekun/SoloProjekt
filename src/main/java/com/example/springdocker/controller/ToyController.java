package com.example.springdocker.controller;

import com.example.springdocker.model.Car;
import com.example.springdocker.model.Toy;
import com.example.springdocker.service.ToyService;
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
public class ToyController {

    private final ToyService service;

    @GetMapping("/toys")
    public List<Toy> getToys() {
        return service.getToys();
    }

    @PostMapping("/toys")
    public void saveNewToy(@RequestBody Toy toy) {
        service.saveNewToy(toy);
    }


}
