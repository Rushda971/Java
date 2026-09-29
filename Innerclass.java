//Inner class ek essa class hai joh outer class ko bhi access kar sakti hai per outer class ko inner class ko access karne ke liye object create
// karna padhta 

/*🟢 Basic Level
1️⃣ Basic Member Inner Class

Create a class Outer with:

private variable message = "Hello Inner"

inner class Inner with method printMessage()

Access and print the outer variable

Create main() to test it. */

class Outerclass{
    int x=20;
    class Innerclass{
        int y=20;
    }
}