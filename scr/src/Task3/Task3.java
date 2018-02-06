package Task3;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("2000 year is " + century(2000) + " century");
        System.out.println("200 year is " + century(200) + " century");
        System.out.println("1327 year is " + century(1327) + " century");
        System.out.println("99 year is " + century(99) + " century");
        System.out.println("-99 year is " + century(-99) + " century");

    }

    public static int century (int year){

        if (year <= 0) return 0;
        if (year/100 < 1) return 1;

        double century = year/100 - year%100/100;
        int result;
        if (year%100==0){
            result = (int) century;
        } else result = (int) ++century;

        return result;

    }

}
