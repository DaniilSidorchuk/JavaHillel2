package Task13;

import Task9.A.CharContainer;

public class ScalableContainer extends CharContainer {

    @Override
    public boolean add(char e) {
        if (this.getOcc()>=this.getArr().length){
            scaleContainer();
        }
        return super.add(e);
    }

    @Override
    public boolean addAll(CharContainer listChar) {
        if (this.getFreeSize()<=listChar.getArr().length){
            scaleContainer();
        }
        return super.addAll(listChar);
    }

    private void scaleContainer(){

    char[] chars = new char[this.getArr().length*2];
    System.arraycopy(this.getArr(),0,chars,0,this.getArr().length);
    this.setArr(chars);
    this.setOcc(chars.length);

    }



}
