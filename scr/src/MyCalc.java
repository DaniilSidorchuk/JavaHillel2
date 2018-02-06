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

//        int a = 15;
//        int b = 4;
//
//        System.out.println("Result of addition is" + " " + add(a, b));
//        System.out.println("Result of subtraction is" + " " + sub(a, b));
//        System.out.println("Result of multiplication is" + " " + mul(a, b));
//        System.out.println("Result of division is" + " " + div(a, b));
//        System.out.println("Result of mod of division is" + " " + mod(a, b));
//        System.out.println("Result of erection of" + " " + a + " " + "to the second degree is" + " " + pow(a));
//        System.out.println(b + " % " + "from  " + a + " is" + " " + percent(a, b));

//        System.out.println("Cast to long " + castToLong(10));
//        byte x1 = 10;
//        byte x2 = -5;
//        System.out.println("Check sign " + checkSign(x1));
//        System.out.println("Check sign " + checkSign(x2));
//        System.out.println("Check even number " + checkEvenNumber(10));
//        System.out.println("Check even number " + checkEvenNumber(9));
//        System.out.println("bitWiseDivByFour " + bitWiseDivByFour(100));
//        System.out.println("bitWiseDivByFour " + bitWiseDivByFour(32));
//        System.out.println("bitWiseDivByFour " + bitWiseDivByFour(8));
//        System.out.println("bitWiseDivByFour " + bitWiseDivByFour(6));
//        System.out.println("bitWiseDivByFour " + bitWiseDivByFour(4));
//        System.out.println("bitWiseDivByFour " + bitWiseDivByFour(3));
//        System.out.println("bitWiseDivByFour " + bitWiseDivByFour(2));
//        System.out.println("bitWiseDivByFour " + bitWiseDivByFour(1));
//        System.out.println("bitWiseDivByFour " + bitWiseDivByFour(-100));


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
        int result = op1&op2;
        if (result == 0){
            System.out.println(1);
            return 1;
        }
        System.out.println(0);
        return 0;

    }

    public static long bitWiseDivByFour(double number) {
        long result = ((long) number);
        result = result >> 2;
        return result;
    }



}
