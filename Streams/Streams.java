package Streams;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        // Feature introduced in java8 with whose help we process collections in a
        // function and declartive manner

        // How to use Streams
        // Source--> Operation --> Terminal Operation

        // Stateless and Stateful
        // Stateless - The operations which do not need to know about other operations
        // (map)
        // Stateful - The operations which need to know about other operations (reduce)

        // 1. Count of even numbers
        List<Integer> s1 = Arrays.asList(1, 2, 3, 4);
        System.out.println("Even Numbers in s1 " + s1.stream().filter(x -> x % 2 == 0).count());

    }
}
