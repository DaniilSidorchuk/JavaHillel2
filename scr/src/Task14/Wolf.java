package Task14;

public class Wolf extends Wild {

    public Wolf() {
        setPredator(true);
    }

    @Override
    public void move() {
        System.out.println("run");
    }
}
