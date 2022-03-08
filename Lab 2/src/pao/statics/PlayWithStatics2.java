package pao.statics;

// static block and static variables are executed in order they are present in a program
public class PlayWithStatics2 {
    // static variable
    private static int a = m1();

    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    private static int m1() {
        System.out.println("from m1");
        return 20;
    }

    private int m2() {
        return 30;
    }

    public static void main(String[] args) {
        System.out.println("Value of a : " + a);
        System.out.println("from main");
    }
}