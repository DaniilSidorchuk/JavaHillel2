package Task24;

public class Main {

    public static void main(String[] args) {
        Chicken chicken = new Chicken("John");
        Fish fish = new Fish("Barry", "Goopry");

        chicken.eat("seed");
        fish.eat("smthng");

        Eatable worm = new Eatable() {
            @Override
            public void eat(String thing) {
                System.out.println("mnmnmnmn");
            }
        };
        worm.eat("fff");
    }

}
