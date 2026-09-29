//Abstraction 
abstract class Animal{
    public abstract void  animalSound();
    public void sleep(){
        System.out.println("ZZZZZzzzz");
    }
}

class Monkey extends Animal{
    public void animalSound(){
        System.out.println("the monkey says:wee wee wee");
    }
}

class Main{
    public static void main(String[] args) {
        Monkey monk = new Monkey();
        monk.animalSound();
        monk.sleep();

    }
}

