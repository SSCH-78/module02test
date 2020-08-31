package datastructure;

import db.dbutility.DbConnection;

import java.util.Collection;
import java.util.Map;
import java.util.*;


public class MapDemo {

    /**
     * @author Jahidul Islam
     * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
     * Store map in DB
     *
     * */
    static Map<Integer,String> map=new HashMap<Integer, String>();
    static DbConnection dbconnect=new DbConnection();

    public static void main(String[] args){
        map.put(1, "john");
        map.put(12, "David");
        map.put(13, "Rose");
        map.put(14, "Star");
        retrieveUsingForLoop();
        retrieveUsingForEach();
        retrieveUsingWhileLoop();
    }

    public static void getValue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key ");
        int key=sc.nextInt();
        String value=map.get(key);
        System.out.println("Value is "+value);
    }

    public static void retrieveUsingForLoop(){
        System.out.println("*****retrieveUsingForLoop*****");

        for (Map.Entry mapEntry : map.entrySet()) {
            System.out.println("Key: "+mapEntry.getKey() + " & Value: " + mapEntry.getValue());
        }
    }

    public static void retrieveUsingWhileLoop(){
        System.out.println("*****retrieveUsingWhileLoop*****");

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println("Key: "+mapEntry.getKey() + " & Value: " + mapEntry.getValue());
        }
    }

    public static void retrieveUsingForEach(){
        System.out.println("*****retrieveUsingForEach*****");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.print("key: "+ entry.getKey());
            System.out.println(", Value: "+ entry.getValue());
        }
    }

    public static void storeDB(){
        dbconnect.insertDataFromHashmAPToPostgresql(map,"public.actors","first_name");
    }




}
