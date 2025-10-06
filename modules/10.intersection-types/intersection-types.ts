// intersection type
type Admin = {
  name: string;
  privileges: string[];
};

type Employee = {
  // employe: string;
  startDate: Date;
};

// interface ElevatedEmployee extends Employee, Admin {}

type ElevatedEmployee = Admin & Employee;

const employe: ElevatedEmployee = {
  name: 'Max',
  // employe: 'Technical Lead',
  privileges: ['Coordinator Team'],
  startDate: new Date()
};

console.log(employe);
type Admin1={
  nome:string;
  grade:string[];
}
type Worker1={
  worker:string;
}
type Lavoratore=Admin1&Worker1&Employee;
const lavoratore1:Lavoratore={
  nome:'Luca',
  grade:['Team Leader'],
  worker:'Developer',
  startDate:new Date(),
} 







