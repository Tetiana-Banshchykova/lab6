package com.lab6.person;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Unknown";
        this.age = 0;
        
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        
    }

    public String move() {
        return String.format("%s is moving!", fullName);
    }

    public String talk() {
        return String.format("%s, age %d, is talking!", fullName, age);
    }
}

