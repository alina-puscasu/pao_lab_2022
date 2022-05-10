package creation;

/**
 * Putem crea un Thread prin implementarea interfetei Runnable.
 *
 * Threadul nou creat porneste odata cu apelarea metodei start, care in spate invoca metoda run, iar pe langa asta se creeaza si contextul necesar unui nou fir de executie
 * (stiva proprie, set registri)
 * */
public class MessageRunnable implements Runnable {

    // In cadrul metodei run punem secventa de cod pe care o dorim executata pe alt fir de executie
    @Override
    public void run() {
        System.out.println("Hello from another thread!"); // noul fir de executie
    }

    public static void main(String[] args) {
        System.out.println("Begin main!"); // fir principal, parinte de executie - firul aferent lui main
        Thread helloThread = new Thread(new MessageRunnable()); // fir principal, parinte de executie - firul aferent lui main
        helloThread.start(); // async process; fir principal, parinte de executie - firul aferent lui main
        helloThread.run(); // sync process, no new Thread created, it uses the same one
        System.out.println("End main!"); // fir principal, parinte de executie - firul aferent lui main
    }
}
