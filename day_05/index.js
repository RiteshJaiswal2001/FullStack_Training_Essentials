// console.log("Hello my name is mickey.");

// let a = 5
// let b = 6.7

// console.log(a+b);

// let c;

// console.log(a+b,c,a-b,a*b);

// function sum(a=10,b) {
//     console.log(a+b);
    
//     return a+b
// }

// sum(null,7);


/* Variables (var, let, const)
var (can be redeclared and updated)
var name = "John";
name = "David";
console.log(name);
*/

/* let (can be updated but not redeclared)
let age = 25;
age = 26;
console.log(age);
*/

/* const (cannot be updated)
const country = "India";
console.log(country);
*/


/* for Loop
for (let i = 1; i <= 5; i++) {
    console.log(i);
}

*/

/* while Loop
let i = 1;

while (i <= 5) {
    console.log(i);
    i++;
}
*/

/* for...of Loop (Best for Arrays)
const fruits = ["Apple", "Banana", "Mango"];

for (const fruit of fruits) {
    console.log(fruit);
}

*/

/*for...in Loop (Objects)
const student = {
    name: "Rahul",
    age: 22,
    city: "Delhi"
};

for (const key in student) {
    console.log(key, ":", student[key]);
}
*/


/* map() creates a new array by transforming each element.

const numbers = [1, 2, 3, 4, 5];

const squares = numbers.map(num => num * num);

console.log(squares);

*/

/*filter() returns elements that satisfy a condition.
const numbers = [10, 15, 20, 25, 30];

const evenNumbers = numbers.filter(num => num % 2 === 0);

console.log(evenNumbers);

*/

/* reduce() reduces an array to a single value.
const numbers = [10, 20, 30, 40];

const sum = numbers.reduce((total, num) => total + num, 0);

console.log(sum);

*/

/*Combine map(), filter(), and reduce()
const numbers = [1, 2, 3, 4, 5, 6];

// Step 1: Keep even numbers
const even = numbers.filter(num => num % 2 === 0);

// Step 2: Square each even number
const squares = even.map(num => num * num);

// Step 3: Find the sum
const total = squares.reduce((sum, num) => sum + num, 0);

console.log(even);
console.log(squares);
console.log(total);

*/


//Real-world Example (Employee Data)
const employees = [
    { name: "Alice", salary: 30000 },
    { name: "Bob", salary: 45000 },
    { name: "Charlie", salary: 50000 },
    { name: "David", salary: 25000 }
];

// Employees with salary greater than 30000
const highSalary = employees.filter(emp => emp.salary > 30000);

// Employee names
const names = employees.map(emp => emp.name);

// Total salary
const totalSalary = employees.reduce(
    (sum, emp) => sum + emp.salary,
    0
);

console.log(highSalary);
console.log(names);
console.log(totalSalary);




// console.log("true"-2+3+4);
