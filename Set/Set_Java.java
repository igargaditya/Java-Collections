package Set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class Set_Java {
    public static void main(String[] args) {
        // Random Order
        Set<Integer> set1 = new HashSet<>();
        set1.add(12);
        set1.add(1);
        set1.add(34);
        System.out.println(set1);

        // Order is that in which it is inserted
        Set<Integer> set2 = new LinkedHashSet<>(16, 0.75f);
        set2.add(12);
        set2.add(2);
        set2.add(34);
        System.out.println(set2);

        // Order is Sorted
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(31, 2, 3));
        set3.add(12);
        System.out.println(set3);

        // ImmutableSet
        Set<Integer> set4 = Set.of(11, 2, 34);
        System.out.println(set4);

        // Unmodifiable or immutable set
        Set<Integer> set5 = Collections.unmodifiableSet(set3);
        System.out.println(set5);

        // Concurrent HashSkipListSet
        ConcurrentSkipListSet<Integer> set6 = new ConcurrentSkipListSet<>(Arrays.asList(10, 2, 3, 11, 19));
        System.out.println(set6);

    }

}
