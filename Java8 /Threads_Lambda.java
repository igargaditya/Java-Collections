public class Threads_Lambda {
    public static void main(String[] args) {
        // Runnable interface which is functional has void run() ;
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
