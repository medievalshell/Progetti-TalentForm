
class FatherAccount{

    balance = 0
    firstDeposit = 0
    firstDraw = 0
    secondDeposit = 0
    secondDraw = 0
   

    constructor(balance,firstDeposit,firstDraw,secondDeposit,secondDraw) {
     
        this.balance=balance
        this.firstDeposit=firstDeposit
        this.firstDraw=firstDraw
        this.secondDeposit=secondDeposit
        this.secondDraw=secondDraw

    }

    getFirstMovement() {
        

        return this.balance + this.firstDeposit
    }
    

    getSecondMovement() {
        

        return this.getFirstMovement() - this.firstDraw
    }

    getThreeMovement() {
        

        return this.getSecondMovement() + this.secondDeposit
    }


    getTotalAccount() {
        

        return this.getThreeMovement - this.secondDraw
    }

}


let accountFather = new FatherAccount(0, 500, 100, 200, 100)

let totAccount = accountFather.getTotalAccount()
console.log('FatherAccount:  ' + totAccount);



class SonAccount extends FatherAccount {

    balance = 0
    firstDeposit = 0
    firstDraw = 0
    secondDeposit = 0
    interested= 0
    

    constructor(balance,firstDeposit,firstDraw,secondDeposit,interested) {
       
        super(balance, firstDeposit, firstDraw, secondDeposit)
        
        this.interested= interested

    }

    
    getFirstMovement() {
        

        return this.balance + this.firstDeposit
    }
    

    getSecondMovement() {
        

        return this.getFirstMovement() - this.firstDraw
    }

    getThreeMovement() {
        

        return this.getSecondMovement() + this.secondDeposit
    }


    getFourMovement() {
        

        return this.getThreeMovement - this.secondDraw
    }



    getInterested() {
        
    return this.getFourMovement*this.interested/100

    }


    getTotalAccount() {
        

   return this.getFourMovement() - this.getInterested()

    }

}

let sonAccount = new SonAccount(0, 400, 100, 200, 100, 10)
let totalAccount = sonAccount.getTotalAccount()
console.log('Son account:  '+ totalAccount);