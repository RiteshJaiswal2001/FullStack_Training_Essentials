// Variables
let name: string = "Alice";
let age: number = 25;
let isStudent: boolean = true;

console.log(name);
console.log(age);
console.log(isStudent);

// Function
// function greet(person: string): string {
//     return `Hello, ${person}!`;
// }

// console.log(greet(name));

// // Array
// let numbers: number[] = [10, 20, 30];
// console.log(numbers);

// // Object
// type User = {
//     id: number;
//     username: string;
// };

// const user: User = {
//     id: 1,
//     username: "alice123",
// };

// console.log(user);

// // Optional parameter
// function add(a: number, b?: number): number {
//     return a + (b ?? 0);
// }

// console.log(add(5));
// console.log(add(5, 10));

// // Union type
// let value: string | number;

// value = "TypeScript";
// console.log(value);

// value = 100;
// console.log(value);

// // Interface
// interface Car {
//     brand: string;
//     year: number;
// }

// const car: Car = {
//     brand: "Toyota",
//     year: 2024,
// };

// console.log(car);

// for (let index = 0; index < 3; index++) {
//     console.log(index);

//     setTimeout(() => {
//         console.log(index);

//     }, 100);;

// }

// var i = 5
// var i =6;
// console.log(i);

// class Department {
//   static fiscalYear = 2025;
//   constructor(
//     public id: string,
//     private name: string,
//     readonly created: Date,
//   ) {}
//   // Getter — accessed as property
//   get fullName() {
//     return this.name;
//   }
//   // Abstract — subclasses must implement
//   abstract describe(): void;
// }
// // Inheritance
// class ITDepartment extends Department {
//   constructor(id: string) {
//     super(id, "IT", new Date());
//   }
//   describe() {
//     console.log("IT Dept #" + this.id);
//   }
// }



