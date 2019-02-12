//import java.util.Scanner;
import java.util.ArrayList;

public class AccountOwner {
//  Scanner input = new Scanner(System.in);
    private String personName;
    private double personAcctNum;

//    public AccountOwner(String personName, double personAcctNum) {
//        this.personName = personName;
//        this.personAcctNum = personAcctNum;
//    }


    public void setPersonName(String personName) { this.personName = personName; }
    public void setPersonAcctNum(double personAcctNum) { this.personAcctNum = personAcctNum; }

    public String getPersonName() { return personName; }
    public double getPersonAcctNum() { return personAcctNum; }

    public void changePersonName(String newPersonName) {
//        String newPersonName;

//        System.out.println("Enter Name on Account: ");
//        newPersonName = input.next();
        personName = newPersonName;
    }

    public void changePersonAccountNumber(int newAccountNumber) {
//        int newAccountNumber;

        System.out.println("Enter Account Number for "+getPersonName()+": ");
//        newAccountNumber = input.nextInt();
        personAcctNum = newAccountNumber;
    }
}
