// classe astratta
class BankAccount {
    constructor(nameAccount) {
        this.nameAccount = nameAccount;
    }
}
class Account extends BankAccount {
    constructor(balance, nameAccount) {
        super(nameAccount);
        this.balance = balance;
    }
    getTotalAccount(firstMovment = 100, firstDraw = 50) {
        return this.balance + firstMovment - firstDraw;
    }
}
let account = new Account(0, "Personale");
let bank = account.getTotalAccount();
let newName = (account.nameAccount = "Work");
console.log(newName);
//# sourceMappingURL=classi-astratte.js.map