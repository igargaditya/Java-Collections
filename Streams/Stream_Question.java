package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Question {
    public static void newLine() {
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Filtering and Collecting Name Size == 6
        List<String> ls1 = new ArrayList<>(Arrays.asList("Aditya", "Ashish", "Pearl", "Shivesh"));
        System.out.println(ls1.stream().filter(x -> x.length() == 6).toList());

        // 2. Sqauring and Sorting Numbers
        List<Integer> ls2 = Arrays.asList(14, 21, 3, 4, 11, 23);
        System.out.println(ls2.stream().map(x -> x * x).sorted().toList());

        // 3. Summing the Array
        List<Integer> ls3 = Arrays.asList(14, 21, 3, 4, 11, 23);
        System.out.println(ls3.stream().reduce((x, y) -> x + y).get());

        // 4. Counting Occurence of Sentance
        String ls4 = "I am Aditya and I love Borussia Dortmund";
        IntStream a = ls4.chars();
        System.out.println(a.filter(x -> x == 'a' || x == 'A').count());

        // Stream cannot be used after a terminal operation has been called
        Stream<String> ls5 = ls1.stream();
        System.out.println(ls5.toList());
        System.out.println(ls5.map(x -> x.toLowerCase()).toList());
    }
}
