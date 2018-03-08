package Task14;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Hello my name is " + this.getName());
        System.out.println("Meowe");
    }

    @Override
    public void move() {
        System.out.println("run and jump");
    }
}
