package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Creating_Streams {

    public static void main(String[] args) {
        // Creating Stream
        // 1. From Collections
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> s1 = l1.stream();
        System.out.println(s1.toList());

        // 2. From Arrays
        String[] l2 = { "Aditya", "Ashish", "Pearly" };
        Stream<String> s2 = Arrays.stream(l2);
        System.out.println(s2.toList());

        // 3. Direct Stream
        Stream<String> s3 = Stream.of("Aditya", "Shivesh", "Preet");
        System.out.println(s3.toList());

        // 4. Infinite Streams
        Stream<Integer> s4 = Stream.generate(() -> 1).limit(10);
        System.out.println(s4.toList());

        // 5. Using Iterables
        Stream<Integer> s5 = Stream.iterate(0, x -> x + 1).skip(10).limit(10);
        System.out.println(s5.toList());

    }
}
