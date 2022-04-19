package interfete.functionale;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String test() {
        return "Test";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student[] students = {new Student("Maria", 30), new Student("Alina", 22)};


//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
        for(Student st:students)
            System.out.println(st);
    }
}
