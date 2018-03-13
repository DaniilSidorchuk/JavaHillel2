package Task16And17;

import Task16And17.Interfaces.Book;
import Task16And17.Interfaces.Digital;
import Task16And17.Interfaces.Searchable;

public class DigitalBook extends Book implements Searchable, Digital {

    @Override
    public String getContent() {
        return this.getTitle() + " " + this.getYear();
    }

    @Override
    public void display() {
        System.out.println(getContent());
    }

    @Override
    public int found(String text) {
        return (int)Math.random()*1000+1;
    }
}
