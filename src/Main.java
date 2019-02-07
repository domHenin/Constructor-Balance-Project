class BankAccount {
    private double balance;


    public BankAccount(int initialBalance) { this.balance = initialBalance; }

    public void setBalance(int balance) { this.balance = balance; }

    public double getBalance() { return balance; }

    public double addBalance() {
        double sum=50;

        sum += balance;
        return sum;
    }

    public double subBalance() {
        double sum = 45;

        sum-= balance;
        return sum;
    }
}



public class Main {
    public static void main(String[] args) {
        // Open (create) a bank account

        // Set its initial balance to 600

        // Withdraw 10 from that bank account

        // Deposit 25 into that bank account

        // Get the account's balance

        // Output that balance to the console



        BankAccount bankAccount = new BankAccount(100);
        BankAccount bankAccount1 = new BankAccount(100);
        BankAccount bankAccount2 = new BankAccount(100);
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount1.addBalance());
        System.out.println(bankAccount2.subBalance());

    }
}


//TODO:
//> make code to actually add to balance
//> make code to actually add to balance
//> retrun in main
