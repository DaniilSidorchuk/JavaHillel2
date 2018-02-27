package Task11;

public class BookShelfTest {

    public static void main(String[] args) {
        BookShelf bs1 = new BookShelf();
        BookShelf bs2 = new BookShelf();

        bs2 = bs1.sameBooks();
        bs1.uniqueBookShelf(bs2);

    }

}
