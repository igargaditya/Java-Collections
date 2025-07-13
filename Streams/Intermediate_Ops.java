package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Intermediate_Ops {
    public static void main(String[] args) {
        // Intermediate Operations transform a stream into antother stream
        // They are lazy meaning they dont execute until a terminal operation is invoked

        // 1. Filter (Takes in Predicate)
        List<Integer> l1 = Arrays.asList(1, 2, 3, 12, 6);
        Stream<Integer> s1 = l1.stream().filter(x -> x % 2 == 0); // No filtering at this point
        System.out.println("Using Filters->" + s1.toList());

        // 2. Map (Takes in Function)
        List<String> l2 = Arrays.asList("aditya", "pearly", "ashish");
        Stream<String> s2 = l2.stream().map(String::toUpperCase);
        System.out.println("Using Map->" + s2.toList());

        // 3. Sorted()
        List<Integer> l3 = Arrays.asList(1, 121, 2, 100, 120);
        Stream<Integer> s3 = l3.stream().sorted((a, b) -> b - a);
        System.out.println("Sorted->" + s3.toList());

        // 4. Distinct
        List<String> l4 = Arrays.asList("Aditya", "Ashish", "Pearl", "Aditya");
        Stream<String> s4 = l4.stream().filter(x -> x.startsWith("A")).distinct();
        System.out.println("Distinct->" + s4.toList());

        // 5. Limit
        Stream<Integer> s5 = Stream.iterate(0, x -> x + 1).limit(10);
        System.out.println("Limit->" + s5.toList());

        // 6. Skip
        Stream<Integer> s6 = Stream.iterate(0, x -> x + 1).skip(10).limit(10);
        System.out.println("Skip->" + s6.toList());

        // 7. Peek (consume but intermediate)
        Stream<Integer> s7 = Stream.iterate(0, x -> x + 1).skip(10).peek(x -> System.out.print(x + " ")).limit(10);
        System.out.println("count->" + s7.count());

        // 8.FlatMap
        // handles stream of collection,list,arrays where each element is itself a
        // collection
        // Transform and Flatten nested lists at the same list

        List<List<Integer>> s8 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));

        System.out.println("FlatMap->" + s8.stream().flatMap(x -> x.stream()).map(x -> x + 10).toList());

    }
}
