package com.oop.classes.intro;

import java.io.Serializable;

public abstract class AccountProperties implements Serializable {
	private static final long serialVersionUID = 1L;
	protected double balance;
    private int accountNumber;
    private String accountName;

    public AccountProperties(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountName() {
        return accountName;
    }
    
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract String getAccountType();
}
