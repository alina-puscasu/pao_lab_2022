package colectii.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example1 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("B");
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("D");

        System.out.println("Using HashSet: ");
        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("X");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("D");
        System.out.println("\nUsing TreeSet:");
        System.out.println(treeSet);

        Set<Integer> treeSetWithComparator = new TreeSet<>(new IntegerComparator());
        treeSetWithComparator.add(10);
        treeSetWithComparator.add(2);
        treeSetWithComparator.add(5);
        System.out.println("\nUsing TreeSet with comparator:");
        System.out.println(treeSetWithComparator);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("B");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("E");
        linkedHashSet.add("C");
        linkedHashSet.add("F");

        // the order of insertion is preserved
        System.out.println("\nUsing LinkedHashSet: ");
        System.out.println(linkedHashSet);
    }
}
