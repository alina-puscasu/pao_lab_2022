package exceptii.unchecked;

public class NumberFormatException {
    public static void main(String[] args) {
        int num = Integer.parseInt("23");
        int num2 = Integer.parseInt("something different than int");
    }
}
