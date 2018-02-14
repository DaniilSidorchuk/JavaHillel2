package Task5.d;

//d. Найти столбец матрицы с максимальной суммой элементов:
//Задана матрица неотрицательных чисел 3x5. Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму.

public class MaxColumnValue {

    public static void main(String[] args) {

        int [][] arr = {{2,3,5,18,9},{2,4,21,39,99},{10,87,2,9,32}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int maxColumn = columWithMaxValue(arr);
        System.out.println("Column with index " + maxColumn + " has the biggest amount of values");

    }

    public static int columWithMaxValue (int [][] arr){

        int column = 0;
        int current = 0;
        int max = 0;
        int i = arr.length;

        for (int j = 0; j < arr[i-1].length; j++) {
            for (int k = 0; k < i; k++) {
                current+=arr[k][j];
            }
            if (j==0){
                max = current;
                column = 0;
            }

            if (max<current){
                max = current;
                column = j;
            }
            current = 0;

        }
    return column;

    }

}
