package javainputoutput;

import javainputoutput.ReadTestDataXLSXFile;
import utility.XLSXFileReader;

public class ReadTestDataXLSXFile {

    /**
     * @author Jahidul Islam
     * 1. Using utility.XLSXFileReader class read data/testData.xlsx file
     * 2. And print values in console
     * Hints all methods required are implemented in utility.XLSXFileReader class
     * all you need to do is use thsoe methods and store XLSX file in a
     * two dimensional array, later you can get the required value from the
     * that two dimensional array.
     * !!!! That's true I did not show you exactly this but you know all the
     * necessary components of it.
     *
     * */
    public static void main(String[] args) throws Exception {

        XLSXFileReader xlsxFileReader=new XLSXFileReader();
        String path = "D:\\myExcel.xlsx";
        xlsxFileReader.setExcelFile(path);
        String[][] mydata=xlsxFileReader.getExcelSheetData("myExcel.xlsx");

        for (int i = 0; i < mydata.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < mydata[i].length; j++) { //this equals to the column in each row.
                System.out.print(mydata[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }



    }


}
