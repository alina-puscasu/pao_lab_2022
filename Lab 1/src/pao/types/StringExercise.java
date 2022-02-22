package pao.types;

import java.util.Locale;

public class StringExercise {

    public static void main(String[] args) {
        String a = "My String";

        // String Pool
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.equals("Another String"));
        System.out.println(a.charAt(1));
        System.out.println(a.indexOf("y"));
        System.out.println("test" == "Test".toLowerCase());
    }
}
