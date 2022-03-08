package pao.singletons;

// Pros: Instance can be accessed directly
// Cons: may lead to resource wastage because instance of class is created always, whether is required or not

public class StaticBlockSingleton {

    public static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    static {
        instance = new StaticBlockSingleton();
    }
}

class Main {
    public static void main(String[] args) {
        StaticBlockSingleton instance1 = StaticBlockSingleton.instance;
        StaticBlockSingleton instance2 = StaticBlockSingleton.instance;
        System.out.println(instance1 == instance2);

    }
}
