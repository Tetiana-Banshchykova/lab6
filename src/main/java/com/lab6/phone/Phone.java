package com.lab6.phone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.inject.Inject;

public class Phone {
    private final Logger logger;

    private int number;
    @Inject
    public Phone(Logger logger) {
        this.logger = logger;
    }

    public Phone() {
        this.logger = LoggerFactory.getLogger(Phone.class);
        this.number = 0;
    }

    public Phone(int number) {
        this.logger = LoggerFactory.getLogger(Phone.class);
        this.number = number;
    }

    public String receiveCall(String fullName) {
        return String.format("The %s is calling!", fullName);
    }

    public String receiveCall(String fullName, int number) {
        return String.format("The %s, %d is calling!", fullName, number);
    }

    public int getNumber() {
        return number;
    }

    public void sendMessages(String... phoneNumbers) {
        logger.info("Sending message to the following numbers:");
        for (String phone : phoneNumbers) {
            logger.info(phone);
        }
    }
}
