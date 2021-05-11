package com.example.springdocker.controller;

import com.example.springdocker.model.Car;
import com.example.springdocker.model.Shoe;
import com.example.springdocker.service.ShoeService;
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
public class ShoeController {

    private final ShoeService service;

    @GetMapping("/shoes")
    public List<Shoe> getShoes() {
        return service.getShoes();
    }

    @PostMapping("/shoes")
    public void saveNewShoe(@RequestBody Shoe shoe) {
        service.saveNewShoe(shoe);
    }


}
