let func = "function"; // scope globale(esterna)
let arr = [1, 2, 3, 4, 5];
// variabile globale

function myfunc(nome, corso) {
  // DICHIARAZIONE FUNZIONE

  let anno = 2021;

  // variabile locale

  func = nome; // scope locale(interna)

  return nome + " " + corso +' ' +arr[0];
}
console.log(myfunc("fabio", "javascript")); // CHIAMATA FUNZIONE
