package Task14;

public class Fish extends Pet {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("...");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " is swiminng");
    }


}
