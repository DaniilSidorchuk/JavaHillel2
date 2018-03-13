package Task16And17;

import Task16And17.Interfaces.Book;
import Task16And17.Interfaces.Digital;

public class OldDigitalBook extends Book implements Digital {

    @Override
    public void display() {
        System.out.println(getContent());
    }

    @Override
    public String getContent() {
        return this.getTitle() + " " + this.getYear();
    }
}
