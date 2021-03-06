package Task5.a;

//a. Определить является ли число палиндромом
//    (123456 - нет)(123321 - да)
//    (9239329 - да)

public class PalindromeNumber {

    public static void main(String[] args) {

    int op = 1111111111;
        System.out.println(palindromeCheck(op));
        System.out.println(alternativePalindromeCheck(op));

    }

    public static boolean palindromeCheck (int number){
    if ((number < 10 && number>=0) || (number > -10 && number<=0) ||number%(number/10)==0 ){
        return false;
    }
    if (number<0) { number *=-1; }
    int [] array = numberToArray(number);
    int lastIndex = array.length - 1;

        for (int i=0; i<array.length/2; i++) {

            if (array[i] == array[lastIndex]){
                lastIndex--;
                continue;
            } else return false;

        }

        return true;

    }

    public static int [] numberToArray (int number){
        int sizeOfArray = quantityOfNumbers(number);

        int[] array = new int [sizeOfArray];
        for (int i = array.length-1; i >=0 ; i--) {
            if (number>=10) {
                array [i] = number % (number / 10);
                if (array[i]==0){
                    array[i]=number/10;
                }
                number /= 10;


            }   else{
                array[i] = number;
                break;
            }

        }

        return array;

    }

    public static int quantityOfNumbers (int number){
        int firstDigitAtNumber = 0;
        int qttyOfNumbers = 0;
        int numberOfTens = 0;

        for (int i = 1000000000; firstDigitAtNumber==0 ; i/=10) {
            firstDigitAtNumber = number / i;
            if (firstDigitAtNumber != 0) {
                numberOfTens=i;
            }
        }

        qttyOfNumbers =(int) Math.log10(numberOfTens)+1;
        return qttyOfNumbers;
    }

    public static boolean alternativePalindromeCheck (int number){

        if ((number < 10 && number>=0) || (number > -10 && number<=0) ||number%(number/10)==0 ){
            return false;
        }
        if (number<0) { number *=-1; }

        int sizeOfNumber = quantityOfNumbers(number);
        int firstNumber = 0;
        int lastNumber = 0;
        int numberOfTens;
        if (sizeOfNumber<10){
            numberOfTens = (int) Math.pow(10,sizeOfNumber)/10;
        } else { numberOfTens = 1000000000;}

        int cloneOfNumber = number;

        for (int i = 0; i < sizeOfNumber/2; i++) {
            firstNumber = number / numberOfTens;
            if (numberOfTens >=10){
                firstNumber = firstNumber - firstNumber/10*10;
                numberOfTens/=10;
            }
            lastNumber = cloneOfNumber % (cloneOfNumber/10);
            cloneOfNumber/=10;

            if (firstNumber == lastNumber){
                continue;
            } else {
            return false;
            }


        }


    return  true;}

}
