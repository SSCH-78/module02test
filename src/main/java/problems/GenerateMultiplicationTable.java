package problems;


import java.util.Scanner;

public class GenerateMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;

        System.out.println("Enter number you want table of: ");
        num= sc.nextInt();

        for(int i=0; i<10; i++)
        {
            System.out.println(num +"x " +i +"=" + (num*i));
        }

    }
}
