package com.example.springdocker.model;

/**
 * Created by Daniel Bojic
 * Date: 2021-05-12
 * Time: 14:04
 * Project: spring-docker-demo
 * Copyright: MIT
 */


public class MyMathCalc {

    public int add(int a, int b){
    return a + b;
    }

    public int multiply(int a, int b){
        return a * b;
    }


    public double divide(double a, double b){

        if (a == 0 || b == 0){
            throw new IndexOutOfBoundsException("Du kan inte dela med 0");
        }


        return a/b;
    }


}
