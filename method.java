

/*class Method{
    
//static: bina object create ke huwe run ho isliye
static void myMethod(){
System.out.println("Learning method in java");
}
public static void main (String[] args){
    myMethod();
}
    
}*/






// Method with return value
// Write a method square(int n) that returns the square of a number.
/*import java.util.Scanner;

class Method {

    static void square() {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter number for square: ");
        int user = num.nextInt();

        int result = user * user;
        System.out.println("Square is: " + result);
    }

    public static void main(String[] args) {
        square();
    }
}*/

//Even or Odd
//Write a method isEven(int n) that returns true if the number is even, otherwise false.
/*import java.util.Scanner;

  class Method{
    static void myNum(){
        Scanner num=new Scanner(System.in);

        System.out.println("Enter number to check weather its Even or Odd: ");
        int user=num.nextInt();

        if (user%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }

    public static void main(String[] args){
        myNum();
    }
  } 
*/







// KEY CONCEPT YOU JUST LEARNED (important for interviews/exams)

// When input count is unknown → use loops

// Use:

// do-while → user must enter at least once

// while(true) → stop using break

// Store running result in a variable
/*Area calculation

Overload a method area() to calculate:

area of a circle

area of a rectangle*/

/*class Method {

    // Area of a circle
    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of a rectangle
    static int area(int length, int height) {
        return length * height;
    }

    public static void main(String[] args) {

        double circleArea = area(5.0);      // circle
        int rectangleArea = area(4, 5);     // rectangle

        System.out.println("Area of circle: " + circleArea);
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}*/


//user input
import java.util.Scanner;

class Method{//class does not have parameter

    //area of rectangle
    static int area(int length,int height){
        return length*height;
    }

    //area of circle
    static double area(int radius){
        return 3.14*radius*radius;
    } 

public static void main(String[] args){
    Scanner area1 = new Scanner(System.in);

    //rectangle
    System.out.println("Enter length: ");
    int len= area1.nextInt();

    System.out.println("Enter height: ");
    int height=area1.nextInt();

    Scanner area2 = new Scanner(System.in);
    System.out.println("Enter radius: ");
    int radius=area2.nextInt();


    System.out.println("Area of rectangle:"+area(len,height));
    System.out.println("Area of circle:"+area(radius));
}




}












