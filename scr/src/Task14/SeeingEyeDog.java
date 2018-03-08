package Task14;

public class SeeingEyeDog extends Dog {
    public SeeingEyeDog(String name) {
        super(name);
    }

    private boolean isTrained;

    public void toTraine(){
        isTrained = true;
    }

    public boolean isTrained() {
        return isTrained;
    }

    @Override
    public void voice() {
        super.voice();
        if (isTrained()){
            System.out.println("I can take you home");
        }
    }
}
