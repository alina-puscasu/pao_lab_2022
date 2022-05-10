package operations;

import java.util.LinkedList;

public class ProducerConsumer {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity;

    public ProducerConsumer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int x) throws InterruptedException {
        while (list.size() == capacity) {
            wait();
        }

        list.add(x);
        System.out.println("Producer produced: " + x);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (list.size() == 0) {
            wait();
        }

        int val = list.removeFirst();
        System.out.println("Consumer consumed: " + val);
        notifyAll();

    }
}

class MainProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc = new ProducerConsumer(5);

        Thread producer = new Thread (() -> {
            for (int i=1; i<=10; i++) {
                try {
//                    Thread.sleep((int) (Math.random() * 100));
                    pc.produce(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread (() -> {
            for (int i=1; i<=10; i++) {
                try {
                    Thread.sleep((int) (Math.random() * 100));
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

        producer.join(); // join suspenda activitatea firului parinte (main) pana la terminarea firului producer
        consumer.join(); // join suspenda activitatea firului parinte (main) pana la terminarea firului consumer

        System.out.println("End!");
    }
}
