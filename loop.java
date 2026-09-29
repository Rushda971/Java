// Beginner (get comfy with loops)
class Loop{
    public static void main(String[] args){
//Print numbers
//Print numbers from 1 to 10 using a for loop.
for (int i = 0; i < 10; i++) {
    System.out.println("Print number (1 to 10):"+i);
}


// Even numbers
// Print all even numbers from 1 to 50.
for(int i=0;i<50;i++){
    if(i%2==0){
        System.out.println("Even number:"+i);
    }
}



// Sum of numbers
// Find the sum of numbers from 1 to 100.
 int sum=0;

// ✔ Always declare result variables outside the loop
// ✔Always initialize variables before use
// ✔Use <= when end value should be included
for(int i=1;i<=100;i++){
   sum+=i;
   }
System.out.println("Sum from1 to 100 number"+sum);



// Multiplication table
// Take a number (for example 5) and print its table:
System.out.println("Multiplication");
for(int i=1;i<=10;i++){
    System.out.println("5"+i+"="+(5*i));
}

//🟡 Intermediate (logic building)

// Reverse counting
// Print numbers from 10 to 1.
System.out.println("Reverse printing:");
for(int i=10;i>10;i--){
    System.out.println(i);
}



// Count digits❗❗❗❗❗
// Given a number like 12345, count how many digits it has.
System.out.println("Count number of digit:");
//approach 1
//converting string into number


//approach 2
//dividing 

//approach 3
//log




// Factorial
// Find the factorial of a number.
// Example: 5! = 5 × 4 × 3 × 2 × 1'
int fact=1;
int n=5;
for(int i=1;i<=n;i++){
    fact=fact*i;
    System.out.println(i);
}

// Palindrome number
// Check if a number like 121 is a palindrome.
// for(int i=0;){
//     System.out.println();
// }


// 🔵 Pattern questions (loops + fun)
// Star pattern
// *
// **
// ***
// ****
// *****
int numbers = 5;
for (int i = 0; i < numbers; i++) {
    for (int j = 0; j < i; j++) {
        System.out.print("*"); // print without newline
    }
    System.out.println(); // move to next line after inner loop
}

int numbers1 = 5;
for (int i = 0; i < numbers1; i++) {
    for (int j = 0; j < numbers1; j++) {
        System.out.print("*"); // print without newline
    }
    System.out.println(); // move to next line after inner loop
}



// Number pattern
// 1
// 12
// 123
// 1234



// 🔴 Challenge (only if you’re feeling brave 💪)
// Prime numbers
// Print all prime numbers between 1 and 100.



// Fibonacci series
// Print first n numbers of the Fibonacci series:
// 0 1 1 2 3 5 8 ...


}}
