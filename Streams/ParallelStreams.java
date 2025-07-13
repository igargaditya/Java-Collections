package Streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {

        // They are helpful when large dataset and should be independent

        // Using Normal Stream
        List<Integer> numbers = Stream.iterate(0, x -> x + 1).limit(20000).toList();
        long starttime = System.currentTimeMillis();
        @SuppressWarnings("unused")
        List<Integer> factorials = numbers.stream().map(x -> {
            int result = 1;
            for (int i = 2; i <= x; i++) {
                result *= i;
            }
            return result;
        }).toList();

        long endtime = System.currentTimeMillis();
        System.out.println("With Sequential Stream " + (endtime - starttime) + " ms");

        // Parallel Stream
        starttime = System.currentTimeMillis();

        factorials = numbers.parallelStream().map(x -> {
            int result = 1;
            for (int i = 2; i <= x; i++) {
                result *= i;
            }
            return result;
        }).toList();

        endtime = System.currentTimeMillis();
        System.out.println("With Parallel Stream " + (endtime - starttime) + " ms");

    }
}
