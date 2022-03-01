package pao.arrays;

import java.util.*;


public class Example3 {
    public static void main(String[] args) {

        // sort
        float[] values = new float[3];
        values[0] = 10.0f;
        values[1] = 20.0f;
        values[2] = 15.0f;

        Arrays.sort(values); // java.util package, Arrays is a utility class
        System.out.println("Values in ascending order: " + values);

        for (int i=0; i<values.length; i++) {
            System.out.println(values[i]);
        }

        // equals
        long[] array1 = {12L, 56L, 9999L};
        long[] array2 = {1L, 2L, 3L};

        boolean result = Arrays.equals(array1, array2);
        boolean result2 = Arrays.equals(array1, array1);
        System.out.println("The arrays are equal? " + result);
        System.out.println("The arrays are equal? " + result2);

        // binary search
        int valSearched1 = Arrays.binarySearch(array1, 12L);
        int valSearched2 = Arrays.binarySearch(array1, 122L);
        System.out.println("First value searched is at position: " + valSearched1);
        System.out.println("Second value searches is at position: " + valSearched2);


    }
}
