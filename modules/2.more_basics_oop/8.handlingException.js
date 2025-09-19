/*
        ERROR  EXCEPTION BY ZERO
        let exc = 5/0
        console.log(exc);
        */

try {
  let exc = 5 / 0; // inserisco le istruzioni da eseguire
} catch (error) {
  // interviene se si presenta un eccezione
} finally {
  console.log("Eccezione Gestita");
}


let exct = 5 / 0
console.log(exct)


let b;
console.log(b); //undefined

try {
  let arr = [1, 2, 3, 4, 5]; // EXCEPTION INDEX OF BUNDLE
  console.log(arr[6]);
} catch (error) {
} finally {
  console.log("Eccezione Gestita");
}

function getRectArea(width, height) {
  // LANCIO UN ECCEZIONE PERSONALIZZATA DI TIPO ERROR
  if (isNaN(width) || isNaN(height)) {
    throw new Error("Parameter is not a number!");
  }
}

try {
  getRectArea(3, "a");
} catch (e) {
  console.error(e);
}
