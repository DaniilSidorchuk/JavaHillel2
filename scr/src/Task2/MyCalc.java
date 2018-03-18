package Task2;

public class MyCalc {

    static double add(double val1, double val2) {

        double result = val1 + val2;
        return result;

    }

    static double sub(double val1, double val2) {

        double result = val1 - val2;
        return result;

    }

    static double mul(double val1, double val2) {

        double result = val1 * val2;
        return result;

    }

    static double div(double val1, double val2) {

        double result = val1 / val2;
        return result;

    }

    static double mod(double val1, double val2) {

        double resultOfMod = (val1 / val2);
        int k = (int)resultOfMod;
        double k1 = (double)k;
        double result = val1 - (val2 * k1);
        return result;

    }

    static double avg(double val1, double val2) {

        double result = (val1 + val2) / 2;
        return result;

    }

    static double pow(double val) {

        double result = val * val;
        return result;

    }

    static double percent(double val1, double percent) {

        double result = val1 * percent / 100;
        return result;

    }

    public static void main(String[] args) {

    }

    public static long castToLong(double val) {

        return (long)val;

    }

    public static byte checkSign(byte b) {

        if ( b >= 0){
            return 0;
        }
        return -128;

    }

    public static int checkEvenNumber(double value) {

        int op1 = (int) value;
        int op2 = 0b0001;
        int op3 = 0b0001;
        int result = op1&op2;
        result = result^op3;
        System.out.println(result);
        return result;
    }

    public static long bitWiseDivByFour(double number) {
        long result = ((long) number);
        result = result >> 2;
        return result;
    }



}
