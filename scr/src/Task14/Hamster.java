package Task14;

public class Hamster extends Pet {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Hello my name is " + this.getName());
        System.out.println("hphphphp");
    }

    @Override
    public void move() {

    }
}
