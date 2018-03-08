package Task14;

public class Crocodile extends Wild {

    public Crocodile() {
        setPredator(true);
    }

    @Override
    public void move() {
        System.out.println("Swim and run");
    }
}
