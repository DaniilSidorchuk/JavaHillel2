package Task6.b;

public class ArraysCompare {

    public static void main(String[] args) {
        char[] arr1 = new char[] {'q','w','e','r','t','y'};
        char[] arr2 = new char[] {'q','w','e','r','t','y'};

        System.out.println(arrayCompare(arr1, arr2));
    }

    private static boolean arrayCompare(char[] arr1, char[] arr2) {
    if (arr1.length!=arr2.length){
        return false;
    }
        int j = 0;

        for (char i: arr1) {
        if (i != arr2[j]){
            return false;
        }
        j++;
        }
        return true;
    }

}
