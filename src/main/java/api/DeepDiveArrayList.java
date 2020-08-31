package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class DeepDiveArrayList {

    /**
     * @author Jahiudl Islam
     * ArrayList JDK 8 API documantation to be read and ArrayList source code to be viewed
     * Demonastrate your understanding on ArrayList after reading the document
     * You are free to document your understanding using comment
     *
     * */
    static ArrayList<String> list = new ArrayList<>();
public static void add() {

    list.add("Hello");
}

    public static void remove(){
        System.out.println("Enter element you want to remove");
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();
        for(String str:list){
            if(str.equals(word)){
                list.remove(str);
            }
        }
    }

    public static void retrieveUsingWhile(){
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void retrieveUsingForeach(){
        Iterator<String> iter= list.iterator();
        for (Iterator<String> it = iter; it.hasNext(); ) {
            Object o = it.next();
            System.out.println(o);
        }

    }

    public static void searchValue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value ");
        int value=sc.nextInt();
        if (list.contains(value)) {
            System.out.println("value found in table");
        }else{
            System.out.println("value not found in table");
        }
    }

    public static void addingElementofOneArrayToOther(){
     ArrayList<String> arrlist = new ArrayList<>();
      arrlist.addAll(list);
    }

    public static void getIndex(){
        int index = list.indexOf("john");
        System.out.println("The element E is at index " + index);
    }

    public static void sort(){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);

        for (String i : cars)
        {
            System.out.println(i);
        }
    }
}







