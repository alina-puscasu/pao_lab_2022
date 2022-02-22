package pao.types;

/**
 * Pentru a lucra cu date avem nevoie de zone de memorie, iar pentru a lucra cu zone de memorie în limbajul Java trebuie
 * sa ne gandim la tipul de date stocat: numere, valori de adevarat sau fals, caractere sau obiecte.
 *
 * Numerele, valorile de adevarat sau fals si caracterele sunt numite tipuri primitive.
 * => byte, short, int, long, float, double, char, boolean
 *
 * Sirul de caractere (String) nu este tip primitiv!
 * Primitivele sunt tipuri de date din java care nu sunt obiecte! (obiect = instanta a unei clase)
 *
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */
public class Primitives {

    public static void main(String[] args) {

        // No Floating
        // [-128...127] 8 bit
        byte b1; // declarare zona memorie
        b1 = 10; // pentru a da o valoare zonei de memorie se foloseste operatorul "="
        byte b2 = 023;  // octal incepe cu 0
        System.out.println(b1);
        System.out.println(b2);

        // 16 bit
        short s1 = 20;
        short s2 = 0xFF; // hexa: [0-9A-Fa-f]
        System.out.println(s1);
        System.out.println(s2);

        // 32 bit; 4 bytes
        int i1 = 10;
        /* numeric literals can have underscores inside them, for separating groups. However, a numeric literal cannot start
        or end with an underscore (Eg: _52 is an invalid number). */
        int i2 = 0B1_0110; // binar incepe cu 0b sau 0B apoi [0-1]
        int i3 = 12345__56;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        // 64 bit; 8 bytes
        long l1 = 10;
        System.out.println(l1);

        // Floating point - pot fi doar in baza 10; diferenta dintre double si float este de precizie (nr zecimale dupa virgula)
        // 32 bit floating point; by default in java orice valoare cu virgula e considerata de tip double
        // -> de aceea folosim un literal (f, F) pentru float

        // 32 bit;
        float f1 = 123.45F;
        System.out.println(f1);

        // 64 bit by default in java orice valoare cu virgula e considerata de tip double
        double d1 = 123.45;
        System.out.println(d1);

        // 16 bit
        char c1 = 'A'; // caracterele in Java se pun intre ghilimele simple ''; 16-bit Unicode character.
        char c2 = '\u0041'; // https://unicode-table.com/en/
        System.out.println(c1);
        System.out.println(c2);

        boolean k1 = false;
        boolean k2 = true;
        System.out.println(k1);
        System.out.println(k2);

        // defaults: int/double
//        var a; not allowed, it needs a value at declaration
//        a = 10;
        var b = 10.20;
    }
}
