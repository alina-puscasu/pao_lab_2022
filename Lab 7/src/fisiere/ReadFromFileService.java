package fisiere;

import fisiere.exceptii.FileReadingException;

import java.io.*;

public class ReadFromFileService {

    public static void readUsingFileInputStream() throws FileReadingException {
        System.out.println("readUsingFileInputStream: ");
        try(FileInputStream in = new FileInputStream("output.txt")) {
            int c;
            while((c = in.read()) !=-1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new FileReadingException("Something went wrong in readUsingFileInputStream method", e);
        }

        System.out.println();
    }

    public static void readUsingFileReader() throws FileReadingException {
        System.out.println("readUsingFileReader: ");
        try(FileReader in = new FileReader("output.txt")) {
            int content;
            while((content = in.read()) !=-1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            throw new FileReadingException("Something went wrong in readUsingFileInputStream method", e);
        }
        System.out.println();
    }

    public static void readUsingDataInputStream() throws FileReadingException {
        System.out.println("readUsingDataInputStream: ");
        try(DataInputStream in = new DataInputStream(new FileInputStream("output.txt"))) {
           while(in.available()>0) {
               String content = in.readLine();
               System.out.println(content);
           }
        } catch (IOException e) {
            throw new FileReadingException("Something went wrong in readUsingFileInputStream method", e);
        }
        System.out.println();
    }

    public static void readUsingBufferedInputStream() throws FileReadingException {
        System.out.println("readUsingBufferedInputStream: ");
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("output.txt"))) {
            while(in.available()>0) {
                int read = in.read();
                System.out.print((char) read);
            }
        } catch (IOException e) {
            throw new FileReadingException("Something went wrong in readUsingFileInputStream method", e);
        }
        System.out.println();
    }

    public static void readUsingBufferedReader() throws FileReadingException {
        System.out.println("readUsingBufferedReader: ");
        try(BufferedReader in = new BufferedReader(new FileReader("output.txt"))) {
            String line = in.readLine();
            while (line!=null) {
                System.out.println(line);
                line = in.readLine();
            }
        } catch (IOException e) {
            throw new FileReadingException("Something went wrong in readUsingBufferedReader method", e);
        }
        System.out.println();
    }
}
