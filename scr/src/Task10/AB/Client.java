package Task10.AB;

public class Client extends Person {
    private int accountId;
    private String dateOfRegistration;
    private String creditStatus;

    public Client(int age) {
        super(age);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Account ID: " + accountId);
        System.out.println("Date of client`s registration: " + dateOfRegistration);
        System.out.println("Current credit status of client: " + creditStatus);
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
    }
}
