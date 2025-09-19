// costrutti di controllo

let numberOne = 50;
let numberTwo = 25;

if (numberOne > numberTwo) {
  console.log(true);
} else {
  console.log(false);
}

if (numberTwo < numberOne) {
  console.log(true);
} else if (numberOne == numberTwo) {
  console.log(false);
}

if (numberOne > numberTwo && numberOne == numberOne) {
  console.log(true);
} else {
  console.log(false);
}

// costrutto controllo switch

let mese = 3;

switch (mese) {
  case 1:
    console.log("Gennaio");
    break; // comando break(interrompe ciclo)
  case 2:
    console.log("Febbraio");
    break;
  case 3:
    console.log("Marzo");
    break;
  default:
    console.log("not found values");
    break;
}

// costrutto di iterazione  for

let first;

for (first = 50;first > 20; first = first - 2) {
  if (first == 26) {
    continue; //comando continue
  }

  console.log(first);
}

for (let index = 100; index >50; index = index -5) {
  console.log(index);
}

// construtto di iterazione while (itera finchè la condizione risulta vera)

let second = 0;

while (second <18) {
  second += 2;

  console.log(second);
}

// costrutto di iterazione do-while (esegue almeno un iterazione anche se risulta falsa)

let one = 1;

do {
  console.log(one);
  one += 3;
} while (one < 10);

let zero = 0;

while (zero < 5) {
  zero += 1;

  console.log(zero);
}
