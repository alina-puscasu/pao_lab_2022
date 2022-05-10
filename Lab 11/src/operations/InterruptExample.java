package operations;

import java.util.Scanner;

class MessageRunnable implements Runnable {

    public static int counter = 0;

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            counter++;
        }
    }
}

public class InterruptExample {

    public static void main(String[] args) {
        Thread helloThread = new Thread(new MessageRunnable());
        helloThread.start();

        Scanner in = new Scanner(System.in);
        while (in.next().compareTo("stop") != 0) {
            System.out.println("MessageRunnable thread is active!");
        }

        helloThread.interrupt();

        System.out.println("Stopped. MessageRunnable counter reached: " + MessageRunnable.counter);
    }
}
