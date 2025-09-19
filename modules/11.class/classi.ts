class Car {
  //public nome:string // proprietà di classe
  //private cognome:string // incapsulamento accessibili solo all interno della classe

  constructor(public brand: string, public year: number) {
    // scrittura

    this.brand = brand;
    this.year = year;
  }

  // metodi di classe
  public colorCar(): void {}

  public fuel(): string {
    // lettura

    return "Diesel";
  }
}

let cars = new Car("Audi", 2023);



class DealerShip extends Car {
  // ereditarietà di classe

  garage: string;
  salesOperator: string;
  testDrive: string;

  constructor(
    brand: string,
    year: number,
    garage: string,
    salesOperator: string,
    testDrive: string,
    readonly id: number
  ) {
    super(brand, year);
    this.garage = garage;
    this.salesOperator = salesOperator;
    this.testDrive = testDrive;
  }

  // get
  public getCarsSold(): number {
    // polimorfismo

    return 25;
  }

  // set

  public getOwner(salesOperator): void {
    if (this.testDrive == salesOperator) {
      throw new Error("Not equals");
    }

    this.testDrive = this.testDrive;
  }
}

let dealer = new DealerShip(
  "Audi",
  2024,
  "Audi",
  "Sales Operator",
  "TestDrive",
  1
);

let carsOld = dealer.getCarsSold();
console.log(carsOld);
let owner = dealer.brand;
let year = dealer.year;
console.log(year);
