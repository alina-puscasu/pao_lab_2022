package polimorfism;

class A {
    int x = 10;

    void m1() {
        System.out.println("Inside A's m1 method");
    }

}

class B extends A {
    int x = 20;

    @Override
    void m1() {
        System.out.println("Inside B's m1 method");
    }
}

class C extends A {
    void m1() {
        System.out.println("Inside C's m1 method");
    }
}

public class DynamicMethodBinding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A ref;
        ref = a;
        // calling A's version of m1
        ref.m1();
        System.out.println(ref.x);

        ref = b; // eq of: A ref = new B() - upcasting
        ref.m1();
        System.out.println(ref.x);

        ref = c; // A a = new C();
        ref.m1();
        System.out.println(ref.x);

//        B bDressedAsA = (B) new A(); // downcasting -> ClassCastException

        B bDressedAsA = null;
        if (bDressedAsA instanceof A) {
            bDressedAsA = (B) a;
            System.out.println("Downcasting");
        }

    }
}
