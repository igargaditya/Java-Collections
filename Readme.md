## This repository contains Everything about Java Collection Framework

![alt text](https://github.com/igargaditya/Java-Collections/blob/main/Hierarchy.png?raw=true)

## 1. List Implementations

### 1.1 ArrayList

- **Declaration:** `List<T> list = new ArrayList<>(initialCapacity,loadfactor);`
- **Initial Capacity:** 10
- **Thread Safety:** Not Thread Safe
- **Use Case:** Fast random access, better for read-heavy operations.
- **Implements:** List

### 1.2 LinkedList

- **Declaration:** `List<T> list = new LinkedList<>();`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Frequent insertions/removals from head or tail.
- **Implements:** List

### 1.3 Vector

- **Declaration:** `List<T> list = new Vector<>(capacity,increment);`
- **Initial Capacity:** 10
- **Thread Safety:** Thread Safe (synchronized)
- **Use Case:** Legacy alternative to `ArrayList` in multi-threaded scenarios.
- **Implements:** List

### 1.4 Stack

- **Declaration:** `Stack<T> stack = new Stack<>();`
- **Extends:** Vector
- **Thread Safety:** Thread Safe
- **Use Case:** LIFO structure, used for recursive-style tasks or undo mechanisms.

### 1.5 CopyOnWriteArrayList

- **Declaration:** `List<T> list = new CopyOnWriteArrayList<>();`
- **Thread Safety:** Thread Safe
- **Use Case:** Best for read-heavy operations in multi-threaded environments.
- **Implements:** List

## 2. Map Implementations (Independent Interface)

![alt text](https://github.com/igargaditya/Java-Collections/blob/main/Map_Interface.png?raw=true)

### 2.1.1 HashMap

- **Declaration:** `Map<K,V> map = new HashMap<>(initialCapacity, loadFactor);`
- **Thread Safety:** Not Thread Safe
- **Use Case:** General-purpose map using `hashCode()` and `equals()`.
- **Implements:** Map

### 2.1.2 LinkedHashMap

- **Declaration:** `Map<K,V> map = new LinkedHashMap<>(initialCapacity, loadFactor, accessOrder);`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Preserves insertion/access order. Used in LRU cache implementations.
- **Implements:** Map and extends HashMap

### 2.1.3 WeakHashMap

- **Declaration:** `Map<K,V> map = new WeakHashMap<>();`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Keys that should be garbage collected when no longer referenced elsewhere.
- **Implements:** Map

### 2.1.4 IdentityHashMap

- **Declaration:** `Map<K,V> map = new IdentityHashMap<>();`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Compares keys using `==` (reference equality) instead of `equals()`.
- **Extends:** Map

### 2.2.1 SortedMap (Interface)

- **Declaration:** `SortedMap<K,V> map = new TreeMap<>();`
- **Use Case:** When we want to find the range of keys in the map
- **Extends:** Map

### 2.2.2 NavigableMap (Interface)

- **Declaration:** `NavigableMap<K,V> map = new TreeMap<>();`
- **Use Case:** Stores the key in any natural order or custom order
- **Extends:** SortedMap

### 2.2.3 TreeMap (Class)

- **Declaration:** `Map<K,V> map = new TreeMap<>();`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Stores the key in any natural order or custom order
- **Implements:** NavigableMap

### 2.3.1 HashTable (Legacy Class)

- **Declaration:** `HashTable<K,V> map = new HashTable<>();`
- **Thread Safety:** Thread Safe
- **Use Case:** When no key or value can null but is slow as synchronized and get methods are also slow
- **Implements:** Map

### 2.4.1 ConcurrentMap (Interface)

- **Declaration:** `ConcurrentMap<K,V> map = new ConcurrentHashMap<>();`
- **Use Case:** When Locking required
- **Extends:** Map

### 2.4.2 ConcurrentHashMap

- **Declaration:** `ConcurrentHashMap<K,V> map = new ConcurrentHashMap<>();`
- **Thread Safety:** Thread Safe
- **Use Case:** When Locking required and no specific order needed, Concurrent Version of HashMap
- **Implements:** ConcurrentMap

### 2.4.3 ConcurrentSkipListMap

- **Declaration:** `ConcurrentHashMap<K,V> map = new ConcurrentHashMap<>();`
- **Thread Safety:** Thread Safe
- **Use Case:** When Locking required and some sorted order needed, Concurrent Version of TreeMap
- **Implements:** ConcurrentMap and NavigableMap
