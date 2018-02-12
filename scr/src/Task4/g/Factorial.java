package Task4.g;

public class Factorial {

    public static void main(String[] args) {

        int number = 5;
        System.out.println("Factorial of number " + number + " is " + resultOfNumberFactorial(number));


    }

    public static int resultOfNumberFactorial (int number){
        int result = number;
        while (number>1){
          result = result * --number;
        }
        return result;

    }

}
