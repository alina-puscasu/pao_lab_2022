package operations;

public class SynchronizedMethodExample implements Runnable {

    private Integer count = 0;

    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            increment();
        }
    }

    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + "::" + count); // count va fi mereu ultima valoare incrementata
    }

    public static void main(String[] args) {
        SynchronizedMethodExample counter = new SynchronizedMethodExample();

        Thread t1 = new Thread(counter, "ONE");
        Thread t2 = new Thread(counter, "TWO");

        t1.start();
        t2.start();
    }
}
