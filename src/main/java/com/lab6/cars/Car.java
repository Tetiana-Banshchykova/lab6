package com.lab6.cars;

public abstract class Car {
    String model;
    String color;
    int maxSpeed;

    public String gas()
    {
        return("Hitting the gas!");
    }

    abstract void breakers();
}
