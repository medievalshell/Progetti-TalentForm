// operatori aritmetici
let addz = 15 + 12;
let prod = 5 * 5;
let div = 10 / 2;
let mod = 100 % 5; //++ operatore di incremento
let sottr = 50 - 25;
sottr += "\n" + "eseguo una sottrazione"; // -- operatore di decremento
let add = 25

console.log(addz + "\n" + prod + "\n" + div + "\n" + mod + "\n" + sottr);

// operatori di confronto  < <= > >= !=

if (addz == prod) {
  // uguale a
  console.log(true);
} else if (prod != div) {
  // diverso da

  console.log(false);
} else if (addz <= sottr) {
  // minore uguale

  console.log(true);
} else if (add >= sottr) {
  // maggiore uguale

  console.log(true);
}
