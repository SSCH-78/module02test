package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class FindDuplicates {

    /**
     * Write Code To Filter Duplicate Elements From An Array?
     * */


    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 10, 20};
        int size = array.length;
        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < size; i++){
            set.add(array[i]);
        }
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}