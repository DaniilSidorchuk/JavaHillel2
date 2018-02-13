package Task4.h;

public class ArithmeticProgression {

    public static void main(String[] args) {
        progression(5);
    }
    
    public static void progression (int n){
        int x = 10;
        for (int i = 0; i < n;i++ ) {
            System.out.println(x);
            x+=2;
        }
        
    }    
    
}
