package datastructure;

import java.util.Hashtable;
import java.util.*;

public class HashTable {

    /**
     * SHow your understanding on HashTable
     * Use some methods from HashTable Class
     * */
    static Hashtable<Integer, String> hashtable = new Hashtable<>();

    public static void main(String[] args){
        addValues();
        print();
        searchKey();
        searchValue();
        getValueofKey();
    }

    public static void addValues(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of your hashtable ");
        int size=sc.nextInt();
        String value;
        Scanner scanner=new Scanner(System.in);

        for(int i=1;i<=size;i++)
        {
            System.out.println("Enter value for key"+i);
            value=scanner.nextLine();
            hashtable.put(i,value);
        }
    }

    public static void copyHashTable(){
        Hashtable<Integer, String> copy = new Hashtable<>();
        copy = (Hashtable<Integer, String>)hashtable.clone();
    }

    public static void clear(){
        hashtable.clear();
    }

    public static void getValueofKey(){
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key ");
        key=sc.nextInt();
        System.out.println(hashtable.getOrDefault(key, "Not Found"));
    }

    public static void print(){
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<= hashtable.size();i++)
        {
            System.out.println(hashtable);
        }
    }

    public static void searchKey(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter key ");
        int key=sc.nextInt();
        if (hashtable.containsKey(key)) {
            System.out.println("key found in table");
        }else{
            System.out.println("key not found in table");
        }
    }

    public static void searchValue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value ");
        int value=sc.nextInt();
        if (hashtable.containsValue(value)) {
            System.out.println("value found in table");
        }else{
            System.out.println("value not found in table");
        }
    }




}
