package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyIntialization {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Aditya", "Ashish", "Abhishek");

        // Did not use terminal operator
        Stream<String> a = name.stream()
                .map(x -> {
                    System.out.println("Collecting: " + x);
                    return x.toUpperCase();
                }).sorted();

        System.out.println("Before Running Terminal Operator");

        List<String> b = a.toList();

        System.out.println("After Terminal Operator");
        System.out.println(b);
    }
}
