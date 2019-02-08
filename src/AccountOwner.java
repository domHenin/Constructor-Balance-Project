public class AccountOwner {
    private String personName;
    private double personAcctNum;

    public AccountOwner(String personName, double personAcctNum) {
        this.personName = personName;
        this.personAcctNum = personAcctNum;
    }

    public String getPersonName() { return personName; }
    public double getPersonAcctNum() { return personAcctNum; }
}
