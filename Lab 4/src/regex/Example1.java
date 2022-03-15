package regex;

public class Example1 {

    public static void main(String[] args) {

        String myString = "This is a special String <3!";
        String myString2 = "A";

        // checks if first one is an upper case, then only lower case
        System.out.println(myString.matches("[A-Z][a-z]+"));
        System.out.println(myString2.matches("[A-Z][a-z]*"));

        // checks if the string contains only digits, at least 1
        System.out.println(myString.matches("[0-9]+"));

        // checks if it is a number that begins with 0722 or 0723 followed by 6 digits OR 6-10 digits
        System.out.println(myString.matches("(0723|0722)[0-9]{6}"));
        System.out.println(myString.matches("(0723|0722)[0-9]{6,10}"));

        // replaces multiple consecutive spaces with a single space
        String myString1 = "This string has    a lot     of spaces ";


        String myString3 = "My favourite programming language is C++ even if C++ has its limitations!";
        System.out.println(myString1.replaceAll("[ ]{2,}", " "));

        // replaces the word with "C++" with "Java"
        System.out.println(myString3.replaceFirst("C\\+\\+", "Java"));
        System.out.println(myString3.replaceAll("C\\+\\+", "Java"));
        System.out.println(myString3.replaceAll("C\\+\\+", "Java"));

        // replaces vowels with *
        String myString4 = "MIAU!";
        System.out.println(myString4.replaceAll("[aeiouAEIOU]", "*"));
        System.out.println(myString4.replaceFirst("[aeiouAEIOU]{2}", "*"));
        System.out.println(myString4.replaceFirst("[aeiouAEIOU]{2,}", "*"));

        String myString5 = "abcd";
        String[] characters = myString5.split("");
        for (String character:characters) {
            System.out.println(character);
        }

        String myString6 = "This is:an example with regex! After!";
        String[] words = myString6.split("[ .,:!]+");
        for (String word:words) {
            System.out.println(word);
        }

        String myString7 = "12ab34c5678";
        String[] numbers = myString7.split("[a-z]+");
        String[] numbers2 = myString7.split("[^0-9]+");
        for (String number:numbers) {
            System.out.println(number);
        }
        for (String number:numbers2) {
            System.out.println(number);
        }
    }
}
