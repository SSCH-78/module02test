package api;

import java.util.*;

public class MapAPI {
    /**
     * @author Jahiudl Islam
     * Read Map and HashMap JDK 8 API documantation to be read and Map and HashMap source code to be viewed
     * Demonastrate your understanding on Map and HashMap after reading the documentation
     * You are free to document your understanding using comment
     * Reason to comment is to keep documentation so that next developer can get highlevel understaning of your implementation
     * by reading your comments/documents
     */
    public static void main(String[] args) {
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
            System.out.println("Key: " + mapEntry.getKey() + " & Value: " + mapEntry.getValue());
        }

        System.out.println("*****retrieveUsingForEach*****");

        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            System.out.print("key: " + entry.getKey());
            System.out.println(", Value: " + entry.getValue());
        }
    }
}
