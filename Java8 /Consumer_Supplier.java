import java.util.function.Consumer;
import java.util.function.Supplier;

public class Consumer_Supplier {
    public static void main(String[] args) {
        // Consumer - Functional Interface with void accept(T t) ;

        Consumer<Integer> c1 = (x) -> {
            x += 47;
            System.out.println(x + 12);
        };
        Consumer<Integer> c2 = (x) -> {
            x += 55;
            System.out.println(x + 100);
        };
        c1.accept(10); // 10+47+12
        c2.accept(10); // 10+55+100
        Consumer<Integer> c3 = c1.andThen(c2);
        c3.accept(11);

        // Supplier - Function interface with T get() ;
        Supplier<String> s1 = () -> "Aditya";
        System.out.println(s1.get());

        // No default or static method
    }
}
