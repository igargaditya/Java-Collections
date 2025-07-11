package Map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipList_Map {
    public static void main(String[] args) {

        ConcurrentSkipListMap<Integer, Integer> map1 = new ConcurrentSkipListMap<>((a, b) -> b - a);

        Thread t1 = new Thread(() -> {
            for (int i = 10; i >= 0; i--) {
                map1.put(i, 10);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 10; i <= 20; i++) {
                map1.put(i, 20);
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
        // Ans in sorted order
        System.out.println(map1);

    }
}
