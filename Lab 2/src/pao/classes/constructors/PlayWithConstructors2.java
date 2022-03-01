package pao.classes.constructors;

class Base2 {
    // lipsa unui modificator de acces precum public protected sau private, inseamna ca field-ul are modif default, care nu se scrie
    // default access modifier = accesibil doar in clase din acelasi package
    int x;

    Base2() {
        System.out.println("Base2 with no params");
    }

    Base2(int x) {
        System.out.println("Base2 with params");
        this.x = x;
    }
}

class Derived2 extends Base2 {
    int y, z;

    Derived2 () {
        System.out.println("Derived2 with no params");
        display();
    }

    Derived2(int x, int y) {
        super(x);
        System.out.println("Derived2 with params");
        this.y = y;
    }

    Derived2(int x, int y, int z) {
        this(x,y); // constructor chaining
        System.out.println("Derived2 with 3 params");
        this.z=z;
    }

    void display() {
        System.out.println("x = " + x + ", y = " + y + ", z =" + z);
    }

}

public class PlayWithConstructors2 {
    public static void main(String[] args) {
        // anonymous object
        new Derived2();

        Derived2 d = new Derived2(10, 20);
        d.display();

        new Derived2(10, 20, 30).display();
    }
}
