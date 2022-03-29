package exceptii.unchecked;

public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        String a = "this is my string";
        a.charAt(a.length());
    }
}
