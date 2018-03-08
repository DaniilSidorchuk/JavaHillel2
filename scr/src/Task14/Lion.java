package Task14;

public class Lion extends Wild {

    public Lion() {
        setPredator(true);
    }

    @Override
    public void move() {
        System.out.println("run");
    }
}
