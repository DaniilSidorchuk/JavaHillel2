package Task4.a;

public class SeasonsOfYear {

    public static void main(String[] args) {
        int month = 0;
        int month1 = 1;

        System.out.println("Month is " + month + " so season is " + timeOfYear(month));
        System.out.println("Month is " + month1 + " so season is " + timeOfYear(month1));

        System.out.println("Month is " + month + " so season is " + timeOfYearAnotherMethod(month));
        System.out.println("Month is " + month1 + " so season is " + timeOfYearAnotherMethod(month1));


    }

    public static String timeOfYear (int month){

        if (month<=0){
            return "Error: wrong number of the month, please, enter number from 1 to 12";
        }

        if ((month >=1 && month <=2) || month==12){
            return "Time of the year is WINTER";
        } else if (month <=5) {
            return "Time of the year is SPRING";
        } else if (month <= 8){
            return "Time of the year is SUMMER";
        } else {
            return "Time of the year is AUTUMN";
        }
    }

    public static String timeOfYearAnotherMethod (int month){
        switch (month){
            case (1): return "WINTER";
            case (2): return "WINTER";
            case (12): return "WINTER";
            case (3): return "SPRING";
            case (4): return "SPRING";
            case (5): return "SPRING";
            case (6): return "SUMMER";
            case (7): return "SUMMER";
            case (8): return "SUMMER";
            case (9): return "AUTUMN";
            case (10): return "AUTUMN";
            case (11): return "AUTUMN";
            default: return "Error: wrong number of the month, please, enter number from 1 to 12";

        }


    }

}
