function technology(java: string, version: number,): any {
  return java + " " + version;
}

console.log(technology("Java", 8,));

// FUNCTION OVERLOAD

function add(a: string, b: string): string;

function add(a: number, b: number): number;

function add(a: any, b: any): any {
  return a + b;
}

console.log(add("Hello ", "Steve"));
console.log(add(10, 20));
console.log(add(10, 50));
