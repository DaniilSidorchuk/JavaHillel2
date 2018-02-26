package Task9.A;

public class CharContainer {

    private char [] arr;
    private int occ = 0;

   public CharContainer(){
        arr = new char[30];
    }

   public CharContainer(int size){
        arr = new char[size];
    }

    public boolean add(char e){
        if (occ > arr.length){
            return false;
        }
        arr[occ] = e;
        occ++;
        return true;
    }

    public boolean set(int index, char c){

        if (index > arr.length || index<0){
            return false;
        }
        if (arr[index-1] == '\0'){
            occ++;
        }
        arr[index] = c;
        return true;
    }

    public int get(int index){
        if (index > arr.length || index < arr.length){
            return -1;
        }
        return arr [index-1];
    }

    public boolean contains(char c){
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == c){
                return true;
            }
        }
        return false;
    }

    public boolean addAll(CharContainer listChar){
        if ((arr.length-occ) < listChar.getFullSize()){
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            arr [i] = (char) listChar.get(i);
        }
        occ = arr.length;
        return true;

    }

    public boolean equals(CharContainer c){
    if (this.getFullSize() != c.getFullSize() || this.length()!=c.length()){
        return false;
    }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != c.get(i)){
                return false;
            }
        }
        return true;

    }

    public void clear(){
        for (int i = 0; i < this.length() ; i++) {
           this.set(i,'\0');
        }
        occ = 0;
    }

    public int indexOf(char c){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c){
                return i;
            }
        }
        return -1;
    }

    public int getFullSize(){
        return arr.length;
    }

    public int getFreeSize(){
        return arr.length - occ;
    }

    public int length(){
        return occ;
    }

    public boolean isEmpty(){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!= '\0'){
                return false;
            }

        }
            return true;
    }

    public void sort(String d){
        d.trim().toLowerCase();
        if (!d.equals("asc") || !d.equals("desc")){
            return;
        }

        if (d.equals("asc")){

            for (int i = arr.length; i > 0 ; i--) {
                for (int j = 0; j < i; j++) {
                    if( arr[j] > arr[j+1]){
                        char tmp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = tmp;
                    }
                    
                }
            }

        }

        for (int i = arr.length; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if( arr[j] < arr[j+1]){
                    char tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

        }

    }


}
