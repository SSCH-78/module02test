package problems;

public class FindFactorials {
    /**
     * factorials of n n! = 1 * 2 * 3 * ......* n
     * */

    public static void main(String[] args) {
        int num = 5;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of "+num+" "+factorial);
    }
}
