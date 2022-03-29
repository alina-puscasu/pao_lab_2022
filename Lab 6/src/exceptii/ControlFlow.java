package exceptii;

public class ControlFlow {
    public static void main(String[] args) {
//        inTryFinally();
//        inTryCatchFinally();
        noException();
    }

    public static void inTryFinally() {
        int arr[]=new int[4];
        try {
            int i = arr[4];
            // does not reach println, exception thrown
            System.out.println("Inside try block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-finally clause");
    }

    public static void inTryCatchFinally() {
        int arr[]=new int[4];
        try {
            int i = arr[4];
            // does not reach println, exception thrown
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught in catch block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-finally clause");
    }

    public static void noException() {
        int arr[]=new int[4];
        try {
            int i = arr[3];
            System.out.println("Inside try block");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception caught in catch block");
        } finally {
            System.out.println("Executing finally");
        }

        System.out.println("Outside try-finally clause");
    }
}
