package com.lab6.cars;

public class Sedan extends Car {
    public Sedan(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String breakers() {
        return "Breaking smoothly like a sedan!";
    }
}
