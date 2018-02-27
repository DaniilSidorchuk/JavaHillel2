package Task12;

import Task9.A.CharContainer;

public class OverrideCharContainer extends CharContainer {

    @Override
    public boolean equals(Object obj) {
        if (obj == null){return false;}
        if (!(obj instanceof CharContainer)){return false;}
            CharContainer cc = (CharContainer) obj;
        if (this.equals(cc)){return true;}
            return false;
    }
}
