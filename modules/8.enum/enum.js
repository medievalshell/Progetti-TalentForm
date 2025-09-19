var Color;
(function (Color) {
    Color[Color["Red"] = 4] = "Red";
    Color[Color["Green"] = 5] = "Green";
    Color[Color["Blue"] = 6] = "Blue";
    Color[Color["Pink"] = 7] = "Pink";
    Color[Color["White"] = 8] = "White";
})(Color || (Color = {}));
let color = Color.Green;
console.log(color);
var Direction;
(function (Direction) {
    Direction["Up"] = "UP";
    Direction["Down"] = "DOWN";
    Direction["Left"] = "LEFT";
    Direction["Right"] = "RIGHT";
})(Direction || (Direction = {}));
var HeterogeneousEnum;
(function (HeterogeneousEnum) {
    HeterogeneousEnum[HeterogeneousEnum["No"] = 0] = "No";
    HeterogeneousEnum["Yes"] = "YES";
})(HeterogeneousEnum || (HeterogeneousEnum = {}));
let enumeration = Direction.Down;
let heterogeneous = HeterogeneousEnum.Yes;
console.log(enumeration);
console.log(heterogeneous);
//# sourceMappingURL=enum.js.map