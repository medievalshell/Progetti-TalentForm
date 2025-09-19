/*
        1.Dichiarazione della classe   -11
        2. definire le proprietà della classe -12/14
        3. definire il costruttore della classe  -16
        4. referenza delle proprietà    -19/21
        5. creare l'oggetto o istanza della classe passando al costruttore 
            i valori delle proprietà precedentemente referenziate dal costruttore -26
        6. stampa dei valori delle proprietà mediante l'istanza della classe  -27

               */
class Studente {
  nome = ""; // proprietà di classe
  cognome = "";
  nazione = "";

  constructor(nome, cognome, nazione) {
    // costruttore di classe

    this.nome = nome; // referenzio le proprieta' della classe
    this.cognome = cognome;
    this.nazione = nazione;
  }
}


let studente = new Studente("antonio", "rossi", "italia"); // istanzio la classe e passo gli argomenti al costruttore
console.log(studente);


class IndirizziScolastici extends Studente {
  // ereditarietà

  istituto = "";

  constructor(istituto, nome, cognome, nazione) {
    super(nome, cognome, nazione); // passo al super le proprieta' della classe padre

    this.istituto = istituto;
  }
  getIstituto() {
    // metodo di classe

    return this.istituto;
  }
}
let nomeIstituto = new IndirizziScolastici("giuseppe verdi");
console.log(nomeIstituto);
let istituto = nomeIstituto.getIstituto(); // creo la variabile oggetto per chiamare il metodo
console.log(istituto);
istituto.nome; // chiamo la proprieta'
console.log(istituto);
