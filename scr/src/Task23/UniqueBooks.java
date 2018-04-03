package Task23;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class UniqueBooks {

    LinkedList list1 = new LinkedList();

    private void addBook (){
        list1.add(new Book("ttt", "ooo"));
        list1.add(new Book("ttt", "ooo"));
        list1.add(new Book("aaaa", "uuuuu"));
        list1.add(new Book("aaaa", "uuuuu"));
        list1.add(new Book("zzzzzzzzz", "wwwwwwwwww"));
        list1.add(new Book("RTY", "nhnhj"));
    }

    public void unique (){
     addBook();
        System.out.println(list1);
        HashSet set = new HashSet();
        while (!list1.isEmpty()){
            set.add(list1.pop());
        }
        System.out.println(set);
    }

    public void bookSort(){
        Collections.sort(list1);
    }

    private class Book implements Comparable<Book>{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj==null || !(obj instanceof Book)) return false;
            obj = (Book) obj;
            return (this.author.equals(((Book) obj).author) && this.title.equals(((Book) obj).title))? true : false;
        }

        @Override
        public String toString() {
            return title + " " + author + " ";
        }

        @Override
        public int hashCode() {
            char [] t = title.toCharArray();
            char [] a = author.toCharArray();
            int hash =0;

            for (int i = 0; i < t.length; i++) {
               hash+=t[i];
            }
            for (int i = 0; i < a.length; i++) {
               hash+=a[i];
            }

            return hash;
        }

        @Override
        public int compareTo(Book o) {
            int length;
            length = this.author.length() < o.author.length() ? this.author.length(): o.author.length();
            for (int i = 0; i < length; i++) {
                if(this.author.toCharArray()[i] < o.author.toCharArray()[i]){
                    return -1;
                }
                if(this.author.toCharArray()[i] > o.author.toCharArray()[i]){
                    return 1;
                }
            }
            return 0;
        }
    }

}
