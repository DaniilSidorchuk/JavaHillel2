package Task10.AB;

public class Employee extends Person {

    private String educationDegree;
    private String position;
    private String department;
    private int salary;
    boolean ill = false;
    boolean vacation = false;

    public Employee(int age) {
        super(age);
    }

    public Employee(int age, int salary) {
        super(age);
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Education: " + educationDegree);
        System.out.println("Position: " + position);
        System.out.println("Department" + department);
        System.out.println("Salary: " + salary);
        isPresent();
    }

    private void isPresent (){
        if (!isIll() && !isVacation()){
            System.out.println("Is present at work");
        } else {
            System.out.println("Is absent at work");
        }
    }


    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public boolean isIll() {
        return ill;
    }

    public void setIll(boolean ill) {
        this.ill = ill;
    }

    public boolean isVacation() {
        return vacation;
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
