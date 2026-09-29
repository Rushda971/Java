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
    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    class Engine{
        void start(){
            System.out.println("Engine of " + brand + " is starting");
        }
    }
}
class CarDemo{
    public static void main(String[] args){
        Car vehicle=new Car("BMW");
        Car.Engine machine= vehicle.new Engine();
        machine.start();

    }
}
