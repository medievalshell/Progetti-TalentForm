
class Dipendenti {
  stipendio = 0;
  oreLavorate = 0;

  constructor(stipendio, oreLavorate) {
    this.oreLavorate = oreLavorate;
    this.stipendio = stipendio;
  }

  getRetribuzioneOraria() {
    return this.stipendio / this.oreLavorate;
  }
}

let dipendenti = new Dipendenti(1600, 160);
let retribuzioneOraria = dipendenti.getRetribuzioneOraria();
console.log("Retribuzione oraria :  " + retribuzioneOraria);
