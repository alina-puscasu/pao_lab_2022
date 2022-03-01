package pao.classes;

import java.util.Objects;

// base class
public class Animal {

    int noOfLegs = 4;

    // good practice: fields should be private and they shoudl have public getters and setters
    private String sound;

    private String name;

    private int age;

    public Animal() {}

    public Animal(int noOfLegs) {
        this.noOfLegs = noOfLegs;
        System.out.println("Animal has " + noOfLegs + " legs");
    }

    // supraincarcare constructor sau overloading constructors
    public Animal (String name, String sound) {
        // this call must be first statement
        this(sound);
        this.name = name;
    }

    public Animal(String sound) {
        this.sound = sound;
    }

    //no return value - void
    // overloading - supraincarcare a metodei printName()
    public void printName(String name) {
        System.out.println("I wish my animal's name were " + name + "but is: " + this.name);
    }

    // no return value = void
    public void printName() {
        System.out.println("My animal's name is: " + this.name);
    }

    public void move() {
        System.out.println("I can walk!");
    }

    public void setSound(String sound) {this.sound = sound; }
    public String getSound() {return sound;}

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getNoOfLegs() == animal.getNoOfLegs() && getAge() == animal.getAge() && getSound().equals(animal.getSound()) && getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoOfLegs(), getSound(), getName(), getAge());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "noOfLegs=" + noOfLegs +
                ", sound='" + sound + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // use alt+insert for generating equals, hashCode, toString
    // if you do not override them, the methods from java.util.Object class (parent for all Java classes) will be used
}
