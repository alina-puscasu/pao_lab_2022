package interfete.functionale;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student("John Doe", 30);
        Supplier<String> test = Student::test; // method ref
        Supplier<Student> supplier = Student::new; // method ref

        System.out.println(studentSupplier.get());

        List<Student> studentList = Arrays.asList(
            studentSupplier.get(),
            supplier.get(),
            new Student("Bogdan", 30)
        );
        System.out.println(studentList);
    }
}
