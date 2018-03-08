package Task14;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Hello my name is " + this.getName());
        System.out.println("woof");
    }

    @Override
    public void move() {
        System.out.println("run");
    }
}
