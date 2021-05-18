package com.example.springdocker.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Daniel Bojic
 * Date: 2021-05-18
 * Time: 23:23
 * Project: spring-docker-demo
 * Copyright: MIT
 */

class MyMathCalcTest {

    MyMathCalc m = new MyMathCalc();
    @Test
    void addTest(){

        int x = 1;
        int y = 2;

        int z = x + y;

        assertEquals(z, m.add(x,y));
    }

    @Test
    void multiTest(){
        int x = 1;
        int y = 2;

        int z = x * y;

        assertEquals(z ,m.multiply(x,y));
    }

    @Test
    void divideTest(){
        int x = 1;
        int y = 2;

        int z = y/x;

        assertEquals(z ,m.divide(y,x));

    }

    @Test
    void divideByZeroTest(){

    assertThrows(IndexOutOfBoundsException.class, () -> m.divide(1,0));


    }

}