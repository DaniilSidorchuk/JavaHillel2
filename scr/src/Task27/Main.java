package Task27;

public class Main {

    public static void main(String[] args) {
        int [] num = new int[]{1,2,5,8,5,8,78,90};
        try {
            long number = processPositiveNumbers(num, '*');
        } catch (NonZeroArgsException e) {
            e.printStackTrace();
        }
    }

    public static long processPositiveNumbers(int[] nums, char op) throws NonZeroArgsException {
        long result = 0;
        for (int num : nums) {
            if (num<0) {
                throw new NonZeroArgsException("Arguments are less zero.");
            }
            switch (op) {
                case '+' :
                    result += num;
                    break;
                case '-' :
                    result -= num;
                    break;
                case '*':
                    result *= num;
                    break;
                default:
                    throw new InvalidOperationException("Not supported operation.");
            }
        }
        return result;
    }


}
