let data = new Date();

console.log(data.getDay()); // RITORNA IL NUMERO DEL GIORNO SETTIMANALE
console.log(data.getFullYear()); // RITORNA L'ANNO CORRENTE
console.log(data.getHours()); // RITORNA L'ORA CORRENTE
console.log(data.getMonth()); // RITORNA IL MESE CORRENTE
console.log(data.getMinutes()); // RITORNA IL MINUTO CORRENTE

data.setFullYear(2023, 11, 31); // RITORNA LA DATA ORA MINUTI E SECONDI IMPOSTATO
console.log(data);

let date = new Date("September 30, 2023 18:00:00"); // RITORNA L'ADD + 5 DELLA DATA IMPOSTATA
date.setDate(date.getDate() + 5);
console.log(date);
