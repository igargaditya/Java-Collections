import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }
}

public class Function_Interface {
    public static void main(String[] args) {
        // Function is an functional interface
        Function<String, String> toLower = (x) -> x.toLowerCase();
        Function<String, Integer> length = (x) -> x.length();
        Function<String, String> substringlength3 = (x) -> x.substring(0, 3);
        Function<String, String> subandlower = toLower.andThen(substringlength3);

        System.out.println(toLower.apply("AdItya"));
        System.out.println(length.apply("Aditya"));
        System.out.println(substringlength3.apply("Aditya"));

        Function<List<Student>, List<Student>> studentswithprefixAdi = li -> {
            List<Student> temp = new ArrayList<>();
            for (Student s : li) {
                System.out.println(s.name);
                if (subandlower.apply(s.name).equals("adi")) {
                    temp.add(s);
                }
            }
            return temp;
        };

        List<Student> l1 = List.of(new Student("Aditya"), new Student("Adityaa"), new Student("adItyaa"));
        List<Student> ans = studentswithprefixAdi.apply(l1);

        System.out.println(ans);

        // Default Methods - andThen() and Compose()
        // Static Methods - Indenity()

    }

}
