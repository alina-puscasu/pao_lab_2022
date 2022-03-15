package strings;

public class Test {

    public static void main(String[] args) {

        String s1 = "this is a string"; // String Pool - tabela de siruri
        String s2 = new String("this is another string"); // heap

        s1.toUpperCase(); // another object in heap
        System.out.println(s1);
        // toLowerCase()
        String s3 = s1.toUpperCase();
        System.out.println("s1 and s3 are equals? " + s1.equals(s3));
        System.out.println("s1 and s3 are equals? " + s1.equalsIgnoreCase(s3));

        System.out.println(s1.length());
        System.out.println(s1.charAt(2));

        // to split a string in an array of Strings
        String[] strings = s1.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }

        String s4 = s1.substring(0,4);
        System.out.println(s4);
        String s5 = s1.substring(5);
        System.out.println(s5);
//        s1.substring(2, s1.length()+1); StringIndexOutOfBoundsException

        // remove spaces
        System.out.println("  My String    has a lot of     spaces  ".trim());

        s1 = s1.concat(s2);
        System.out.println(s1);
        System.out.println(s2);

        // indexOf
        System.out.println("Index is: " + "myStringy".indexOf('y'));
        System.out.println("Index is: " + "myStringy".indexOf('y', 2));
        System.out.println("Index is: " + "myStringy".indexOf("my"));
        System.out.println("Index is: " + "myStringy".indexOf("my", 3));
        // endsWith, startsWith
        System.out.println("Does my string starts with does?" + "myStringy".startsWith("does"));
        System.out.println("Does my string ends with gy?" + "myStringy".endsWith("gy"));

        // reprezentarea unei valori de tip primitiv sau a unui obiect sub forma unui șir de caractere:
        System.out.println(String.valueOf(10));
        System.out.println(String.valueOf(10L));
        System.out.println(String.valueOf(10.00));
        System.out.println(String.valueOf(10.00f));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf('a'));
        System.out.println(String.valueOf(new Object()));
        String a = String.valueOf(10);

        // StringBuilder - aceleasi metode ca si String + metode specifice
        StringBuilder sb1 = new StringBuilder("Java");
        String sbToString = sb1.toString();

        // append - primitive + String + StringBuffer + Object
        String s6 = " Love";
        sb1.append(s6);
        System.out.println(sb1);

        System.out.println(sb1.reverse());

        // substring
        sb1.substring(4); // a new String object is created
        System.out.println(sb1);

        // replace
        StringBuilder sb2 = new StringBuilder("myStringBuilder");
        sb2.replace(0,2, "");
        System.out.println(sb2);

        // setCharAt
        sb2.setCharAt(0, 's');
        System.out.println(sb2);

        // delete
        sb2.delete(0,2);
        sb2.deleteCharAt(1);
        sb2.delete(0, 1000); // OK
        System.out.println(sb2);

        // insert
        sb2.insert(0, true);
        sb2.insert(0, 'a');
        sb2.insert(0, 10.0);
        sb2.insert(0, 10.0f);
        sb2.insert(0, 10);
        sb2.insert(0, 10L);
        sb2.insert(0, new Object());
        sb2.insert(0, "myString");
        System.out.println(sb2);

        // StringBuffer - thread safe, lower than StringBuilder
        StringBuffer sbf = new StringBuffer("myStringBuffer");
        StringBuffer sbf2 = new StringBuffer("myStringBuffer2");
        sbf.append(sbf2);
        sbf.append(10);
        sbf.append("myString");
        System.out.println(sbf);
    }
}
