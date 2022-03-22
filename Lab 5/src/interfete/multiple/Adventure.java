package interfete.multiple;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface Test extends CanFight, CanSwim, CanFly {}

class ActionCharacter {
    public void fight() {
        System.out.println("Action Character can fight");
    }
}

class Hero extends ActionCharacter implements Test {

    public void swim() {
        System.out.println("Hero can swim");
    }

    public void fly() {
        System.out.println("Hero can fly");
    }

    // nu mai este necesar sa implementeze fight() pentru ca deja este implementat de ActionCharacter
}

public class Adventure {

    static void testCanFight(CanFight x) {
        CanFight x1 = new Hero();
        x.fight();
    }

    static void testCanSwim(CanSwim x) {
        CanSwim x1 = new Hero();
        x.swim();
    }

    static void testCanFly(CanFly x) {
        CanFly x1 = new Hero();
        x.fly();
    }

    static void testActionCharacter(ActionCharacter x) {
        ActionCharacter x1 = new Hero();
        x.fight();
    }

    public static void main(final String[] args) {
        Hero hero = new Hero();

        testCanFight(hero); // Treat it as a CanFight

        testCanSwim(hero); // Treat it as a CanSwim

        testCanFly(hero); // Treat it as a CanFly

        testActionCharacter(hero); // Treat it as an ActionCharacter
    }
}