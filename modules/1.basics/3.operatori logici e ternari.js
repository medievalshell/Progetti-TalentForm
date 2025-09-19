  // OPERATORI LOGICI AND && OR ||
let codice_01 = 50
let codice_02 = 50
let codice_03 = 100
let codice_04 =200


if (codice_03 == codice_04 && codice_01 == codice_02) {  // SE LA PRIMA ESPRESSIONE RISULTA ESSERE VERA E LA SECONDA ESSERE FALSA RESTITUISCE FALSE
                                                          // SE TUTTE E DUE LE ESPRESSIONI SONO VERE RESTITUISCE TRUE
                                                          // SE TUTTE E DUE LE ESPRESSIONI SONO FALSE RESTITUISCE FALSE
              
  console.log(true);
} else  {
  

  console.log(false);
}


if (codice_03 == codice_04 || codice_01 != codice_02) { // SE LA PRIMA ESPRESSIONE RISULTA ESSERE VERA E LA SECONDA ESSERE FALSA RESTITUISCE TRUE
                                                          // SE TUTTE E DUE LE ESPRESSIONI SONO VERE RESTITUISCE TRUE
                                                          // SE TUTTE E DUE LE ESPRESSIONI SONO FALSE RESTITUISCE FALSE
              

    console.log(true);
} else  {

      console.log(false);
}




// operatori ternari

let tern = 5 < 3 ? true : false;
console.log(tern);

let anno = 2023;
let check = anno > 2022 ? true : false;
console.log(check);

let stop = false,
  age = 18;

age >= 18
  ? alert("Marco potrà guidare l'automobile")
  : ((stop = true), alert("Marco non potrà ancora guidare l'automobile"));
