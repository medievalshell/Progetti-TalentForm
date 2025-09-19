interface ISmartphone {
  smartphone: string;
  id: number;
}

interface INotebook {
  brand: string;
  id: number;
}

class Technology implements ISmartphone,INotebook {
  smartphone: string;
  id: number;
  brand: string
  

  constructor(smartphone: string, id: number,brand:string) {
    this.smartphone = smartphone;
    this.id = id;
    this.brand = brand;
  }
}

let smartphone = new Technology("iOS", 15,'Audi');
console.log(smartphone);
