package com.oop.classes.intro;

import java.io.Serializable;

public class CheckingAccount extends AccountProperties implements Serializable {
	private static final long serialVersionUID = 1L;
	public CheckingAccount(int accountNumber, String accountName) {
		super(accountNumber, accountName);
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
        return "Conto Corrente";
    }
}
