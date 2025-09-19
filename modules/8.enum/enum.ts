enum Color {
  Red = 4,
  Green,
  Blue,
  Pink,
  White,
}

let color: Color = Color.Green;
console.log(color);

enum Direction {
  Up = "UP",
  Down = "DOWN",
  Left = "LEFT",
  Right = "RIGHT",
}

enum HeterogeneousEnum {
  No = 0,
  Yes = "YES",
}

let enumeration: Direction = Direction.Down;
let heterogeneous: HeterogeneousEnum = HeterogeneousEnum.Yes;

console.log(enumeration);
console.log(heterogeneous);
