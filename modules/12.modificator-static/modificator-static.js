var MyAccount = /** @class */ (function () {
    //proprietà della classe
    function MyAccount(balance, firstDeposit, firstDraw) {
        //costruttore della classe
        MyAccount.balance = balance;
        MyAccount.firstDeposit = firstDeposit;
        MyAccount.firstDraw = firstDraw;
    }
    MyAccount.getFirstDeposit = function () {
        return this.balance + this.firstDeposit;
    };
    MyAccount.getTotalAccount = function () {
        return this.getFirstDeposit() - this.firstDraw;
    };
    return MyAccount;
}());
var myAccount = new MyAccount(0, 500, 100);
var total = MyAccount.getTotalAccount(); // chiamo il metodo static
console.log(total);
