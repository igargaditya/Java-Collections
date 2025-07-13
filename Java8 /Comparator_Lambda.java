import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Cricketers {
    private int avg;
    private String Name;

    public Cricketers(int avg, String name) {
        this.avg = avg;
        Name = name;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}

public class Comparator_Lambda {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 11, 232, 1, 23);
        // Sort takes in a comparator
        // Comparator is a functional interface which has method int compare
        Comparator<Integer> c1 = (a, b) -> b - a;

        // Descending Order
        num.sort(c1);
        System.out.println(num);
        // Ascending order
        num.sort(null);
        System.out.println(num);

        // using collections.sort and descending order
        Collections.sort(num, c1);
        System.out.println(num);

        Map<Cricketers, Integer> mp1 = new TreeMap<>((a, b) -> {
            if (a.getAvg() - b.getAvg() < 0)
                return 1;
            else if (a.getAvg() - b.getAvg() > 0)
                return -1;
            else {
                return a.getName().compareTo(b.getName());
            }
        });

        mp1.put(new Cricketers(29, "Dhoni"), 8);
        mp1.put(new Cricketers(53, "Kohli"), 1);
        mp1.put(new Cricketers(29, "Raina"), 11);

        for (Cricketers cricket : mp1.keySet()) {
            System.out.println(cricket.getName() + "-> " + mp1.get(cricket) + " with average ->" + cricket.getAvg());
        }

    }

}
