package Task22;

import java.util.ArrayList;
import java.util.HashSet;

public class Catalog {

    private HashSet catalog = new HashSet();

    public boolean addBook (Book book){
        if (catalog.contains(book)){
            return false;
        }
        catalog.add(book);
        return true;
    }

    private boolean removeBook(Book book){
        if (catalog.contains(book)){
            catalog.remove(book);
            return true;
        }
        return false;
    }

    public Book takeBook (Book book, Book.Notes notes){
        if (!catalog.contains(book)){
            return null;
        }
        book.bookIsTaken(notes);
        removeBook(book);
        return book;
    }

    private class Book {

        private String name;
        private String auhor;
        private ArrayList readers = new ArrayList();

        public void bookIsTaken (Notes notes){
            readers.add(notes);
        }

        public Book(String name, String auhor) {
            this.name = name;
            this.auhor = auhor;
        }

        public String getName() {
            return name;
        }

        public String getAuhor() {
            return auhor;
        }

        public ArrayList getReaders() {
            return readers;
        }

        private class Notes{
            String reader;
            String date;
        }
    }

}
