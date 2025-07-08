package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
    private int marks;
    private String name;

    public Student(int marks, String name) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " " + marks;
    }

}

class StringLengthCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }

}

class IntDesc implements Comparator<Integer> {

    @Override
    // if int -1 then x then y
    // if int 0 then x == y
    // if int 1 then y then x
    public int compare(Integer x, Integer y) {
        return y - x;
    }

}

public class Comparators {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 4));
        list1.sort(new IntDesc());
        System.out.println(list1);
        List<String> list2 = new ArrayList<>(Arrays.asList("banana", "apple", "date"));

        // Ascending Order
        list2.sort(new StringLengthCompare()); // date apple banana

        System.out.println(list2);

        List<Student> list3 = new ArrayList<>();
        list3.add(new Student(91, "Aditya"));
        list3.add(new Student(90, "Preet"));
        list3.add(new Student(90, "Ashish"));
        list3.add(new Student(93, "Shivesh"));

        // Neg as A Before P
        int ans = list3.get(2).getName().compareTo(list3.get(1).getName());
        System.out.println(ans);
        // 93 90 b-a
        // 90 93 b-a
        list3.sort((a, b) -> {
            if (b.getMarks() - a.getMarks() < 0) {
                return -1;
            } else if (a.getMarks() - b.getMarks() > 0) {
                return 1;
            } else {
                // if a before b in dict then -ve
                return a.getName().compareTo(b.getName());
            }
        });
        System.out.println(list3);

    }
}
