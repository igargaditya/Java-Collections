import java.util.WeakHashMap;

public class Weak_Hash_Map {
    public static void main(String[] args) {
        WeakHashMap<String, String> cache = new WeakHashMap<>();

        // The cache will be erased for those key who have weak reference
        // String are intially not weak reference hence we do it like this
        cache.put("motorola", new String("Fushion 50")); // Strong Reference
        cache.put(new String("Iphone"), "Phone");
        cache.put(new String("Samsung"), "Galaxyy");
        System.out.println("Before Simulating " + cache);
        System.gc();
        simulate();
        System.out.println("After Simulating the cache may be removed " + cache);

    }

    public static void simulate() {
        try {
            System.out.println("Some Program is running");
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
