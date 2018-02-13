package Task4.f;

public class SumOfNumbers {

    public static void main(String[] args) {

        int number = 50123580;
        System.out.println("Sum of all numbers is " + sum(number));
        System.out.println("Sum of all numbers is " + sumAlternativeMethod(number));

    }

    public static int sum (int number){
        int i = 1000000000;
        int result = 0;
        int x;
        while (i>=1){
        x = number / i;
        if (x>10){

           x = x - x/10*10;
        }

        result +=x;
        i/=10;
        }
        return result;
    }

    public static int sumAlternativeMethod (int number){

        int x=1;
        int result = 0;


        while (number!=0){
            if (number>=10) {
                x = number % (number / 10);
                number /= 10;
                result += x;
            }else {result+=number;
            break;
            }
        }
       return result;

    }

}
