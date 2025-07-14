package Streams;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optional_Class {

    public static Optional<String> getName(int id) {
        String name = "Aditya";
        // if Optional.of then null pointer exception
        return Optional.of(name);
    }

    public static void main(String[] args) {

        // Creating Optional
        // 1. Optional.of --> cant return null values
        // 2. Optional.ofNullable --> Can return Null values
        // 3. Optional.Empty --> returns null optional box

        // Now the Name can be null
        Optional<String> name = getName(2);
        // 1. Optional.isPresent() returns a boolean
        if (name.isPresent()) {
            System.out.println(name.get());
        }
        // 2. Optional.ifPresent() takes in a consumer
        name.ifPresent(x -> {
            System.out.println(x.toUpperCase());
        });

        String name2;
        if (name.isPresent()) {
            name2 = name.get();
        } else
            name2 = "NA";
        System.out.println(name2);

        // 3. name.orElse
        name2 = name.orElse("N/A");
        System.out.println(name2);
        // 4. name.orElseGet
        name2 = name.orElseGet(() -> "N/A");
        System.out.println(name2);
        // 5. name.orElseThrow

        name2 = name.orElseThrow(() -> new NoSuchElementException());
        // System.out.println(name2);

        // Directly using Optional
        Optional<String> optional = name.map(x -> x.toUpperCase());
        optional.ifPresent(x -> System.out.println(x));
    }

}
