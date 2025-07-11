package Map;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_Hashmap {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Integer> map1 = new ConcurrentHashMap<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map1.put(i, 1000);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map1.put(i, 2000);
            }
        });
        t2.start();
        t1.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        // thread safe
        System.out.println(map1.size());
    }
}
