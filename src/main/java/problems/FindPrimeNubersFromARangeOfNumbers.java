package problems;

import java.util.*;

public class FindPrimeNubersFromARangeOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Declare the variables
        int lowerBound, upperBound, flag;

        // Ask user to enter lower value of interval
        System.out.printf("Enter lower bound of the interval: ");
        lowerBound = sc.nextInt();


        System.out.printf("\nEnter upper bound of the interval: ");
        upperBound = sc.nextInt();

        for (int i = lowerBound; i <= upperBound; i++) {
            if (i == 1 || i == 0) {
                continue;

            }
            flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            if (flag == 1)
                System.out.println(i);
        }
    }

}

