package pao.classes;

import java.util.Objects;

public class Bird extends Animal {
    int noOfLegs = 2;

    public Bird(String sound) {
        super(sound);
    }

    // good practice to add this annotation to highlight method is overridden
    @Override
    public void printName() {
        System.out.println("Birds have no name!");
    }

    @Override
    public void move() {
        System.out.println("I can fly!");
    }

    public int getNoOfLegsFromParent() {
        return super.getNoOfLegs();
    }

    @Override
    public int getNoOfLegs() {
        return noOfLegs;
    }

    @Override
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return getNoOfLegs() == bird.getNoOfLegs();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNoOfLegs());
    }

    @Override
    public String toString() {
        return "Bird{" +
                "noOfLegs=" + noOfLegs +
                '}';
    }
}
