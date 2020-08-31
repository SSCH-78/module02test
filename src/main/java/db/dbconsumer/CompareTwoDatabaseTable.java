package db.dbconsumer;

import db.dbutility.DbConnection;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompareTwoDatabaseTable {

    /**
     *
     * Create method to compare two database table.
     * As an example you can prepare two database and similar two tables with 20 records
     * Later get the records using Java and compare two
     * Later use unit testing framework to test in under test
     *
     * */
    static DbConnection dbConnect;
    static {
        dbConnect = new DbConnection();
    }

     public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        List<String> nameFromTable1=new ArrayList<>();
        List<String> nameFromTable2=new ArrayList<>();
        nameFromTable1=dbConnect.readDatabase("actor","first_name");
        nameFromTable2=dbConnect.readDatabase("actors","first_name");


        System.out.println("Printing result of table1");
        nameFromTable1.forEach(str-> System.out.println(str));
        System.out.println("Printing result of table2");
        nameFromTable2.forEach(str-> System.out.println(str));

        System.out.println("Comparing result");
        System.out.println(nameFromTable1.equals(nameFromTable2));

     }

}
