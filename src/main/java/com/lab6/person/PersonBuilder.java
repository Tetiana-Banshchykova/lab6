package com.lab6.person;

//Person builder
public class PersonBuilder {

    private String fullName = "Unknown";
    private int age = 0;

    public PersonBuilder setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(fullName, age);
    }
}