package Task24;

public class Chicken implements Eatable {

    private String name;
    private boolean isFull = false;

    public Chicken(String name) {
        this.name = name;
    }

    public void move(){
        isFull = false;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat(String thing) {
        System.out.println("omomom");
        isFull = true;
    }

}
