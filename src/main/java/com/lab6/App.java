package com.lab6;

import com.lab6.banking.BankAccount;
import com.lab6.person.Person;
import com.lab6.phone.Phone;
import com.lab6.shapes.Ball;
import com.lab6.shapes.Cylinder;
import com.lab6.shapes.Pyramid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        Person john = new Person();
        Person bob = new Person("Bob Newmaker", 34);
        Phone samsung = new Phone();
        Phone xiaomi = new Phone(0643567245);
        Ball ball = new Ball();
        Cylinder cylinder = new Cylinder();
        Pyramid pyramid = new Pyramid();

        logger.info("Completing Task 1...");
        logger.info(bob.talk());
        logger.info(bob.move());

        logger.info("Completing Task 2...");
        logger.info(xiaomi.receiveCall("John"));

    }
}