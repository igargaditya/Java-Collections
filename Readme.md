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

### 2.1.3 IdentityHashMap

- **Declaration:** `Map<K,V> map = new IdentityHashMap<>();`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Compares keys using `==` (reference equality) instead of `equals()`.
- **Extends:** Map

### 2.1.4 WeakHashMap

- **Declaration:** `Map<K,V> map = new WeakHashMap<>();`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Keys that should be garbage collected when no longer referenced elsewhere.
- **Implements:** Map

### 2.2.1 HashTable (Legacy Class)

- **Declaration:** `HashTable<K,V> map = new HashTable<>();`
- **Thread Safety:** Thread Safe
- **Use Case:** When no key or value can null but is slow as synchronized and get methods are also slow
- **Implements:** Map

### 2.3.1 SortedMap (Interface)

- **Declaration:** `SortedMap<K,V> map = new TreeMap<>();`
- **Use Case:** When we want to find the range of keys in the map
- **Extends:** Map

### 2.3.2 NavigableMap (Interface)

- **Declaration:** `NavigableMap<K,V> map = new TreeMap<>();`
- **Use Case:** Stores the key in any natural order or custom order
- **Extends:** SortedMap

### 2.3.3 TreeMap (Class)

- **Declaration:** `Map<K,V> map = new TreeMap<>();`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Stores the key in any natural order or custom order
- **Implements:** NavigableMap

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

- **Declaration:** `ConcurrentHashMap<K,V> map = new ConcurrentSkipListMap<>();`
- **Thread Safety:** Thread Safe
- **Use Case:** When Locking required and some sorted order needed, Concurrent Version of TreeMap
- **Implements:** ConcurrentMap and NavigableMap

### 2.5.1 EnumMap

- **Declaration:** `Map<K,V> map = new EnumMap<>(enum.class);`
- **Thread Safety:** Not Thread Safe
- **Use Case:** When working with Enum values as faster due to no hashing
- **Implements:** Map

## 3. Comparator vs Comparable

### 3.1 Comparator

- The Comparator interface in Java is used to define custom sorting logic for objects — outside the object’s class. It's extremely useful when you want to sort the same class in different ways (e.g., by name, age, salary).
- Has the compare() method

### 3.2 Comparable

- It's used when you want to define a natural ordering for objects within the class itself.
- Used to define the natural sort order of the class
- Has the compareTo() method

## 4. Set Implementations

### 3.1 HashSet

- Just like Hashmap it implements the set interface and is used to store the key values in non ordered manner

### 3.2 LinkedHashSet

- Just like LinkedHashMap it implements the set interface and is used to key values in the order they are inserted.

### 3.3 TreeSet

- Just like TreeMao it implements the set interface, SortedSet interface and Navigable Interface and is used to key values in sorted order

### 3.4 EnumSet

- Just like EnunMap it is advisable to use EnumSet for enums as they reduce their complexity as number of hashes is equal to number of ordinals.

### 3.5 UnmodifiableSet

- Any set can be made unmodifiable using Collections.unmodifiableSet(set) and using
- set.of(1,2,3,4) methods.

### 3.6 ConcurrentSkipListSet

- Thread Safe version when we want to store elements which are sorted in some order
- They are weakly consistent and they may or may not reflect the changes

### 3.7 CopyOnWriteArraySetEnumSet

- When we want a thread safe version of a hashset then we use CopyonWriteArraySet, This is consistent as it reflects changes after reading has been done.
- When Reading Frequent Operations then use this
