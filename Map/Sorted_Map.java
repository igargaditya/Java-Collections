package Map;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sorted_Map {
    public static void main(String[] args) {
        // Sorted map is an interface

        SortedMap<String, Integer> map = new TreeMap<>((a, b) -> a.length() - b.length());

        map.put("Aditya", 98);
        map.put("Abhishek", 91);
        map.put("Pearl", 99);

        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Aditya")); // Exclude
        System.out.println(map.tailMap("Aditya")); // Exclude
        System.out.println(map.subMap("Aditya", "Pearl")); // Exclude to key

        NavigableMap<String, Integer> map2 = new TreeMap<>();

        map2.put("one", 1);
        map2.put("two", 2);
        map2.put("three", 3);
        System.out.println(map2);
        // returns the key strictly lower or equal than given key
        System.out.println(map2.floorKey("one"));

        // Returns the key strictly larger or equal than given key
        System.out.println(map2.ceilingKey("onee"));
    }
}
