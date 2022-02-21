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
        /* NO Floating point - poate fi scrie in baza 10 / binar / octal / hexa */

        // 8 bit: [-128...127]
            // declarare zona memorie
            // pentru a da o valoare zonei de memorie se foloseste operatorul "="
            // octal incepe cu 0

        // 16 bit

            // hexa incepe cu 0X sau 0x apoi [0-9A-Fa-f]

        // 32 bit; 4 bytes

            // binar incepe cu 0b sau 0B apoi [0-1]
            // se pot declara mai multe zone de memorie cu virgula intre ele


        /* numeric literals can have underscores inside them, for separating groups. However, a numeric literal cannot start
        or end with an underscore (Eg: _52 is an invalid number). */

        // 64 bit; 8 bytes

        // Floating point - pot fi doar in baza 10; diferenta dintre double si float este de precizie (nr zecimale dupa virgula)
        // 32 bit floating point; by default in java orice valoare cu virgula e considerata de tip double
        // -> de aceea folosim un literal (f, F) pentru float

        // 64 bit floating point; by default in java orice valoare cu virgula e considerata de tip double

        // 16 bit
            // caracterele in Java se pun intre ghilimele simple ''; 16-bit Unicode character.


            //1 bit pentru boolean
    }
}
