package Task10.AB;

public class Worker extends Employee {

    private int workingHours;
    private String team;
    private String [] responsibilities;

    public Worker(int age, int salary) {
        super(age, salary);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Working hours: " + workingHours);
        System.out.println("Team: " + team);
        printResp();
    }

    private void printResp(){
        System.out.println("List of responsibilities:");
        for (int i = 0; i < this.responsibilities.length; i++) {
            System.out.println((i+1) + ". " + this.responsibilities[i]);
        }
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String[] getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String[] responsibilities) {
        this.responsibilities = responsibilities;
    }
}
