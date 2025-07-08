package List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {

        List<Integer> ll = new LinkedList<>(); // LinkedList
        System.out.println(ll.getClass().getName());
        List<String> animals = new LinkedList<>(Arrays.asList("Cat", "Dog", "Elephant")); // Linkedlist
        System.out.println(animals.getClass().getName());
        List<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Elephant"));

        animals.removeAll(animalsToRemove);
        System.out.println(animals);

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.get(2);
        ll.addFirst(0);
        ll.addLast(40);
        ll.remove(2);
        System.out.println(ll);
    }
}
