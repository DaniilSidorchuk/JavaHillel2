package Task10.AB;

public class SysAdmin extends Employee {

    private String blockOfResponsibility;

    public SysAdmin(int age, int salary) {
        super(age, salary);
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Is responsible for: ");
    }

    public String getBlockOfResponsibility() {
        return blockOfResponsibility;
    }

    public void setBlockOfResponsibility(String blockOfResponsibility) {
        this.blockOfResponsibility = blockOfResponsibility;
    }
}
