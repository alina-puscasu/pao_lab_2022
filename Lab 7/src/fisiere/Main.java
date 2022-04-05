package fisiere;

import fisiere.exceptii.FileReadingException;
import fisiere.exceptii.FileWritingException;

public class Main {
    public static void main(String[] args) throws FileWritingException, FileReadingException {
//        WriteToFileService.writeUsingFileOutputStream("hello! ");
        ReadFromFileService.readUsingFileInputStream();
//        WriteToFileService.writeUsingFileWriter("hello 2! ");
        ReadFromFileService.readUsingFileReader();
//        WriteToFileService.writeUsingDataOutputStream("hello 3! ");
        ReadFromFileService.readUsingDataInputStream();
//        WriteToFileService.writeUsingBufferedOutputStream("hello 4! ");
        ReadFromFileService.readUsingBufferedInputStream();
//        WriteToFileService.writeUsingBufferedWriter("hello 5! ");
        ReadFromFileService.readUsingBufferedReader();
    }
}
