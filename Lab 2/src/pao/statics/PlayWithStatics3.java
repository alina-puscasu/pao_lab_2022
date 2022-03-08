package pao.statics;

public class PlayWithStatics3 {
    // static variable
    private static int a = 10;

    // instance variable
    private int b = 20;

    // static method
    private static void m1() {
        a = 20;
        System.out.println("from m1");

//        static int c; // static not allowed for local vars
//        b = 10; // cannot make static reference
//        this.a = 30; // this = current object; cannot use this in static context
//        m2(); cannot make static reference to non-static method m2()
    }

    // instance method
    void m2() {
        a = 30; //can call static var from non-static method
        m1(); // can call static method
        System.out.println("from m2");
    }

}

class Base {
    static int myVar = 0;

    public static void fun() {
        System.out.println("Static fun() called");
    }
}

class Derived extends Base {
    public static void fun() {
//        System.out.println(super.fun()); static cannot access this or super
    }
}