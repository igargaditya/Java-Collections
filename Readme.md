# This repository contains Everything about Java Collection Framework

![alt text](https://github.com/igargaditya/Java-Collections/blob/main/Hierarchy.png?raw=true)

## 1. List Implementations

### 1.1 ArrayList

- **Declaration:** `List<T> list = new ArrayList<>(initialCapacity,loadfactor);`
- **Initial Capacity:** 10
- **Thread Safety:** Not Thread Safe
- **Use Case:** Fast random access, better for read-heavy operations.

### 1.2 LinkedList

- **Declaration:** `List<T> list = new LinkedList<>();`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Frequent insertions/removals from head or tail.

### 1.3 Vector

- **Declaration:** `List<T> list = new Vector<>(capacity,increment);`
- **Initial Capacity:** 10
- **Thread Safety:** Thread Safe (synchronized)
- **Use Case:** Legacy alternative to `ArrayList` in multi-threaded scenarios.

### 1.4 Stack

- **Declaration:** `Stack<T> stack = new Stack<>();`
- **Extends:** Vector
- **Thread Safety:** Thread Safe
- **Use Case:** LIFO structure, used for recursive-style tasks or undo mechanisms.

### 1.5 CopyOnWriteArrayList

- **Declaration:** `List<T> list = new CopyOnWriteArrayList<>();`
- **Thread Safety:** Thread Safe
- **Use Case:** Best for read-heavy operations in multi-threaded environments.

## 2. Map Implementations (Not part of Collection Framework and is an independent Interface)

### 2.1 HashMap

- **Declaration:** `Map<K,V> map = new HashMap<>(initialCapacity, loadFactor);`
- **Thread Safety:** Not Thread Safe
- **Use Case:** General-purpose map using `hashCode()` and `equals()`.

### 2.2 LinkedHashMap

- **Declaration:** `Map<K,V> map = new LinkedHashMap<>(initialCapacity, loadFactor, accessOrder);`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Preserves insertion/access order. Used in LRU cache implementations.

### 2.3 WeakHashMap

- **Declaration:** `Map<K,V> map = new WeakHashMap<>();`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Keys that should be garbage collected when no longer referenced elsewhere.

### 2.4 IdentityHashMap

- **Declaration:** `Map<K,V> map = new IdentityHashMap<>();`
- **Thread Safety:** Not Thread Safe
- **Use Case:** Compares keys using `==` (reference equality) instead of `equals()`.
