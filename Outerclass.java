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
    private String message="Hello Inner";
     class Innerclass{
        void printMessage(){
           System.out.println(message);
        }
     }
 }

class Main{
    public static void main(String[] args){
        Outerclass outermsg =new Outerclass();
        Outerclass.Innerclass inner=outermsg.new Innerclass();
       
        //objectname.methodname
        inner.printMessage();

    }
}
/*🟢 LEVEL 1: BASIC
✅ Q1: Member Inner Class
Create a class Car:
Variable: brand
Constructor to initialize brand
Inner class Engine
Method start() prints: "Engine of <brand> is starting"

🔹 Task:
Create objects in main() and call start().*/

class Car{
    String brand="BMW";
    class Engine{
        void start(){
            System.out.println("Engine of BMW is starting");
        }
    }
}
class Main{
    public static void main(String[] args){
        Car vehicle=new Car();
        Car.Engine machine= Car.new Engine();
        machine.start();

    }
}







