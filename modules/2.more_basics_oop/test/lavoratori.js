
class Freelancer {

    reddLordo = 0
    coefRedd = 0
    aliquotaIrpef = 0
    aliquotaInps=0


    constructor(reddLordo, coefRedd, aliquotaInps, aliquotaIrpef) {
        
        this.aliquotaInps = aliquotaInps
        this.aliquotaIrpef = aliquotaIrpef
        this.reddLordo = reddLordo
        this.coefRedd= coefRedd
       
    }
    
    getUtileTasse() {
        
    return (this.reddLordo*this.coefRedd)/100

    }


    getTassaInps() {
        
        return (this.getUtileTasse()*this.aliquotaInps)/100
    }
   
    getTassaIrpef() {
        
        return (this.getUtileTasse()*this.aliquotaIrpef)/100
    }


    getRedditoAnnuo() {
        

        return (this.reddLordo - (this.getTassaInps()+ this.getTassaIrpef()))
    }


}

let freelancer = new Freelancer(35000, 78, 26.23, 15)

let reddAnnuoFreelancer = freelancer.getRedditoAnnuo()
console.log('Freelancer: '+reddAnnuoFreelancer);



class Artigiano {

    reddLordo = 0
    coeffRedd = 0
    tassaInps = 0
    aliquotaIrpef = 0
    
    constructor(reddLordo, coeffRedd,
    tassaInps,aliquotaIrpef) {

        this.reddLordo = reddLordo
        this.coeffRedd = coeffRedd
        this.tassaInps = tassaInps
        this.aliquotaIrpef= aliquotaIrpef

    }

     
    getUtileTasse() {
        
        return (this.reddLordo * this.coeffRedd)*100
    }

    getTassaIrpef() {
        

        return (this.getUtileTasse()*this.aliquotaIrpef)/100
    }

    getRedditoAnnuo() {
        
        return this.reddLordo - (this.tassaInps + this.getTassaIrpef())
        

    }

}

let artigiano = new Artigiano(85000,67,3500,15)
let reddAnnuoArtigiano = artigiano.getRedditoAnnuo()
console.log('Artigiano: ' + reddAnnuoArtigiano);

class Commerciante extends Artigiano{

    reddLordo = 0
    coeffRedd = 0
    tassaInps = 0
    aliquotaIrpef = 0
    
    constructor(reddLordo, coeffRedd,
    tassaInps,aliquotaIrpef) {
    super(reddLordo,coeffRedd,tassaInps,aliquotaIrpef)
        
    }

     
    getUtileTasse() {
        
        return (this.reddLordo * this.coeffRedd)*100
    }

    getTassaIrpef() {
        

        return (this.getUtileTasse()*this.aliquotaIrpef)/100
    }

    getRedditoAnnuo() {
        
        return this.reddLordo - (this.tassaInps + this.getTassaIrpef())
        

    }

}

let commerciante = new Commerciante()
let reddAnnuoCommerciante = commerciante.getRedditoAnnuo()
console.log('Commerciante: '+ reddAnnuoCommerciante);