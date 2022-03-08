package polimorfism;

class Parent {
    private void m1() {
        System.out.println("parent m1()");
    }

    // overloading example
    private void m1(int x) {
        System.out.println("parent m1()");
    }

    // overloading example
    private void m1(double x) {
        System.out.println("parent m1()");
    }

    protected void m2() {
        System.out.println("parent m2()");
    }

    static void m3() {
        System.out.println("parent static - m3()");
    }
}

class Child extends Parent {
    // private methods from parent are not overridden
    private int m1() {
        System.out.println("child m1()");
        return 1;
    }

    // overriding method with more accessibility
    @Override
    public void m2() {
        System.out.println("child m2()");
    }

    static void m3() {
        System.out.println("child static m3()");
    }
}

public class DynamicMethodBinding2 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.m2(); // parent m2
        p1.m3(); // parent static

        Parent p2 = new Child();
        p2.m2(); // child m2
        p2.m3(); // parent static

        Child c1 = new Child();
        c1.m2(); // child m2
        c1.m3(); // child static
    }
}
