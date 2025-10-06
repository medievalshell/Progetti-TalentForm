// // arrow function
// let arrow = (name: string, age: number, job: string): any => {
//   return `${name} ${age} ${job}`;
// };
// console.log(arrow("fabio", 34, "teacher"));
// // spread operator
// let count: number[] = [10, 20, 30];
// let valueCount: number[] = [100, 500, 600];
// let spread: number[] = [...count, ...valueCount];
// console.log(spread);
// Traccia: Scrivi una funzione che ritorna il maggiore tra due numeri.
let max = (a, b) => {
    return a > b ? a : b;
};
console.log(max(50, 30));
// Traccia: Scrivi una funzione che conta quante vocali ci sono in una stringa.
let vocali = (str) => {
    let count = 0;
    for (let i = 0; i < str.length; i++) {
        if ("aeiouAEIOU".includes(str[i]))
            count++;
    }
    return count;
};
console.log(vocali("Ciao a tutti"));
for (let i in vocali) {
    console.log(vocali[i], i);
}
console.log(vocali("benvenuti a tutti"));
// Traccia: Scrivi una funzione che controlla se un valore è presente in un array.
let n = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let check = (val, n) => {
    return n.indexOf(val);
};
console.log(check(5, n));
//# sourceMappingURL=arrow-function.js.map