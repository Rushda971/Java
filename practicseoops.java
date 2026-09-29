/*Here’s a **structured practice set (Basic → Advanced)** on:

* ✅ Inheritance
* ✅ Inner Classes
* ✅ Polymorphism
* ✅ `super` keyword
* ✅ Real-life based scenarios

All examples use **Java-style OOP** since these concepts are most common in Java.

---

# 🟢 LEVEL 1 – BASIC

---

## 1️⃣ Inheritance – Basic

**Real-life scenario:** Vehicles

```java
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}
```

### ❓ Questions:

1. Can `Car` access `start()`?-yes
2. What type of inheritance is this?-single inheritance
3. What happens if `Vehicle` has a constructor?-dont know 

Because:
When a child object is created,
The parent constructor runs first automatically
Then the child constructor runs.
This happens because Java automatically adds:
super();
as the first line inside the child constructor.

👉 Parent constructor always executes first.
👉 If parent has parameterized constructor, child must call it using super(parameters).
👉 super() must be the first statement in constructor.


Yes — inheritance can work without explicitly writing constructors.


3️⃣ Main Differences – Simple Version
Feature	Constructor	No-Parameter Method
Name	Same as class	Any valid name
Return type	None	Must have return type (void if none)
Called automatically?	Yes, on object creation	No, must call explicitly
Purpose	Initialize object	Perform actions or logic
Can be before main?	Yes, executes when object created	Can be defined before main, but won’t execute until called
---





## 2️⃣ `super` Keyword – Basic

**Scenario:** Employee salary calculation

```java
class Employee {
    int salary = 30000;
}

class Developer extends Employee {
    int salary = 50000;

    void printSalary() {
        System.out.println(super.salary);
    }
}
```

### ❓ Questions:

1. What will `printSalary()` print? it will print employeee
2. Why is `super` needed?to access parent class/subclass
3. What happens if we remove `super`?then it will print developer salary

---

## 3️⃣ Polymorphism – Method Overriding

**Scenario:** Animals making sounds

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
```

### ❓ Questions:

1. What is method overriding?method of parent class is used in child class
2. If we write:

   ```java
   Animal a = new Dog();
   a.sound();
   ```

   What will be printed?dog barks`

---

# 🟡 LEVEL 2 – INTERMEDIATE

---

## 4️⃣ Real-Life Polymorphism – Payment System

```java
class Payment {
    void pay() {
        System.out.println("Generic Payment");
    }
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UpiPayment extends Payment {
    void pay() {
        System.out.println("Paid using UPI");
    }
}
```

### ❓ Questions:

1. What concept is shown here?polymorphism
2. How does runtime polymorphism work here?
Runtime polymorphism, also known as dynamic method dispatch or late binding,
3. Write a method:

   ```java
   void processPayment(Payment p)
   ```

   that demonstrates polymorphism.

---

## 5️⃣ `super()` Constructor Use

```java
class Person {
    Person(String name) {
        System.out.println("Person: " + name);
    }
}

class Student extends Person {
    Student(String name, int roll) {
        super(name);
        System.out.println("Roll: " + roll);
    }
}
```

### ❓ Questions:

1. Why must `super(name)` be first?
2. What happens if we remove it?
3. What type of constructor chaining is this?

---

## 6️⃣ Inner Class – Basic

**Scenario:** University and Department

```java
class University {
    String uniName = "ABC University";

    class Department {
        void show() {
            System.out.println(uniName);
        }
    }
}
```

### ❓ Questions:

1. What type of inner class is this?
2. Can `Department` access `uniName`?
3. How do you create object of `Department`?

---

# 🟠 LEVEL 3 – ADVANCED

---

## 7️⃣ Inner Class with Inheritance

```java
class Outer {
    void show() {
        System.out.println("Outer show");
    }

    class Inner extends Outer {
        void display() {
            System.out.println("Inner display");
        }
    }
}
```

### ❓ Questions:

1. Is this valid?
2. What methods can `Inner` access?
3. How do you create object of `Inner`?

---

## 8️⃣ Real-Life Advanced Polymorphism – Banking System

```java
class BankAccount {
    double calculateInterest() {
        return 0;
    }
}

class SavingsAccount extends BankAccount {
    double calculateInterest() {
        return 5.0;
    }
}

class CurrentAccount extends BankAccount {
    double calculateInterest() {
        return 2.0;
    }
}
```

### ❓ Questions:

1. What principle is applied here?
2. If:

   ```java
   BankAccount acc = new SavingsAccount();
   ```

   Which method runs?
3. What is dynamic method dispatch?

---

## 9️⃣ `super` Method Call in Overriding

```java
class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    void show() {
        super.show();
        System.out.println("Child show");
    }
}
```

### ❓ Questions:

1. What will be the output?
2. Why call `super.show()`?
3. Can `super` access private methods?

---

# 🔴 LEVEL 4 – REAL-LIFE DESIGN BASED QUESTIONS

---

## 🔟 Case Study – E-Commerce System

Design:

* `Product` (base class)
* `Electronics`, `Clothing` (derived classes)
* Inner class `Review`
* Use polymorphism for `calculateDiscount()`
* Use `super` to call base constructor

### ❓ Design Tasks:

1. Create base class `Product`
2. Override `calculateDiscount()` in child classes
3. Add inner class `Review`
4. Demonstrate runtime polymorphism
5. Use `super()` properly

---

# 💡 Interview-Based Conceptual Questions

1. Difference between compile-time and runtime polymorphism?
2. Why Java doesn’t support multiple inheritance with classes?
3. Difference between static inner class and non-static inner class?
4. Can we use `super` in static method?
5. What is IS-A relationship?


IS-A → inheritance → enables polymorphism

HAS-A → composition → enables code reuse

Non-static inner class → depends on outer object

Static inner class → independent utility

super → always tied to parent object
---

If you want, I can also provide:

* ✅ Solutions with explanations
* ✅ MCQs with answers
* ✅ Output-based tricky questions
* ✅ Mini project combining all concepts
* ✅ Diagram-based explanation with visuals

Tell me your level (beginner / intermediate / advanced) and I’ll customize it.
