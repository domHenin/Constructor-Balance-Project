class BankAccount {
    private double balance;


    public BankAccount(int initialBalance) { this.balance = initialBalance; }

    public void setBalance(int balance) { this.balance = balance; }

    public double getBalance() { return balance; }

    public double depositBalance() {
        double sum=0;
        double depositAmount=25;

        sum = balance + depositAmount;
        return sum;
    }

    public double withdrawBalance() {
        double withdrawAmout = 10;
        double sum =0;

        sum = balance - withdrawAmout;
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



        BankAccount bankAccount = new BankAccount(600);
        System.out.println("Initial Balance: "+bankAccount.getBalance());
        System.out.println("Deposit Money: "+bankAccount.depositBalance());
        System.out.println("Withdraw Money: "+bankAccount.withdrawBalance());
    }
}


//TODO:
//> make code to actually add to balance
//> make code to actually add to balance
//> retrun in main
