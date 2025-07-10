import java.util.LinkedHashMap;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.5f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {

        LRUCache<String, Integer> lru = new LRUCache<>(3);
        lru.put("Aditya", 94);
        lru.put("Pearl", 99);
        lru.put("Ashish", 92);
        lru.put("Aditya", 99);
        lru.put("Pearl", 100);
        lru.put("Shivesh", 91);

        for (java.util.Map.Entry<String, Integer> i : lru.entrySet()) {
            System.out.println(i.getKey() + "->" + i.getValue());
        }

    }
}
