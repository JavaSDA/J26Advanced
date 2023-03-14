package com.company.abstraction.exercises.account;

public class BankTest {
    public static void main(String[] args) {
        Bank federalReserve = new Bank(6);

//        Account savings = new SavingsAccount("EEE2213423");
//        Account checking = new CheckingAccount("BB233288");

        federalReserve.addAccount(new SavingsAccount("EEE2213423"));
        federalReserve.addAccount(new CheckingAccount("BB233288"));

        federalReserve.deposit("EEE2213423", 100); // Deposit money into an account from the bank interface
        System.out.println(federalReserve.getBalance("EEE2213423")); // Get balance of an account from the bank interface
    }
}
