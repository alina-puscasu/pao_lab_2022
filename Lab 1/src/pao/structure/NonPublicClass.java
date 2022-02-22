/**
 * Clasele din Java sunt organizate in pachete.
 * Cuvantul cheie 'package' => de obicei pe prima linie, defineste pachetul in care se afla clasa
 * Clasa Main nu are nici un package definit => este inclusa in pachetul implicit, numit "default"
 * Ca si buna practica, este bine sa denumim intotdeauna pachetele.
 */


/**
 * class = cuvant cheie ce semnaleaza definitia unei clase
 * <p>
 * Reguli nume clasa:
 * - nu poate incepe cu numere (dar poate contine numere)
 * - nu poate coincide cu cuvinte cheie (eg: 'package')
 * - nu poate contine spatii si caractere speciale (exceptie "$" si "_")
 * <p>
 * Conventii
 * - camel case
 * - incepe cu litera mare
 * - substantive
 * <p>
 * Pentru a folosi clase din alte pachete fata de cel curent => folosim cuvantul cheie import
 * java.lang => pachet special din Java ce nu trebuie importat
 * (de exemplu, clasa System folosita pentru a printa mesaje in consola, face parte din acest pachet)
 */


/**
 * Un fisier Java poate avea mai multe definitii de clase in el. Insa doar una poate fi publica.
 */

package pao.structure;
import java.lang.*;

class ClassStructure {

    public static void main(String[] args) {
        System.out.println("ClassStructure");
    }
}

/**
 * Un fisier Java poate avea mai multe definitii de clase in el. Insa doar una poate fi publica.
 */
public class NonPublicClass{

    /**
     * class field
     */
    private int myVariable;

    /**
     * class method
     */
    private void myMethod() {

    }
}

class AnotherClass {
}