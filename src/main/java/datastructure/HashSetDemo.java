package datastructure;
import db.dbutility.*;

import java.util.*;

public class HashSetDemo {

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     *
     * */
    static DbConnection dbconnect=new DbConnection();
    public static HashSet<String> name=new HashSet<String>();

    public void storeData(){
        name.add("john");
        name.add("david");
    }

    public void printData(){
        System.out.println(name);
    }

    public void saveDataDB() {

        dbconnect.insertDataFromHashSetToPostgresql(name,"public.actors","first_name");
    }

    public static void main(String[] args){
        HashSetDemo set=new HashSetDemo();
        set.storeData();
        set.printData();
        set.saveDataDB();
    }

}
