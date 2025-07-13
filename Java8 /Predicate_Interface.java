import java.util.function.Predicate;

public class Predicate_Interface {
    public static void main(String[] args) {

        // Predicate is a functional interface which returns a Boolean valued function
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        System.out.println(isEven.test(20));
        Predicate<Integer> isMultipleOfThree = (x) -> x % 3 == 0;
        System.out.println(isMultipleOfThree.test(21));

        // Default Methods in Predicate interface
        // 1. And
        boolean ofTwoandThree = isEven.and(isMultipleOfThree).test(20);
        System.out.println(ofTwoandThree);

        // 2. Or
        boolean ofTwoorThree = isEven.or(isMultipleOfThree).test(21);
        System.out.println(ofTwoorThree);

        // 3. Negate
        boolean ofTwoandThreeNegation = isEven.and(isMultipleOfThree).negate().test(20);
        System.out.println(ofTwoandThreeNegation);

        // Static Method
        // isEqual
        Predicate<String> ans = Predicate.isEqual("Aditya");
        System.out.println(ans.test("pearly"));

    }
}
