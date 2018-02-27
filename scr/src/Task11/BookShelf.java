package Task11;

public class BookShelf {

    Book [] book = new Book[1];

    public void addBook (Book book){
        if (this.book[1]==null){
            this.book[1] = book;
        }
        Book[] tmp = new Book[this.book.length+1];
        for (int i = 0; i < this.book.length; i++) {
            tmp[i] = this.book[i];
        }
        tmp[tmp.length-1] = book;
    }

    public void deleteBook (Book book){
        Book [] book1 = new Book[this.book.length-1];
        int index = -1;

        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i].equals(book)){
                index = i;
            }
        }
        int j = 0;
        for (int i = 0; i < book1.length; i++) {
            if (j == index){
                j++;
            }
            book1[i] = this.book[j];
            j++;
        }

        this.book = book1;
    }

    public BookShelf sameBooks (){
        BookShelf same = new BookShelf();

        for (int i = 0; i < this.book.length; i++) {
            for (int j = i; j < this.book.length; j++) {
                if (this.book[i].equals(this.book[j])){
                if (!same.contains(this.book[j])){
                    same.addBook(this.book[j]);
                    }
                }
            }
        }
        return same;
    }

    public void uniqueBookShelf (BookShelf book){
        for (int i = 0; i < book.book.length; i++) {
            if (this.contains(book.book[i])){
                this.deleteBook(book.book[i]);
            }
        }

    }

    private boolean contains (Book book){
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i].equals(book)){
                return true;
            }
        }
        return false;
    }




}
