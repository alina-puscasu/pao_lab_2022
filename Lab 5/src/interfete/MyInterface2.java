package interfete;

public interface MyInterface2 {

    public String sayBye();

    default void sameSignature() {
        System.out.println("Same signature from MyInterface 2");
    }
}
