package pao.operators;

public class Operators {

    public static void main(String[] args) {

        boolean q = false;
        boolean w = true;
        boolean t = true;
        boolean result1 = q & w;
        boolean result2 = q && w; // nu se mai uita la partea dreapta adica la w pentru ca stie deja ca este false dupa q
        boolean restult3 = t | q;
        boolean restult4 = t || q; // nu se mai uita la partea dreapta adica la q pentru ca stie ca este true bazat pe t
        boolean b1 = true == false; // false
        boolean b2 = 3 > 10; // false

        System.out.println(b1 + " " + b2);

        System.out.println("1 + 2 = " + 1 + 2); // String + numeric -> String; result: "1 + 2 = 12"
        System.out.println("1 + 2 = " + (1 + 2)); // String + numeric -> String; " 1 + 2 = 3"
        System.out.println(1+2+"1 + 2 = "); // String + numeric -> String;  "31 + 2 = "

        int a = 10, b = 5, c = 1, result, result0;
        result = a-++c-++b; //10-2-6
        System.out.println(result);

        int x = 10;
        int y = 20;

        if (x<y) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        if (x<y) {
            System.out.println("A");
        }

        if (x<y) {
            System.out.println("A");
        } else if (y>x) {
            System.out.printf("B");
        } else {
            System.out.println("C");
        }
    }
}
