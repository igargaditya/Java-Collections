package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Immutable_Map {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Aditya", 21);
        map1.put("Pearl", 14);

        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);

        Map<String, Integer> map3 = Map.of("Aditya", 21, "Pearl", 14);

        System.out.println(map2);
        System.out.println(map3);

    }
}
