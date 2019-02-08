public class BankAccountBuild {
    private double balance;
    public void BankAccountBuild(int initialBalance) { this.balance = initialBalance; }
    public void setBalance(int balance) { this.balance = balance; }
    public double getBalance() { return balance; }
    public double depositBalance(double depositAmount) {
// double depositAmount=0;
        if (depositAmount>-1){
            balance += depositAmount;
        }else {
            System.out.println("Your Process Could Not Be Completed");
        }
        return balance;
    }



    public double withdrawBalance(double withdrawAmout) {
// double sum =0;
        if (withdrawAmout>-1){
            balance -= withdrawAmout;
        }else {
            System.out.println("Your Process Could Not Be Completed");
        }
        return balance;
    }
    public double changeBalance() {
        double newBalance=0;
        newBalance = getBalance();
        return newBalance;
    }
// public double totalBalance() {
// int newBalance=0;
//
// return newBalance;
// }
}
