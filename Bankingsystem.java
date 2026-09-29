class Bankingsystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(600);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
