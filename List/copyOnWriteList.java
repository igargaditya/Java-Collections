package List;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteList {
    public static void main(String[] args) {
        List<Integer> arr = new CopyOnWriteArrayList<>(Arrays.asList(1, 2, 3, 4));

        // ConcurrentModificationException
        // List<Integer> arr1 = new ArrayList<>();
        // arr1.add(1);
        // arr1.add(18);
        // for (Integer i : arr1) {
        // if (i == 18) {
        // arr1.add(21);
        // }
        // }
        for (Integer i : arr) {
            if (i == 2) {
                arr.add(7);
                System.out.println("Added 7 While Reading operation");
            }
            // This doesnt run as loop is running on the original and after the loop end
            // then only the reference of list is changed
            else if (i == 7) {
                arr.add(8);
            }
        }
        System.out.println(arr);

    }
}
