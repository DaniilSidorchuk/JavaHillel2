package Task10.AB;

public class Person {

    private String firstName;
    private String secondName;
    private String sex;
    private int age;
    private String city;

    public Person(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println("First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
