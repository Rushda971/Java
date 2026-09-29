/*
Level 1 – Very Basic
1️⃣ Student Class

Create a Student class with:

private String name

private int age

private double marks

Requirements:

Age cannot be negative

Marks must be between 0–100

Create getters and setters with validation

2️⃣ Rectangle Class

Create a Rectangle class:

private double length

private double width

Add methods:

setLength() (cannot be negative)

setWidth() (cannot be negative)

getArea()

getPerimeter()

3️⃣ Employee Salary System

Create an Employee class:

private String name

private double salary

Rules:

Salary cannot be negative

Add method increaseSalary(double percent)

Add getter for salary

Level 2 – Real World Encapsulation
4️⃣ Bank Account (Basic Version)

Create a BankAccount class:

private String accountHolder

private double balance

Methods:

deposit(double amount) → only positive

withdraw(double amount) → only if sufficient balance

getBalance()

5️⃣ Mobile Phone Lock System

Create a MobilePhone class:

private String password

private boolean isLocked

Methods:

unlock(String inputPassword)

lock()

changePassword(String oldPass, String newPass)

🟠 Level 3 – Strong Foundation Builder
6️⃣ Product Inventory System

Create a Product class:

private String name

private double price

private int quantity

Rules:

Price cannot be negative

Quantity cannot be negative

Method sell(int amount) → reduce quantity

Method restock(int amount)

7️⃣ ATM Machine

Create an ATM class:

private int pin

private double balance

Methods:

checkBalance(int inputPin)

withdraw(int inputPin, double amount)

deposit(int inputPin, double amount)

PIN must be validated inside methods.

🔥 Important Rule for All Questions

Do NOT:

Make variables public

Access variables directly from main()

Always use methods.

Excellent 🔥 now you’re entering real OOP understanding.

I’ll explain clearly and simply:

1️⃣ Difference between constructor and method
2️⃣ Why constructor has no return type
3️⃣ Constructor overloading

1️⃣ Constructor vs Method
🔹 Constructor

Same name as class

No return type

Runs automatically when object is created

Used to initialize data

Example:

class Programmer {
    private String id;

    public Programmer(String id) {
        this.id = id;
    }
}


Runs when:

Programmer p = new Programmer("1392");

🔹 Method

Can have any name

Must have return type (or void)

Called manually

Used to perform actions

Example:

public void setId(String id) {
    this.id = id;
}


Called like:

p.setId("2000");

🔥 Simple Comparison Table
Constructor	Method
Same name as class	Any name
No return type	Must have return type
Runs automatically	Called manually
Used for initialization	Used for behavior
2️⃣ Why Constructor Has No Return Type

Look at a method:

public void test() { }


It has void.

But constructor:

public Programmer(String id) { }


No void. No int. Nothing.

Why?

Because constructor is NOT a normal method.

It is a special block that builds the object.

If you write:

public void Programmer(String id)


Now it becomes a method ❌
Not a constructor.

Then this won’t work:

new Programmer("1392");


Because Java won't find a real constructor.

3️⃣ Constructor Overloading 🔥

Overloading = Same name, different parameters.

You can have multiple constructors.

Example:

class Programmer {

    private String id;
    private String name;

    // Constructor 1
    public Programmer(String id) {
        this.id = id;
    }

    // Constructor 2
    public Programmer(String id, String name) {
        this.id = id;
        this.name = name;
    }
}


Now you can create objects in different ways:

Programmer p1 = new Programmer("1392");

Programmer p2 = new Programmer("2001", "John");


Java automatically chooses correct constructor.

🧠 Real-World Example (Banking System)
class BankAccount {

    private String name;
    private double balance;

    // Default constructor
    public BankAccount() {
        balance = 0;
    }

    // Parameterized constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
}


Usage:

BankAccount a1 = new BankAccount();
BankAccount a2 = new BankAccount("Ali", 1000);


Very flexible.

🔥 Final Important Concept

If you do NOT write any constructor,

Java automatically gives you:

public ClassName() { }


This is called the default constructor.

But the moment you create your own constructor,
Java removes the default one.

That’s very important ⚠️

🚀 Small Practice for You

Create a class:

Car
private String model;
private int year;


Make:

Default constructor

Constructor with only model

Constructor with model + year

Post it here. I’ll review it like a code reviewer 🔥

*/