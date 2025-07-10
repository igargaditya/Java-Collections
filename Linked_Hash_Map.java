import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Linked_Hash_Map {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(100, 0.3f, true);
        // Access Order true - recently used is put at last

        map.put("Pearly", 55);
        map.put("Aditya", 47);
        map.put("Ashish", 18);
        map.put("Shivesh", 29);
        map.get("Aditya"); // Aditya at last now as access order true
        map.put("Preet", 19);

        for (Entry<String, Integer> s : map.entrySet()) {
            System.out.println(s.getKey() + "->" + s.getValue());
        }

        // If key present then gives it value else if default value ;
        System.out.println(map.getOrDefault("Preet", 0));
        System.out.println(map.getOrDefault("Preety", 0));

        // If key absent then put else do not do anything
        System.out.println(map.putIfAbsent("Kshitij", 11));
    }
}
