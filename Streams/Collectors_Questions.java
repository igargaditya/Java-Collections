package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors_Questions {
    public static void main(String[] args) {

        // 1. Collecting by String length
        List<String> ans1 = Arrays.asList("Aditya", "Alice", "Bob", "Ashihsh", "Pearl");
        System.out.println(ans1.stream().collect(Collectors.groupingBy(x -> x.length())));

        // 2. Counting Word Occurences
        String ans2 = "Hello I Am Aditya Hello Aditya";
        System.out
                .println(Arrays.stream(ans2.split(" "))
                        .collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // 3. Partioning Even and odd numbers
        List<Integer> ans3 = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 111, 14, 21, 47, 5);
        System.out.println(ans3.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList())));

        // 4. Summing Values in a map
        Map<String, Integer> ans4 = Map.of("Aditya", 47, "Pearl", 55, "Ashish", 18);
        System.out.println(ans4.values().stream().reduce((x, y) -> x + y).get());

        // 5. Create a map from stream elements
        List<String> ans5 = List.of("Aditya", "Ashish", "Reus", "Messi", "Ronaldo", "Ribery");
        System.out.println(ans5.stream().collect(Collectors.toMap(x -> x, x -> x.length())));

        // 6. Which word how many times
        List<String> ans6 = List.of("Aditya", "Aditya", "Reus", "Reus", "Ronaldo");
        System.out.println(ans6.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));

    }
}
