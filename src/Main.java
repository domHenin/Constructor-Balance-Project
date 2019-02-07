class BankAccount {
    double addNumber;
    double subNumber;
    private double balance;
    private double addBalance;
    private double subBalance;
    double addAnswer;
    double subAnswer;

    public BankAccount(double initialBalance) { this.balance = initialBalance; }


    public BankAccount(double initialBalance, double answer) {
        this.balance = initialBalance;
        this.addAnswer = answer;
    }

    public void setBalance(double balance) { this.balance = balance; }

    public double getBalance() { return balance; }

    public void setAnswer(double answer) { this.addAnswer = answer; }

    public double getAnswer() {
        double sum;

        sum = addAnswer + balance;
        return sum;
    }

    public double addBalance() {
        addAnswer = addNumber + balance;
        return addAnswer;
    }

    public double subBalance() {
        subAnswer = subNumber + balance;
        return subAnswer;
    }
}



public class Main {
    public static void main(String[] args) {
        double balanceAdd;
        double balanceSub;
        double answer;
//        System.out.println("Hello World!");
        BankAccount bankAccount = new BankAccount(100);
        BankAccount bankAccount1 = new BankAccount(100, 50);


        System.out.println("This is the First Constructor: "+bankAccount.getBalance());
        System.out.println("This is Second Constructor that addes: "+bankAccount1.getAnswer());







    }
}


//TODO:
//> make code to actually add to balance
//> make code to actually add to balance
//> retrun in main
