import java.util.Hashtable;

public class Hash_Table {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        hash.put(1, 21);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                hash.put(i, 1000);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                hash.put(i, 2000);
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
        System.out.println(hash.size());
    }
}
