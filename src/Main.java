class BankAccount {
    private double balance;

//  public void BankAccount(int initialBalance) { this.balance = initialBalance; }

    public void setBalance(int balance) { this.balance = balance; }

    public double getBalance() { return balance; }

    public double depositBalance(double depositAmount) {
//        double depositAmount=0;
        balance += depositAmount;
        return balance;
    }

    public double withdrawBalance(double withdrawAmout) {
//        double sum =0;

        balance -= withdrawAmout;
        return balance;
    }

    public double changeBalance() {
        double newBalance=0;

        newBalance = getBalance();
        return newBalance;
    }

//    public double totalBalance() {
//        int newBalance=0;
//
//        return newBalance;
//    }
}



public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(600);
//test  bankAccount1.setBalance(200);
        System.out.println("Initial Balance: "+bankAccount.getBalance());
//test  System.out.println("Initial Balance: "+bankAccount1.getBalance());
        System.out.println("Deposit Money: "+bankAccount.depositBalance(25));
        System.out.println("Withdraw Money: "+bankAccount.withdrawBalance(10));
//test  BankAccount bankAccount1 = new BankAccount();
        System.out.println("Balance: "+bankAccount.changeBalance());

        System.out.println("New Balance: "+bankAccount.withdrawBalance(50));
    }
}


//TODO:
// Open (create) a bank account

// Set its initial balance to 600

// Withdraw 10 from that bank account
// Deposit 25 into that bank account
// Get the account's balance
// Output that balance to the console

// fix hardcoding
// update balance
