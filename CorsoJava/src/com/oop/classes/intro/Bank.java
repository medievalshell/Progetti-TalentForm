package com.oop.classes.intro;

public class Bank {
    
	// APPLICANDO L'INCAPSULAMENTO
	private int balance;
	private int firstDeposit;
	private int firstDraw;
	private int secondDeposit;
	private int secondDraw;

	public int getFirstDeposit() {
		return balance + firstDeposit;
	}

	public void setFirstDeposit(int firstDeposit) {
		this.firstDeposit = firstDeposit;
	}

	public int getFirstDraw() {
		return getFirstDeposit() - firstDraw;
	}

	public void setFirstDraw(int firstDraw) {
		this.firstDraw = firstDraw;
	}

	public int getSecondDeposit() {
		return getFirstDraw() + secondDeposit;
	}

	public void setSecondDeposit(int secondDeposit) {
		this.secondDeposit = secondDeposit;
	}

	public int getTotalAccount() {
		return getSecondDeposit() - secondDraw;
	}

	public void setSecondDraw(int secondDraw) {
		this.secondDraw = secondDraw;
	}

	  // PASSAGGIO DELL'ATTTRIBUTO BALANCE SU SETBALANCE COME PARAMETRO = INCAPSULAMENTO DI BALANCE
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {

		Bank account = new Bank();
 

		account.setBalance(0);
		account.setFirstDeposit(300);
		account.setFirstDraw(100);
		account.setSecondDeposit(50);
		account.setSecondDraw(10);

		System.out.println("SALDO FINALE €" + account.getTotalAccount());

	}

}


