package Task10.AB;

public class Test {

    public static void main(String[] args) {

        Person person = new Person(10);
        Client client = new Client(10);
        Employee employee = new Employee(10,10);
        Worker worker = new Worker(10,10);
        Manager manager = new Manager(10,10);
        SysAdmin sysAdmin = new SysAdmin(10,10);

        //System.out.println(sysAdmin instanceof Client );
        System.out.println(worker instanceof Person);
        //System.out.println(worker instanceof Manager);
        System.out.println(sysAdmin instanceof Person);
        //System.out.println(manager instanceof Client);
        //System.out.println(client instanceof Employee);
        System.out.println(client instanceof Person);


    }

}
