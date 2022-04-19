package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationMain {

    public static void main(String[] args) {
        writeBook();
        System.out.println(readBook());
    }

    private static void writeBook() {
        try (FileOutputStream out = new FileOutputStream("output.txt"); ObjectOutputStream oos = new ObjectOutputStream(out)) {
            Book book = new Book("The Picture of Dorian Grey", "Oscar Wilde", 1890, 75);
            oos.writeObject(book);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Book readBook() {
        try (FileInputStream in = new FileInputStream("output.txt"); ObjectInputStream ois = new ObjectInputStream(in)) {
            return (Book) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
