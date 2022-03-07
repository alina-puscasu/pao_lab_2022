package pao.statics;

class OuterClass {
    private static final String MSG = "Message";

    // Static nested class
    public static class NestedStaticClass {

        // Only static members of Outer class is directly accessible in nested static class

    }

    // Non-static nested class - also called Inner class
    public class InnerClass {

        // Both static and non-static members of Outer class are accessible in this Inner class

    }
}

public class PlayWithStatics4 {

    public static void main(String args[]) {
        // Create instance of nested Static class

        // Call non static method of nested static class

        // In order to create instance of Inner class we need an Outer class instance

        // Calling non-static method of Inner class

        // We can also combine above steps in one step to create instance of Inner class

        // Similarly we can now call Inner class method

    }
}
