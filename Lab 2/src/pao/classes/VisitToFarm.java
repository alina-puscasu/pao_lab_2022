package pao.classes;

public class VisitToFarm {
    public static void main(String[] args) {
        Animal animal = new Animal("Max", "ham");
        Bird bird = new Bird("chip-chip");

        //
        System.out.println(animal.noOfLegs);
        System.out.println(bird.noOfLegs);
        System.out.println(animal.getNoOfLegs());
        System.out.println(bird.getNoOfLegs());

        Animal animal1 = new Animal("Max", "ham-ham");
        Animal animal2 = new Animal("Max", "ham");
        Animal animal3 = animal1;

        // Object - class parent for all classes
        // in Object we have implementations for: equals, hashCode, toString
        System.out.println(animal1.equals(animal2)); // false
        System.out.println(animal1 == animal2); // false
        System.out.println(animal1.equals(animal3)); // true
        System.out.println(animal1 == animal3); // true
        System.out.println(animal1); //toString overriden, will print all the attribute-value pairs for this object

        Cat c1 = new Cat("Marie", "meow", CatBreed.BRITISH_SHORT_HAIR);
        Cat c2 = new Cat("Marie", "meow", CatBreed.BRITISH_SHORT_HAIR);
        Cat c3 = c1;
        Cat c4 = new Cat("Marie", "meow123", CatBreed.BRITISH_SHORT_HAIR);

        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));

        // OVERRIDE
        // printName method overridden in Bird
        animal1.printName();
        c1.printName();
        bird.printName();

        // move method overridden in Bird
        animal1.move();
        c1.move();
        bird.move();


        // toString - redundant
        System.out.println(animal1.toString());
        System.out.println(c1.toString());
    }
}
