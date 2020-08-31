package javainputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class ReadFromAFileAndWriteInAnotherFile {

    /***
     * Read form a file XXXXXX write in a file YYYYYY
     *
     * */
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("D:\\firstFile.txt");

            int i = 0;
            String s = "";

            while ((i = fin.read()) != -1) {
                s = s + String.valueOf((char) i);
            }

            FileOutputStream fout = new FileOutputStream("D:\\secondFile.txt");
            byte[] b = s.getBytes();

            fout.write(b);
            fout.close();

            System.out.println("Successfully writing in second file");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
