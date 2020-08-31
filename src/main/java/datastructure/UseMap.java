package datastructure;

import java.util.ArrayList;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * You can use any other retrieval process
		 * Use any databases[ Postgresql] to store data and retrieve data.
		 */
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

		ArrayList<String> list = new ArrayList<String>();
		list.add("john");
		list.add("rose");
		list.add("david");

		map.put("name", list);

		System.out.println("*****retrieveUsingWhileLoop*****");

		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry mapEntry = (Map.Entry) iterator.next();
			System.out.println("Key: "+mapEntry.getKey() + " & Value: " + mapEntry.getValue());
		}

		System.out.println("*****retrieveUsingForEach*****");

		Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
		for (Map.Entry<String, ArrayList<String>> entry : entries) {
			System.out.print("key: "+ entry.getKey());
			System.out.println(", Value: "+ entry.getValue());
		}


	}

}
