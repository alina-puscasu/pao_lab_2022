package creation;

public class MessageThread extends Thread {

    /**
     * Suprascrierea metodei run din Runnable, in cadrul careia punem secventa de cod pe care o dorim executata pe un alt fir de executie.
     *
     * */
    @Override
    public void run() {
        System.out.println("Hello from another thread!");
    }

    public static void main(String[] args) {
        System.out.println("Begin in main thread!");

        MessageThread newThread = new MessageThread();
        newThread.setName("Thread-test");

        newThread.start(); // in spate apeleaza metoda run -> async, can be executed at anytime
        System.out.println("End in main thread!");
    }
}
