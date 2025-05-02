package com.lab6;

import com.lab6.banking.BankAccount;
import com.lab6.banking.LoanSystem;
import com.lab6.cars.Sedan;
import com.lab6.person.Person;
import com.lab6.person.PersonBuilder;
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
        LoanSystem loan = new LoanSystem();
        Person john = new Person();
        Person bob = new Person("Bob Newmaker", 34);
        Phone samsung = new Phone();
        Phone xiaomi = new Phone(0643567245); // 0-prefixed integers should be avoided; use long or string if needed
        Ball ball = new Ball();
        Cylinder cylinder = new Cylinder();
        Pyramid pyramid = new Pyramid();
        Sedan sedan = new Sedan("Cruiser", "Red", 100);
        Person person = new PersonBuilder()
        .setFullName("Alice Johnson")
        .setAge(28)
        .build();
        
    
        if (logger.isInfoEnabled()) {
            logger.info("Completing Task 1...");
            logger.info(bob.talk());
            logger.info(bob.move());
            logger.info(john.talk());
            logger.info(john.move());
            logger.info(person.talk());

    
            logger.info("Completing Task 2...");
            logger.info(xiaomi.receiveCall("John"));
            logger.info(samsung.receiveCall("John"));

            logger.info("Completing Task 3...");
            logger.info("Your radius is: {}", ball.getRadius());
            logger.info("Your cylinder's radius is: {}", cylinder.getRadius());
            logger.info("Your volume is: {}", pyramid.getVolume());
            
            logger.info("Completing Task 4...");
            logger.info(sedan.breakers());
            logger.info(sedan.gas());
            
            logger.info("Completing Task 5 and 6...");
            logger.info(user.getValues());
            logger.info(loan.takeLoan(100));

        }
    }
    
}