package pao.exercise.lab1;

import java.util.Scanner;

/**
 * Sa se afiseze al n-lea termen din seria Fibonacci, unde n este citit de la tastatura.
 */
public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Read n: ");
        int n = scanner.nextInt();

        // https://en.wikipedia.org/wiki/Fibonacci_number
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n <= 2) {
            System.out.println(1);
            return;
        }

        int fibo_1 = 0, fibo_n = 1, i = 2, temp;
        while (i <= n) {
            temp = fibo_n;
            fibo_n += fibo_1;
            fibo_1 = temp;
            i++;
        }

        System.out.println("Al n-lea termen din seria Fibonacci: " + fibo_n);
    }
}

