package interfete.functionale;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Maria", 21),
                new Student("Bogdan", 30),
                new Student("Alexandru", 18)
        );

        Predicate<Student> studentPredicate = student -> student.getAge() > 20;
        for (Student s: studentList) {
            if(studentPredicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}
