public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        AccountOwner person = new AccountOwner("Goku", 123);
        bankAccount.setBalance(600);
//test bankAccount1.setBalance(200);
        System.out.println("Initial Balance: "+bankAccount.getBalance());
//test System.out.println("Initial Balance: "+bankAccount1.getBalance());
        System.out.println("Deposit Money: "+bankAccount.depositBalance(25));
//wip        System.out.println("Successfully Deposited: $ "+);
        System.out.println("Withdraw Money: "+bankAccount.withdrawBalance(10));
//test BankAccount bankAccount1 = new BankAccount();
        System.out.println("Balance: "+bankAccount.changeBalance());
        System.out.println("Name on Account: "+person.getPersonName());
        System.out.println("Account Number: "+person.getPersonAcctNum()+ " for "+person.getPersonName());
// System.out.println("New Balance: "+bankAccount.withdrawBalance(50));
    }
}
//TODO: (check)
// Open (create) a bank account
// Set its initial balance to 600
// Withdraw 10 from that bank account
// Deposit 25 into that bank account
// Get the account's balance
// Output that balance to the console
//TODO: (check)
// fix hardcoding
// update balance
//TODO: (check)
// add logic to depositBalance
// add logic to withdrawBalance
//TODO: (in progress)
// create new class for person
// make the 'Balance' smarter