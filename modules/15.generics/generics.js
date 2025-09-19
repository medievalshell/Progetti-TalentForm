let generic;
generic = [1, 2, 3, 4, 5, 6, 67];
console.log(generic);
function fun(args) {
    return args;
}
let result = fun("Hello World");
let result2 = fun(200);
console.log(result);
console.log(result2);
function fu(args1, args2, args3) {
    return args3;
}
let result3 = fu("hey", 3, false);
console.log(result3);
class customArray {
    constructor() {
        this.arr = [];
    }
    getItems(arr) {
        return (this.arr = arr);
    }
    addItem(item) {
        this.arr.push(item);
    }
    removeItem(item) {
        let index = this.arr.indexOf(item);
        if (index > -1)
            this.arr.splice(index, 1);
    }
}
let numObj = new customArray();
numObj.addItem(10);
let strObj = new customArray();
strObj.addItem("Person");
console.log(numObj);
console.log(strObj);
//# sourceMappingURL=generics.js.map