package problems;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {

        fibonacciSeries(100);
    }

    private static void fibonacciSeries(int n) {

    /**
     * *
     * Write a function to find fibonacciSerie of 100
     * */

        int previousNumber = 0;
        int nextNumber = 1;
        System.out.print("Fibonacci Series of "+n+" numbers:");

        int i=1;
        while(i <= n)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }

}
