package interfete;

public interface MyInterface {
    // variable declaration
    // public static final implicite
    public static final String HELLO_WORLD = "hello";

    // public abstract implicite
    public abstract String sayHello();

    // public implicit
    default void saySomething(){
        commonLogic();
        System.out.println("Something");
    }

    default void saySomething2(){
        commonLogic();
        System.out.println("Something2");
    }

    public static void print(String message) {
        System.out.println(message);
    };

    private static void commonLogic() {
        System.out.println("Common logic");
    }

    default void sameSignature() {
        System.out.println("Same signature from MyInterface 1");
    }
}
