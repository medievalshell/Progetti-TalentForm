package com.oop.classes.intro;

public class BankAccount {
	private int balance = 0;
	private int firstDeposit = 0;
	private int firstDraw = 0;
	private int secondDeposit = 0;
	private int secondDraw = 0;
    // Getter e Setter
    public int getBalance() { return balance; }
    public void setBalance(int balance) { this.balance = balance; }

    public int getFirstDeposit() { return firstDeposit; }
    public void setFirstDeposit(int firstDeposit) {
        this.firstDeposit = firstDeposit;
        balance += firstDeposit;
    }

    public int getFirstDraw() { return firstDraw; }
    public void setFirstDraw(int firstDraw) {
        this.firstDraw = firstDraw;
        balance -= firstDraw;
    }

    public int getSecondDeposit() { return secondDeposit; }
    public void setSecondDeposit(int secondDeposit) {
        this.secondDeposit = secondDeposit;
        balance += secondDeposit;
    }

    public int getSecondDraw() { return secondDraw; }
    public void setSecondDraw(int secondDraw) {
        this.secondDraw = secondDraw;
        balance -= secondDraw;
    }
	public static void main(String[] args) {
		
	}

}
