let generic: Array<number>;
generic = [1, 2, 3, 4, 5, 6, 67];
console.log(generic);

function fun<T>(args: T): T {
  return args;
}
let result = fun<string>("Hello World");
let result2 = fun<number>(200);

console.log(result);
console.log(result2);

function fu<T, U, V>(args1: T, args2: U, args3: V): V {
  return args3;
}

let result3 = fu<string, number, boolean>("hey", 3, false);

console.log(result3);

class customArray<T> {
  private arr: T[] = [];

  getItems(arr: T[]) {
    return (this.arr = arr);
  }
  addItem(item: T) {
    this.arr.push(item);
  }

  removeItem(item: T) {
    let index = this.arr.indexOf(item);
    if (index > -1) this.arr.splice(index, 1);
  }
}

let numObj = new customArray<number>();
numObj.addItem(10);
let strObj = new customArray<string>();
strObj.addItem("Person");

console.log(numObj);
console.log(strObj);
