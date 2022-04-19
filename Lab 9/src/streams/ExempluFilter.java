package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExempluFilter {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Cherry", "Banana", "Pineapple");

        Predicate<String> predicate = fruit -> fruit.equals("Banana");
        fruits.stream()
                .peek(e -> System.out.println("Unfiltered value: " + e))
                .filter(predicate)
                .peek(e -> System.out.println("Filtered value: " + e))
                .forEach(System.out::println);
    }
}
