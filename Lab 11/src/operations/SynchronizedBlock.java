package operations;

/**
 * Synchronized duce la un timp mai mare de executie. Este indicat sa il folosim doar pe sectiunile unde chiar este nevoie de el.
 * */
public class SynchronizedBlock implements Runnable {

    private Integer count = 0;

    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            increment();
        }
    }

    public void increment() {
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + "::" + count);
        }

        System.out.println("!" + Thread.currentThread().getName() + "::" + count); // ceea ce se citeste nu va fi mereu ultima valoare incrementata pentru ca nu este synchronized acest print
    }

    public static void main(String[] args) {
        SynchronizedBlock counter = new SynchronizedBlock();

        Thread t1 = new Thread(counter, "ONE");
        Thread t2 = new Thread(counter, "TWO");

        t1.start();
        t2.start();
    }
}
