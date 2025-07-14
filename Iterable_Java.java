import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterable_Java {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 3, 1));
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();

        // What happens inside the forEach loop
        // 1. it.hasNext() returns boolean value if next element present
        // 2. it.next() return the next element in iteration
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // 3. it.remove -> iterator provides a method to remove the element from list
        // while iterating without giving any concurrentmodification exception
        // Element is removed while iterating only

        // 4. ListIterator provides a lot more feature along with the iterator one
        ListIterator<Integer> it1 = list.listIterator();
        while (it1.hasNext()) {
            Integer element = it1.next();
            if (element == 1) {
                it1.remove();
            } else if (element == 3) {
                it1.set(21);
            }
        }
        System.out.println();

        System.out.println(list);
    }

}
