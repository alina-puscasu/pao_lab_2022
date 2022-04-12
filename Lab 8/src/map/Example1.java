package map;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<String, Person> personHaspMap = new HashMap<>();

        Person p1 = new Person("Ioana", 18);

        personHaspMap.put("2980506230078", new Person("Maria", 20));
        personHaspMap.put("2960506230069", new Person("Alin", 30));
        personHaspMap.put("2950506230063", new Person("Marius", 20));

        System.out.println(personHaspMap.get("2980506230078"));

        personHaspMap.put("2980506230078", p1);
        System.out.println(personHaspMap.get("2980506230078"));

        // delete key-value pair
        personHaspMap.remove("2960506230069");
        for(Map.Entry<String, Person> pair : personHaspMap.entrySet()) {
            System.out.println("Key: " + pair.getKey() + "; value: " + pair.getValue() + "\n");
        }

        System.out.println("Keyset: ");
        System.out.println(personHaspMap.keySet());

        System.out.println("Values: ");
        System.out.println(personHaspMap.values());


        Map<Person, Integer> map = new HashMap<>();
        Person p2 = new Person("Ioana", 18);
        map.put(p1, 2);
        map.put(p2, 3); // it updates the value, the key is the same since Person has equals method overriden
        System.out.println("Content of the map: ");
        System.out.println("p1: " + map.get(p1));
        System.out.println("p2: " + map.get(p2));
    }
}
