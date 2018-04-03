package Task24;

public class Fish implements Eatable {

    private String name;
    private String breed;
    private boolean isHungry = true;

    public Fish(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void swim(){
        isHungry = true;
    }

    @Override
    public void eat(String thing) {
        System.out.println("ononon");
        isHungry = false;
    }
}
