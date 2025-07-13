package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Terminal_Ops {
    public static void main(String[] args) {

        // 1. Count - Used to return the count of the stream
        long ans1 = Arrays.asList(1, 2, 3).stream().filter(x -> x > 1).count();
        System.out.println(ans1);

        // 2. toList - used to convert the stream into List
        List<Integer> ans2 = Arrays.asList(1, 2, 3).stream().map(x -> x + 1).toList();
        System.out.println(ans2);

        // 3. Collect - Used to collect and make it collection
        List<Integer> ans3 = Arrays.asList(1, 3, 4);
        ans3.stream().sorted().skip(1).collect(Collectors.toList());
        System.out.println(ans3);

        // 4. Foreach - Running a loop
        List<Integer> ans4 = Arrays.asList(1, 3, 4);
        ans4.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();

        // 5. Reduce - Takes Binary Operater ( 2 input and 1 output) --> return optional
        // 6. Get - Take the value out from optional
        List<Integer> ans5 = Arrays.asList(1, 3, 4);
        Optional<Integer> ans6 = ans5.stream().reduce((x, y) -> x + y);
        System.out.println(ans6.get());

        // 7. AnyMatch, AllMatch, NoneMatch (predicate) --> ShortCircuit Method
        List<Integer> ans7 = Arrays.asList(1, 2, 3);
        boolean anymatch = ans7.stream().anyMatch(x -> x < 0);
        System.out.println(anymatch);
        boolean allmatch = ans7.stream().allMatch(x -> x > 0);
        System.out.println(allmatch);
        boolean nonematch = ans7.stream().noneMatch(x -> x < 0);
        System.out.println(nonematch);

        // 8. findfirst, firstany --> ShortCircuit Method
        List<Integer> ans8 = Arrays.asList(2, 31, 100, 200, 23000, 20, 3);
        Optional<Integer> findfirst = ans8.stream().findFirst();
        System.out.println(findfirst.get());
        Optional<Integer> findany = ans8.stream().findAny();
        System.out.println(findany.get());

        // 9. toArray - Stream into array
        List<Integer> ans9 = Arrays.asList(2, 31, 100, 200, 23000, 20, 3);
        Object[] ans = ans9.stream().map(x -> x + 10).toArray();
        System.out.println(Arrays.stream(ans).toList());

        // 10. Min,Max
        List<Integer> ans10 = Arrays.asList(2, 31, 100, 200, 23000, 20, 3);
        System.out.println(ans10.stream().max((a, b) -> a - b).get());
        System.out.println(ans10.stream().min((a, b) -> b - a).get()); // Desc minimum

        // 11. ForeachOrdered - For parallel stream
        List<Integer> ans11 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Not Ordered");
        ans11.parallelStream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println("Ordered Now");
        ans11.parallelStream().forEachOrdered(x -> System.out.print(x + " "));

    }
}
