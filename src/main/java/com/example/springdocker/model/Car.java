package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Daniel Bojic
 * Date: 2021-05-11
 * Time: 11:47
 * Project: spring-docker-demo
 * Copyright: MIT
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    String id;
    String name;
}
