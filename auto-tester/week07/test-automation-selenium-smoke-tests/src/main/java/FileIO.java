import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {

  public static List<String> readFromFile(String nameOfFile) {
    Path pathOfFile = Paths.get(nameOfFile);
    List<String> contentOfFile = new ArrayList<>();
    try {
      contentOfFile = Files.readAllLines(pathOfFile);
    } catch (IOException e) {
      System.out.println("Unable to read file.");
    }
    return contentOfFile;
  }

  public static void writeToFile(String nameOfFileToWrite, String content) {
    List<String> writeableFormat = Arrays.asList(content);
    Path pathOfDecryptedFile = Paths.get(nameOfFileToWrite);
    try {
      Files.write(pathOfDecryptedFile, writeableFormat);
    } catch (IOException e) {
      System.out.println("Unable to write file.");
    }
  }
}

