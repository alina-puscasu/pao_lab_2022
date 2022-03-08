package abstractExample;

public class Derived extends MyAbstractClass {
    @Override
    public void test() {
        System.out.println("Test from Derived");
    }

    @Override
    public void test2() {
        System.out.println("Test2 from Derived");
    }

    public static void main(String[] args) {
        MyAbstractClass m1 = new Derived();
        Derived m2 = new Derived();

        m1.test();
        m1.test1();
        m1.test2();

        m2.test();
        m2.test1();
        m2.test2();



    }
}
