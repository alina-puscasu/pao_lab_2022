package pao.types;

/**
 * Clasele Wrapper sunt folosite pentru a folosi primitivele pe post de obiecte, atunci cand este necesar.
 *
 * Primitive Data Type  |  Wrapper Class
 * - byte                   Byte
 * - short                  Short
 * - int                    Integer
 * - long                   Long
 * - float                  Float
 * - double                 Double
 * - boolean                Boolean
 * - char                   Character
 */
public class Wrappers {

    public static void main(String[] args) {
        int i1 = 10;
        //"10"
        Integer integer1 = Integer.valueOf(i1);
        System.out.println(integer1.toString());

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';

        // primitive out of Wrapper

        Integer i2 = Integer.valueOf(2);
        double i1DoubleValue = i2.doubleValue();
        int i2IntValue = i2.intValue();
        String intAsString = i2.toString();
    }
}
