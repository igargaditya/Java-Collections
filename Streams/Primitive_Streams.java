package Streams;

import java.util.Random;
import java.util.stream.IntStream;

public class Primitive_Streams {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        System.out.println(a);

        // IntStream b = Arrays.stream(a);

        // Boxed is used to convert into Stream
        System.out.println(IntStream.range(1, 5).boxed().toList());

        System.out.println(new Random().ints(5).boxed().toList());

    }
}
