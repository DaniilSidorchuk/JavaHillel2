package Task9.B;

import Task9.A.CharContainer;

public class SetChar extends CharContainer {

    private char [] arr;
    private int occ = 0;

    @Override
    public boolean add(char e) {
        return addUnique(e);
    }

    @Override
    public boolean addAll(CharContainer listChar) {
        if ((arr.length-occ) < listChar.getFullSize()){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            this.addUnique((char) listChar.get(i));
        }
        occ = arr.length;
        return true;
    }

    private boolean addUnique (char var){
        if (this.contains(var)){
            return false;
        }
        this.set(occ-1, var);
        occ++;
        return true;

    }

}
