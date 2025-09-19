package com.oop.classes.intro;

import java.io.Serializable;

public class SavingsAccount extends AccountProperties implements Serializable {
	private static final long serialVersionUID = 1L;
	private double taxRate;

	public SavingsAccount(int accountNumber, String accountName, double taxRate) {
        super(accountNumber, accountName);
        this.taxRate = taxRate;
    }
    
	@Override
    public void deposit(double amount) {
        this.balance += amount;
    }
    
	@Override
    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    
    @Override
    public String getAccountType() {
        return "Conto Risparmio";
    }

    public double calculateTax() {
        return this.balance * taxRate;
    }
}
