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
        Integer integer1 = Integer.valueOf(i1);
        Integer integer2 = Integer.valueOf("10");
        System.out.println(integer1);
        System.out.println(integer2);

        Integer myInt = 5;
        Double myDouble = 6.77;
        Character myChar = 'A';

        System.out.println(myInt.intValue()); // returns primitive
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());


        Integer i2 = Integer.valueOf(2);
        double i1DoubleValue = i2.doubleValue();
        int i2IntValue = i2.intValue();
        String intAsString = i2.toString();
    }
}
