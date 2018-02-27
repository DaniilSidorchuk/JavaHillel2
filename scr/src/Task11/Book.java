package Task11;

public class Book {

    private String name;
    private int pages;
    private String author;

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }

        if (!(obj instanceof Book)){
            return false;
        }
        Book book = (Book) obj;
        if (this.name.equals(book.name) && this.pages == book.pages && this.author.equals(book.author)){
            return true;
        }
        return false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
