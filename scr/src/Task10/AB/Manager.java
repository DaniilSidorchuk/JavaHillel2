package Task10.AB;

public class Manager extends Employee {

    private String team;

    public Manager(int age, int salary) {
        super(age, salary);
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Team: " + team);
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
