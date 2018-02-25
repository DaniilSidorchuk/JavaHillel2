package Task8;

//Написать функцию, которая принимает в качестве параметров месяц и год и выводит, сколько дней в этом месяце.
//        Для ввода месяца и года используйте числовые значения
//        (например, январь - 1 месяц, март - 3 и т.д.)
//        Для названия месяцев и вывода информации используйте enum. Например,
//        “January 1981 and 31 days” или “February 2016 and 29 days”.


public class DaysOfMonth {

    public static void main(String[] args) {
    int mon = 2;
    int year = 1888;
    showDaysAtMonth(mon, year);
    }

    private static void showDaysAtMonth(int mon, int year) {

         String month = "smth";
         int days = 0;
        switch (mon){
            case 1: month = Month.JANUARY.toString();
            days = 31;
            break;
            case 2: month = Month.FEBRUARY.toString();

            if (year%4==0 && year%100!=0){
                days = 29;
            } else {days = 28;}
                break;
            case 3: month = Month.MARCH.toString();
                days = 31;
                break;
            case 4: month = Month.APRIL.toString();
                days = 30;
                break;
            case 5: month = Month.MAY.toString();
                days = 31;
                break;
            case 6: month = Month.JUNE.toString();
                days = 30;
                break;
            case 7: month = Month.JULY.toString();
                days = 31;
                break;
            case 8: month = Month.AUGUST.toString();
                days = 31;
                break;
            case 9: month = Month.SEPTEMBER.toString();
                days = 30;
                break;
            case 10: month = Month.OCTOBER.toString();
                days = 31;
                break;
            case 11: month = Month.NOVEMBER.toString();
                days = 30;
                break;
            case 12: month = Month.DECEMBER.toString();
                days = 31;
        }

        System.out.println(month + " " + year + " and " + days + " days");

    }

}
