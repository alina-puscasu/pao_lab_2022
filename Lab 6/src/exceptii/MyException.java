package exceptii;

public class MyException extends Exception {

    MyException() {}

    MyException(String string) {
        super(string);
    }

    public static void main(String[] args) {
        try {
            myMethod();
        } catch (MyException e) {
//            System.out.println(e);
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void myMethod() throws MyException {
        throw new MyException("exception from myMethod");
    }
}
