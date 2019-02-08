public class AccountOwnerBuild {
    private String personName;
    private double personAcctNum;

    public AccountOwnerBuild(String personName, double personAcctNum) {
        this.personName = personName;
        this.personAcctNum = personAcctNum;
    }

    public String getPersonName() { return personName; }
    public double getPersonAcctNum() { return personAcctNum; }
}
