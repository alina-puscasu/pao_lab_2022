package pao.io;

import java.util.Scanner;

public class ReadingAndWriting {

    public static void main(String[] args) {

        // The Scanner class is useful when reading values, as it has utility methods for most primitives.
        Scanner scanner;

        // It can be set to read from the System console.
        scanner = new Scanner(System.in);

        System.out.println("Input text:");
        // whole lines of text
        String string = scanner.nextLine();

        System.out.println("Read boolean:");
        // booleans
        boolean b = scanner.nextBoolean();

        System.out.println("Read int:");
        // numeric types
        int i = scanner.nextInt();

        System.out.println("End of reading");

        // Error output stream. (in the IDE and command line, this will behave exactly like the "out" stream, but it can
        // be configured to be redirected separately from it in production use.
        System.err.print("Something has happened!");
    }
}