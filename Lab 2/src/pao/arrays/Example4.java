package pao.arrays;

public class Example4 {
    public static void main(String[] args) {
        int[][] array1 = new int[2][];
        int array11[][] = new int[2][];

        int[][] array2 = new int[5][4];
        int array22[][] = new int[5][4];
//        int[][] wrongArray = new int[][]; // not ok, you must specify at least 1 dimension

        // initializing two dimensional array as literal
        String[][] names = {{"Sam", "Smith"}, {"Robert", "Rowney jr"}, {"Ryan", "Gosling"}};
        for (int i =0; i<names.length; i++) {
            for (int j =0; j<names[i].length; j++) {
                System.out.print(names[i][j]+ " ");
            }
            System.out.println();
        }

        for (String[] arrayOfStrings : names) {
            for (String element : arrayOfStrings) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
