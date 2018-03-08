package Task14;

public abstract class Pet extends Animal {

    private String name;
    private boolean isVaccinated;

    public Pet(String name) {
        this.name = name;
    }

    public abstract void voice();

    public abstract void move();

    public void toVaccinate(){
    isVaccinated = true;
    }

    public String getName() {
        return name;
    }

    public boolean isVaccinated(){
        return isVaccinated;
    }

}
