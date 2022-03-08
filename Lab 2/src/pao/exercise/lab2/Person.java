package pao.exercise.lab2;

public class Person {
    private String name;
    private String surname;
    private int age;
    private long id;
    private String type;

    public Person(String name, String surname, int age, long id, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("Puscasu", "Alina", 30, 123, "Mathematics");
        Person p2 = new Person("Popescu", "Marian", 20, 234, "Informatics");
        System.out.println(p1);
        System.out.println(p2);
    }
}
