// enum Color {
//   Red = 4,
//   Green,
//   Blue,
//   Pink,
//   White,
// }

// let color: Color = Color.Green;
// console.log(color);

// enum Direction {
//   Up = "UP",
//   Down = "DOWN",
//   Left = "LEFT",
//   Right = "RIGHT",
// }

// enum HeterogeneousEnum {
//   No = 0,
//   Yes = "YES",
// }

// let enumeration: Direction = Direction.Down;
// let heterogeneous: HeterogeneousEnum = HeterogeneousEnum.Yes;

// console.log(enumeration);
// console.log(heterogeneous);

enum Stagione{
  PRIMAVERA,
  ESTATE,
  AUTUNNO,
  INVERNO,
}
function getStagione(stagione: Stagione): string {
  switch (stagione) {
    case Stagione.PRIMAVERA:
      return "primavera"; 
    case Stagione.ESTATE:
      return "estate";
    case Stagione.AUTUNNO:
      return "autunno";
    case Stagione.INVERNO:
      return "inverno";
    default:
      return "non è una stagione";
  }
}
let s: Stagione = Stagione.ESTATE;
console.log(getStagione(s));