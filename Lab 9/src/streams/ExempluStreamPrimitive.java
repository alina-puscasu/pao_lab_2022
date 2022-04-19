package streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ExempluStreamPrimitive {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(i->System.out.print(i + " "));

        System.out.println();

        LongStream longStream = LongStream.rangeClosed(1, 3);
        longStream.forEach(i->System.out.print(i + " "));

        System.out.println();
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(i->System.out.print(i + " "));
    }
}
