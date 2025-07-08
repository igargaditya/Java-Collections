import java.util.List;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        // Thread Safe
        List<Integer> vec = new Vector<>();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
                vec.add(i);
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
                vec.add(i);
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        System.out.println(vec.size());

    }
}
