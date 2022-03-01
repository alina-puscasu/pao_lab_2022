package pao.arrays;

public class Example1 {
    public static void main(String[] args) {

        float values[] = new float[3]; // declare and allocate memory
        float[] values2 = new float[3];

        // we use the keyword "new" and then float[3] to allocate space to store 3 float values
        // each element is accessed via an index - and indexes range from 0 to number of elements in the array minus 1
        values[0] = 10.0f;
        values[1] = 20.0f;
        values[2] = 15.0f;

        // Exercise: go through the values array and add everything up
        float sum = 0.0f;

        for (int i=0; i < values.length; i++) {
            sum += values[i];
        }

        System.out.println("With for: " + sum);

        // enhanced for
        for (float value : values) {
            sum += value; // sum = sum + value
        }

        System.out.println("With enhanced for: " + sum);

    }
}
