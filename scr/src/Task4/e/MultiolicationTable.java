package Task4.e;

public class MultiolicationTable {

    public static void main(String[] args) {

        int result = 0;
        int a = 1;
        int b = 1;

        while (result<100){
            if (b>10){
                a++;
                b=1;
            }
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);
            b++;

        }

    }

}
