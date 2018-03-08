package Task14;

public abstract class Wild extends Animal {

    private boolean isPredator;

    public void voice(){
        System.out.println("I am a wild animal");
        if (isPredator()){
            System.out.print(" and I am angry");
        }
    }
    public abstract void move();

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }
}
