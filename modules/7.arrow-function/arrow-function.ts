// arrow function

let arrow = (name: string, age: number, job: string): any => {
  return `${name} ${age} ${job}`;
};
console.log(arrow("fabio", 34, "teacher"));

// spread operator

let count: number[] = [10, 20, 30];
let valueCount: number[] = [100, 500, 600];
let spread: number[] = [...count, ...valueCount];
console.log(spread);
