package colectii.set;


import java.util.HashSet;
import java.util.Set;

public class Example2 {

    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        Person p1 = new Person("Popescu Ion", 23);
        Person p2 = new Person("Popescu Ion", 23);

        set.add(p1);
        set.add(p2);

        System.out.println(set.size());
    }
}
