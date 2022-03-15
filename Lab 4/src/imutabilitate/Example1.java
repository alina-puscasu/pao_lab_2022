package imutabilitate;

// Java is always pass-by-value! o mare confuzie in Java mereu, de fapt pass references by values
// https://www.youtube.com/watch?v=-5NC5_sI-vQ
// Object parameters are actually references (which are passed by value).

public class Example1 {

    public static void main(String[] args) {
        Student s = new Student("Alice", 5);
        changeReference(s);
        System.out.println(s); // Alice 5

        changeObject(s);
        System.out.println(s); // Alice 10

    }

    static void changeReference(Student st) {
        st = new Student("Bob", 10);
    } // check example1.png

    static void changeObject(Student st) {
        st.setAverageGrade(10);
    } // check example1_2.png
}

class Student {

    private String name;
    private Integer averageGrade;

    public Student(String name, Integer averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Integer averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}