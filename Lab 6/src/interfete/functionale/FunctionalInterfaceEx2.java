package interfete.functionale;

public interface FunctionalInterfaceEx2 {

    void execute();

    // we can redeclare toString, equals and hashCode and still have a functional interface
    String toString();
    boolean equals(Object object);

    default void print(String text) {
        System.out.println(text);
    }

    static void print(String text, String name) {
        System.out.println(name+":"+text);
    }


}
