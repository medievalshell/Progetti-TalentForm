// classe astratta

abstract class BankAccount {
  nameAccount: string;

  constructor(nameAccount: string) {
    this.nameAccount = nameAccount;
  }

  abstract getTotalAccount(); // dichiarazione non implementazione
}

class Account extends BankAccount {
  balance: number;

  constructor(balance: number, nameAccount: string) {
    super(nameAccount);
    this.balance = balance;
  }

  getTotalAccount(firstMovment: number = 100, firstDraw: number = 50): number {
    return this.balance + firstMovment - firstDraw;
  }
}

let account = new Account(0, "Personale");
let bank = account.getTotalAccount();
let newName = (account.nameAccount = "Work");
console.log(newName);
