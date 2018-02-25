package Task9.B;

import Task9.A.CharContainer;

public class SetChar extends CharContainer {

    private char [] arr;
    private int occ = 0;

    public boolean addUnique (char var){
        if (this.contains(var)){
            return false;
        }
        this.set(occ-1, var);
        return true;

    }

}
