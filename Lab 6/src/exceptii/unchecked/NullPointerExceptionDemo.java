package exceptii.unchecked;

import java.util.Optional;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String a = null;
        System.out.println(a.toLowerCase());

        // Optional
        String optional = null;
        Optional.ofNullable(optional).orElse("myString");
    }
}
