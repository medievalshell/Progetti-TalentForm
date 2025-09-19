// VARIABILI

/*
let color = 'red'
let id = 10.05
let log = true
color = true
const api = 'https://prova.com/products'
// NON SI PUO' FARE api =''
let brand = 'fiat' // INIZIALIZZAZIONE PER VALORE
let modelBrand = brand // INIZIALIZZAZIONE PER RIFERIMENTO

console.log(log + ' ' + color + ' ' + api);

let operation = 163 % 5
console.log('RESTO :'+' '+ operation);



if (10 < 3) {
  console.log("OK");
} else {
  console.log("ERROR");
}



if (10 == 5) {
    console.log('OK');
    
    
} else if (5 == 3) {
    
    console.log('OK');
}

else if (3 == 3) {
    
    console.log('L\'ULTIMO E QUELLO GIUSTO');
}


let min = 2
let max = 8

let res = min<max?'OK':'ERROR'
console.log(res);



if (10 > 3 || 5 < 2) {
    
    console.log('OK');
    
} else {

    console.log('ERROR');
    
}


let log! = true
 console.log(log);

 
 let year = 2025


 switch (year) {
    case 2022:
           console.log('ERROR YEAR');
           
         break;
        
      case 2024:
           console.log('ERROR YEAR');
           
         break;
     
            
      case 2026:
           console.log('EXACT YEAR');
           
         break;
    
 
     default:
           console.log('NOT FOUND VALUES');
           
        break;
 }
 
  

for (let index = 20; index > 10; index = index - 2) {
  if (index == 16) {
    continue;
  }
  console.log(index);
}

 

 let count = 0
  
while (0<10) {
    
    count++
    console.log(count);
    
}
    

 
let tech = 'JAVASCRIPT' 
let job = '   developer    '
let union = tech.concat(job)
console.log(tech.length);// LUNGHEZZA CARATTERI
console.log(job.replace('developer', 'DEVELOPER')); // SOSTITUISCO LA STRINGA INIZIALIZZATA
console.log(union); // UNIONE DI 2 STRINGHE
console.log(job.trim()); // RIMUOVO GLI SPAZI SX DX DELLA MIA VARIABILE

console.log(tech.toLowerCase() + ' '+ job.toUpperCase()); // TRASFORMO LE MIE VARIABILI DA MINUSCOLO IN MAIUSCOLO E VICEVERSA

let codStudent = 231
let cod = codStudent.toString() // CONVERTO UN VALORE NUMBER IN UN VALORE STRING
console.log(cod);
console.log(typeof(cod));  // VERIFICA CHE IL VALORE SIA UNA STRING


let colori = ["rosso", "verde", "giallo"]; 
for (let index = 0; index < colori.length; index++) {// ITERO IL MIO ARRAY
  console.log(colori[index]);
}
console.log(colori.length);// VISUALIZZO LA LUNGHEZZA DELL'ARRAY
console.log(colori[2]);// VISUALIZZO QUALE ELEMENTO SI TROVA NELLA POSIZIONE O INDICE 2
colori.pop()// RIMUOVO L'ULTIMO ELEMENTO IN CODA ALL'ARRAY
colori.push('viola') // AGGIUNGO UN NUOVO ELEMENTO IN CODA ALL'ARRAY
colori.sort() // ORDINO DA CRESCENTE A DECRESCENTE L'ARRAY
colori.reverse()// ORDINO DA DECRESCENTE A CRESCENTE L'ARRAY
colori.unshift('blu') // INSERISCO ALLA POSIZIONE 0 UN NUOVO ELEMENTO
colori.forEach(function (item, index) {   // CICLO ITEM E INDEX DELL'ARRAY
  // ciclare array
  console.log(item + " " + index);
});

colori.splice(2, 0, "arancione", "grigio"); // AGGIUNGO 2 ELEMENTI ALL'INDICE 2
console.log(colori);

colori.splice(2, 2); //  RIMUOVO GLI ELEMENTI AGGIUNTI ALL'INDICE 2

let numbers = [1, 2, 2, 3, 3, 4, 5, 6]
 let set = new Set(numbers);
      console.log(set);



  let nomi = ['c','c','b','b','a','a','d','d']
      let set = new Set(nomi);
      console.log(set);
 
   
 
    let anagrafica = [
  ["anna", 45],
  ["paolo", 10],
  ["luca", 25],
      ["antonio", 55],
      ["mirko", 15],
      ["antonia", 25],
      ["giuseppe", 55],
  ["maria", 55],
];

console.log(anagrafica);

   
let corso = {   // DEFINISCO LE PROPRIETA' E I VALORI INIZIALI
  materie: ["javascript", "java", "php"],
  oreDurata: 200,
  studenti: 16,
  periodo: "maggio-giugno",
  attestato: "si",
};

corso.webinar = "si";
console.log(corso);
//console.log(corso);



function myCourse(nome,technology) {
  return nome + ' ' + technology;
}

console.log(myCourse('corso', 'javascript')); 


let array = [0,1,2,3]

function stipendioMensileAnna(retribuzioneOraria, oreLavorate) {
  

  return 'TOTALE STIPENDIO ANNA' + ' '+ retribuzioneOraria*oreLavorate
}

console.log(stipendioMensileAnna(10, 160));


    
function CalcoloUtileTasse(redditoLordo, cefRedd) {
    
      return redditoLordo*cefRedd/100 + '  ' + array[2]
}
  
console.log(CalcoloUtileTasse(35000, 67));
  

ECCEZIONE ARITMETICA

try {

  let exct = 5 / 0
  
} catch (error) {
  
}

finally {
   
  console.log('ECCEZIONE GESTITA');
  

}
 

try {
  let array = [1, 2, 3, 4, 5];
  console.log(array[6]);
} catch (error) {
} finally {
  console.log("ECCEZIONE GESTITA");

  let array = [1, 2, 3, 4];
  console.log(
    "HO SBAGLIATO AD INSERIRE LA DIMENSIONE DEL MIO ARRAY:" + " " + array[3]
  );
}

try {
  let array = [1, 2, 3, 4, 5];
  console.log(array[6]);
} catch (error) {
} finally {
  console.log("ECCEZIONE GESTITA NEL SECONDO ARRAY");
}


let operator = ''
 console.log(operator);
 


  function getRectArea(width, height) {
  if (isNaN(width) || isNaN(height)) {
    throw new Error("Parameter is not a number!");
  }
}

try {
  getRectArea(3, "a");
} catch (e) {
  console.error(e);
}

   */

/*
        1.Dichiarazione della classe   
        2. definire le proprietà della classe 
        3. definire il costruttore della classe  
        4. referenza delle proprietà    
        5. creare l'oggetto o istanza della classe passando al costruttore 
            i valori delle proprietà precedentemente referenziate dal costruttore 
        6. stampa dei valori delle proprietà mediante l'istanza della classe  

           



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

  getNome() {
          
       return 'fabio'
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



  getNome() {   // METODO POLIMORFICO
    
    return 'marco'

  }
}
let nomeIstituto = new IndirizziScolastici("giuseppe verdi",'marco','rossi','italia');
console.log(nomeIstituto);
let istituto = nomeIstituto.getIstituto(); ////  creo la variabile oggetto per chiamare il metodo
console.log(istituto);
let student = nomeIstituto.getNome()
 console.log(student);
 
istituto.nazione // chiamo la proprieta'
console.log(istituto);

 

class Dipendenti {
  oreLavorate = 0;
  retribuzioneOraria = 0;
  stipendio = 0;

  constructor(retribuzioneOraria, oreLavorate, stipendio) {
    this.retribuzioneOraria = retribuzioneOraria;
    this.oreLavorate = oreLavorate;
    this.stipendio = stipendio;
  }

  getStipendio() {
    return this.retribuzioneOraria * this.oreLavorate;
  }

  getRetribuzioneOraria() {
    return this.stipendio / this.oreLavorate;
  }

  getOreLavorate() {
    return this.stipendio / this.retribuzioneOraria;
  }
}

let dipendenti = new Dipendenti(10, 160, 1600);

let stipendio = dipendenti.getStipendio();
console.log(stipendio);

let retribuzioneOraria = dipendenti.getRetribuzioneOraria();
console.log(retribuzioneOraria);

let oreLavorate = dipendenti.getOreLavorate()
console.log(oreLavorate);

class Azienda extends Dipendenti {
  nome = "";

  constructor(nome, retribuzioneOraria, oreLavorate, stipendio) {
    super(retribuzioneOraria, oreLavorate, stipendio);

    this.nome = nome;
  }

  getNomeAzienda() {
    return this.nome;
  }

  getStipendio() {
    return this.retribuzioneOraria * this.oreLavorate;
  }

  getOreLavorate() {
    return this.stipendio / this.retribuzioneOraria;
  }

  getRetribuzioneOraria() {
    return this.stipendio / this.oreLavorate;
  }
}

let azienda = new Azienda("PC SRL", 10, 160, 1600);

let aziendaName = azienda.getNomeAzienda();
console.log(aziendaName);

let aziendaStipendio = azienda.getStipendio();
console.log(aziendaStipendio);

let aziendaRetribuzioneOraria = azienda.getRetribuzioneOraria();
console.log(aziendaRetribuzioneOraria);

let aziendaOreLavorate = azienda.getOreLavorate();
console.log(aziendaOreLavorate);



   ESERCIZIO BANK ACCOUNT CONTO CORRENTE FATHER AND SON  DETERMINARE IL SALDO ATTUALE DI FATHER E DI SON APPLICANDO IL CANONE ANNUO
        DEL 15% LE OPERAZIONE DA ESEGUIRE SARANNO LE SEGUENTI : SALDO INIZIALE = 0,  FIRST DEPOSIT 500€ FIRST DRAW 100€ SECOND DEPOSIT 200€ SECOND DRAW 100€
        TOTAL ACCOUNT ?

  

class FatherAccount {
  balance = 0;     // DEFINISCO LE PROPRIETA'
  firstDeposit = 500;
  firstDraw = 100;
  secondDeposit = 200;
  secondDraw = 50;

  constructor(balance, firstDeposit, firstDraw, secondDeposit, secondDraw) {   // PASSAGGIO DELLE PROPRIETA' AL COSTRUTTORE
    this.balance = balance;           // REFERENZA E INIZIALIZZA LE PROPRIETA'
    this.firstDeposit = firstDeposit;
    this.firstDraw = firstDraw;
    this.secondDeposit = secondDeposit;
    this.secondDraw = secondDraw;
  }

  getFirstDeposit() {          // CALCOLO DEL METODO GETFIRSTDEPOSIT
    return this.balance + this.firstDeposit;
  }

  getFirstDraw() {  // CALCOLO DEL METODO GETFIRSTDRAW
    return this.getFirstDeposit() - this.firstDraw;
  }

  getSecondDeposit() {    // CALCOLO DEL METODO GETSECONDDEPOSIT
    return this.getFirstDraw() + this.secondDeposit;
  }

  getTotalAccount() {   // METODO CHE CALCOLA IL TOTALACCOUNT
    return this.getSecondDeposit() - this.secondDraw;
  }
}

let fatherAccount = new FatherAccount(0, 500, 100, 200, 50); // INIZIALIZZO GLI ARGOMENTI DEL COSTRUTTORE

let father = fatherAccount.getTotalAccount();  // INVOCO IL METODO GETTOTTALACCOUNT PER VISUALIZZARE IL SALDO FINALE
console.log("SALDO TOTALE FATHER ACCOUNT" + '   ' + father + '€');


class SonAccount extends FatherAccount {
     
   canoneAnnuo = 0

  constructor(balance, firstDeposit, firstDraw, secondDeposit, secondDraw,canoneAnnuo) {
      
    super(balance,firstDeposit, firstDraw, secondDeposit, secondDraw) // DEFINISCO LE PROPRIETA' NEL SUPER
    this.canoneAnnuo = canoneAnnuo


  }
  
       // OVVERRRIDE DEI METODI POLIMORFICI
          
  
          getFirstDeposit() {          // CALCOLO DEL METODO GETFIRSTDEPOSIT
    return this.balance + this.firstDeposit;
  }

  getFirstDraw() {  // CALCOLO DEL METODO GETFIRSTDRAW
    return this.getFirstDeposit() - this.firstDraw;
  }

  getSecondDeposit() {    // CALCOLO DEL METODO GETSECONDDEPOSIT
    return this.getFirstDraw() + this.secondDeposit;


  }   

  getSecondDraw() {
      
    return this.getSecondDeposit() - this.secondDraw

  }

   getCanoneAnnuo() {    // METODO CHE CALCOLA IN EURO IL CANONE ANNUO DA PAGARE
        
    return (this.getSecondDraw()*this.canoneAnnuo)/100

    }
  
  
  getTotalAccount() {   // METODO CHE CALCOLA IL TOTALACCOUNT
    return this.getSecondDraw() - this.getCanoneAnnuo()
  }

   }




let sonAccount = new SonAccount(0, 500, 100, 200, 50, 15)
let son = sonAccount.getTotalAccount()
   console.log('SALDO TOTALE SON ACCOUNT ' +son+ '€');
   
   


class FatherAccount {

  balance = 0
  firstDeposit = 0
  firstDraw = 0
  secondDeposit = 0
  seconDraw = 0

    
  getFirstDeposit(balance = 0, firstDeposit = 500) {
    

    return balance + firstDeposit
  }

  getFirstDraw(firstDraw = 100) {

    return this.getFirstDeposit() - firstDraw
  }


  getSecondDeposit(secondDeposit = 200) {

    return this.getFirstDraw() + secondDeposit
  }


  getTotalAccount(secondDraw = 50) {
    
  return this.getSecondDeposit() - secondDraw


  }


}

let fatherAccount = new FatherAccount()
let father = fatherAccount.getTotalAccount()
  console.log(father);
  
  


class Freelancer {
  redditoAnnuoLordo = 0;
  coeffRedd = 0;
  tassaIrpef = 0;
  tassaInps = 0;

  constructor(redditoAnnuoLordo, coeffRedd, tassaIrpef, tassaInps) {
    this.redditoAnnuoLordo = redditoAnnuoLordo;
    this.coeffRedd = coeffRedd;
    this.tassaIrpef = tassaIrpef;
    this.tassaInps = tassaInps;
  }

  getUtileTasse() {
    return (this.redditoAnnuoLordo * this.coeffRedd) / 100;
  }

  getTassaIrpef() {
    return (this.getUtileTasse() * this.tassaIrpef) / 100;
  }

  getTassaInps() {
    return (this.getUtileTasse() * this.tassaInps) / 100;
  }

  getStipendioMensile() {
    return (
      (this.redditoAnnuoLordo - (this.getTassaIrpef() + this.getTassaInps())) /
      12
    );
  }
}

let freelancer = new Freelancer(40000, 67, 15, 26);

let stipendioMensile = freelancer.getStipendioMensile();
console.log("STIPENDIO MENSILE:FREELANCER" + stipendioMensile + "€");

class Artigiano extends Freelancer {

  constructor(redditoAnnuoLordo,coeffRedd,tassaIrpef,tassaInps) {
  super(redditoAnnuoLordo,coeffRedd,tassaIrpef,tassaInps)

  }



  getUtileTasse() {
    return (this.redditoAnnuoLordo * this.coeffRedd) / 100;
  }

  getTassaIrpef() {
    return (this.getUtileTasse() * this.tassaIrpef) / 100;
  }


  getStipendioMensile() {
    return ( (this.redditoAnnuoLordo - (this.getTassaIrpef() + this.tassaInps)) /
      12
    );
  }
}

let artigiano = new Artigiano(85000, 67, 15, 2500);
let stipArtigiano = artigiano.getStipendioMensile()
console.log("REDDITO MENSILE: ARTIGIANO " + stipArtigiano + "€");

class Commerciante extends Artigiano {

  constructor(redditoAnnuoLordo, coeffRedd, tassaIrpef, tassaInps) {
    
    super(redditoAnnuoLordo,coeffRedd,tassaIrpef,tassaInps)
  }
  getUtileTasse() {
    return (this.redditoAnnuoLordo * this.coeffRedd) / 100;
  }

  getTassaIrpef() {
    return (this.getUtileTasse() * this.tassaIrpef) / 100;
  }

  getStipendioMensile() {
    return (
      (this.redditoAnnuoLordo - (this.getTassaIrpef() + this.tassaInps)) /
      12
    );
  }
}

let commerciante = new Commerciante(125000, 40, 15, 2500);
let stipCommerciante = commerciante.getStipendioMensile();
console.log("REDDITO MENSILE: COMMERCIANTE " + stipCommerciante + "€");


  */



   




