package Task16And17;

import Task16And17.Interfaces.Book;

public class PaperBook extends Book {
    @Override
    public String getContent() {
        return "IncompatibleBookFormat";
    }
}
