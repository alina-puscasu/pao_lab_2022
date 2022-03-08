package pao.finals;

public class PlayWithFinal {

    static final int MY_CONSTANT = 20;

    // direct initialize
    final int THRESHOLD = 5;

    // blank final variable
    final int CAPACITY;

    final int MINIMUM;

    static final double PI = 3.14159;

    static final double EULER_CONSTANT;

    // instance initializer - is called only when we have a constructor call
    {
        CAPACITY = 25;
        System.out.println("THRESHOLD: " + THRESHOLD);
        System.out.println("CAPACITY: " + CAPACITY);
    }

    // static initializer block
    static {
        EULER_CONSTANT = 20;
        System.out.println("Static initializer block");
    }

    {
        System.out.println("SECOND INSTANCE INITIALIZER BLOCK");
    }

    public PlayWithFinal() {
        MINIMUM = 40;
        System.out.println("MINIMUM: " + MINIMUM);
    }

    public static void main(String[] args) {
        System.out.println("PI: " + PI);
        System.out.println("EULER_CONSTANT: " + EULER_CONSTANT);

//        CAPACITY = 5; is not static, not allowed
        new PlayWithFinal();
    }
}
