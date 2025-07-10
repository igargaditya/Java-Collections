package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Idenity_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        String k1 = new String("key1");
        String k2 = new String("key1");
        System.out.println(k1.hashCode());
        System.out.println(k2.hashCode());

        map1.put(k1, 2); // Hashcode1 --> value1 --> index1
        map1.put(k2, 1); // Hashcode1 --> value1 --> index1 --> equals

        System.out.println(map1);

        Map<String, Integer> map2 = new IdentityHashMap<>();
        String kk1 = new String("key");
        String kk2 = new String("key");
        String k3 = "key";
        String k4 = "key";
        System.out.println(System.identityHashCode(kk1)); // 622488023
        System.out.println(System.identityHashCode(kk2)); // 1933863327
        System.out.println(System.identityHashCode(k3)); // 112810359
        System.out.println(System.identityHashCode(k4)); // 112810359

        map2.put(kk1, 2); // Hashcode1 --> value1 --> index1
        map2.put(kk2, 1); // Hashcode2 --> value2 --> index2
        map2.put(k3, 3); // Hashcode3 --> value3 --> index3
        map2.put(k4, 4); // Hashcode3 (same at stringbuffer)--> value3 --> index3 --> ==

        System.out.println(map2);
    }
}
