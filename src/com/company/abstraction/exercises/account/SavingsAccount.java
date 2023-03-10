package com.company.abstraction.exercises.account;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
        interestRate = 0.0;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

}
