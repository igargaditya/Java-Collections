import java.util.EnumMap;
import java.util.Map;

public class Enum_Map {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);

        // Hashing is not required in this
        map.put(Day.Tuesday, "Gym"); // Mapped to its ordinal
        map.put(Day.Wednesday, "Football"); // Mapped to its ordinal
        map.put(Day.Monday, "Swimming"); // Mapped to its ordinal
        System.out.println(map.get(Day.Tuesday));

        // order maintained of enum
        System.out.println(map);

    }
}

enum Day {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}