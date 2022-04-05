package fisiere;

import fisiere.exceptii.FileWritingException;

import java.io.*;

public class WriteToFileService {

    public static void writeUsingFileOutputStream(String text) throws FileWritingException {
        try(FileOutputStream out = new FileOutputStream("output.txt", true)) {
            out.write(text.getBytes());
        } catch (IOException e) {
            throw new FileWritingException("Something went wrong in writeUsingFileOutputStream", e);
        }
    }

    public static void writeUsingFileWriter(String text) throws FileWritingException {
        try(FileWriter fileWriter = new FileWriter("output.txt", true)) {
            fileWriter.write(text);
        } catch (IOException e) {
            throw new FileWritingException("Something went wrong in writeUsingFileWriter", e);
        }
    }

    public static void writeUsingDataOutputStream(String text) throws FileWritingException {
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("output.txt", true))) {
            outputStream.writeBytes(text);
        } catch (IOException e) {
            throw new FileWritingException("Something went wrong in writeUsingFileWriter", e);
        }
    }

    public static void writeUsingBufferedOutputStream(String text) throws FileWritingException {
        try(BufferedOutputStream bufferedOutputStream =  new BufferedOutputStream(new FileOutputStream("output.txt", true))) {
            bufferedOutputStream.write(text.getBytes());
        } catch (IOException e) {
            throw new FileWritingException("Something went wrong in writeUsingBufferedOutputStream", e);
        }
    }

    public static void writeUsingBufferedWriter(String text) throws FileWritingException {
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter("output.txt", true))) {
            buffer.write(text);
        } catch (IOException e) {
            throw new FileWritingException("Something went wrong in writeUsingBufferedWriter", e);
        }
    }
}
