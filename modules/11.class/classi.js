class Car {
    //public nome:string // proprietà di classe
    //private cognome:string // incapsulamento accessibili solo all interno della classe
    constructor(brand, year) {
        // scrittura
        this.brand = brand;
        this.year = year;
        this.brand = brand;
        this.year = year;
    }
    // metodi di classe
    colorCar() { }
    fuel() {
        // lettura
        return "Diesel";
    }
}
let cars = new Car("Audi", 2023);
class DealerShip extends Car {
    constructor(brand, year, garage, salesOperator, testDrive, id) {
        super(brand, year);
        this.id = id;
        this.garage = garage;
        this.salesOperator = salesOperator;
        this.testDrive = testDrive;
    }
    // get
    getCarsSold() {
        // polimorfismo
        return 25;
    }
    // set
    getOwner(salesOperator) {
        if (this.testDrive == salesOperator) {
            throw new Error("Not equals");
        }
        this.testDrive = this.testDrive;
    }
}
let dealer = new DealerShip("Audi", 2024, "Audi", "Sales Operator", "TestDrive", 1);
let carsOld = dealer.getCarsSold();
console.log(carsOld);
let owner = dealer.brand;
let year = dealer.year;
console.log(year);
//# sourceMappingURL=classi.js.map