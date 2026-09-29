/*Practice 2 (Medium)
Inhertiance|| encapsulation||polymorphism
Create a class called BankAccount
Requirements:
Private variable:
balance (double)

Create:
getBalance() method
deposit(double amount)
withdraw(double amount)

Conditions:
If withdraw amount is more than balance:
Print "Insufficient balance"

In main():
Deposit 1000
Withdraw 500
Withdraw 600
Print final balance

Expected Output:
Deposited: 1000
Withdrawn: 500
Insufficient balance
Final Balance: 500
*/

import java.util.Scanner;

class BankAccount {
    private double balance;

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Enter an amount greater than zero.");
            return;
        }

        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Enter an amount greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

class BankingAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();
        boolean running = true;

        System.out.println("Welcome to Jackers Bank");

        while (running) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Withdraw cash");
            System.out.println("2. Deposit cash");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Amount to withdraw: ");
                    account.withdraw(input.nextDouble());
                    break;
                case 2:
                    System.out.print("Amount to deposit: ");
                    account.deposit(input.nextDouble());
                    break;
                case 3:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Please choose 1, 2, 3, or 4.");
            }
        }

        input.close();
    }
}



