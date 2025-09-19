
function funct<T, U, V>(args1: T, args2: U, args3: V): V {
  return args3;
}

let res3 = funct<string, number, boolean>("hey", 3, false);

console.log(res3);