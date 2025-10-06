class MyAccount {
    //proprietà della classe
    constructor(balance, firstDeposit, firstDraw) {
        //costruttore della classe
        MyAccount.balance = balance;
        MyAccount.firstDeposit = firstDeposit;
        MyAccount.firstDraw = firstDraw;
    }
    static getFirstDeposit() {
        return this.balance + this.firstDeposit;
    }
    static getTotalAccount() {
        return this.getFirstDeposit() - this.firstDraw;
    }
}
let myAccount = new MyAccount(0, 500, 100);
let total = MyAccount.getTotalAccount(); // chiamo il metodo static
console.log(total);
//# sourceMappingURL=modificator-static.js.map