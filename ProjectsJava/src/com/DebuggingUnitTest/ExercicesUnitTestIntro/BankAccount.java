package com.DebuggingUnitTest.ExercicesUnitTestIntro;


import static junit.framework.TestCase.fail;

public class BankAccount {

    public static void main(String[] args) {
        System.out.println("The application is running");
    }


    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }


    public double deposit(double amount) {
        balance += amount;
        return balance;
    }


    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {

        return balance;
    }

}







