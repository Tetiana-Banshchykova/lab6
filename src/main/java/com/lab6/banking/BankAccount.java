package com.lab6.banking;

public class BankAccount {
    String name;
    int bankID;
    double balance;

    public BankAccount()
    {
        name = "John";
        bankID = 12345678;
        balance = 100;
    }

    public String getValues()
    {
        return String.format("Your name is: %s.%n Your bank ID is: %d.%n Your balance is %f", this.name, this.bankID, this.balance);
    }

    public String giveMoney(double yourSum)
    {
        balance = balance + yourSum;
        return String.format("You have given %.2f $ on your account. Now you have %.2f $", yourSum, balance);
    }

    public String takeMoney(double yourSum)
    {
        if (balance - yourSum < 0) 
        {
            return "You don't have enough money on your balance.";
        }
        else
        {
            balance = balance - yourSum;
            return String.format("You successfully taken %f $, your current balance is %f $.", yourSum, balance);
        }
    }
}
