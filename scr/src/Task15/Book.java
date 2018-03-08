package Task15;

public class Book extends Task11.Book {

    private static int qtty;

    public Book() {
        qtty++;
    }

    public static int getQtty() {
        return qtty;
    }
}
