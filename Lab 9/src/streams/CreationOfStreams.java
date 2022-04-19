package streams;

import interfete.functionale.Student;
import lambda.Car;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreationOfStreams {
    public static void main(String[] args) {
        String[] arr = new String[] {"a", "b", "c"};
        Stream<String> stringStream = Arrays.stream(arr);

        List<Student> studentList = new ArrayList<>();
        Stream<Student> studentStream = studentList.stream();

        Stream<String> secondStringStream =  Stream.of("a", "b", "c");

        Stream<Car> carStream = Stream.empty();

        Stream<Integer> integerStream = Stream.iterate(0, x -> x + 1).limit(10);
        Consumer<Integer> otherWay = System.out::println;
        integerStream.forEach(otherWay); // forEach - operatie finala

        System.out.println("-------------------");

        Stream.iterate(0, x -> x + 1)
                .limit(10)
                .sorted()
                .forEach(System.out::println);

        Stream<Integer> secondIntegerStream = Stream.generate(() -> 1); // infinit stream
        secondIntegerStream.forEach(System.out::println);


    }
}
