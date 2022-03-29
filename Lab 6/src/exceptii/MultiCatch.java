package exceptii;

import java.util.Scanner;

public class MultiCatch {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = 1;
//
//        try {
//            n = Integer.parseInt(scanner.nextLine());
//        } catch (NumberFormatException e) {
//            System.out.println(e);
//        }
//
//        try {
//            if (5/n > 1) {
//                System.out.println(n + "is lower than 5");
//            }
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int n = Integer.parseInt(scanner.nextLine());
            if (5/n > 1) {
                System.out.println(n + "is lower than 5");
            }
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e);
        }
    }
}
