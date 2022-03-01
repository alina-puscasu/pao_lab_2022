package pao.classes.constructors;

class Base {
    Base() {
        System.out.println("Base constructor called");
    }
}

// use extends in order to inherit from another class
class Derived extends Base {
    Derived() {
        // implicit pe prima linie compilerul face un super();
        // reguli pentru a folosi explicit super() sau this() - trebuie sa fie unul, fie celalalt si pe prima linie
        // daca nu as fi avut niciun constructor in Derived, compilatorul insereaza un no-args constructor by default
        System.out.println("Derived class constructor called ");
    }
}

public class PlayWithConstructor1 {
    // default constructor inserted by the compiler only if there is no other constructor defined already
    public static void main(String[] args) {
        // creare obiect si asignare referinta in heap
        // intai se apeleaza constructorul clasei Base
        Derived d = new Derived();
    }


}
