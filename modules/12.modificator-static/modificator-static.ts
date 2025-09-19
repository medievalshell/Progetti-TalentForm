class MyAccount {
  // classe

  static balance: number;
  static firstDeposit: number;
  static firstDraw: number;
 //proprietà della classe

  constructor(balance: number,firstDeposit:number,firstDraw:number) {
    //costruttore della classe
    MyAccount.balance = balance;
    MyAccount.firstDeposit = firstDeposit;
    MyAccount.firstDraw = firstDraw;
  }

  static getFirstDeposit(): number {
    return this.balance + this.firstDeposit;
  }


  static getTotalAccount(): number {
    return this.getFirstDeposit() - this.firstDraw;
  }
}
let myAccount = new MyAccount(0, 500, 100);
let total = MyAccount.getTotalAccount() // chiamo il metodo static
console.log(total);


