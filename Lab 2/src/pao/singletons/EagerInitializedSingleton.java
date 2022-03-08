package pao.singletons;

// Cons: May lead to resource wastage. Because instance of class is created always, whether it is required or not.
public class EagerInitializedSingleton {

    // static variable
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // private constructor restricted to this class itself
    private EagerInitializedSingleton() {
        System.out.println("I initialize the singleton!");
    }

    // static method to create instance of Singleton class
    public static EagerInitializedSingleton getInstance() {
        System.out.println("Returning this singleton!");
        return instance;
    }
}

class MainEager {
    public static void main(String[] args) {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
        System.out.println(instance2 == instance1);
    }
}
