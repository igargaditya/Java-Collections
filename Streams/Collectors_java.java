package Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_java {
        public static void main(String[] args) {
                // Collectors is a ultility class
                // Provides set to methods to create common collectors

                // 1. Collecting to a list
                List<String> l1 = Arrays.asList("Alice", "Bob", "Duran", "Duran");
                System.out.println(l1.stream().collect(Collectors.toList()));

                // 2. Collecting to a Set
                List<Integer> l2 = Arrays.asList(1, 2, 3, 21, 12, 1, 1, 1, 1);
                System.out.println(l2.stream().collect(Collectors.toSet()));

                // 3. Collecting to a specific Collection
                LinkedList<Integer> l3 = l2.stream().collect(Collectors.toCollection(() -> new LinkedList<>()));
                System.out.println(l3);

                // 4. Joining Streams - Joings the whole of list
                List<String> l4 = Arrays.asList("Alice", "Bob", "Duran", "Duran");
                System.out.println(l4.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(",")));

                // 5. Summarizing Data - generates statistical Summary
                List<Integer> l5 = Arrays.asList(1, 2, 3, 21, 12, 1, 1, 1, 1);
                Double a = l5.stream().collect(Collectors.averagingInt(x -> x));
                System.out.println(a);

                // 6. Grouping Elements
                List<String> l6 = Arrays.asList("Alice", "Bob", "Duran", "Duran", "Aditya", "Ashish", "Sos");
                System.out.println(l6.stream().collect(Collectors.groupingBy(x -> x.length(),
                                Collectors.joining(","))));
                System.out.println(l6.stream().collect(Collectors.groupingBy(x -> x.length(),
                                Collectors.counting())));
                HashMap<Integer, Long> ans10 = l6.stream().collect(
                                Collectors.groupingBy(x -> x.length(), HashMap::new, Collectors.counting()));
                System.out.println(ans10);

                // 7. Partioning Elements
                List<String> l7 = Arrays.asList("Alice", "Bob", "Duran", "Duran", "Aditya", "Ashish", "Sos");
                System.out.println(l7.stream().collect(Collectors.partitioningBy(x -> x.length() > 4)));

                // 8. Mapping and collecting
                List<String> l8 = Arrays.asList("Alice", "Bob", "Duran", "Duran", "Aditya", "Ashish", "Sos");
                System.out.println(l8.stream().collect(Collectors.mapping(x -> x.toLowerCase(),
                                Collectors.toList())));

        }
}
