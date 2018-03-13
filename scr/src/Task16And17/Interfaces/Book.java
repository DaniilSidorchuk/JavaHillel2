package Task16And17.Interfaces;

public abstract class Book {

   private String title;
   private int year;

    public Book() {
    }

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle(){
       return title;
   }
   public int getYear(){
       return year;
   }
   public abstract String getContent();

}
