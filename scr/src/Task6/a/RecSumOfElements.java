package Task6.a;

//Написать рекурсивную функцию подсчета суммы элементов этого ряда для первых N элементов:
//        F = K*1 + K*2 +K*3 + K*4 +K*5 + … + K*N,
//        где N <= 30, а K - константа K = 3
//        При N = 1, сумма будет равна: ‘3’.
//        При N = 30, сумма должна быть равна: ‘1395’.
//        Note: Используйте для конечной суммы тип данных long.
public class RecSumOfElements {

    public static void main(String[] args) {
        int n = 3;

        if (n<=30){
            long result =  sumOfElements(n);
            System.out.println(result);
        }

    }

    private static int sumOfElements(int n) {

        if (n == 1){return 3;}
        return n*3 + sumOfElements((n-1));

    }

}
