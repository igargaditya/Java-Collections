import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    private String name;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    private int marks;

    @Override
    public int compareTo(Student o) {
        if (this.getMarks() - o.getMarks() < 0) {
            return 1;
        } else if (this.getMarks() - o.getMarks() > 0) {
            return -1;
        } else {
            return this.getName().compareTo(o.getName());
        }
    }
}

public class Comparables {

    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 92);
        Student s2 = new Student("Shivesh", 94);
        Student s3 = new Student("Pearl", 99);
        Student s4 = new Student("Abhishek", 92);
        List<Student> ls = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
        ls.sort(null);

        System.out.println(ls);

    }
}
