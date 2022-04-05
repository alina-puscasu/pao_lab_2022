package fisiere.exceptii;

public class FileWritingException extends Exception {

    public FileWritingException(String message) {super(message);}

    public FileWritingException(String message, Throwable cause) {super (message, cause);}
}
