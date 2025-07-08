package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(); // ArrayList
        List<Integer> list2 = new ArrayList<>(); // ArrayList
        List<Integer> list3 = Arrays.asList(4, 3, 2, 1); // Arrays$ArrayList
        Integer[] arr = { 5, 1, 2, 4 };
        List<Integer> list4 = Arrays.asList(arr); // Arrays$ArrayList
        List<Integer> list5 = new ArrayList<>(list4); // ArrayList
        List<Integer> list6 = List.of(1, 2, 4); // ImmutableCollections$ListN

        // To add
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list2.add(2);
        list5.add(6);
        // list1.remove(Integer.valueOf(1));
        list1.remove(Integer.valueOf(1));

        System.out.println(list1);
        // To get
        System.out.println(list3.get(0));

        // Print
        for (int i = 0; i < list4.size(); i++) {
            System.out.print(list4.get(i) + " ");
        }
        System.out.println();
        for (int x : list5) {
            System.out.print(x + " ");
        }
        System.out.println();

        // Check existence
        System.out.println(list6.contains(1));
        System.out.println(list6.contains(4));

        // Adding element at some index and shifts the later indexes
        list1.add(2, 30);

        // Replaces the element at index with given elemet
        list1.set(2, 40);

        System.out.println(list1);

        Collections.swap(list1, 0, 1);
        System.out.println(list1);

        Collections.sort(list4);
        System.out.println(list4);

        list5.sort(null);
        System.out.println(list5);
    }
}

/*
 * List 1 - [1,3,2]
 * List 2 - [2]
 * List 3 - [4,3,2,1]
 * List 4 - [5,1,2,4]
 * List 5 - [5,1,2,4] -> 6 added
 * List 6 - [1,2,4]
 * 
 * Addition - Cant be added to List 3 or List 4 or List 6
 * Get Method - Applicable for all but not out of bounds
 * Update - Can be used for all list except the list6
 * Remove - We cant remove from list3,list4 and list6
 * 
 * 
 * 
 * 
 * 
 */