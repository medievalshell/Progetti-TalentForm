// OGGETTI
let corso = {
  materia: ["javascript", "java", "php"],
  durata: 200,
  studenti: 16,
  esito: "idoneo",
  occupazione: "tirocinio",
};
corso.sviluppo = "web";
console.log(corso.sviluppo);
console.log(corso);

let auto = {
  gomme: 4,
  colore: "blu",
  porte: 5,
  cil: 1300,
  marca: function () {
    return this.colore + " " + this.porte;
  },
};

console.log(auto.marca()); //oggetto invoca la funzione
console.log(auto.porte); // oggetto invoca la proprietà porte
auto.concessionaria = ["fiat", "auto", "blu"]; // oggetto invoca una nuova proprietà assegnandole un valore
console.log(auto);

let classe = {
  numeroStudenti: 10,
  cittaStudenti: ["roma,milano", "torino"],
  nomiStudenti: ["luca", "paolo", "marco"],
  etaStudenti: [22, 23, 24, 25, 26],
  istituto: function () {
    return (
      this.nomiStudenti + "," + this.newstudents + " " + this.otherstudents
    );
  },
};

classe.newstudents = ["maria", "alberto", "sara"];
classe.otherstudents = ["gino", "mario", "luciano"];

console.log(classe.istituto());
