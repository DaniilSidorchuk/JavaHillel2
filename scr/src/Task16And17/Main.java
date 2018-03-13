package Task16And17;

import Task16And17.Interfaces.Book;
import Task16And17.Interfaces.Digital;
import Task16And17.Interfaces.Searchable;

public class Main {

    public static void main(String[] args) {
        DigitalBook digitalBook1 = new DigitalBook();
        DigitalBook digitalBook2 = new DigitalBook();
        OldDigitalBook oldDigitalBook1 = new OldDigitalBook();
        OldDigitalBook oldDigitalBook2 = new OldDigitalBook();
        PaperBook paperBook1 = new PaperBook();
        PaperBook paperBook2 = new PaperBook();

        Book [] books = new Book[]{digitalBook1, digitalBook2, oldDigitalBook1, oldDigitalBook2, paperBook1, paperBook2};

        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof Digital && books[i] instanceof Searchable){
                Digital digital = (Digital) books[i];
                digital.display();
                Searchable searchable = (Searchable) books[i];
                System.out.println(searchable.found("t"));
            }

            if (books[i] instanceof Digital){
                Digital digital = (Digital) books[i];
                digital.display();
            } else {
                System.out.println(books[i].getContent());
            }

        }

    }

}
