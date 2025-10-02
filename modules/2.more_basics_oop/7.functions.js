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

function giocaConLaConsole() {
  console.log("Benvenuto nel gioco della console!");
  console.warn("Attenzione: questo è solo un esempio.");
  console.error("Errore finto: nessun errore reale.");
  let risposta = prompt("Scrivi un numero da 1 a 10:");
  if (risposta == 7) {
    console.log("Hai indovinato il numero segreto!");
  } else {
    console.log("Ritenta, il numero segreto era 7.");
  }
}

giocaConLaConsole();
function indovinaNumero() {
  console.log("Benvenuto! Indovina il numero segreto tra 1 e 10.");
  const segreto = Math.floor(Math.random() * 10) + 1;
  let tentativi = 0;
  let trovato = false;
  while (!trovato) {
    let risposta = prompt("Inserisci un numero:");
    tentativi++;
    if (Number(risposta) === segreto) {
      console.log("Complimenti! Hai indovinato in " + tentativi + " tentativi.");
      trovato = true;
    } else if (risposta === null) {
      console.warn("Gioco interrotto.");
      break;
    } else {
      console.log("Sbagliato! Riprova.");
    }
  }
}
indovinaNumero();
//tabellina 10
function tabellina10() {
  console.log("Tabellina del 10:");
  for (let i = 1; i <= 10; i++) {
    console.log(10 * i);
  } 
}
tabellina10();
//Scrivi una funzione che controlla se un valore è presente in un array.
function checkValueInArray(arr, val) {
  return arr.includes(val);
}   