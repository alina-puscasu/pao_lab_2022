package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example2 {

    public static void main(String[] args) {

        Map<String, Person> hashMap = new HashMap<>();
        Map<String, Person> linkedHashMap = new LinkedHashMap<>();
        Map<String, Person> treeMap = new TreeMap<>();

        hashMap.put("2980506230078", new Person("Maria", 30));
        hashMap.put("2960506230069", new Person("Alin", 23));
        hashMap.put("2950506230063", new Person("Marius", 18));

        linkedHashMap.put("2980506230078", new Person("Maria", 30));
        linkedHashMap.put("2960506230069", new Person("Alin", 23));
        linkedHashMap.put("2950506230063", new Person("Marius", 18));

        treeMap.put("2980506230078", new Person("Maria", 30));
        treeMap.put("2960506230069", new Person("Alin", 23));
        treeMap.put("2950506230063", new Person("Marius", 18));

        System.out.println("HASHMAP: ");
        for (Map.Entry<String, Person> pair : hashMap.entrySet()) {
            System.out.println("Key: " + pair.getKey() + "; value: " + pair.getValue() + "\n");
        }

        System.out.println("LINKEDHASHMAP: ");
        for (Map.Entry<String, Person> pair : linkedHashMap.entrySet()) {
            System.out.println("Key: " + pair.getKey() + "; value: " + pair.getValue() + "\n");
        }

        System.out.println("TREEMAP: ");
        for (Map.Entry<String, Person> pair : treeMap.entrySet()) {
            System.out.println("Key: " + pair.getKey() + "; value: " + pair.getValue() + "\n");
        }

        TreeMap<String, Person> treeMapWithComparator = new TreeMap<>(new StringComparator());
        treeMapWithComparator.put("2980506230078", new Person("Maria", 30));
        treeMapWithComparator.put("2960506230069", new Person("Alin", 23));
        treeMapWithComparator.put("2950506230063", new Person("Marius", 18));

        System.out.println("TREEMAP WITH COMPARATOR - DESC ORDER: ");
        for (Map.Entry<String, Person> pair : treeMapWithComparator.entrySet()) {
            System.out.println("Key: " + pair.getKey() + "; value: " + pair.getValue() + "\n");
        }
    }
}
