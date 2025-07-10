package Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>(100, 0.2f);
        // No order of Hashmap
        map.put(2, "Ashish");
        map.put(1, "Aditya");
        map.put(3, "Xyz");

        map.putIfAbsent(2, "Shive"); // Noting put
        // If key not present return default value
        System.out.println(map.getOrDefault(0, "Nothing"));

        System.out.println(map.containsValue("Shivesh"));
        System.out.println(map.containsKey(2));
        System.out.println(map.get(4));
        System.out.println(map);

        // Iterating HashMap
        Set<Integer> keys = map.keySet();
        for (Integer i : keys) {
            System.out.println(map.get(i));
        }

        for (int i : map.keySet()) {
            System.out.println(i + "->" + map.get(i));
        }
        map.remove(3);
        map.remove(1, "garg");

        for (Entry<Integer, String> i : map.entrySet()) {
            System.out.println(i.getKey() + " -> " + i.getValue());
        }

    }
}
