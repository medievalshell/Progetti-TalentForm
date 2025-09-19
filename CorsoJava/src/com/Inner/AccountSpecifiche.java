package com.Inner;

public class AccountSpecifiche {
    private int balance;
    private int firstDeposit;
    private int firstDraw;
    private int secondDeposit;
    private int secondDraw;
    private int canoneAnnuo;
    private int impostaBollo;
    public AccountSpecifiche(int balance, int firstDeposit, int firstDraw, int secondDeposit, int secondDraw,
            int canoneAnnuo, int impostaBollo) {
        this.balance = balance;
        this.firstDeposit = firstDeposit;
        this.firstDraw = firstDraw;
        this.secondDeposit = secondDeposit;
        this.secondDraw = secondDraw;
        this.canoneAnnuo = canoneAnnuo;
        this.impostaBollo = impostaBollo;
    }
    class Operazioni{
        public int getFirstDeposit() {
            return balance + firstDeposit;
        }
        public int getFirstDraw() { 
            return this.getFirstDeposit() - firstDraw;
        }
        public int getSecondDeposit() {
            return this.getFirstDraw() + secondDeposit;
        }
        public int getSecondDraw() {
            return this.getSecondDeposit() - secondDraw;
        }
        public int calcoloCanoneAnnuo() {
            return this.getSecondDraw() * canoneAnnuo / 100;
        }
        public int calcoloImpostaBollo() {
            return this.getSecondDraw() * impostaBollo / 100;
        }
        public int getTotalAccount() {   
            return this.getSecondDraw() - (this.calcoloCanoneAnnuo() + this.calcoloImpostaBollo());
        } 
    }
    public static void main(String[] args) {
        AccountSpecifiche account = new AccountSpecifiche(0, 1000, 500, 1000, 500, 11, 30);
        AccountSpecifiche.Operazioni calcolo = account.new Operazioni();
        System.out.println("Il saldo attuale ammonta a: €" + calcolo.getTotalAccount());
        
    }
}