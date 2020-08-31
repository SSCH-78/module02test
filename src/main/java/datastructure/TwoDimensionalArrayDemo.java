package datastructure;

import java.util.ArrayList;

public class TwoDimensionalArrayDemo {

    /**
     * @author Jahidul Islam
     * Construct Two Dimensional array reference variable and
     * store all the data of testData.xlsx from data directory
     * You do not have to read xlsx file only the similar data need to be
     * stored in 2D Array reference variable
     * Later get those value by index and also by using any iteration process
     *
     *  */
   static String[][] array2D;

   public static void main(String[] args){

       array2D= new String[][]{{"Alama", "Jabin"}, {"Salma", "Sultana"},{"Abdel","El"}};

       for (int i = 0; i < 2; i++) {
           for (int j = 0; j < 2; j++) {
               System.out.println("arr[" + i + "][" + j + "] = "
                       + array2D[i][j]);
           }
       }


       for (String [] a : array2D) {
           for (String i : a) {
               System.out.print(i + "\t");
           }
           System.out.println("\n");
       }

    }


}
