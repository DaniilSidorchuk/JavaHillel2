package Task5.c;

//c. В числовой матрице 5x2 поменять местами два столбца,
//т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
//а его элементы второго переместить в первый.

public class ChangeColumnsInArray {

    public static void main(String[] args) {

        int [][] arr = {{2,3},{5,18},{9,2},{4,21},{39,99}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        arr = changedArr(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int [][] changedArr (int[][] arr){
        int x;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            x = arr[i][j];
            arr[i][j] = arr[i][j+1];
            arr[i][j+1] = x;

           }
          return arr;
        }

    }


