import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Student other = (Student) obj;
        return this.id == other.getId() && Objects.equals(name, other.getName());

    }

}

public class Hash_Map2 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Aditya", 47); // Hashcode1 --> index1
        map1.put("xyz", 46); // Hashcode2 --> index2
        map1.put("Aditya", 45); // HashCode1 --> index1 --> Equals() --> replace
        map1.remove("Aditya");
        System.out.println(map1);

        Map<Student, String> map2 = new HashMap<>();
        Student s1 = new Student("Aditya", 47);
        Student s2 = new Student("Harshit", 46);
        Student s3 = new Student("Aditya", 47);

        // Hashcode with objects is with memory
        map2.put(s1, "Roll No 47"); // Hashcode1 --> index1
        map2.put(s2, "Roll No 46"); // Hashcode2 --> index2
        map2.put(s3, "Roll No 47"); // Hashcode3 --> index3

        System.out.println("Sizeof Map2 is " + map2.size());

        // after overrding the equals and hashcode the size of map2 is 2

    }
}
