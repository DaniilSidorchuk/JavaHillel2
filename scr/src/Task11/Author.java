package Task11;

public class Author {

    private String firstSecondName;
    private String dateOfBirth;
    private Book [] books = new Book[1];


    public Author(String firstSecondName) {
        this.firstSecondName = firstSecondName;
    }

    public void addBook (Book book){
        if (this.contains(book)){
            System.out.println("Sent book is already exsist at current author collection");
            return;
        }
        Book [] book1 = new Book[this.books.length+1];
        this.books[this.books.length-1] = book;
        for (int i = 0; i < this.books.length; i++) {
            book1[i] = this.books[i];
        }
        this.books = book1;
    }

    public void deleteBook (Book book){
        Book [] book1 = new Book[this.books.length-1];
        int index = -1;

        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)){
                index = i;
            }
        }
        int j = 0;
        for (int i = 0; i < book1.length; i++) {
            if (j == index){
                j++;
            }
            book1[i] = this.books[j];
            j++;
        }

        this.books = book1;

    }

    private boolean contains (Book book){
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)){
                return true;
            }
        }
        return false;
    }

    public String getFirstSecondName() {
        return firstSecondName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
