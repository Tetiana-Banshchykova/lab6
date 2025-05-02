package com.lab6.banking;

public class LoanSystem extends BankAccount {
    double creditLimit;
    double creditPercent;
    int loanDate;

    public LoanSystem()
    {
        creditLimit = 1000;
    }

    public String takeLoan(int yourSum)
    {
        if (yourSum < creditLimit) {
            return String.format("Sorry, unfortunately your credit limit is too low for this loan. YOur current limit is %.2f", creditLimit);
        }
        else
        {
            balance = balance + yourSum;
            return String.format("You successfully have taken a loan. Your balance now is %.2f.", balance);
        }
    }
}
