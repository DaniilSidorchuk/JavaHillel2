package Task5.b;

//b. Двумерный массив 10х10, заполнить случайными числами от -20 до 20. Реализовать функции:
//        определения суммы всех элементов массива,
//        среднее арифметическое,
//        минимальный элемент,
//        максимальный элемент,
//        кол-во положительных элементов,
//        кол-во отрицательных элементов.


import java.util.Arrays;

public class ArrayOperations {

    public static void main(String[] args) {

        int [] arr = new int[] {10,7,4,5,7};


    int [][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array [i][j] = (int) (Math.random()*41-20);
            }
        }

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int amountOfNumbersAtArray = amountOfNumbersAtArray(array);
        System.out.println("Total amount of numbars at array is " + amountOfNumbersAtArray);

        int averageValue = averageNumber(array);
        System.out.println("Average amount " + averageValue);

        int min = minValue(array);
        System.out.println("Minimum value of array is " + min);

        int max = maxValue(array);
        System.out.println("Maximum value of array is " + max);

        int positive = qttyOfPositiveElements(array);
        System.out.println("Total amount of positive elements is " + positive);

        int negative = qttyOfNegativeElements(array);
        System.out.println("Total amount of positive elements is " + negative);

    }

    public static int amountOfNumbersAtArray (int [][] array){

        int amount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
            amount += array[i][j];
            }
        }

        return amount;
    }

    public static int averageNumber (int [][] array ){

        int qttyOfArrayElements = array.length * array[0].length;
        int average = amountOfNumbersAtArray(array) / qttyOfArrayElements;
        return average;

    }

    public static int minValue (int[][]array){

        int min = 0;
        int current=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if (j==0){current=array[i][j];}
                if (current>=array[i][j] ){
                    current = array[i][j];
                }
            }
            if(i==0){min = current;}
            if (min >= current ){
               min = current;
            }
        }
        return min;
    }

    public static int maxValue (int[][]array){
        int max = 0;
        int current=0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if (j==0){current=array[i][j];}
                if (current<=array[i][j] ){
                    current = array[i][j];
                }
            }
            if(i==0){max = current;}
            if (max <= current ){
                max = current;
            }
        }
        return max;
    }

    public static int qttyOfPositiveElements (int[][]array){

        int counter = 0;

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= 0){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int qttyOfNegativeElements (int[][]array){

        int counter = 0;

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0){
                    counter++;
                }
            }
        }
        return counter;
    }
}
