package pao.singletons;

// Pros: Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
// Cons: Every time a condition of null has to be checked.
public class LazyInitializedSingleton {

    // private instance
    private static LazyInitializedSingleton instance;

    // private constructor
    private LazyInitializedSingleton() {
        System.out.println("Initializing my singleton!");
    }

    // static method to return instance of class
    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        System.out.println("Giving you my singleton!");
        return instance;
    }
}

class MainLazy {
    public static void main(String[] args) {
        LazyInitializedSingleton instance1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton instance2 = LazyInitializedSingleton.getInstance();

        System.out.println(instance2 == instance1);
    }
}