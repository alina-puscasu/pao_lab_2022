package streams;

import java.util.Arrays;
import java.util.List;

public class ExempluMap {

    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alexandra", "Sara", "Maria");

        studentNames.stream()
                .map(name -> name.length()) // or method ref String::length
                .forEach(System.out::println);
    }
}
