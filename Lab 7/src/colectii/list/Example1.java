package colectii.list;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        ArrayList<String> flowers = new ArrayList<>();
        List<String> seasons = new ArrayList<>(4);
        List<String> animals = new ArrayList<>(Arrays.asList("Cat", "Cat", "Dog", "Parrot"));  // can contain duplicates

        animals.add("Turtle");
        animals.add(2,"Fish");

        animals.set(1, "Pig");
        animals.remove(0);

        // iterare
        System.out.println("For-each iteration:");
        for (String animal: animals) {
            System.out.println(animal + " ");
        }

        System.out.println("\nIterator: ");
        Iterator<String> iterator2 = animals.iterator();
        while(iterator2.hasNext()) {
            String animal = iterator2.next();
            if(animal.equals("Pig")) {
                iterator2.remove();
            }
        }
        System.out.println(animals);


        // sortare
        System.out.println("\n Sorted asc: "); // it will use default comparable
        Collections.sort(animals);
        for (String animal : animals) {
            System.out.println(animal + " ");
        }

        // sortare desc:
        System.out.println("\n Sorted desc:");
        Collections.reverse(animals);
        for (String animal : animals) {
            System.out.println(animal + " ");
        }

        Collections.sort(animals);
        // cautare
        int pigIndex = Collections.binarySearch(animals, "Dog");
        if (pigIndex >=0) {
            System.out.println("\n Dog found at index: " +pigIndex);
        } else {
            System.out.println("\n Dog not found");
        }

    }
}
