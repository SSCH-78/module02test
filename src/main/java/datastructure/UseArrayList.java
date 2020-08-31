package datastructure;

import db.dbutility.DbConnection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class UseArrayList {

	static DbConnection dbconnect=new DbConnection();

	static ArrayList<String> arrayList=new ArrayList<String>();
	static String element;

	public static void addElement(){
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter number of elements you want to add in arrayList");
		int size=scanner.nextInt();
		String extra=scanner.nextLine();

		for(int i=0;i<size;i++){
			System.out.println("Enter element");
			element=scanner.nextLine();
			arrayList.add(element);
		}

	}

	public static void remove(){
		System.out.println("Enter element you want to remove");
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();
		for(String str:arrayList){
			if(str.equals(word)){
				arrayList.remove(str);
			}
		}
	}

	public static void retrieveUsingWhile(){
		Iterator iter = arrayList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public static void retrieveUsingForeach(){
		Iterator<String> iter= arrayList.iterator();
		for (Iterator<String> it = iter; it.hasNext(); ) {
			Object o = it.next();
			System.out.println(o);
		}

	}

	public static void storeData(){
		dbconnect.insertDataFromArrayListToMySql(arrayList,"actors","first_name");

	}

	public static void main(String[] args) {

		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		addElement();
		retrieveUsingForeach();
		remove();
		retrieveUsingWhile();

	}

}
