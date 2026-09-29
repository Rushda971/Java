import java.util.Scanner;

class Cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.print("Enter first number: ");
        double first = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Result: " + (first + second));
                break;
            case '-':
                System.out.println("Result: " + (first - second));
                break;
            case '*':
                System.out.println("Result: " + (first * second));
                break;
            case '/':
                if (second == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (first / second));
                }
                break;
            default:
                System.out.println("Please enter a valid operator.");
        }

        input.close();
    }
}
 
